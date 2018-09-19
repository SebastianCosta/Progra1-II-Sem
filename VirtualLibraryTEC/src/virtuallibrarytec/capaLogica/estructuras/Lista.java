package virtuallibrarytec.capaLogica.estructuras;

import java.util.Scanner;

/**
 *
 * @param <T>
 */
public class Lista<T> {
    // Atributos
    private NodoS<T> cabeza, apuntando, cola;
    private int pos, tamano;

    // Constructores

    /**
     *
     */
    public Lista() {
        this.cabeza = null;
        this.apuntando = this.cabeza;
        this.cola = this.cabeza;
        pos = 0;
        tamano = 0;
    }

    //Metodos de la lista simple, la cual va a funcionar como una cola y pila
    //Este método agregar el nodo al inicio de la lista

    /**
     *
     * @param pNodoN
     */
    public void agregar_inicio(T pNodoN) {
        if (this.esVacia()) {
            NodoS<T> nuevo = new NodoS(pNodoN);
            cabeza = nuevo;
            cola = cabeza;
            tamano++;
        } else {
            NodoS<T> nuevo = new NodoS(pNodoN);
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
            tamano++;
        }

    }
    
    // Este metodo permite agregar el nodo al fina de la lista

    /**
     *
     * @param pNodoN
     */
    public void agregar_final(T pNodoN) {
        if (this.esVacia()) {
            NodoS<T> nuevo = new NodoS(pNodoN);
            cabeza = nuevo;
            cola = cabeza;
            tamano++;
        } else {
            NodoS<T> nuevo = new NodoS(pNodoN);
            this.cola.setSiguiente(nuevo);
            this.cola = cola.getSiguiente();
            this.tamano++;

        }
    }

    //Este metodo permite imprimir los elementos que contienen los nodos de la lista

    /**
     *
     */
    public void ver() {
        this.apuntando = cabeza;
        while (this.apuntando != null) {
            System.out.print("[" + this.apuntando.getContiene() + "] --->");
            this.apuntando = this.apuntando.getSiguiente();
        }
    }
    public void Vaciar(){
        for (int i = 0; i < tamano; i++) {
            this.cabeza = null;
            this.cabeza.setSiguiente(null);
        }
        
        
    }
    
    //Este metodo permite eliminar el nodo del inicio de la lista

    /**
     *
     * @return
     */
    public T elim_inicio() {
        if (cabeza == null){
            return null;
        
        }
        T temporal = cabeza.getContiene();
        cabeza = cabeza.getSiguiente();
        tamano--;
        System.out.println(temporal);
        return temporal;

    }
    
     //Este metodo permite eliminar el nodo del final de la lista

    /**
     *
     */
    public void elim_final() {
        NodoS<T> aux = this.cabeza;
        int i = 0;
        while (i < this.tamano-1) {
            if (aux.getSiguiente() == cola) {
                aux.setSiguiente(null);
                cola = aux;
            } else {
                aux = aux.getSiguiente();
                i++;
            }
        }
        //System.out.println(cabeza.getContiene());
        this.tamano--;
    }
    
     /*public void deleteNode(int position) 
    { 
        // If linked list is empty 
        if (cabeza == null) 
            return; 
  
        // Store head node 
        NodoS temp = cabeza; 
  
        // If head needs to be removed 
        if (position == 0) 
        { 
            cabeza= temp.getSiguiente();   // Change head 
            return; 
        } 
  
        // Find previous node of the node to be deleted 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.getSiguiente(); 
  
        // If position is more than number of ndoes 
        if (temp == null || temp.getSiguiente() == null) 
            return; 
  
        // Node temp->next is the node to be deleted 
        // Store pointer to the next of node to be deleted 
        NodoS next = temp.getSiguiente().getSiguiente(); 
  
        temp.getSiguiente() = next;  // Unlink the deleted node from list 
    }*/ 
    
    public void eliminar(int pos){ 
        if (pos == 0){
            cabeza=cabeza.getSiguiente();
        }
        else{
            int cont = 0; 
            NodoS temporal = cabeza;
            while(cont < pos-1)
            {
                temporal = temporal.getSiguiente();
                //System.out.print("["+temporal.getElemento()+"]");
                cont++;
            }
            temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
        } 
        tamano--;
             
    }
    
    /**
     *
     * @param elemento
     * @return
     */
    public NodoS<T> buscarNodo(T elemento) {
        NodoS<T> temp = cabeza;
        if (!esVacia()) {
            for (int i = 0; i < tamano; i++) {
                if (temp.getContiene() == elemento) {
                    System.out.println("ECONTRADO: " + temp.getContiene().toString());
                    break;
                } else {
                    temp = temp.getSiguiente();
                }
            }
        }
        return temp;

    }

    /**
     *
     */
    public void limpiar() {
        this.cabeza = this.cola = this.apuntando = new NodoS();
        this.pos = 0;
        this.tamano = 0;
    }

    /**
     *
     * @return
     */
    public boolean esVacia() {
        return this.cabeza == null;
    }

    /**
     *
     * @return
     */
    public NodoS getCabeza() {
        return cabeza;
    }

    /**
     *
     * @param cabeza
     */
    public void setCabeza(NodoS cabeza) {
        this.cabeza = cabeza;
    }

    /**
     *
     * @return
     */
    public NodoS getApuntando() {
        return apuntando;
    }

    /**
     *
     * @param apuntando
     */
    public void setApuntando(NodoS apuntando) {
        this.apuntando = apuntando;
    }

    /**
     *
     * @return
     */
    public NodoS getCola() {
        return cola;
    }

    /**
     *
     * @param cola
     */
    public void setCola(NodoS cola) {
        this.cola = cola;
    }

    /**
     *
     * @return
     */
    public int getPos() {
        return pos;
    }

    /**
     *
     * @param pos
     */
    public void setPos(int pos) {
        this.pos = pos;
    }

    /**
     *
     * @return
     */
    public int getTamano() {
        System.out.println(tamano);
        return tamano;
    }

    /**
     *
     * @param tamano
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String toString() {
        String msg = "";
        NodoS<T> temp = cabeza;
        for (int i = 0; i < tamano; i++) {
            msg += ("["+ temp.getContiene()+"]");
            temp = temp.getSiguiente();
        }
        return msg;
    }

    
    
    
}
