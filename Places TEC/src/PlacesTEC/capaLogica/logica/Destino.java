
package PlacesTEC.capaLogica.logica;


public class Destino {
    private int latitud;
    private int longitud;
    private String direccion_exacta;
    private String fecha;
    private String desplazamiento;
    private int grado;
    private int minutos;
    private int segundos;

    public Destino(int latitud, int longitud, String fecha, String desplazamiento) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.fecha = fecha;
        this.desplazamiento = desplazamiento;
    }

    public Destino(String direccion_exacta, String fecha, String desplazamiento) {
        this.direccion_exacta = direccion_exacta;
        this.fecha = fecha;
        this.desplazamiento = desplazamiento;
    }

    public Destino(int latitud, int longitud, String direccion_exacta, String fecha, String desplazamiento) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccion_exacta = direccion_exacta;
        this.fecha = fecha;
        this.desplazamiento = desplazamiento;
    }
    
    
    //falta un constructor con lo que no pude leer

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getDireccion_exacta() {
        return direccion_exacta;
    }

    public void setDireccion_exacta(String direccion_exacta) {
        this.direccion_exacta = direccion_exacta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Destino{" + "latitud=" + latitud + ", longitud=" + longitud + ", direccion_exacta=" + direccion_exacta + ", fecha=" + fecha + ", desplazamiento=" + desplazamiento + ", grado=" + grado + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }
    
    
}
