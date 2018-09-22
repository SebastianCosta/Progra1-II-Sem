/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuallibrarytec.capaPresentacion.main;


import virtuallibrarytec.capaLogica.utils.ModeladorTablas;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import virtuallibrarytec.capaLogica.estructuras.Nodo;
import virtuallibrarytec.capaLogica.estructuras.NodoD;
import virtuallibrarytec.capaLogica.estructuras.NodoS;
import virtuallibrarytec.capaLogica.logicaNeogicos.Cliente;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionClientesPedidos;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibros;
import virtuallibrarytec.capaLogica.logicaNeogicos.Libreria;
import virtuallibrarytec.capaLogica.logicaNeogicos.Libro;
import virtuallibrarytec.capaLogica.logicaNeogicos.Pedido;

/**
 *
 * @author sebas
 */
public class VentGestionparaCliente extends javax.swing.JDialog {
    
    private GestionClientesPedidos clientes;
    private Principal principal;

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
    

    public JTable getTabla_Libros() {
        return Tabla_Libros;
    }

    public void setTabla_Libros(JTable Tabla_Libros) {
        this.Tabla_Libros = Tabla_Libros;
    }

    
    
    

    /**
     * Creates new form VentGestion_Vehiculos
     * @param parent
     * @param modal
     * @param principal
     */
    public VentGestionparaCliente(java.awt.Frame parent, boolean modal, Principal principal) {
        super(parent,modal);
        initComponents();
        this.principal = principal;
        
    }

    /**
     *
     */
    public void actualizarTabla(Cliente elemento) {
        if (elemento.getLibros_compra().esVacia()) {
            ModeladorTablas.vaciarTabla(Tabla_Libros);
        } else {
            ModeladorTablas.vaciarTabla(Tabla_Libros);
            Object[] filaNueva;
            NodoS <Libro> temp = elemento.getLibros_compra().getCabeza();
            for (int i = 0; i < elemento.getLibros_compra().getTamano(); i++) {
                filaNueva = new Object[]{temp.getContiene().getID(),temp.getContiene().getNombre(),temp.getContiene().getTema(),
                    temp.getContiene().getDescripcion(),temp.getContiene().getPrecio()};
                ModeladorTablas.nuevaFila(Tabla_Libros, filaNueva);
                temp = temp.getSiguiente();
            }

        }
    }

    /**
     *
     * @throws Exception
     */
    public void eliminarDesdeTabla() throws Exception {
        
        this.busCliente().getLibros_compra().eliminar(Tabla_Libros.getSelectedRow());
        
        //Tabla_Agencias.remove(Tabla_Agencias.getSelectedRow());
        this.dispose();
        
        VentGestionparaCliente crear_Libro = new VentGestionparaCliente(principal, rootPaneCheckingEnabled,principal);
        
        Object[] columnasLibros = new Object[] {"ID","Nombre","Tema","Descripción","Precio"};        
        crear_Libro.getTabla_Libros().setModel(ModeladorTablas.generarModeloDeTabla(5, columnasLibros));
        crear_Libro.getTabla_Libros().setAutoCreateRowSorter(false);
        crear_Libro.actualizarTabla(busCliente());
        
        crear_Libro.setVisible(true);
        crear_Libro.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    public Cliente busCliente(){
        String cedula = this.jTextFieldCedula.getText();
      
        
            NodoS<Cliente> temp =  principal.getUsuarios().getLista_clientes().getCabeza();
            for (int i = 0; i < principal.getUsuarios().getLista_clientes().getTamano(); i++) {
                System.out.println("Entro al for"+i);
                
                if (cedula.equals(temp.getContiene().getCedula())){
                    System.out.println("entro al if de busCliente");
                    System.out.println(temp.getContiene().toString());
                    return temp.getContiene();
                    
                    
    }                                                    
           temp = temp.getSiguiente(); }
        return null;
        
        
       
        
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Libros = new javax.swing.JTable();
        jButtonComprar_Libro = new javax.swing.JButton();
        jButtonGestionarPedidos = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla_Libros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla_Libros);

        jButtonComprar_Libro.setText("Comprar Libro");
        jButtonComprar_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprar_LibroActionPerformed(evt);
            }
        });

        jButtonGestionarPedidos.setText("Eliminar Libro");
        jButtonGestionarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarPedidosActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitulo.setText("Gestión de Pedidos del Cliente");

        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese su cédula para buscar sus pedidos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(165, 165, 165)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonComprar_Libro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGestionarPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButtonComprar_Libro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGestionarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprar_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprar_LibroActionPerformed
        int row = Tabla_Libros.getSelectedRow();
        String ID,Nombre,Tema,Descripcion, Precio;
       ID  = Tabla_Libros.getModel().getValueAt(row, 0).toString();
       Nombre = Tabla_Libros.getModel().getValueAt(row, 1).toString();
       Tema = Tabla_Libros.getModel().getValueAt(row, 2).toString();
       Descripcion =Tabla_Libros.getModel().getValueAt(row, 3).toString();
       Precio = Tabla_Libros.getModel().getValueAt(row, 4).toString();
       
       //actualiza la cantidad de libros disponibles y vendidos
      NodoD<Libro> temporal = principal.getLibros().getLista_libros().getCabeza();
            for (int i = 0; i < principal.getLibros().getLista_libros().getTamano(); i++) {
                if ( ID.equals(temporal.getElemento().getID())){
                    temporal.getElemento().actualizarcantidad();
                    System.out.println("sirve");
                    break;
                    
        
        
            }}

       // agrega el libro al carrito de compras del cliente
      
       Libro libronuevo = new Libro(ID,Nombre,Tema,Descripcion,Integer.parseInt(Precio));
       
       String cedula = this.jTextFieldCedula.getText();
      
        
            NodoS<Cliente> temp =  principal.getUsuarios().getLista_clientes().getCabeza();
            for (int i = 0; i < principal.getUsuarios().getLista_clientes().getTamano(); i++) {
                System.out.println("Entro al for"+i);
                
                if (cedula.equals(temp.getContiene().getCedula())){
                    System.out.println("entro al if");
                    
                    temp.getContiene().agregaraLista(libronuevo);
                    
                    System.out.println(temp.getContiene().getLibros_compra().toString());
                    break;
        
    }//GEN-LAST:event_jButtonComprar_LibroActionPerformed
           temp = temp.getSiguiente(); }}
    
    private void jButtonGestionarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarPedidosActionPerformed
       try {

            eliminarDesdeTabla();
            

        } catch (Exception ex) {
            //ystem.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonGestionarPedidosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.busCliente();
        this.actualizarTabla(this.busCliente());
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Libros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonComprar_Libro;
    private javax.swing.JButton jButtonGestionarPedidos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCedula;
    // End of variables declaration//GEN-END:variables
}
