
package UI.Desktop;

import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;



//* IMPORTAR CLASES
import BusinessEntities.Localidad;
import BusinessEntities.Tren;
import BusinessEntities.Vagon;
import BusinessEntities.Viaje;
import BusinessLogic.LocalidadLogic;
import BusinessLogic.TrenLogic;
import BusinessLogic.VagonLogic;
import BusinessLogic.ViajeLogic;
import java.util.ArrayList;

        

public class frmViaje extends javax.swing.JFrame {

  
   
    public frmViaje() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbxOrigen = new javax.swing.JComboBox();
        lblOrigen = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblTren = new javax.swing.JLabel();
        lblTipoVagon = new javax.swing.JLabel();
        cbxDestino = new javax.swing.JComboBox();
        cbxTren = new javax.swing.JComboBox();
        cbxTipoVagon = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viaje");
        setName("Viaje"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        cbxOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrigenActionPerformed(evt);
            }
        });

        lblOrigen.setText("Origen");

        lblDestino.setText("Destino");

        lblTren.setText("Tren");

        lblTipoVagon.setText("Tipo de Vagón");

        cbxDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxTren.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxTipoVagon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrigen)
                            .addComponent(lblDestino)
                            .addComponent(lblTren)
                            .addComponent(lblTipoVagon))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxTipoVagon, 0, 292, Short.MAX_VALUE)
                            .addComponent(cbxOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxTren, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrigen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestino)
                    .addComponent(cbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTren)
                    .addComponent(cbxTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoVagon)
                    .addComponent(cbxTipoVagon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        btnAceptar.getAccessibleContext().setAccessibleName("btnAceptar");
        btnCancelar.getAccessibleContext().setAccessibleName("btnCancelar");
        cbxOrigen.getAccessibleContext().setAccessibleName("cbxOrigen");
        lblOrigen.getAccessibleContext().setAccessibleName("lblOrigen");
        lblDestino.getAccessibleContext().setAccessibleName("lblDestino");
        lblTren.getAccessibleContext().setAccessibleName("lblTren");
        lblTipoVagon.getAccessibleContext().setAccessibleName("lblTipoVagon");
        cbxDestino.getAccessibleContext().setAccessibleName("cbxDestino");
        cbxTren.getAccessibleContext().setAccessibleName("cbxTren");
        cbxTipoVagon.getAccessibleContext().setAccessibleName("cbxTipoVagon");

        getAccessibleContext().setAccessibleName("frmViaje");

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        frmPrincipal principal = new frmPrincipal();
        principal.setVisible(true);
        
        /*int i = JOptionPane.showConfirmDialog(this,"¿Realmente desea salir?","Confirmar salida",JOptionPane.YES_NO_OPTION);
        if(i==0){
        System.exit(0);
           }*/
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //LOCALIDADES
        LocalidadLogic localidadLogic = new LocalidadLogic();         
        ArrayList<Localidad> localidades = new ArrayList<Localidad>();
        localidades = localidadLogic.getAll();
        this.cbxOrigen.setModel(new DefaultComboBoxModel(localidades.toArray()));
        this.cbxDestino.setModel(new DefaultComboBoxModel(localidades.toArray()));
        
      
        //TRENES
        //getOne 
        //TrenLogic trenLogic = new TrenLogic();
        //Tren tren = new Tren();
        //int aux = 2;
        //tren = trenLogic.getByNum(aux);
        //ArrayList<Tren> trenes = new ArrayList<Tren>();
        //trenes.add(tren);
        //this.cbxTren.setModel(new DefaultComboBoxModel(trenes.toArray()));
        
         
        //getAll 
        TrenLogic trenLogic = new TrenLogic();         
        ArrayList<Tren> trenes = new ArrayList<Tren>();
        trenes = trenLogic.getAll();
        this.cbxTren.setModel(new DefaultComboBoxModel(trenes.toArray()));
       
               
        //VAGONES
        VagonLogic vagonLogic = new VagonLogic();
        ArrayList<Vagon> vagones = new ArrayList<Vagon>();      
        vagones = vagonLogic.getAll();
        this.cbxTipoVagon.setModel(new DefaultComboBoxModel(vagones.toArray()));
  
    }//GEN-LAST:event_formWindowOpened

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
         
        //validar que origen y destino sean diferentes
        int c1 = cbxOrigen.getSelectedIndex();
        int c2 = cbxDestino.getSelectedIndex();
        
        if (c1 == c2)
        {
            JOptionPane.showMessageDialog(this,"- Origen y destino iguales","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        { 
            ViajeLogic viajeActual = new ViajeLogic();
            
            Localidad locOrig = (Localidad) cbxOrigen.getSelectedItem();
                        
            Localidad locDest = (Localidad) cbxDestino.getSelectedItem();
            
            Tren tren = (Tren) cbxTren.getSelectedItem();
            
            Vagon vagon = (Vagon) cbxTipoVagon.getSelectedItem();
            
            viajeActual.nuevoViaje(locOrig,locDest,tren,vagon);
            
                      
            
            
            frmDatos datos = new frmDatos(viajeActual);
            datos.setVisible(true);
            this.setVisible(false);
            
            
        }
            
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cbxOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOrigenActionPerformed

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
            java.util.logging.Logger.getLogger(frmViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmViaje().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cbxDestino;
    private javax.swing.JComboBox cbxOrigen;
    private javax.swing.JComboBox cbxTipoVagon;
    private javax.swing.JComboBox cbxTren;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblTipoVagon;
    private javax.swing.JLabel lblTren;
    // End of variables declaration//GEN-END:variables
}
