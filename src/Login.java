

import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author semha
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        nameuser = new javax.swing.JLabel();
        wordpass = new javax.swing.JLabel();
        showpasswordbutton = new javax.swing.JCheckBox();
        loginbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        usernamefield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        logingif = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameuser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameuser.setText("Username");
        getContentPane().add(nameuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, -1));

        wordpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wordpass.setText("Password");
        getContentPane().add(wordpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 78, -1));

        showpasswordbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showpasswordbutton.setText("Show Password");
        showpasswordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(showpasswordbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 173, -1));

        loginbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        closebutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        closebutton.setText("Close");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, -1, -1));

        usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, 258, -1));

        passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, 258, -1));

        logingif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login ani.gif"))); // NOI18N
        logingif.setText("jLabel3");
        getContentPane().add(logingif, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 279, 128));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginbck.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showpasswordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordbuttonActionPerformed
if(showpasswordbutton.isSelected()){
    passwordfield.setEchoChar((char)0);}
else
{
    passwordfield.setEchoChar('*');
}// TODO add your handling code here:
    }//GEN-LAST:event_showpasswordbuttonActionPerformed

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_usernamefieldActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
int a = JOptionPane.showConfirmDialog(null,"Do you want to close application", "Select", JOptionPane.YES_NO_OPTION);    
if (a==0){
System.exit(0);}// TODO add your handling code here:
    }//GEN-LAST:event_closebuttonActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed

        String email = usernamefield.getText();
        String password = passwordfield.getText();
        
try{
Connection con = ConnectionProvider.getCon();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from employee where email = '"+email+"'");
if (rs.next()){
    if(rs.getString(2).equals(password)&& rs.getString(12).equals("Manager")){
    
  setVisible(false);
new ManagerHome(email).setVisible(true);}else if(rs.getString(2).equals(password)&& rs.getString(12).equals("Officer")){
        setVisible(false);
    new OfficerHome(email).setVisible(true);
    ////////here officer
}else if(rs.getString(2).equals(password)&& rs.getString(12).equals("Inspector")){
    ////////here inspector
        setVisible(false);
    new InspectorHome(email).setVisible(true);

}
    
    
}
else{
    JOptionPane.showMessageDialog(null, "Incorrect Email or Password");
}
}catch(Exception e){
        
        JOptionPane.showMessageDialog(null,"Incorrect Email or Password");
}
        
   
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfieldActionPerformed
this.loginbuttonActionPerformed(evt);               // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldActionPerformed

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
    private javax.swing.JButton closebutton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel logingif;
    private javax.swing.JLabel nameuser;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JCheckBox showpasswordbutton;
    private javax.swing.JTextField usernamefield;
    private javax.swing.JLabel wordpass;
    // End of variables declaration//GEN-END:variables
}