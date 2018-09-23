/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuallibrarytec.capaPresentacion.main;


import static javafx.scene.input.KeyCode.T;
import virtuallibrarytec.capaLogica.utils.ModeladorTablas;
import javax.swing.JTable;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import virtuallibrarytec.capaLogica.estructuras.Lista;
import virtuallibrarytec.capaLogica.estructuras.ListaD;
import virtuallibrarytec.capaLogica.estructuras.NodoD;
import virtuallibrarytec.capaLogica.estructuras.NodoS;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionBusqueda;
import virtuallibrarytec.capaLogica.logicaNeogicos.GestionLibros;
import virtuallibrarytec.capaLogica.logicaNeogicos.Libreria;
import virtuallibrarytec.capaLogica.logicaNeogicos.Libro;

/**
 *
 * @author sebas
 */
public class VentBusqueda extends javax.swing.JDialog {
    private Principal principal;
    private GestionLibros libros;
   
    Lista<Libro> resultados;

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

    public GestionLibros getLibros() {
        return libros;
    }

    /**
     *
     * @return
     */
    public void setLibros(GestionLibros libros) {    
        this.libros = libros;
    }

    public JTable getTabla_Libros() {
        return Tabla_Libros;
    }

    public void setTabla_Libros(JTable Tabla_Libros) {
        this.Tabla_Libros = Tabla_Libros;
    }

    public JTextField getjTextFieldBusqueda() {
        return jTextFieldBusqueda;
    }

    public void setjTextFieldBusqueda(JTextField jTextFieldBusqueda) {
        this.jTextFieldBusqueda = jTextFieldBusqueda;
    }

    public JTextField getjTextFieldLibreria() {
        return jTextFieldLibreria;
    }

    public void setjTextFieldLibreria(JTextField jTextFieldLibreria) {
        this.jTextFieldLibreria = jTextFieldLibreria;
    }

    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public void setjTextFieldNombre(JTextField jTextFieldNombre) {
        this.jTextFieldNombre = jTextFieldNombre;
    }

    public JTextField getjTextFieldPrecio() {
        return jTextFieldPrecio;
    }

    public void setjTextFieldPrecio(JTextField jTextFieldPrecio) {
        this.jTextFieldPrecio = jTextFieldPrecio;
    }

    public JTextField getjTextFieldTema() {
        return jTextFieldTema;
    }

    public void setjTextFieldTema(JTextField jTextFieldTema) {
        this.jTextFieldTema = jTextFieldTema;
    }

    
    
    

    /**
     * Creates new form VentGestion_Vehiculos
     * @param parent
     * @param modal
     * @param principal
     */
    public VentBusqueda(java.awt.Frame parent, boolean modal, Principal principal) {
        super(parent,modal);
        initComponents();
        this.principal = principal;
        this.resultados = new Lista<Libro>();
        
    }
    /**public void buscar(){
        String ID = this.jTextFieldBusqueda.getText();
        NodoD <Libro> temp = principal.getLibros().getLista_libros().getCabeza();
        for (int i = 0;i<principal.getLibros().getLista_libros().getTamano();i++){
            if(ID.equals(temp.getElemento().getID())){
                
                resultados.agregar_final(temp.getElemento());
            }temp = temp.getSiguiente();
            if (ID.equals(temp.getElemento().getNombre())){
                
                resultados.agregar_final(temp.getElemento());
            }temp = temp.getSiguiente();
            if (ID.equals(temp.getElemento().getTema())){
                
                resultados.agregar_final(temp.getElemento());
            }temp = temp.getSiguiente();
            if (ID.equals(temp.getElemento().getPrecio())){
                
                resultados.agregar_final(temp.getElemento());
            }temp = temp.getSiguiente();
            if (ID.equals(temp.getElemento().getDescripcion())){
                
                resultados.agregar_final(temp.getElemento());
            }temp = temp.getSiguiente();
            if (ID.equals(temp.getElemento().getLibreriapertenece())){
                
                resultados.agregar_final(temp.getElemento());
            }
            
            
        }
    }*/
    public void buscarID(){
        String ID = this.jTextFieldBusqueda.getText();
        NodoD <Libro> temp = principal.getLibros().getLista_libros().getCabeza();
        for (int i = 0;i<principal.getLibros().getLista_libros().getTamano();i++){
            if(ID.equals(temp.getElemento().getID())){
                
                resultados.agregar_final(temp.getElemento());
            }temp = temp.getSiguiente();
           
            
            
        }
    }
    
    
    public void buscarNombre(){
        String ID = this.jTextFieldNombre.getText();
        NodoD <Libro> temp = principal.getLibros().getLista_libros().getCabeza();
        for (int i = 0;i<principal.getLibros().getLista_libros().getTamano();i++){
            
            if (ID.equals(temp.getElemento().getNombre())){
                
                resultados.agregar_final(temp.getElemento());
            }temp = temp.getSiguiente();  
        }
    }
    public void buscarTema(){
        String ID = this.jTextFieldTema.getText();
        NodoD <Libro> temp = principal.getLibros().getLista_libros().getCabeza();
        for (int i = 0;i<principal.getLibros().getLista_libros().getTamano();i++){
            
            if (ID.equals(temp.getElemento().getTema())){
                
                resultados.agregar_final(temp.getElemento());
            }temp = temp.getSiguiente();
            
            
        }
    }
    public void buscarPrecio(){
       int ID = Integer.parseInt(this.jTextFieldPrecio.getText());
        NodoD <Libro> temp = principal.getLibros().getLista_libros().getCabeza();
        for (int i = 0;i<principal.getLibros().getLista_libros().getTamano();i++){
            
            if (ID == temp.getElemento().getPrecio()){
                
                resultados.agregar_final(temp.getElemento());
            }temp = temp.getSiguiente();
            
            
            
        }
    }
    public void buscarLibreria(){
       String ID = this.jTextFieldLibreria.getText();
        NodoD <Libreria> temp = principal.getLibrerias().getLista_librerias().getCabeza();
        for (int i = 0;i< principal.getLibrerias().getLista_librerias().getTamano();i++){
            NodoS libron = temp.getElemento().getLista_libros().getCabeza();
            if (ID.equals(temp.getElemento().getNombre().toString())){
                
                for (int j = 0; j < temp.getElemento().getLista_libros().getTamano(); j++) {
                     resultados.agregar_inicio(temp.getElemento().getLista_libros().getCabeza());
                
               
               
            }} 
            temp = temp.getSiguiente();
            
            
        } 
    }

