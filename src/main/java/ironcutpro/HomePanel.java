/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ironcutpro;

/**
 *
 * @author main_
 */
public class HomePanel extends javax.swing.JFrame {

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
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

        RealizarC = new javax.swing.JButton();
        CarritoC = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        ImageUser = new javax.swing.JLabel();
        FondoHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RealizarC.setBackground(new java.awt.Color(102, 102, 102));
        RealizarC.setForeground(new java.awt.Color(153, 153, 255));
        RealizarC.setText("Realizar Compras");
        RealizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCActionPerformed(evt);
            }
        });
        getContentPane().add(RealizarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 194, 180, 30));

        CarritoC.setBackground(new java.awt.Color(102, 102, 102));
        CarritoC.setForeground(new java.awt.Color(153, 153, 255));
        CarritoC.setText("Carrito de compras");
        getContentPane().add(CarritoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 180, 30));

        Salir.setBackground(new java.awt.Color(153, 153, 255));
        Salir.setForeground(new java.awt.Color(102, 102, 102));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        ImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ironcutpro/Imagenes/User (1).png"))); // NOI18N
        getContentPane().add(ImageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 130, 110));

        FondoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ironcutpro/Imagenes/FONDOMETAL.jpg"))); // NOI18N
        getContentPane().add(FondoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 697, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RealizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RealizarCActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomePanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarritoC;
    private javax.swing.JLabel FondoHome;
    private javax.swing.JLabel ImageUser;
    private javax.swing.JButton RealizarC;
    private javax.swing.JButton Salir;
    // End of variables declaration//GEN-END:variables
}
