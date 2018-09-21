/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualibrarytec.Main;


import virtuallibrarytec.capaLogica.logicaNeogicos.GestionBusqueda;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionClientesPedidos;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibrerias;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibros;
import virtuallibrarytec.capaLogica.logicaNeogicos.Libreria;
import virtuallibrarytec.capaLogica.logicaNeogicos.Libro;
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
        GestionBusqueda historial = new GestionBusqueda();
        //(String ID, String nombre, String tema, String descripcion, int cantVend, int cantDisp, int precio
        Libro libro1 = new Libro("Lib1","De la Tierra a la Luna","Novela científica","De la Tierra a la Luna (título original: De la Terre à la Lune Trajet direct en 97 heures) es una novela «científica» y «satírica» del escritor Julio Verne, publicada en el \"Journal des débats politiques et littéraires\" desde el 14 de septiembre hasta el 14 de octubre de 1865, y como un solo volumen el 25 de octubre de ese mismo año. El 16 de septiembre de 1872 se presentaría una edición doble con \"Alrededor de la Luna\" (\"Autour de la Lune\"), su continuación, que habría aparecido en 1870 de manera seriada",5,4,12); 
        Libro libro2 = new Libro("Lib2","El Padrino","Novela policíaca","El padrino es una novela de género criminal escrita por el escritor italoestadounidense Mario Puzo que originalmente publicó una de las mayores editoriales del país conocida como G. P. Putnam's Sons en 1969. Detalla la historia ficticia de una familia de la mafia siciliana asentada en Nueva York y que está encabezada por Don Vito Corleone, El gran jefe, la cual se convirtió en sinónima de la mafia italiana. La trama transcurre entre los años 1945 y 1955, y también proporciona el trasfondo de Vito desde su niñez, hasta su madurez.",24,45,12);
        Libro libro3 = new Libro("LIB","Introducción a la matemática discreta","Matemática","Matemática discreta, también conocida como matemática finita, es el estudio de las estructuras matemáticas que son fundamentalmente discretas, en el sentido de que no requieren la noción de continuidad.",34,24,11);
        
        
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLibrerias(librerias);
        principal.setLibros(libros);
        principal.setUsuarios(usuarios);
        
        librerias.getLista_librerias().insertar_final(libreria1);
        librerias.getLista_librerias().insertar_final(libreria2);
        
        libreria1.getLista_libros().agregar_inicio(libro1);
        libreria1.getLista_libros().agregar_inicio(libro2);
        libreria2.getLista_libros().agregar_inicio(libro3);
        libros.agregar(libro1);
        libros.agregar(libro2);
        libros.agregar(libro3);
        principal.setHistorial(historial);
        
    }
}
