/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtuallibrarytec.capaPresentacion.main;

/**
 *
 * @author sebas
 */
public class VentCrear_Librerias extends javax.swing.JDialog {
    private VentGestion_Librerias ventGestionLibreria;

    
    public VentCrear_Librerias(java.awt.Dialog parent, boolean modal,VentGestion_Librerias ventGestionLibreria) {
        super(parent, modal);
        initComponents();
        this.ventGestionLibreria= ventGestionLibreria;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonCrear_Libreria = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        jTextFieldPais = new javax.swing.JTextField();
        jLabelUbicacion = new javax.swing.JLabel();
        jTextFieldUbicacion = new javax.swing.JTextField();
        jLabelHorario = new javax.swing.JLabel();
        jTextFieldhorario = new javax.swing.JTextField();
        jLabeltelefono = new javax.swing.JLabel();
        jTextFieldtelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombre.setText("Nombre:");

        jButtonCrear_Libreria.setText("Crear Librería");
        jButtonCrear_Libreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrear_LibreriaActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitulo.setText("Crear Librería");

        jLabelPais.setText("País:");

        jLabelUbicacion.setText("Ubicación:");

        jLabelHorario.setText("Horario:");

        jLabeltelefono.setText("Número de teléfono:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButtonCrear_Libreria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabelNombre)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelPais)
                                            .addGap(36, 36, 36)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUbicacion)
                                            .addComponent(jLabelHorario))
                                        .addGap(10, 10, 10)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldhorario, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jTextFieldUbicacion)
                                    .addComponent(jTextFieldPais)
                                    .addComponent(jTextFieldNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabeltelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPais)
                    .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUbicacion)
                    .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabelHorario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jTextFieldhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltelefono)
                    .addComponent(jTextFieldtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButtonCrear_Libreria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrear_LibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrear_LibreriaActionPerformed
       String nombre,pais,ubicacion,horario;
       int numero;
       
       nombre = this.jTextFieldNombre.getText();
       pais= this.jTextFieldPais.getText();
       ubicacion = this.jTextFieldUbicacion.getText();
       horario = this.jTextFieldhorario.getText();
       numero = Integer.parseInt(this.jTextFieldtelefono.getText());
       
       ventGestionLibreria.getPrincipal().getLibrerias().crear(nombre,pais,ubicacion,horario,numero);
       System.out.println(ventGestionLibreria.getPrincipal().getLibrerias().consultar());
       ventGestionLibreria.actualizarTabla();
       
        
       this.dispose();
    }//GEN-LAST:event_jButtonCrear_LibreriaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrear_Libreria;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JLabel jLabeltelefono;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldUbicacion;
    private javax.swing.JTextField jTextFieldhorario;
    private javax.swing.JTextField jTextFieldtelefono;
    // End of variables declaration//GEN-END:variables
}
