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
public class Arista {
    private Destino Vertice1;
    private Destino Vertice2;
    private int Tiempo;
    private int Distancia;

    public Destino getVertice1() {
        return Vertice1;
    }

    public void setVertice1(Destino Vertice1) {
        this.Vertice1 = Vertice1;
    }

    public Destino getVertice2() {
        return Vertice2;
    }

    public void setVertice2(Destino Vertice2) {
        this.Vertice2 = Vertice2;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }
    
    
    
    

    public Arista() {
    }

    public Arista(Destino Vertice1, Destino Vertice2, int Tiempo, int Distancia) {
        this.Vertice1 = Vertice1;
        this.Vertice2 = Vertice2;
        this.Tiempo = Tiempo;
        this.Distancia = Distancia;
    }
    
    
    
    
    
}
