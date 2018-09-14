
package virtuallibrarytec.capaLogica.estructuras;

/**
 *
 * @param <T>
 */
public class NodoD <T> {
    //Atributos
    private T elemento;
    private NodoD<T> siguiente,anterior;
    
    //Constructores

    /**
     *
     */
    public NodoD (){
       this.elemento = null;
       this.anterior = null; 
       this.siguiente = null;
       
    }
    
    //Nodo apuntando a un objeto

    /**
     *
     * @param pElemento
     */
    public NodoD( T pElemento){
        this.elemento = pElemento;
        this.anterior = null;
        this.siguiente = null;
    }
    
    //Nodo apuntando

    /**
     *
     * @param pElemento
     * @param pAnterior
     * @param pSiguiente
     */
    public NodoD(T pElemento, NodoD<T> pAnterior, NodoD<T> pSiguiente){
        this.elemento = pElemento;
        this.anterior = pAnterior;
        this.siguiente = pSiguiente;
    }

    /**
     *
     * @return
     */
    public T getElemento() {
        return elemento;
    }

    /**
     *
     * @param elemento
     */
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    /**
     *
     * @return
     */
    public NodoD<T> getSiguiente() {
        return siguiente;
    }

    /**
     *
     * @param siguiente
     */
    public void setSiguiente(NodoD<T> siguiente) {
        this.siguiente = siguiente;
    }

    /**
     *
     * @return
     */
    public NodoD<T> getAnterior() {
        return anterior;
    }

    /**
     *
     * @param anterior
     */
    public void setAnterior(NodoD<T> anterior) {
        this.anterior = anterior;
    }
   
    
}
