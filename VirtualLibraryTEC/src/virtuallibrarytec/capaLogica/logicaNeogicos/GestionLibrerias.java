
package virtuallibrarytec.capaLogica.logicaNeogicos;

import virtuallibrarytec.capaLogica.estructuras.Lista;
import virtuallibrarytec.capaLogica.estructuras.ListaD;

public class GestionLibrerias {
   private ListaD<Libreria> lista_librerias;

    public ListaD<Libreria> getLista_librerias() {
        return lista_librerias;
    }

    public void setLista_librerias(ListaD<Libreria> lista_librerias) {
        this.lista_librerias = lista_librerias;
    }

    public GestionLibrerias() {
        lista_librerias = new ListaD<Libreria>();
    }
   
   public void crear(String nombre, String pais, String ubicacion, String horario, int numero){
        Libreria nuevaLibreria = new Libreria(nombre,pais,ubicacion,horario,numero);
        this.lista_librerias.insertar_final(nuevaLibreria);
    }
   
    /**
     *
     * @return
     */
    public String consultar(){
        return lista_librerias.toString();
    }
    
   
   
    
}
