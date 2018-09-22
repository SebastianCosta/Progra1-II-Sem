
package virtuallibrarytec.capaLogica.logicaNeogicos;

import virtuallibrarytec.capaLogica.estructuras.Lista;


public class GestionClientesPedidos {
    private Lista<Cliente> lista_clientes;

    
    
    public Lista<Cliente> getLista_clientes() {
        return lista_clientes;
    }

    public void setLista_clientes(Lista<Cliente> lista_clientes) {
        this.lista_clientes = lista_clientes;
    }

    public GestionClientesPedidos() {
            this.lista_clientes = new Lista<Cliente>();

    }
    
    public void crear(String cedula, String nombre, String direccion, String telefono, String correo){
        Cliente nuevo_Usuario = new Cliente(cedula,nombre,direccion,telefono,correo);
        this.lista_clientes.agregar_final(nuevo_Usuario);
    }
    
    
    
    /**
     *
     * @return
     */
    public String consultar(){
        return lista_clientes.toString();
    }

    /**
     *
     */
    public void eliminar(){
        lista_clientes.elim_inicio();
    }
    
    public void atender( int cant){
        this.lista_clientes.elim_final();
    }
    
    
    
    
}
