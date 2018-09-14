/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuallibrarytec.capaPresentacion.main;

import virtuallibrarytec.capaLogica.logicaNeogicos.GestionClientesPedidos;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibrerias;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibros;
import virtuallibrarytec.capaLogica.utils.ModeladorTablas;

/**
 *
 * @author sebas
 */
public class Principal extends javax.swing.JFrame {
    private GestionLibrerias librerias;
    private GestionLibros libros;
    private GestionClientesPedidos usuarios;
    

    public GestionLibrerias getLibrerias() {
        return librerias;
    }

    public void setLibrerias(GestionLibrerias librerias) {
        this.librerias = librerias;
    }

    public GestionLibros getLibros() {
        return libros;
    }

    public void setLibros(GestionLibros libros) {
        this.libros = libros;
    }

    public GestionClientesPedidos getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(GestionClientesPedidos usuarios) {
        this.usuarios = usuarios;
    }
    
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jbuttonGLibros = new javax.swing.JButton();
        jbuttonGLibreria = new javax.swing.JButton();
        jButtonBusqueda = new javax.swing.JButton();
        jButtonAtencionPedidos = new javax.swing.JButton();
        jButtonPedidos = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("Virtual Library TEC");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 580, 70));

        jbuttonGLibros.setBackground(new java.awt.Color(102, 102, 102));
        jbuttonGLibros.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jbuttonGLibros.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonGLibros.setText("Gestión de Libros");
        jbuttonGLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonGLibrosActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonGLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 410, 60));

        jbuttonGLibreria.setBackground(new java.awt.Color(102, 102, 102));
        jbuttonGLibreria.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jbuttonGLibreria.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonGLibreria.setText("Gestión de Librerías");
        jbuttonGLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonGLibreriaActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonGLibreria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 420, 70));

        jButtonBusqueda.setBackground(new java.awt.Color(102, 102, 102));
        jButtonBusqueda.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jButtonBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBusqueda.setText("Búsqueda de Libros");
        jButtonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 410, 70));

        jButtonAtencionPedidos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAtencionPedidos.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jButtonAtencionPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtencionPedidos.setText("Atención de Pedidos");
        jButtonAtencionPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtencionPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtencionPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 420, 70));

        jButtonPedidos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonPedidos.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 36)); // NOI18N
        jButtonPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPedidos.setText("Pedidos de Libros");
        jButtonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 420, 70));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/virtuallibrarytec/capaPresentacion/main/151059.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1180, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonGLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonGLibreriaActionPerformed
    VentGestion_Librerias crear_Libreria = new VentGestion_Librerias(this, rootPaneCheckingEnabled,this);
    
    Object[] columnasLibrerias = new Object[] {"Nombre","País","Ubicación","Horario","Número"};        
    crear_Libreria.getTabla_Librerias().setModel(ModeladorTablas.generarModeloDeTabla(5, columnasLibrerias));
    crear_Libreria.getTabla_Librerias().setAutoCreateRowSorter(false);
    //crear_Agencia.actualizarTabla();
    
    crear_Libreria.setVisible(true);
    crear_Libreria.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jbuttonGLibreriaActionPerformed

    private void jbuttonGLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonGLibrosActionPerformed
     VentGestion_Libros crear_Libro = new VentGestion_Libros(this, rootPaneCheckingEnabled,this);
    
    Object[] columnasLibros = new Object[] {"ID","Nombre","Tema","Descripción","Cantidad Vendida","Cantidad Disponible","Precio"};        
    crear_Libro.getTabla_Libros().setModel(ModeladorTablas.generarModeloDeTabla(7, columnasLibros));
    crear_Libro.getTabla_Libros().setAutoCreateRowSorter(false);
    //crear_Agencia.actualizarTabla();
    
    crear_Libro.setVisible(true);
    crear_Libro.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jbuttonGLibrosActionPerformed

    private void jButtonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaActionPerformed
        VentBusqueda crear_Libro = new VentBusqueda(this, rootPaneCheckingEnabled,this);
    
        Object[] columnasLibros = new Object[] {"ID","Nombre","Tema","Descripción","Cantidad Vendida","Cantidad Disponible","Precio"};        
        crear_Libro.getTabla_Libros().setModel(ModeladorTablas.generarModeloDeTabla(7, columnasLibros));
        crear_Libro.getTabla_Libros().setAutoCreateRowSorter(false);
        //crear_Agencia.actualizarTabla();

        crear_Libro.setVisible(true);
        crear_Libro.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jButtonBusquedaActionPerformed

    private void jButtonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidosActionPerformed
        VentRegistroCompras ventReg = new VentRegistroCompras (this, rootPaneCheckingEnabled, this);
        ventReg.setVisible(true);
        ventReg.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jButtonPedidosActionPerformed

    private void jButtonAtencionPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtencionPedidosActionPerformed
       VentAtencionPedidos ventLA = new VentAtencionPedidos(this, rootPaneCheckingEnabled, this);
       
       Object[] columnasLibros = new Object[] {"Nombre del cliente","Libros"};        
        ventLA.getjTablePedidos().setModel(ModeladorTablas.generarModeloDeTabla(2, columnasLibros));
        ventLA.getjTablePedidos().setAutoCreateRowSorter(false);
       
       
       ventLA.setVisible(true);
       ventLA.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jButtonAtencionPedidosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonAtencionPedidos;
    private javax.swing.JButton jButtonBusqueda;
    private javax.swing.JButton jButtonPedidos;
    private javax.swing.JButton jbuttonGLibreria;
    private javax.swing.JButton jbuttonGLibros;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