     public void actualizarTabla() {
        if (resultados.esVacia()) {
            ModeladorTablas.vaciarTabla(Tabla_Libros);
        } else {
            ModeladorTablas.vaciarTabla(Tabla_Libros);
            Object[] filaNueva;
            NodoS <Libro> temp = resultados.getCabeza();
            for (int i = 0; i < resultados.getTamano(); i++) {
                filaNueva = new Object[]{temp.getContiene().getID(),temp.getContiene().getNombre(),
                    temp.getContiene().getTema(),temp.getContiene().getDescripcion(),temp.getContiene().getCantVend(),
                    temp.getContiene().getCantDisp(),temp.getContiene().getPrecio()
                    };
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
        //principal.getVehiculos().getLista_vehiculos().eliminar(Tabla_Vehiculos.getSelectedRow());
        //Tabla_Agencias.remove(Tabla_Agencias.getSelectedRow());
        this.dispose();
        
        VentBusqueda crear_Libro = new VentBusqueda(principal, rootPaneCheckingEnabled,principal);
        
       Object[] columnasLibros = new Object[] {"ID","Nombre","Tema","Descripción","Cantidad Vendida","Cantidad Disponible","Precio"};        
        crear_Libro.getTabla_Libros().setModel(ModeladorTablas.generarModeloDeTabla(7, columnasLibros));
        crear_Libro.getTabla_Libros().setAutoCreateRowSorter(false);
        //crear_Vehiculo.actualizarTabla();
        
        crear_Libro.setVisible(true);
        crear_Libro.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
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
        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButtonBuscarID = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTema = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLibreria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jButtonBuscarNombre = new javax.swing.JButton();
        jButtonBuscarPrecio = new javax.swing.JButton();
        jButtonBuscaLibreria = new javax.swing.JButton();
        jButtonBuscarTema = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitulo.setText("Búsqueda de Libros");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ingrese el ID:");

        jButtonBuscarID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonBuscarID.setText("Buscar por ID");
        jButtonBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarIDActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setText("Ver libro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Ingrese el Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Ingrese el Tema:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Ingrese el nombre de la Libreria:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Ingrese el Precio:");

        jButtonBuscarNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonBuscarNombre.setText("Buscar por Nombre");
        jButtonBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarNombreActionPerformed(evt);
            }
        });

