package virtuallibrarytec.capaLogica.estructuras;

/**
 * @param <X>
 */
public class Nodo<X> {
	private X elemento;
	private Nodo<X> nodoSig;
	private Nodo<X> nodoAnt;

    /**
     *
     * @return
     */
    public X getElemento() {
		return elemento;
	}

    /**
     *
     * @param elemento
     */
    public void setElemento(X elemento) {
		this.elemento = elemento;
	}

    /**
     *
     * @return
     */
    public Nodo<X> getNodoSig() {
		return nodoSig;
	}

    /**
     *
     * @param nodoSig
     */
    public void setNodoSig(Nodo<X> nodoSig) {
		this.nodoSig = nodoSig;
	}

    /**
     *
     * @return
     */
    public Nodo<X> getNodoAnt() {
		return nodoAnt;
	}

    /**
     *
     * @param nodoAnt
     */
    public void setNodoAnt(Nodo<X> nodoAnt) {
		this.nodoAnt = nodoAnt;
	}

    /**
     *
     * @param elemento
     */
    public Nodo(X elemento) {
		this.elemento = elemento;
		this.nodoAnt = null;
		this.nodoSig = null;
	}

	@Override
	public String toString() {
		return elemento.toString() + "\n";
	}
}
