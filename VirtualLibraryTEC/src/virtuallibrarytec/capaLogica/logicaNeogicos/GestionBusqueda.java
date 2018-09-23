
package virtuallibrarytec.capaLogica.logicaNeogicos;

import virtuallibrarytec.capaLogica.estructuras.Lista;


public class GestionBusqueda {
    public Lista<Libro> historial;

    public Lista<Libro> getHistorial2() {
        return historial;
    }

    public void setHistorial(Lista<Libro> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "GestionBusqueda{" + "historial=" + historial + '}';
    }

    
    
    
    public GestionBusqueda() {
        this.historial = new Lista<Libro>();
    }
    public void agregarHistorial(Libro libroH){
        historial.agregar_inicio(libroH);
    }
    public void eliminardelHistorial(Libro libroH){
        historial.elim_inicio();
    }
    
}
