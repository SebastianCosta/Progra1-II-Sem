/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuallibrarytec.capaLogica.logicaNeogicos;

import java.util.Date;

/**
 *
 * @author sebas
 */
public class Pedido {
    private Cliente cliente;
    private boolean estado = false;
    private Date fecha;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void cambiarEstado(){
        this.estado = true;
        System.out.println("se actualizo el estado");
    }
    public Date obtenerfechaactual(){
        Date date = new Date();
        return date;
        
    }

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = false;
        this.fecha = obtenerfechaactual();
    }

    @Override
    public String toString() {
        return "Pedido{" + " estado=" + estado + '}';
    }
    
    
    
    
    
}
