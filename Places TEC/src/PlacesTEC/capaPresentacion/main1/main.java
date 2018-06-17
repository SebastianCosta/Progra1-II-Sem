/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacesTEC.capaPresentacion.main1;

import PlacesTEC.capaLogica.estructura.BST;
import PlacesTEC.capaLogica.estructura.NodoBST;
import PlacesTEC.capaLogica.logica.Destino;
import PlacesTEC.capaLogica.logica.GestionLugares;
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
        NodoBST nodo1 = new NodoBST(destino);
        Destino sitio1= new Destino("Alajuela",2512,"3","lunes a viernes" ,"Alajuela.net");
        Destino sitio2= new Destino("Heredia",2512,"5","lunes a viernes" ,"Heredia.net");
        Destino sitio3= new Destino("Bajuela",2512,"3","lunes a viernes" ,"Alajuela.net");
       
        BST bst = new BST();
        bst.setRaiz(nodo1);
        bst.insertar(sitio1);
        bst.insertar(sitio2);
        bst.insertar(sitio3);
        bst.eliminarNodoSitio(sitio3);
        
 
    }  
}
