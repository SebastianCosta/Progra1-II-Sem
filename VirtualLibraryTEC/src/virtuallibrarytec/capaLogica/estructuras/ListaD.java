package virtuallibrarytec.capaLogica.estructuras;

/**
 * @param <T>
 */
public class ListaD <T> {
    //Atributos
    private NodoD<T> cola,cabeza,apuntando;
    private int tamano,pos; 
    
    //Constructores
    
    
   //Metodos 

    /**
     *
     * @return
     */
    public boolean esVacia(){
       return cabeza == null;
    }
    
    /**
     *
     * @param elemento
     */
    public void append(T elemento){
    NodoD<T> nuevo_nodo = new NodoD<>(elemento);
    this.cola.setSiguiente(nuevo_nodo);
    this.cola = nuevo_nodo;
    this.tamano++;
    
}

    /**
     *
     * @param elemento
     */
    public void insertar_final(T elemento) {
        NodoD<T> nuevo_nodo = new NodoD<>(elemento);
        if (esVacia()) {
            cabeza = nuevo_nodo;
            cola = cabeza;
            tamano++;
        } else {
            cola.setSiguiente(nuevo_nodo); 
            cola.getSiguiente().setAnterior(cola);  
            cola = cola.getSiguiente();
            tamano++;
        }
    }

    /**
     *
     * @param elemento
     * @return
     */
    public NodoD<T> buscar(T elemento) {
        NodoD<T> temp = this.cabeza;
        if (!esVacia()) {
            for (int i = 0; i < tamano; i++) {
                if (temp.getElemento() == elemento) {
                    System.out.println("ENCONTRADO: " + temp.getElemento().toString()+ " Posición: " + this.pos );
                    break;
                
                } else {
                    temp = temp.getSiguiente();
                    this.pos++;
                }
            }
        }
        return temp;
    }
    
    /**
     *
     * @param elemento
     * @return
     */
    public NodoD<T> busqueda_avanzada(T elemento){
        NodoD<T> temp = this.cabeza;
        
        
        return temp;
    }
    
    /**
     *
     * @param pos
     */
    public void eliminar(int pos){ 
        if (pos == 0){
            cabeza=cabeza.getSiguiente();
        }
        else{
            int cont = 0; 
            NodoD temporal = cabeza;
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
    
    
     public String toString() {
        String msg = "";
        NodoD<T> temp = cabeza;
        for (int i = 0; i < tamano; i++) {
            msg += ("["+ temp.getElemento()+"]");
            temp = temp.getSiguiente();
        }
        return msg;
    }

    /**
     *
     * @return
     */
    public NodoD<T> getCola() {
        return cola;
    }

    /**
     *
     * @param cola
     */
    public void setCola(NodoD<T> cola) {
        this.cola = cola;
    }

    /**
     *
     * @return
     */
    public NodoD<T> getCabeza() {
        return cabeza;
    }

    /**
     *
     * @param cabeza
     */
    public void setCabeza(NodoD<T> cabeza) {
        this.cabeza = cabeza;
    }

    /**
     *
     * @return
     */
    public NodoD<T> getApuntando() {
        return apuntando;
    }

    /**
     *
     * @param apuntando
     */
    public void setApuntando(NodoD<T> apuntando) {
        this.apuntando = apuntando;
    }

    /**
     *
     * @return
     */
    public int getTamano() {
        return tamano;
    }

    /**
     *
     * @param tamano
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
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
    
    
    
    
}
