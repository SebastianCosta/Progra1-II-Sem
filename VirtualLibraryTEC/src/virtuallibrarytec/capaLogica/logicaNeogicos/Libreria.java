package virtuallibrarytec.capaLogica.logicaNeogicos;

import virtuallibrarytec.capaLogica.estructuras.Lista;
import virtuallibrarytec.capaLogica.estructuras.ListaD;

public class Libreria {
    private Lista <Libro> lista_libros;
    private String nombre,pais,ubicacion,horario;
    private int numero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Lista<Libro> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(Lista<Libro> lista_libros) {
        this.lista_libros = lista_libros;
    }

    
    
    
    
    
    
    @Override
    public String toString() {
        return "Libreria{" + "nombre=" + nombre + ", pais=" + pais + ", ubicacion=" + ubicacion + ", horario=" + horario + ", numero=" + numero + '}';
    }

    public Libreria( String nombre, String pais, String ubicacion, String horario, int numero) {
        this.lista_libros = new Lista<Libro>();
        this.nombre = nombre;
        this.pais = pais;
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.numero = numero;
    }

    
    
    
    
    
    
    
    
    public void agregarListaLibros(String ID, String nombre, String tema, String descripcion, int cantVend, int cantDisp, int precio){
        Libro nuevoLibro = new Libro(ID,nombre,tema,descripcion,cantVend,cantDisp,precio);
        lista_libros.agregar_final(nuevoLibro);
    }
}
