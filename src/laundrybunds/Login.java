/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrybunds;

import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.*;
import controller.koneksi;

/**
 *
 * @author user
 */
public class Login extends javax.swing.JFrame {
    Connection con = koneksi.getKoneksi();
    ResultSet rs = null;
    PreparedStatement ps = null;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        textpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        textname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnlogin.png"))); // NOI18N
        btnLogin.setPreferredSize(new java.awt.Dimension(223, 39));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(87, 250, 223, 39);
        btnLogin.getAccessibleContext().setAccessibleParent(btnLogin);

        textpass.setPreferredSize(new java.awt.Dimension(190, 39));
        getContentPane().add(textpass);
        textpass.setBounds(120, 200, 190, 39);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgpassword.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(223, 39));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(87, 200, 223, 39);

        textname.setPreferredSize(new java.awt.Dimension(190, 39));
        getContentPane().add(textname);
        textname.setBounds(120, 150, 190, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgusername.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(223, 39));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(87, 150, 223, 39);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundLogin.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String sql = "select * from login where username=? and password=?";
        try{
            ps= con.prepareStatement(sql);
            ps.setString(1, textname.getText());
            ps.setString(2, String.valueOf(textpass.getPassword()));
            rs = ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Login berhasil");
                new Menu().setVisible(true);
                this.dispose();
            }else
                JOptionPane.showMessageDialog(null, "Masukkan data dengan benar");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textname;
    private javax.swing.JPasswordField textpass;
    // End of variables declaration//GEN-END:variables
}
