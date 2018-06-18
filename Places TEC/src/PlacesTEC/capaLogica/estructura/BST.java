/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacesTEC.capaLogica.estructura;

import PlacesTEC.capaLogica.logica.Destino;
import static javax.management.Query.lt;

/**
 *
 * @author sebas
 */
public class BST<X> {
    private NodoBST raiz;   
   
    
    public BST() {
        this.raiz = null;
       
    }

    public NodoBST getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoBST raiz) {
        this.raiz = raiz;
    }
    
 

    private boolean esVacio() {
        boolean vacio = true;
        if ( raiz != null )
            vacio = false;
        return vacio;
    }
    
    public static boolean comparar(String raiz,String sitio ){
        int comp = raiz.compareTo(sitio);
        if(comp > 0){
            return false;//si sitio es mayor
           
        }else if(comp < 0){//si raiz es menor
            return true;
        }
        return true;//si son iguales 
    }
    public void imprimir(NodoBST raiz) {
        
        
        if (raiz != null) {
            imprimir(raiz.izquierdo);
            System.out.print(" ("+ raiz.getSitio()+")");
            
            imprimir(raiz.derecho);
        }
    }
    public void insertar(Destino nuevo ) {
        NodoBST nuevoNodo = new NodoBST(nuevo);
        if (raiz == null) {//cuando no hay raiz
            raiz = nuevoNodo;
            return;
        }
        NodoBST current = raiz;
        NodoBST parent = null;
        
        while (raiz != null) {//para que busque cuando si existe una raiz
            parent = current;
            
            System.out.println(nuevo.getDireccion_exacta());
            System.out.println(current.getSitio().getDireccion_exacta());
            if (comparar(nuevo.getDireccion_exacta(),current.getSitio().getDireccion_exacta())==true) {//compara el nombre del nuevo lugar con el nombre del lugar de la raiz 
                current = current.izquierdo;// para que vaya comparando los nodos de la izquierda de la raiz/padre de ese nodo
                if (current == null) {//si no hay nodo a la izquierda del padre
                    parent.izquierdo = nuevoNodo;   //asigna el nuevo nodo a la izquierda del nodo padre          
                    System.out.println("aqui primer agrego izquierdo");
                    return;
                    
                }
            } else {
                current = current.derecho;//para comparar los nodos de la derecha de la raiz/padre de ese nodo
                if (current == null) {//si no hay nodo derecho 
                    parent.derecho = nuevoNodo;//asigna el nuevoNodo a la derecha
                    
                    System.out.println("aqui agrego derecho");
                    return;
                }
            }
        }
    }
   
    //Metodo que borra un nodo del arbol.
    public boolean eliminarNodoSitio(Destino sitio) { 
        NodoBST parent = raiz;
        NodoBST current = raiz;
        boolean esHijoIzq = false;
        //con este se busca el nodo a eliminar
        while (!(current.getSitio().getDireccion_exacta()).equals(sitio.getDireccion_exacta()) ) {//compara que nodo a eliminar sea diferente al del nodo padre
            parent = current;//se asgina el padre igual que el current para que tome current como raiz para seguir buscando
            if (comparar(current.getSitio().getDireccion_exacta(),sitio.getDireccion_exacta())== false) {//compara si la raiz es mayor para que busque los elementos de la izquierda
                esHijoIzq = true;
                current = current.izquierdo;//empieza a buscar por la izquierda
                System.out.println("aqui1");
            } else {
                esHijoIzq = false;
                current = current.derecho;//empieza a buscar por la derecha
                System.out.println("aqui2");
            }
            if (current == null) {
                return false;
            }
        }
	//ya encontrado se aplican los casos para eliminar un nodo dependiendo de sus hijos
        //current es el nodo del sitio a eliminar
        //Si el nodo a eliminar no tiene hijos
        if (current.izquierdo == null && current.derecho == null) {
            if (current == raiz) {
                raiz = null;
                System.out.println("primer if");
            }
            if (esHijoIzq== true) {//si el nodo a eliminar es hijo izquierdo
                parent.izquierdo = null;
                System.out.println("segundo if");
            } else {//si el nodo a eliminar es hijo derecho
                parent.derecho = null;
                System.out.println("else");
            }
        } //Si el nodo a eliminar solo tiene un hijo
        else if (current.derecho == null) {//si tiene hijo por la izquierda
            if (current == raiz) {
                raiz = current.izquierdo;
            } else if (esHijoIzq) {//si es hijo a la izquierda
                parent.izquierdo = current.izquierdo;
            } else {
                parent.derecho = current.izquierdo;//si es hijo por la derecha
            }
        } else if (current.izquierdo == null) {//si tiene hijo por la derecha
            if (current == raiz) {
                raiz = current.derecho;
            } else if (esHijoIzq) {
                parent.izquierdo = current.derecho;//asigna el hijo del nodo a eliminar como el nuevo hijo izquierdo del padre
            } else {
                parent.derecho = current.derecho;
            }
        } else if (current.izquierdo != null && current.derecho != null) {//cuando tiene 2 hijos
            NodoBST sucesor = obtenerSucesor(current);//con esto se llega al menor nodo en el sub arbol derecho
            if (current == raiz) {
                raiz = sucesor;
            } else if (esHijoIzq) {
                parent.izquierdo = sucesor;//se asigna el sucesor del nodo a eliminar como el nuevo hijo izquierdo del padre del nodo a eliminar
            } else {
                parent.derecho = sucesor;//se asigna el sucesor del nodo a eliminar como el nuevo hijo derecho del padre del nodo a eliminar
            }
            sucesor.izquierdo = current.izquierdo;
        }
        return true;
    }
    //Esta funcion es para obtener el nodo siguiente cuando se va a eliminar un nodo con dos hijos
    public NodoBST obtenerSucesor(NodoBST Nodoborr) {
        NodoBST sucesor = null;
        NodoBST sucesorPadre = null;
        NodoBST current = Nodoborr.derecho;//hijo derecho del nodo a borrar
        while (current != null) {
            sucesorPadre = sucesor;
            sucesor = current;
            current = current.izquierdo;//va buscando por la izquierda
        }
		//revisa si el sucesor tiene el hijo derecho
        //  si tiene hijo derecho lo agrega a la izquierda del Sucesor Padre
        if (sucesor != Nodoborr.derecho) {
            sucesor.izquierdo = sucesor.derecho;
            sucesor.derecho = Nodoborr.derecho;
        }
        return sucesor;
    }
    
        
        
  }
        
    

    
    
    
    
    
    

