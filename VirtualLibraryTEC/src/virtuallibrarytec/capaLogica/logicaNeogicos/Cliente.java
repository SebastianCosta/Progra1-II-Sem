
package virtuallibrarytec.capaLogica.logicaNeogicos;

import virtuallibrarytec.capaLogica.estructuras.Lista;
import virtuallibrarytec.capaLogica.estructuras.ListaD;

public class Cliente {
    private String cedula,nombre,direccion,telefono,correo;
    private Lista<Libro>libros_compra;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Lista<Libro> getLibros_compra() {
        return libros_compra;
    }

    public void setLibros_compra(Lista<Libro> libros_compra) {
        this.libros_compra = libros_compra;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", libros_compra=" + libros_compra + '}';
    }

    public Cliente(String cedula, String nombre, String direccion, String telefono, String correo, Lista<Libro> libros_compra) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.libros_compra = new Lista<Libro>();
    }
    
    
    public void agregaraLista(Libro libroComprar){
        this.libros_compra.agregar_final(libroComprar);
    }
    
    
    
    
    
}
