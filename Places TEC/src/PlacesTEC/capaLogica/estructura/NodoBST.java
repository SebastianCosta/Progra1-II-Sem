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
    
    
    
    
  

    public NodoBST(Destino sitio) {
        this.sitio = sitio;
        this.derecho = null;
        this.izquierdo = null;
    }

    
    
    
          
    
}
