/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacesTEC.capaLogica.estructura;

import PlacesTEC.capaLogica.logica.Destino;

/**
 *
 * @author sebas
 */
public class NodoBST<X> {
    private Destino sitio;
    NodoBST derecho;
    NodoBST izquierdo;

    public Destino getSitio() {
        return sitio;
    }

    public void setSitio(Destino sitio) {
        this.sitio = sitio;
    }

    public NodoBST getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoBST derecho) {
        this.derecho = derecho;
    }

    public NodoBST getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoBST izquierdo) {
        this.izquierdo = izquierdo;
    }
    
    public NodoBST(Destino sitio) {
        this.sitio = sitio;
        this.derecho = null;
        this.izquierdo = null;
    }

    
    
    
          
    
}
