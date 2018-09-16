/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualibrarytec.Main;


import virtuallibrarytec.capaLogica.logicaNeogicos.GestionClientesPedidos;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibrerias;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibros;
import virtuallibrarytec.capaLogica.logicaNeogicos.Libreria;
import virtuallibrarytec.capaPresentacion.main.Principal;



/**
 *
 * @author sebas
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
//        
        GestionLibrerias librerias = new GestionLibrerias();
        GestionLibros libros = new GestionLibros ();
        GestionClientesPedidos usuarios = new GestionClientesPedidos();
        Libreria libreria1 = new Libreria("Libreria Internacional", "Costa Rica", "Todo el pais", "L a V de 10:30 a 21:00 y S a D de 11:00 a 20:00", 25721710);
        Libreria libreria2 = new Libreria("Libreria TEC", "Costa Rica", "Cartago,Alajuela y Limon", "L a V de 10:30 a 21:00 y S a D de 11:00 a 20:00", 25721710);

        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLibrerias(librerias);
        principal.setLibros(libros);
        principal.setUsuarios(usuarios);
        librerias.getLista_librerias().insertar_final(libreria1);
        librerias.getLista_librerias().insertar_final(libreria2);
        
        
    }
}
