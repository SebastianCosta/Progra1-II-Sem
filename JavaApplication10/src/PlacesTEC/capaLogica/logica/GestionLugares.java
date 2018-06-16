/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacesTEC.capaLogica.logica;

import java.util.LinkedList;

/**
 *
 * @author sebas
 */
public class GestionLugares {
    private LinkedList<Destino> destinos;

    public LinkedList<Destino> getDestinos() {
        return destinos;
    }

    public void setDestino(LinkedList<Destino> destinos) {
        this.destinos = destinos;
    }

    public GestionLugares(LinkedList<Destino> destinos) {
        this.destinos = new LinkedList<Destino>();
    }
    
    public void agregarLugarLatLon(int latitud,int longitud,String fecha,String desplazamiento){
        Destino nuevo_Destino = new Destino(latitud,longitud,fecha,desplazamiento);
        this.destinos.add(nuevo_Destino);
    }
    public void agregarLugarDir(String direccion_exacta, String fecha, String desplazamiento){
        Destino nuevo_Destino = new Destino(direccion_exacta,fecha,desplazamiento);
        this.destinos.add(nuevo_Destino);
    }
    public void eliminarDestino(Destino destino){
       this.destinos.remove(destino);
    }


    public void editarDestino(Destino destino,int nlatitud, int nlongitud, String ndireccion_exacta, String fecha, String ndesplazamiento){
        this.destinos.remove(destino);
        Destino nuevo_Destino = new Destino(nlatitud,nlongitud,ndireccion_exacta,fecha,ndesplazamiento);
        
    }
            
    
}
