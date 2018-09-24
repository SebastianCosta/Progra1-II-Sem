/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuallibrarytec.capaPresentacion.main;


import virtuallibrarytec.capaLogica.utils.ModeladorTablas;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import virtuallibrarytec.capaLogica.estructuras.NodoD;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibrerias;
import virtuallibrarytec.capaLogica.logicaNeogicos.Libreria;
import virtuallibrarytec.capaLogica.logicaNeogicos.Libro;

/**
 *
 * @author sebas
 */
public final class VentGestion_Librerias extends javax.swing.JDialog {

    private Principal principal;
    private GestionLibrerias gestion_librerias;

    /**
     *
     * @return
     */
    public Principal getPrincipal() {
        return principal;
    }

    /**
     *
     * @param principal
     */
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public GestionLibrerias getGestion_librerias() {
        return gestion_librerias;
    }

    public void setGestion_librerias(GestionLibrerias gestion_librerias) {
        this.gestion_librerias = gestion_librerias;
    }

    public JTable getTabla_Librerias() {
        return Tabla_Librerias;
    }

    public void setTabla_Librerias(JTable Tabla_Librerias) {
        this.Tabla_Librerias = Tabla_Librerias;
    }  

    /**
     * Creates new form VentGestion_Agencias1
     */
    VentGestion_Librerias(java.awt.Frame parent, boolean modal, Principal principal) {
        super(parent, modal);
        initComponents();
        this.principal = principal;

    }

    /**
     *
     */
    
    public void actualizarTabla() {
        if (principal.getLibrerias().getLista_librerias().esVacia()) {
            ModeladorTablas.vaciarTabla(Tabla_Librerias);
        } else {
            ModeladorTablas.vaciarTabla(Tabla_Librerias);
            Object[] filaNueva;
            NodoD<Libreria> temp = principal.getLibrerias().getLista_librerias().getCabeza();
            for (int i = 0; i < principal.getLibrerias().getLista_librerias().getTamano(); i++) {
                filaNueva = new Object[]{temp.getElemento().getNombre(),
                    temp.getElemento().getPais(),temp.getElemento().getHorario(),
                    temp.getElemento().getUbicacion(),temp.getElemento().getNumero()};
                ModeladorTablas.nuevaFila(Tabla_Librerias, filaNueva);
                temp = temp.getSiguiente();
            }

        }
    }

    /**
     *
     * @throws Exception
     */
    public void eliminarDesdeTabla() throws Exception {
        principal.getLibrerias().getLista_librerias().eliminar(Tabla_Librerias.getSelectedRow());
        //Tabla_Agencias.remove(Tabla_Agencias.getSelectedRow());
        this.dispose();
        VentGestion_Librerias crear_Libreria = new VentGestion_Librerias(principal, rootPaneCheckingEnabled,principal);
        Object[] columnasAgencias = new Object[] {"Nombre","País","Ubicación","Horario","Número"};        
        crear_Libreria.getTabla_Librerias().setModel(ModeladorTablas.generarModeloDeTabla(5, columnasAgencias));
        crear_Libreria.getTabla_Librerias().setAutoCreateRowSorter(false);
        crear_Libreria.actualizarTabla();
        crear_Libreria.setVisible(true);
        crear_Libreria.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabla_lib = new javax.swing.JScrollPane();
        Tabla_Librerias = new javax.swing.JTable();
        jButtonCrear_NuevaLibreria = new javax.swing.JButton();
        jButtonEliminar_Libreria = new javax.swing.JButton();
        jButtonConsular_Libreria = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla_Librerias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_lib.setViewportView(Tabla_Librerias);

        jButtonCrear_NuevaLibreria.setText("Crear nueva Librería");
        jButtonCrear_NuevaLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrear_NuevaLibreriaActionPerformed(evt);
            }
        });

        jButtonEliminar_Libreria.setText("Eliminar Librería");
        jButtonEliminar_Libreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminar_LibreriaActionPerformed(evt);
            }
        });

        jButtonConsular_Libreria.setText("Consultar Librería");
        jButtonConsular_Libreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsular_LibreriaActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setText("Gestión de Librerías");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabelTitulo)
                .addContainerGap(570, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tabla_lib)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConsular_Libreria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar_Libreria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCrear_NuevaLibreria, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabla_lib, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButtonCrear_NuevaLibreria)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar_Libreria)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsular_Libreria)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrear_NuevaLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrear_NuevaLibreriaActionPerformed
        VentCrear_Librerias crear_Agencia = new VentCrear_Librerias(this, rootPaneCheckingEnabled, this);
        crear_Agencia.setVisible(true);
        crear_Agencia.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    }//GEN-LAST:event_jButtonCrear_NuevaLibreriaActionPerformed

    private void jButtonEliminar_LibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminar_LibreriaActionPerformed
        try {

            eliminarDesdeTabla();
            

        } catch (Exception ex) {
            //ystem.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonEliminar_LibreriaActionPerformed

    private void jButtonConsular_LibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsular_LibreriaActionPerformed
        int row = Tabla_Librerias.getSelectedRow();
       String ID,Nombre,Tema,Descripcion, Precio;
       ID  = Tabla_Librerias.getModel().getValueAt(row, 0).toString();
       Nombre = Tabla_Librerias.getModel().getValueAt(row, 1).toString();
       Tema = Tabla_Librerias.getModel().getValueAt(row, 2).toString();
       Descripcion =Tabla_Librerias.getModel().getValueAt(row, 3).toString();
       Precio = Tabla_Librerias.getModel().getValueAt(row, 4).toString();
       
        
        VentVer_Librerias verLibro = new VentVer_Librerias(this, rootPaneCheckingEnabled,this);
        //this.jTextFieldBusqueda.setText("");
        verLibro.getjTextFieldNombre().setText(ID);
        verLibro.getjTextFieldPais().setText(Nombre);
        verLibro.getjTextFieldUbicacion().setText(Tema);
        verLibro.getjTextFieldhorario().setText(Descripcion);
        verLibro.getjTextFieldtelefono().setText(Precio);
                
                
         verLibro.setVisible(true);
         verLibro.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jButtonConsular_LibreriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Librerias;
    private javax.swing.JButton jButtonConsular_Libreria;
    private javax.swing.JButton jButtonCrear_NuevaLibreria;
    private javax.swing.JButton jButtonEliminar_Libreria;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane tabla_lib;
    // End of variables declaration//GEN-END:variables
}
