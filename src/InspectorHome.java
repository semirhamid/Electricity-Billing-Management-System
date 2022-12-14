
import java.awt.Toolkit;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author semha
 */
public class InspectorHome extends javax.swing.JFrame {
String email;
static String semail;
    /**
     * Creates new form Use
     */
    public InspectorHome(String email) {
        this.email = email;
        this.semail = email;
        initComponents();
        setResizable(false);
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        profilebutton = new javax.swing.JButton();
        customerdetailbutton = new javax.swing.JButton();
        addrecordbutton = new javax.swing.JButton();
        updaterecordbutton = new javax.swing.JButton();
        deleterecordbutton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        smalllogo = new javax.swing.JLabel();
        recorddetailbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Biglogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 190, 255));

        profilebutton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        profilebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile.png"))); // NOI18N
        profilebutton.setText("       Profile");
        profilebutton.setToolTipText("");
        profilebutton.setActionCommand("Profile");
        profilebutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        profilebutton.setContentAreaFilled(false);
        profilebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profilebutton.setFocusable(false);
        profilebutton.setHideActionText(true);
        profilebutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        profilebutton.setSelected(true);
        profilebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebuttonActionPerformed(evt);
            }
        });

        customerdetailbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerdetailbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer detail 41.png"))); // NOI18N
        customerdetailbutton.setText("       Customer Detail");
        customerdetailbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        customerdetailbutton.setContentAreaFilled(false);
        customerdetailbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        customerdetailbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerdetailbuttonActionPerformed(evt);
            }
        });

        addrecordbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addrecordbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add record 41.png"))); // NOI18N
        addrecordbutton.setText("       Add Record");
        addrecordbutton.setToolTipText("");
        addrecordbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addrecordbutton.setContentAreaFilled(false);
        addrecordbutton.setHideActionText(true);
        addrecordbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addrecordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrecordbuttonActionPerformed(evt);
            }
        });

        updaterecordbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updaterecordbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update record 41.png"))); // NOI18N
        updaterecordbutton.setText("       Update Record");
        updaterecordbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        updaterecordbutton.setContentAreaFilled(false);
        updaterecordbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        updaterecordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updaterecordbuttonActionPerformed(evt);
            }
        });

        deleterecordbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleterecordbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete record 41.png"))); // NOI18N
        deleterecordbutton.setText("       Delete Record");
        deleterecordbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        deleterecordbutton.setContentAreaFilled(false);
        deleterecordbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deleterecordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterecordbuttonActionPerformed(evt);
            }
        });

        logoutbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout 41.png"))); // NOI18N
        logoutbutton.setText("       Logout");
        logoutbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        logoutbutton.setContentAreaFilled(false);
        logoutbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        smalllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin logo.png"))); // NOI18N
        smalllogo.setText("jLabel1");

        recorddetailbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recorddetailbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/record detail.png"))); // NOI18N
        recorddetailbutton.setText("       Record Detail");
        recorddetailbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        recorddetailbutton.setContentAreaFilled(false);
        recorddetailbutton.setHideActionText(true);
        recorddetailbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        recorddetailbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recorddetailbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(smalllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(customerdetailbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(addrecordbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(updaterecordbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(deleterecordbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(logoutbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(profilebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(recorddetailbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(smalllogo)
                .addGap(2, 2, 2)
                .addComponent(profilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(customerdetailbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(addrecordbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(updaterecordbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(deleterecordbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(recorddetailbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 770));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Biglogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homes.png"))); // NOI18N
        Biglogo.setText("jLabel2");
        jPanel2.add(Biglogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 790, 439));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1110, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebuttonActionPerformed
new Profile(email).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_profilebuttonActionPerformed

    private void addrecordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrecordbuttonActionPerformed
new NewRecord().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_addrecordbuttonActionPerformed

    private void recorddetailbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recorddetailbuttonActionPerformed
new RecordDetails().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_recorddetailbuttonActionPerformed

    private void customerdetailbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerdetailbuttonActionPerformed
new CustomerDetail().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_customerdetailbuttonActionPerformed

    private void updaterecordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaterecordbuttonActionPerformed
new UpdateRecord().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_updaterecordbuttonActionPerformed

    private void deleterecordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterecordbuttonActionPerformed
new DeleteRecord().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_deleterecordbuttonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
setVisible(false);
new Login().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_logoutbuttonActionPerformed
private void setIconImage(){
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("payenergy.png")));
        
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InspectorHome(semail).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Biglogo;
    private javax.swing.JButton addrecordbutton;
    private javax.swing.JButton customerdetailbutton;
    private javax.swing.JButton deleterecordbutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton profilebutton;
    private javax.swing.JButton recorddetailbutton;
    private javax.swing.JLabel smalllogo;
    private javax.swing.JButton updaterecordbutton;
    // End of variables declaration//GEN-END:variables
}
