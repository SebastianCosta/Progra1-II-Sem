/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualibrarytec.Main;


import virtuallibrarytec.capaLogica.logicaNeogicos.GestionClientesPedidos;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibrerias;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibros;
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
        

        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLibrerias(librerias);
        principal.setLibros(libros);
        principal.setUsuarios(usuarios);
        
        
        
        
    }
}
