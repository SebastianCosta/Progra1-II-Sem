/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuallibrarytec.capaLogica.logicaNeogicos;

/**
 *
 * @author sebas
 */
public class Pedido {
    private Cliente cliente;
    private boolean estado = false;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void cambiarEstado(){
        this.estado = true;
    }

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Pedido{" + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
