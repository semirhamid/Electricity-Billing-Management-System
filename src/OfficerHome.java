
import java.awt.Toolkit;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author semha
 */
public class OfficerHome extends javax.swing.JFrame {
String email;
static String semail;
    /**
     * Creates new form Use
     */
    public OfficerHome(String email) {
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
        addcustomerbutton = new javax.swing.JButton();
        updatecustomerbutton = new javax.swing.JButton();
        customerdetail = new javax.swing.JButton();
        removecustomerbutton = new javax.swing.JButton();
        addrecordbutton = new javax.swing.JButton();
        updaterecordbutton = new javax.swing.JButton();
        deleterecordbutton = new javax.swing.JButton();
        billingbutton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        smalllogo = new javax.swing.JLabel();
        recorddetailbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        biglogo = new javax.swing.JLabel();

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

        addcustomerbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addcustomerbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add customer 41.png"))); // NOI18N
        addcustomerbutton.setText("       Add customer");
        addcustomerbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addcustomerbutton.setContentAreaFilled(false);
        addcustomerbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addcustomerbutton.setSelected(true);
        addcustomerbutton.setVerifyInputWhenFocusTarget(false);
        addcustomerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustomerbuttonActionPerformed(evt);
            }
        });

        updatecustomerbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updatecustomerbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update customer 41.png"))); // NOI18N
        updatecustomerbutton.setText("       Update Customer");
        updatecustomerbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updatecustomerbutton.setContentAreaFilled(false);
        updatecustomerbutton.setHideActionText(true);
        updatecustomerbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        updatecustomerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecustomerbuttonActionPerformed(evt);
            }
        });

        customerdetail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        customerdetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer detail 41.png"))); // NOI18N
        customerdetail.setText("       Customer Detail");
        customerdetail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        customerdetail.setContentAreaFilled(false);
        customerdetail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        customerdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerdetailActionPerformed(evt);
            }
        });

        removecustomerbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        removecustomerbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete customer 41.png"))); // NOI18N
        removecustomerbutton.setText("       Remove customer");
        removecustomerbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        removecustomerbutton.setContentAreaFilled(false);
        removecustomerbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        removecustomerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removecustomerbuttonActionPerformed(evt);
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

        billingbutton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        billingbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing 41.png"))); // NOI18N
        billingbutton.setText("       Billing");
        billingbutton.setToolTipText("");
        billingbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        billingbutton.setContentAreaFilled(false);
        billingbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        billingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingbuttonActionPerformed(evt);
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
                        .addComponent(updatecustomerbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(customerdetail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(removecustomerbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(addrecordbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(updaterecordbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(deleterecordbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(billingbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(logoutbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addComponent(addcustomerbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(addcustomerbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(updatecustomerbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(customerdetail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(removecustomerbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(addrecordbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(updaterecordbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(deleterecordbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(recorddetailbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(billingbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(logoutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 770));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        biglogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homes.png"))); // NOI18N
        jPanel2.add(biglogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 799, -1));

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

    private void addcustomerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustomerbuttonActionPerformed
new NewCustomer().setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_addcustomerbuttonActionPerformed

    private void updatecustomerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecustomerbuttonActionPerformed
new UpdateCustomer().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_updatecustomerbuttonActionPerformed

    private void customerdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerdetailActionPerformed
new CustomerDetail().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_customerdetailActionPerformed

    private void removecustomerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removecustomerbuttonActionPerformed
new DeleteCustomer().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_removecustomerbuttonActionPerformed

    private void updaterecordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaterecordbuttonActionPerformed
new UpdateRecord().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_updaterecordbuttonActionPerformed

    private void deleterecordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterecordbuttonActionPerformed
new DeleteRecord().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_deleterecordbuttonActionPerformed

    private void billingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingbuttonActionPerformed
new Billing().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_billingbuttonActionPerformed

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
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficerHome(semail).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcustomerbutton;
    private javax.swing.JButton addrecordbutton;
    private javax.swing.JLabel biglogo;
    private javax.swing.JButton billingbutton;
    private javax.swing.JButton customerdetail;
    private javax.swing.JButton deleterecordbutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton profilebutton;
    private javax.swing.JButton recorddetailbutton;
    private javax.swing.JButton removecustomerbutton;
    private javax.swing.JLabel smalllogo;
    private javax.swing.JButton updatecustomerbutton;
    private javax.swing.JButton updaterecordbutton;
    // End of variables declaration//GEN-END:variables
}