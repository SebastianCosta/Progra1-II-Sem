/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra.pkg3;

import PlacesTEC.capaLogica.estructura.BST;
import PlacesTEC.capaLogica.estructura.NodoBST;
import PlacesTEC.capaLogica.logica.Destino;
import PlacesTEC.capaLogica.logica.GestionLugares;
import PlacesTEC.capaLogica.logica.Sitio;
import PlacesTEC.capaPresentacion.main.Principal;
import java.io.PrintStream;
import java.util.LinkedList;

/**
 *
 * @author sebas
 */
public class main {
    public static void main(String[] args) {
       GestionLugares lugares = new GestionLugares();
    
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setDestinos(lugares); 
        
        
        Destino destino = new Destino("Cartago","2018","carro");
        Sitio sitio1= new Sitio("Alajuela",2512,"3","lunes a viernes" ,"Alajuela.net");
        Sitio sitio2= new Sitio("Heredia",2512,"5","lunes a viernes" ,"Heredia.net");
        Sitio sitio3= new Sitio("Bajuela",2512,"3","lunes a viernes" ,"Alajuela.net");
       
        
        NodoBST nodo1 = new NodoBST(destino);
        NodoBST nodo2 = new NodoBST(sitio1);
        NodoBST nodo3 = new NodoBST(sitio2);
        

        
        BST bst = new BST();
        bst.setRaiz(nodo1);
        bst.insertar(sitio1);
        bst.insertar(sitio2);
        bst.insertar(sitio3);
       
        
             
        
        
       
    }  
}