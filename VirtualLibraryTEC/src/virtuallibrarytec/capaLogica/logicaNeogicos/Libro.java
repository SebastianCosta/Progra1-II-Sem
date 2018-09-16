package virtuallibrarytec.capaLogica.logicaNeogicos;

/**
 *
 
 */
public class Libro {
    private Libreria libreriapertenece;
    private String ID,nombre,tema,descripcion;
    private int cantVend,cantDisp,precio;
    //falta foto

    public Libreria getLibreriapertenece() {
        return libreriapertenece;
    }

    public void setLibreriapertenece(Libreria libreriapertenece) {
        this.libreriapertenece = libreriapertenece;
    }
    
    public void actualizarcantidad(){
        this.cantDisp --;
        this.cantVend ++;
    }

    
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantVend() {
        return cantVend;
    }

    public void setCantVend(int cantVend) {
        this.cantVend = cantVend;
    }

    public int getCantDisp() {
        return cantDisp;
    }

    public void setCantDisp(int cantDisp) {
        this.cantDisp = cantDisp;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "ID=" + ID + ", nombre=" + nombre + ", tema=" + tema + ", descripcion=" + descripcion + ", cantVend=" + cantVend + ", cantDisp=" + cantDisp + ", precio=" + precio + '}';
    }

    public Libro(Libreria libreriapertenece, String ID, String nombre, String tema, String descripcion, int cantVend, int cantDisp, int precio) {
        this.libreriapertenece = libreriapertenece;
        this.ID = ID;
        this.nombre = nombre;
        this.tema = tema;
        this.descripcion = descripcion;
        this.cantVend = cantVend;
        this.cantDisp = cantDisp;
        this.precio = precio;
    }

    public Libro(String ID, String nombre, String tema, String descripcion, int precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.tema = tema;
        this.descripcion = descripcion;
        this.precio = precio;
    }

   
    
    

    public Libro(String ID, String nombre, String tema, String descripcion, int cantVend, int cantDisp, int precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.tema = tema;
        this.descripcion = descripcion;
        this.cantVend = cantVend;
        this.cantDisp = cantDisp;
        this.precio = precio;
        this.libreriapertenece = libreriapertenece;
    }
    
    
    
}
