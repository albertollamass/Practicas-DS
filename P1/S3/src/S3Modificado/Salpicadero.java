/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package S3Modificado;

/**
 *
 * @author luisg
 */
public class Salpicadero extends javax.swing.JFrame {

    private float RPM;
    //private EstadoMotor estado;
    private Controlador controlador;
    
    void botonPulsado(){
        int botonPulsado = 2;
        switch(botonPulsado){
            case 0: controlador.modificarEstado(EstadoMotor.ACELERANDO);
        }
    }
    
    /**
     * @param controlador El controlador del motor
     */
    /*public Salpicadero(Controlador controlador) {
        initComponents();
        this.RPM = 0;
        this.controlador = controlador;
    }*/
    
    public void pushRPM(float RPM){
        this.RPM = RPM;
    }
    
    /*public void pushEstado(EstadoMotor estado){
        this.estado = estado;
    }*/
    
    /*private void acelerar(){
        controlador.modificarEstado(EstadoMotor.ACELERANDO);
    }
    
    private void frenar(){
        controlador.modificarEstado(EstadoMotor.FRENANDO);
    }*/
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Palanca = new javax.swing.ButtonGroup();
        PanelCruz = new javax.swing.JPanel();
        PHorizontal1 = new javax.swing.JPanel();
        PVertical1 = new javax.swing.JPanel();
        Acelerar1 = new javax.swing.JButton();
        Frenar1 = new javax.swing.JButton();
        Mantener1 = new javax.swing.JButton();
        Reiniciar1 = new javax.swing.JButton();
        RadioFrenar = new javax.swing.JRadioButton();
        RadioAcelerar = new javax.swing.JRadioButton();
        RadioMantener = new javax.swing.JRadioButton();
        RadioReiniciar = new javax.swing.JRadioButton();
        RadioCentrado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PHorizontal1.setBackground(new java.awt.Color(255, 255, 0));
        PHorizontal1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PHorizontal1.setFocusable(false);
        PHorizontal1.setOpaque(false);

        javax.swing.GroupLayout PHorizontal1Layout = new javax.swing.GroupLayout(PHorizontal1);
        PHorizontal1.setLayout(PHorizontal1Layout);
        PHorizontal1Layout.setHorizontalGroup(
            PHorizontal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );
        PHorizontal1Layout.setVerticalGroup(
            PHorizontal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        PVertical1.setBackground(new java.awt.Color(255, 255, 0));
        PVertical1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PVertical1.setEnabled(false);
        PVertical1.setFocusable(false);
        PVertical1.setOpaque(false);

        javax.swing.GroupLayout PVertical1Layout = new javax.swing.GroupLayout(PVertical1);
        PVertical1.setLayout(PVertical1Layout);
        PVertical1Layout.setHorizontalGroup(
            PVertical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        PVertical1Layout.setVerticalGroup(
            PVertical1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        Acelerar1.setText("Acelerar");
        Acelerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acelerar1ActionPerformed(evt);
            }
        });

        Frenar1.setText("Frenar");

        Mantener1.setText("Mantener");

        Reiniciar1.setText("Reiniciar");

        Palanca.add(RadioFrenar);
        RadioFrenar.setText("jRadioButton1");
        RadioFrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioFrenarActionPerformed(evt);
            }
        });

        RadioAcelerar.setBackground(new java.awt.Color(51, 51, 51));
        Palanca.add(RadioAcelerar);
        RadioAcelerar.setText("jRadioButton2");

        Palanca.add(RadioMantener);
        RadioMantener.setText("jRadioButton4");

        Palanca.add(RadioReiniciar);
        RadioReiniciar.setText("jRadioButton3");

        Palanca.add(RadioCentrado);
        RadioCentrado.setText("jRadioButton1");
        RadioCentrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioCentradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCruzLayout = new javax.swing.GroupLayout(PanelCruz);
        PanelCruz.setLayout(PanelCruzLayout);
        PanelCruzLayout.setHorizontalGroup(
            PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCruzLayout.createSequentialGroup()
                .addGroup(PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCruzLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Frenar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(RadioReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCruzLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(RadioMantener, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(Reiniciar1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCruzLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mantener1)
                    .addComponent(Acelerar1))
                .addGap(111, 111, 111))
            .addGroup(PanelCruzLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(RadioAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCruzLayout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(PHorizontal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
            .addGroup(PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCruzLayout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(PVertical1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
            .addGroup(PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCruzLayout.createSequentialGroup()
                    .addContainerGap(138, Short.MAX_VALUE)
                    .addComponent(RadioCentrado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(136, Short.MAX_VALUE)))
        );
        PanelCruzLayout.setVerticalGroup(
            PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCruzLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Acelerar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Frenar1)
                    .addComponent(Reiniciar1)
                    .addComponent(RadioFrenar)
                    .addComponent(RadioReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(RadioMantener, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mantener1)
                .addGap(36, 36, 36))
            .addGroup(PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCruzLayout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(PHorizontal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
            .addGroup(PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCruzLayout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(PVertical1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
            .addGroup(PanelCruzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCruzLayout.createSequentialGroup()
                    .addContainerGap(112, Short.MAX_VALUE)
                    .addComponent(RadioCentrado, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(116, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(779, Short.MAX_VALUE)
                .addComponent(PanelCruz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(PanelCruz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Acelerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acelerar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Acelerar1ActionPerformed

    private void RadioFrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioFrenarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioFrenarActionPerformed

    private void RadioCentradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioCentradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioCentradoActionPerformed

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Salpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salpicadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salpicadero().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acelerar1;
    private javax.swing.JButton Frenar1;
    private javax.swing.JButton Mantener1;
    private javax.swing.JPanel PHorizontal1;
    private javax.swing.JPanel PVertical1;
    private javax.swing.ButtonGroup Palanca;
    private javax.swing.JPanel PanelCruz;
    private javax.swing.JRadioButton RadioAcelerar;
    private javax.swing.JRadioButton RadioCentrado;
    private javax.swing.JRadioButton RadioFrenar;
    private javax.swing.JRadioButton RadioMantener;
    private javax.swing.JRadioButton RadioReiniciar;
    private javax.swing.JButton Reiniciar1;
    // End of variables declaration//GEN-END:variables
}
