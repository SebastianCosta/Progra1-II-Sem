/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacesTEC.capaLogica.estructura;

/**
 *
 * @author sebas
 */
public class Nodo<X> {
    private int vertice;
    private int peso;

    public Nodo() {
        this.vertice = 0;
        this.peso = 0;
    }
    
    
    public Nodo(int vertice, int peso) {
        this.vertice = vertice;
        this.peso = peso;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nodo{" + "vertice=" + vertice + ", peso=" + peso + '}';
    }
    
    
    
}
