
package virtuallibrarytec.capaLogica.estructuras;

/**
 *
 * @param <T>
 */
public class NodoS <T> {
    // Atributos
    private T contiene; 
    private NodoS<T> siguiente;
    
    //Constructores

    /**
     *
     */
    
    public NodoS(){
        this.contiene = null;
        this.siguiente = null;
    }
    
    /**
     *
     * @param pcontiene
     */
    public NodoS(T pcontiene){
        this.contiene = pcontiene;
    }
    
    /**
     *
     * @param pcontiene
     * @param psiguiente
     */
    public NodoS(T pcontiene, NodoS<T> psiguiente){
        this.contiene = pcontiene;
        this.siguiente = psiguiente;
    }
    
    //METODOS DE LA CLASE NodoS

    /**
     *
     * @return
     */
    public T getContiene() {
        return contiene;
    }

    /**
     *
     * @param contiene
     */
    public void setContiene(T contiene) {
        this.contiene = contiene;
    }

    /**
     *
     * @return
     */
    public NodoS<T> getSiguiente() {
        return siguiente;
    }

    /**
     *
     * @param siguiente
     */
    public void setSiguiente(NodoS<T> siguiente) {
        this.siguiente = siguiente;
    }
    
   
}
