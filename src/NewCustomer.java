

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import Project.ConnectionProvider;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author semha
 */
public class NewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form NewCustomer
     */
    public NewCustomer() {
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

        mainbadge = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namefirst = new javax.swing.JLabel();
        namemiddle = new javax.swing.JLabel();
        namelast = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        contactnum = new javax.swing.JLabel();
        genderbox = new javax.swing.JComboBox<>();
        sex = new javax.swing.JLabel();
        firstnamefield = new javax.swing.JTextField();
        middlenamefield = new javax.swing.JTextField();
        lastnamefield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        contactfield = new javax.swing.JTextField();
        savebutton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        kebelekebele = new javax.swing.JLabel();
        citycity = new javax.swing.JLabel();
        zonet = new javax.swing.JLabel();
        homenumbernumber = new javax.swing.JLabel();
        homenumberfield = new javax.swing.JTextField();
        kebelefield = new javax.swing.JTextField();
        cityfield = new javax.swing.JTextField();
        zonefield = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        cidbadge = new javax.swing.JLabel();
        customerid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(363, 36));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1110, 697));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainbadge.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mainbadge.setText("New Customer");
        getContentPane().add(mainbadge, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 261, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        namefirst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namefirst.setText("First Name");
        getContentPane().add(namefirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        namemiddle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namemiddle.setText("Middle Name");
        getContentPane().add(namemiddle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        namelast.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namelast.setText("Last Name");
        getContentPane().add(namelast, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setText("E-mail");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 50, -1));

        contactnum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contactnum.setText("Contact");
        getContentPane().add(contactnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        genderbox.setForeground(new java.awt.Color(153, 153, 153));
        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Femal", "Others" }));
        genderbox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        genderbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderboxActionPerformed(evt);
            }
        });
        getContentPane().add(genderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 277, -1));

        sex.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sex.setText("Gender");
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        firstnamefield.setForeground(new java.awt.Color(153, 153, 153));
        firstnamefield.setText("Enter First Name");
        firstnamefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        firstnamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstnamefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstnamefieldFocusLost(evt);
            }
        });
        firstnamefield.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                firstnamefieldComponentShown(evt);
            }
        });
        firstnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 277, -1));

        middlenamefield.setForeground(new java.awt.Color(153, 153, 153));
        middlenamefield.setText("Enter Middle Name");
        middlenamefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        middlenamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                middlenamefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                middlenamefieldFocusLost(evt);
            }
        });
        middlenamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(middlenamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 277, -1));

        lastnamefield.setForeground(new java.awt.Color(153, 153, 153));
        lastnamefield.setText("Enter Last Name");
        lastnamefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lastnamefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastnamefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastnamefieldFocusLost(evt);
            }
        });
        lastnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 277, -1));

        emailfield.setForeground(new java.awt.Color(153, 153, 153));
        emailfield.setText("example@aait.com");
        emailfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        emailfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailfieldFocusLost(evt);
            }
        });
        emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 277, -1));

        contactfield.setForeground(new java.awt.Color(153, 153, 153));
        contactfield.setText("+251111111111");
        contactfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contactfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactfieldFocusLost(evt);
            }
        });
        contactfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactfieldActionPerformed(evt);
            }
        });
        getContentPane().add(contactfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 277, -1));

        savebutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, -1, -1));

        resetbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resetbutton.setText("Reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(resetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 680, -1, -1));

        closebutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        closebutton.setText("Close");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 680, -1, -1));

        kebelekebele.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kebelekebele.setText("Kebele");
        getContentPane().add(kebelekebele, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 55, -1));

        citycity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        citycity.setText("City");
        getContentPane().add(citycity, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 43, -1));

        zonet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        zonet.setText("Zone");
        getContentPane().add(zonet, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 43, -1));

        homenumbernumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homenumbernumber.setText("Home Number");
        getContentPane().add(homenumbernumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, -1, -1));

        homenumberfield.setForeground(new java.awt.Color(153, 153, 153));
        homenumberfield.setText("225");
        homenumberfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        homenumberfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                homenumberfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                homenumberfieldFocusLost(evt);
            }
        });
        homenumberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homenumberfieldActionPerformed(evt);
            }
        });
        getContentPane().add(homenumberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 277, -1));

        kebelefield.setForeground(new java.awt.Color(153, 153, 153));
        kebelefield.setText("05");
        kebelefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        kebelefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kebelefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kebelefieldFocusLost(evt);
            }
        });
        kebelefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kebelefieldActionPerformed(evt);
            }
        });
        getContentPane().add(kebelefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 277, -1));

        cityfield.setForeground(new java.awt.Color(153, 153, 153));
        cityfield.setText("Hawassa");
        cityfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cityfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityfieldFocusLost(evt);
            }
        });
        cityfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityfieldActionPerformed(evt);
            }
        });
        getContentPane().add(cityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 277, -1));

        zonefield.setForeground(new java.awt.Color(153, 153, 153));
        zonefield.setText("Sidama");
        zonefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        zonefield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zonefieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zonefieldFocusLost(evt);
            }
        });
        zonefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonefieldActionPerformed(evt);
            }
        });
        getContentPane().add(zonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 277, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 110, 100));

        cidbadge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cidbadge.setText("17850");
        getContentPane().add(cidbadge, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, -1, -1));

        customerid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerid.setText("Customer ID");
        getContentPane().add(customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, -1));

        jPanel1.setBackground(new java.awt.Color(110, 190, 242));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 130));

        jPanel4.setBackground(new java.awt.Color(110, 190, 242));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1090, 120));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1090, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnamefieldActionPerformed

    }//GEN-LAST:event_firstnamefieldActionPerformed

    private void lastnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnamefieldActionPerformed

    }//GEN-LAST:event_lastnamefieldActionPerformed

    private void emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldActionPerformed

    private void genderboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderboxActionPerformed

    private void contactfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactfieldActionPerformed

    private void kebelefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kebelefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kebelefieldActionPerformed

    private void zonefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zonefieldActionPerformed

    private void firstnamefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnamefieldFocusGained
                if(firstnamefield.getText().equals("Enter First Name")){
            firstnamefield.setText("");
        firstnamefield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_firstnamefieldFocusGained

    private void firstnamefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnamefieldFocusLost
                 if(firstnamefield.getText().equals("")){
            firstnamefield.setText("Enter First Name");
        firstnamefield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_firstnamefieldFocusLost

    private void middlenamefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middlenamefieldFocusGained
        // TODO add your handling code here:
        if(middlenamefield.getText().equals("Enter Middle Name")){
            middlenamefield.setText("");
        middlenamefield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_middlenamefieldFocusGained

    private void middlenamefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middlenamefieldFocusLost
        // TODO add your handling code here:                 
        if(middlenamefield.getText().equals("")){
            middlenamefield.setText("Enter Middle Name");
        middlenamefield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_middlenamefieldFocusLost

    private void lastnamefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnamefieldFocusGained
        // TODO add your handling code here:
        if(lastnamefield.getText().equals("Enter Last Name")){
            lastnamefield.setText("");
        lastnamefield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_lastnamefieldFocusGained

    private void lastnamefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnamefieldFocusLost
        // TODO add your handling code here:
                         if(lastnamefield.getText().equals("")){
            lastnamefield.setText("Enter Last Name");
        lastnamefield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_lastnamefieldFocusLost

    private void emailfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailfieldFocusGained
        // TODO add your handling code here:
        if(emailfield.getText().equals("example@aait.com")){
            emailfield.setText("");
        emailfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emailfieldFocusGained

    private void emailfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailfieldFocusLost
        // TODO add your handling code here:
                         if(emailfield.getText().equals("")){
            emailfield.setText("example@aait.com");
        emailfield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_emailfieldFocusLost

    private void contactfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactfieldFocusGained
        // TODO add your handling code here:
        if(contactfield.getText().equals("+251111111111")){
            contactfield.setText("");
        contactfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_contactfieldFocusGained

    private void contactfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactfieldFocusLost
        // TODO add your handling code here:
                         if(contactfield.getText().equals("")){
            contactfield.setText("+251111111111");
        contactfield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_contactfieldFocusLost

    private void homenumberfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homenumberfieldFocusGained
        // TODO add your handling code here:
        if(homenumberfield.getText().equals("225")){
            homenumberfield.setText("");
        homenumberfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_homenumberfieldFocusGained

    private void homenumberfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homenumberfieldFocusLost
        // TODO add your handling code here:
                         if(homenumberfield.getText().equals("")){
            homenumberfield.setText("225");
        homenumberfield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_homenumberfieldFocusLost

    private void kebelefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kebelefieldFocusGained
        // TODO add your handling code here:
        if(kebelefield.getText().equals("05")){
            kebelefield.setText("");
        kebelefield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_kebelefieldFocusGained

    private void kebelefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kebelefieldFocusLost
        // TODO add your handling code here:
                         if(kebelefield.getText().equals("")){
            kebelefield.setText("05");
        kebelefield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_kebelefieldFocusLost

    private void cityfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityfieldFocusGained
        // TODO add your handling code here:
        if(cityfield.getText().equals("Hawassa")){
            cityfield.setText("");
        cityfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_cityfieldFocusGained

    private void cityfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityfieldFocusLost
        // TODO add your handling code here:
                         if(cityfield.getText().equals("")){
            cityfield.setText("Hawassa");
        cityfield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_cityfieldFocusLost

    private void zonefieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zonefieldFocusGained
        // TODO add your handling code here:
        if(zonefield.getText().equals("Sidama")){
            zonefield.setText("");
        zonefield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_zonefieldFocusGained

    private void zonefieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zonefieldFocusLost
        // TODO add your handling code here:
                         if(zonefield.getText().equals("")){
            zonefield.setText("Sidama");
        zonefield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_zonefieldFocusLost

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_closebuttonActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
setVisible(false);
new NewCustomer().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void middlenamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenamefieldActionPerformed

    private void homenumberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homenumberfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homenumberfieldActionPerformed

    private void cityfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityfieldActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
String cid = cidbadge.getText();
        String firstname = firstnamefield.getText();
        String middlename = middlenamefield.getText();
        String lastname = lastnamefield.getText();
        String email = emailfield.getText();
        String contact = contactfield.getText();
        String homenumber = homenumberfield.getText();
        String kebele = kebelefield.getText();
        String city = cityfield.getText();
        String zone = zonefield.getText();
        String gender = (String) genderbox.getSelectedItem();
        
try{
            Connection con = ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into customer values('"+firstname+"','"+middlename+"','"+lastname+"','"+contact+"','"+email+"','"+homenumber+"','"+kebele+"','"+city+"','"+zone+"','"+gender+"','"+cid+"')");
        JOptionPane.showMessageDialog(null, "Successfully Inserted");
        setVisible(false);
        new NewCustomer().setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }      


        
         try{
           Connection con = ConnectionProvider.getCon();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select max(rid) from record");
           if(rs.next()){
               int id = rs.getInt(1);
               id = id + 1;
               String str = String.valueOf(id);
               int rid =id;
               DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDateTime now = LocalDateTime.now();
               st.executeUpdate("insert into record values('"+rid+"','"+cid+"','"+0+"','"+""+"','"+"null"+"','"+dtf.format(now)+"')");
           }
           else{
               cidbadge.setText("17850");
           }
          
           
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
    }//GEN-LAST:event_savebuttonActionPerformed

    private void firstnamefieldComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_firstnamefieldComponentShown

    }//GEN-LAST:event_firstnamefieldComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
           Connection con = ConnectionProvider.getCon();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select max(cid) from customer");
           if(rs.next()){
               int cid = rs.getInt(1);
               cid = cid + 33;
               String str = String.valueOf(cid);
               cidbadge.setText(str);
           }
           else{
               cidbadge.setText("17850");
           }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage());
       }        
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the comm
     * 
     * 
     *  and line arguments
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
                new NewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cidbadge;
    private javax.swing.JLabel citycity;
    private javax.swing.JTextField cityfield;
    private javax.swing.JButton closebutton;
    private javax.swing.JTextField contactfield;
    private javax.swing.JLabel contactnum;
    private javax.swing.JLabel customerid;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailfield;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JTextField homenumberfield;
    private javax.swing.JLabel homenumbernumber;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField kebelefield;
    private javax.swing.JLabel kebelekebele;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbadge;
    private javax.swing.JTextField middlenamefield;
    private javax.swing.JLabel namefirst;
    private javax.swing.JLabel namelast;
    private javax.swing.JLabel namemiddle;
    private javax.swing.JButton resetbutton;
    private javax.swing.JButton savebutton;
    private javax.swing.JLabel sex;
    private javax.swing.JTextField zonefield;
    private javax.swing.JLabel zonet;
    // End of variables declaration//GEN-END:variables
}