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
    private Destino raiz;
    private BST derecho;
    private BST izquierdo; 

    
   
    
    public BST() {
        this.raiz = null;
        this.derecho = null;
        this.izquierdo = null;
    }
    
    // constructor de una hoja
    public void BST(Destino root ) {
        this.raiz = (Destino) root;  
        this.derecho = null;
        this.izquierdo = null;
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
            return false;//si a es mayor
           
        }else if(comp < 0){//si b es mayor
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
    public void insertar( Sitio nuevo ) {
        NodoBST newNodo = new NodoBST(nuevo);
        if (raiz == null) {
            raiz = newNodo;
            return;
        }
        NodoBST current = raiz;
        NodoBST parent = null;
        NodoBST temp = null;
        while (raiz != null) {
            parent = current;
            
            System.out.println(nuevo.getID());
            System.out.println(current.getDestinoraiz().getDireccion_exacta());
            if (comparar(nuevo.getID() ,current.getDestinoraiz().getDireccion_exacta())==true) {
                
                current = current.izquierdo;
                if (current == null) {
                    parent.izquierdo = newNodo;             
                    System.out.println("aqui primer agrego izquierdo");
                    return;
                    
                }
            } else {
                current = current.derecho;
                if (current == null) {
                    parent.derecho = newNodo;
                    
                    System.out.println("aqui agrego derecho");
                    return;
                }
            }
        }
    }
   
    //Metodo que borra un nodo del arbol.
    public boolean eliminarNodoSitio(Sitio sitio) { 
        NodoBST parent = raiz;
        NodoBST current = raiz;
        boolean esHijoIzq = false;
        while (current.getSitio().getID().equals(sitio.getID()) ) {
            parent = current;
            if (comparar(current.getSitio().getID(),sitio.getID())== true) {
                esHijoIzq = true;
                current = current.izquierdo;
            } else {
                esHijoIzq = false;
                current = current.derecho;
            }
            if (current == null) {
                return false;
            }
        }
		//no se encontró el nodo si llega hasta aquí
        //Si el nodo a eliminar no tiene hijos
        if (current.izquierdo == null && current.derecho == null) {
            if (current == raiz) {
                raiz = null;
            }
            if (esHijoIzq== true) {
                parent.izquierdo = null;
            } else {
                parent.derecho = null;
            }
        } //CSi el nodo a eliminar solo tiene un hijo
        else if (current.derecho == null) {
            if (current == raiz) {
                raiz = current.izquierdo;
            } else if (esHijoIzq) {
                parent.izquierdo = current.izquierdo;
            } else {
                parent.derecho = current.izquierdo;
            }
        } else if (current.izquierdo == null) {
            if (current == raiz) {
                raiz = current.derecho;
            } else if (esHijoIzq) {
                parent.izquierdo = current.derecho;
            } else {
                parent.derecho = current.derecho;
            }
        } else if (current.izquierdo != null && current.derecho != null) {

            //now we have found the minimum element in the right sub tree
            NodoBST sucesor = getSucesor(current);
            if (current == raiz) {
                raiz = sucesor;
            } else if (esHijoIzq) {
                parent.izquierdo = sucesor;
            } else {
                parent.derecho = sucesor;
            }
            sucesor.izquierdo = current.izquierdo;
        }
        return true;
    }
    //Obtener nodo siguiente despues de que se elimina
    public NodoBST getSucesor(NodoBST Nodoborr) {
        NodoBST sucesor = null;
        NodoBST sucesorPadre = null;
        NodoBST current = Nodoborr.derecho;
        while (current != null) {
            sucesorPadre = sucesor;
            sucesor = current;
            current = current.izquierdo;
        }
		//revisa si el sucesor tiene el hijo derecho
        //  si tiene hijo derecho lo agrega a la isquiza del Sucesor Padre
        if (sucesor != Nodoborr.derecho) {
            sucesor.izquierdo = sucesor.derecho;
            sucesor.derecho = Nodoborr.derecho;
        }
        return sucesor;
    }
    
        
        
  }
        
    

    
    
    
    
    
    

