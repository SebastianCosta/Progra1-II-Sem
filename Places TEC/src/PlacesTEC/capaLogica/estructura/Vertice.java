/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacesTEC.capaLogica.estructura;

import java.util.LinkedList;

/**
 *
 * @author sebas
 */
public class Vertice<X> {
    private X lugar;
    private boolean visitado;
    LinkedList<Arista> aristas;
    
    public X getLugar() {
        return lugar;
    }

    public void setLugar(X lugar) {
        this.lugar = lugar;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public LinkedList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(LinkedList<Arista> aristas) {
        this.aristas = aristas;
    }
    
    
    
    public Vertice(){
        this.lugar = null;
        this.visitado = false;
        this.aristas = new LinkedList<Arista>();
        
    }

    public Vertice(X lugar) {
        this.lugar = lugar;
        this.visitado = false;
        this.aristas = new LinkedList<Arista>();
    }

    public Vertice(X lugar, LinkedList<Arista> aristas) {
        this.lugar = lugar;
        this.visitado = visitado;
        this.aristas = aristas;
    }
    
    
    public int verificarArista(Arista arista) {
        if (!this.aristas.contains(arista)) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public int agregarArista(Arista arista) {
        if (!this.aristas.contains(arista)) {
            this.aristas.add(arista);
            return 0;
        } else {
            return 1;
        }
    }
    
    
    
}
