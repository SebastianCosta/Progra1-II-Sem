
package virtuallibrarytec.capaLogica.logicaNeogicos;

import virtuallibrarytec.capaLogica.estructuras.Lista;
import virtuallibrarytec.capaLogica.estructuras.ListaD;


public class GestionLibros {
    private ListaD<Libro> lista_libros;

    
    //G&S

    public ListaD<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(ListaD<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }
    

    
    //constructor
    public GestionLibros() {
        this.lista_libros= new ListaD<Libro>();
    }
    
    //en esta hay que agregar el metodo de buscar libros para la funcionalidad
    //metodos
    public void crear(String ID, String nombre, String tema, String descripcion, int cantVend, int cantDisp, int precio){
        Libro nuevoLibro = new Libro(ID,nombre,tema,descripcion,cantVend,cantDisp,precio);
        lista_libros.insertar_final(nuevoLibro);
    }
    public void agregar(Libro libronuevo){
        lista_libros.insertar_final(libronuevo);
    }
    public void eliminar(){
      //investigar metodo para buscar elemento en la lista  
    }
    public void modificar(){
        //buscar,eliminar y luego crear otro
    }

     public String consultar(){
        return lista_libros.toString();
    }
    
    
    
    @Override
    public String toString() {
        return "GestionLibros{" + "lista_libros=" + lista_libros + '}';
    }
    
    
    
    
    
    
}
