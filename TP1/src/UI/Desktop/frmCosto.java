package UI.Desktop;

import BusinessEntities.Viaje;
import javax.swing.JOptionPane;
import BusinessLogic.LocalidadLogic;
import BusinessLogic.ViajeLogic;

public class frmCosto extends javax.swing.JFrame {

    public ViajeLogic viaje;
    
    public frmCosto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public frmCosto(ViajeLogic viajeActual) {
        initComponents();
        viaje = viajeActual;
        this.setLocationRelativeTo(null);
       
    }
    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCosto = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtCosto = new javax.swing.JTextField();
        lblOrigen = new javax.swing.JLabel();
        javax.swing.JLabel lblDestino = new javax.swing.JLabel();
        lblTren = new javax.swing.JLabel();
        lblVagon = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtTren = new javax.swing.JTextField();
        txtVagon = new javax.swing.JTextField();
        lblDistancia = new javax.swing.JLabel();
        txtDistancia = new javax.swing.JTextField();
        txtKm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Costo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCosto.setText("Costo:  $");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCosto.setEnabled(false);

        lblOrigen.setText("Origen");

        lblDestino.setText("Destino");

        lblTren.setText("Tren");

        lblVagon.setText("Vagón");

        txtOrigen.setEnabled(false);

        txtDestino.setEnabled(false);

        txtTren.setEnabled(false);

        txtVagon.setEnabled(false);

        lblDistancia.setText("Distancia");

        txtDistancia.setEnabled(false);

        txtKm.setText("km");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrigen)
                        .addGap(27, 27, 27)
                        .addComponent(txtOrigen))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTren)
                            .addComponent(lblVagon))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTren)
                            .addComponent(txtVagon)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDestino)
                        .addGap(23, 23, 23)
                        .addComponent(txtDestino)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDistancia)
                    .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKm)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestino)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTren)
                    .addComponent(txtTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVagon)
                    .addComponent(txtVagon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistancia)
                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKm))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCosto)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        lblCosto.getAccessibleContext().setAccessibleName("lblCosto");
        btnAceptar.getAccessibleContext().setAccessibleName("btnAceptar");
        btnCancelar.getAccessibleContext().setAccessibleName("btnCancelar");
        txtCosto.getAccessibleContext().setAccessibleName("txtCosto");
        lblOrigen.getAccessibleContext().setAccessibleName("lblOrigen");
        lblDestino.getAccessibleContext().setAccessibleName("lblDestino");
        lblTren.getAccessibleContext().setAccessibleName("lblTren");
        lblVagon.getAccessibleContext().setAccessibleName("lblVagon");
        txtOrigen.getAccessibleContext().setAccessibleName("txtOrigen");
        txtDestino.getAccessibleContext().setAccessibleName("txtDestino");
        txtTren.getAccessibleContext().setAccessibleName("txtTren");
        txtVagon.getAccessibleContext().setAccessibleName("txtVagon");
        lblDistancia.getAccessibleContext().setAccessibleName("lblDistancia");
        txtDistancia.getAccessibleContext().setAccessibleName("txtDistancia");
        txtKm.getAccessibleContext().setAccessibleName("txtKm");

        getAccessibleContext().setAccessibleName("frmCosto");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        frmDatos datos = new frmDatos();
        datos.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

  
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        //completar los txt
        this.txtOrigen.setText(viaje.devolverOrigen());
        this.txtDestino.setText(viaje.devolverDestino());
        String lineaTren = Integer.toString(viaje.devolverLineaTren());
        this.txtTren.setText(lineaTren.toString());
        this.txtVagon.setText(viaje.devolverTipoVagon());
        String distancia = Float.toString(viaje.devolverDistancia());
        this.txtDistancia.setText(distancia);        
        float costo = (float) (Math.floor(1e2 * (viaje.devolverCosto())) / 1e2); 
        this.txtCosto.setText(Float.toString(costo));
        
    }//GEN-LAST:event_formWindowOpened

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int seleccion = JOptionPane.showOptionDialog( 
                this, // Componente padre
                "¿Desea comprar el boleto?", //Mensaje
                "Seleccione una opción", // Título
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,    // null para icono por defecto.
                new Object[] { "Si", "No"},    // null para YES, NO y CANCEL
                "Si");
        
        if (seleccion != -1)
        {
              if((seleccion + 1)==1)
                {
                    viaje.setViaje();
                    dispose();
                    frmPrincipal principal = new frmPrincipal();
                    principal.setVisible(true);
                }
              else
                {
                    
                    
                }
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCosto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblTren;
    private javax.swing.JLabel lblVagon;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JLabel txtKm;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtTren;
    private javax.swing.JTextField txtVagon;
    // End of variables declaration//GEN-END:variables
}
