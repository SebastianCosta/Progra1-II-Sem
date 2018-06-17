/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacesTEC.capaLogica.estructura;

import PlacesTEC.capaLogica.logica.Destino;
import PlacesTEC.capaLogica.logica.Sitio;

/**
 *
 * @author sebas
 */
public class NodoBST {
    private Sitio sitio;
    NodoBST derecho;
    NodoBST izquierdo;
    private Destino destinoraiz;

    public Destino getDestinoraiz() {
        return destinoraiz;
    }

    public void setDestinoraiz(Destino destinoraiz) {
        this.destinoraiz = destinoraiz;
    }
    

    public Sitio getSitio() {
        return sitio;
    }

    public void setSitio(Sitio sitio) {
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

    public NodoBST(Sitio sitio) {
        this.sitio = sitio;
        this.derecho = null;
        this.izquierdo = null;
    }

    public NodoBST( Destino destinoraiz) {
        this.derecho = null;
        this.izquierdo = null;
        this.destinoraiz = destinoraiz;
    }
    
    
          
    
}