        jButtonBuscarPrecio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonBuscarPrecio.setText("Buscar por Precio");
        jButtonBuscarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarPrecioActionPerformed(evt);
            }
        });

        jButtonBuscaLibreria.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonBuscaLibreria.setText("Buscar por nombre de Libreria");
        jButtonBuscaLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaLibreriaActionPerformed(evt);
            }
        });

        jButtonBuscarTema.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonBuscarTema.setText("Buscar por Tema");
        jButtonBuscarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTemaActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Ver Historial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(644, 644, 644)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1424, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButtonBuscarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonBuscaLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldTema, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonBuscarPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonBuscarTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonBuscarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBuscarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTema, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscaLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButtonBuscarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(433, 433, 433))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int row = Tabla_Libros.getSelectedRow();
       String ID,Nombre,Tema,Descripcion, Precio;
       ID  = Tabla_Libros.getModel().getValueAt(row, 0).toString();
       Nombre = Tabla_Libros.getModel().getValueAt(row, 1).toString();
       Tema = Tabla_Libros.getModel().getValueAt(row, 2).toString();
       Descripcion =Tabla_Libros.getModel().getValueAt(row, 3).toString();
       Precio = Tabla_Libros.getModel().getValueAt(row, 4).toString();
       
       Libro libronuevo = new Libro(ID,Nombre,Tema,Descripcion,Integer.parseInt(Precio)); 
        
        principal.getHistorial().getHistorial2().agregar_inicio(libronuevo);
        System.out.println("agrego el libro");
        System.out.println( principal.getHistorial().getHistorial2().toString());
        
        VentVerLibro verLibro = new VentVerLibro(this, rootPaneCheckingEnabled,this);
        //this.jTextFieldBusqueda.setText("");
        verLibro.getjTextFieldID().setText(ID);
        verLibro.getjTextFieldNombre().setText(Nombre);
        verLibro.getjTextFieldTema().setText(Tema);
        verLibro.getjTextFieldDescripcion().setText(Descripcion);
        verLibro.getjTextFieldPrecio().setText(Precio);
                
                
         verLibro.setVisible(true);
         verLibro.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarNombreActionPerformed
       try{
        buscarNombre();
       this.jTextFieldNombre.setText("");
        this.actualizarTabla();
        resultados.Vaciar();
       }catch(Exception e) {

    System.out.println("ERROR");

}
    }//GEN-LAST:event_jButtonBuscarNombreActionPerformed

    private void jButtonBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarIDActionPerformed
       try{
        buscarID();
        this.jTextFieldBusqueda.setText("");
        this.actualizarTabla();
        resultados.Vaciar();
       }catch(Exception e) {

    System.out.println("ERROR");

}

    }//GEN-LAST:event_jButtonBuscarIDActionPerformed

    private void jButtonBuscarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarPrecioActionPerformed
       try{
        buscarPrecio();
        this.jTextFieldPrecio.setText("");
        this.actualizarTabla();
        resultados.Vaciar();
       }catch(Exception e) {

    System.out.println("ERROR");

}
        
    }//GEN-LAST:event_jButtonBuscarPrecioActionPerformed

    private void jButtonBuscaLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaLibreriaActionPerformed
      //areglar para que busque
        try{ 
        buscarLibreria();
        this.jTextFieldLibreria.setText("");
        this.actualizarTabla();
        resultados.Vaciar();
       }catch(Exception e) {

    System.out.println("ERROR");

}
    }//GEN-LAST:event_jButtonBuscaLibreriaActionPerformed

    private void jButtonBuscarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTemaActionPerformed
        try{
        buscarTema();
        this.jTextFieldTema.setText("");
        this.actualizarTabla();
        resultados.Vaciar();
        
        }catch(Exception e) {

                     System.out.println("ERROR");

}
        
    }//GEN-LAST:event_jButtonBuscarTemaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       VentHistorial crear_compra = new VentHistorial(this, rootPaneCheckingEnabled,this);
         Object[] columnasLibros = new Object[] {"ID","Nombre","Tema","Descripción","Precio"};        
         crear_compra.getTablaHistorial().setModel(ModeladorTablas.generarModeloDeTabla(5, columnasLibros));
         crear_compra.getTablaHistorial().setAutoCreateRowSorter(false);
         crear_compra.actualizarTabla();
         
         crear_compra.setVisible(true);
         crear_compra.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Libros;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscaLibreria;
    private javax.swing.JButton jButtonBuscarID;
    private javax.swing.JButton jButtonBuscarNombre;
    private javax.swing.JButton jButtonBuscarPrecio;
    private javax.swing.JButton jButtonBuscarTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldLibreria;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldTema;
    // End of variables declaration//GEN-END:variables
}
