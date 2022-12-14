
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
public class RegisterEmployee extends javax.swing.JFrame {

    /**
     * Creates new form RegisterEmployee
     */
    public RegisterEmployee() {
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
        firstnamel = new javax.swing.JLabel();
        middlenamel = new javax.swing.JLabel();
        lastnamel = new javax.swing.JLabel();
        emaill = new javax.swing.JLabel();
        kebelel = new javax.swing.JLabel();
        contactl = new javax.swing.JLabel();
        genderbox = new javax.swing.JComboBox<>();
        genderl = new javax.swing.JLabel();
        firstnamefield = new javax.swing.JTextField();
        middlenamefield = new javax.swing.JTextField();
        lastnamefield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        contactfield = new javax.swing.JTextField();
        savebutton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        cityl = new javax.swing.JLabel();
        zonel = new javax.swing.JLabel();
        homenumberl = new javax.swing.JLabel();
        homenumberfield = new javax.swing.JTextField();
        kebelefield = new javax.swing.JTextField();
        cityfield = new javax.swing.JTextField();
        zonefield = new javax.swing.JTextField();
        passwordl = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        positionbox = new javax.swing.JComboBox<>();
        positionl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(363, 36));
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 500));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainbadge.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mainbadge.setText("Employee Registration");
        getContentPane().add(mainbadge, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 400, 50));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        firstnamel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstnamel.setText("First Name");
        getContentPane().add(firstnamel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        middlenamel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        middlenamel.setText("Middle Name");
        getContentPane().add(middlenamel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        lastnamel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastnamel.setText("Last Name");
        getContentPane().add(lastnamel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        emaill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emaill.setText("E-mail");
        getContentPane().add(emaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 50, -1));

        kebelel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kebelel.setText("Kebele");
        getContentPane().add(kebelel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 55, -1));

        contactl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contactl.setText("Contact");
        getContentPane().add(contactl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        genderbox.setForeground(new java.awt.Color(153, 153, 153));
        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Femal", "Others" }));
        genderbox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        genderbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderboxActionPerformed(evt);
            }
        });
        getContentPane().add(genderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 277, -1));

        genderl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genderl.setText("Gender");
        getContentPane().add(genderl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

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
        getContentPane().add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 277, -1));

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
        getContentPane().add(middlenamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 277, -1));

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
        getContentPane().add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 277, -1));

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
        getContentPane().add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 210, -1));

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
        getContentPane().add(contactfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 277, -1));

        savebutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savebutton.setText("Save");
        savebutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 60, -1));

        resetbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resetbutton.setText("Reset");
        resetbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(resetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 680, 80, -1));

        closebutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        closebutton.setText("Close");
        closebutton.setToolTipText("");
        closebutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 680, 70, -1));

        cityl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cityl.setText("City");
        getContentPane().add(cityl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 43, -1));

        zonel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        zonel.setText("Zone");
        getContentPane().add(zonel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 43, -1));

        homenumberl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homenumberl.setText("Home Number");
        getContentPane().add(homenumberl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, -1, -1));

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
        getContentPane().add(homenumberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 277, -1));

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
        getContentPane().add(kebelefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 277, -1));

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
        getContentPane().add(cityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 277, -1));

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
        getContentPane().add(zonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 277, -1));

        passwordl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordl.setText("Password");
        getContentPane().add(passwordl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        passwordfield.setForeground(new java.awt.Color(153, 153, 153));
        passwordfield.setText("**********");
        passwordfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        passwordfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordfieldFocusLost(evt);
            }
        });
        getContentPane().add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 210, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, -1));

        positionbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        positionbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Officer", "Inspector", "Manager" }));
        positionbox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(positionbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 210, -1));

        positionl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        positionl.setText("Position");
        getContentPane().add(positionl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 120, -1));

        jPanel1.setBackground(new java.awt.Color(110, 190, 242));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1090, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1090, 520));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(110, 190, 242));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 130));

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
new RegisterEmployee().setVisible(true);// TODO add your handling code here:
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
        String password = passwordfield.getText();
        String position = (String) positionbox.getSelectedItem();
        
try{
            Connection con = ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into employee values('"+email+"','"+password+"','"+firstname+"','"+middlename+"','"+lastname+"','"+gender+"','"+contact+"','"+homenumber+"','"+kebele+"','"+city+"','"+zone+"','"+position+"')");
        JOptionPane.showMessageDialog(null, "Registered Successfully");
        setVisible(false);
        new RegisterEmployee().setVisible(true);
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Email must be unique");
        } 
    }//GEN-LAST:event_savebuttonActionPerformed

    private void firstnamefieldComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_firstnamefieldComponentShown

    }//GEN-LAST:event_firstnamefieldComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      
    }//GEN-LAST:event_formComponentShown

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
if(jCheckBox1.isSelected()){
    passwordfield.setEchoChar((char)0);}
else
{
    passwordfield.setEchoChar('*');
}        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void passwordfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldFocusGained
                // TODO add your handling code here:
        if(passwordfield.getText().equals("**********")){
            passwordfield.setText("");
        passwordfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_passwordfieldFocusGained

    private void passwordfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldFocusLost
                                 if(passwordfield.getText().equals("")){
            passwordfield.setText("**********");
        passwordfield.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_passwordfieldFocusLost

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
                new RegisterEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityfield;
    private javax.swing.JLabel cityl;
    private javax.swing.JButton closebutton;
    private javax.swing.JTextField contactfield;
    private javax.swing.JLabel contactl;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel emaill;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JLabel firstnamel;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JLabel genderl;
    private javax.swing.JTextField homenumberfield;
    private javax.swing.JLabel homenumberl;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField kebelefield;
    private javax.swing.JLabel kebelel;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JLabel lastnamel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbadge;
    private javax.swing.JTextField middlenamefield;
    private javax.swing.JLabel middlenamel;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JLabel passwordl;
    private javax.swing.JComboBox<String> positionbox;
    private javax.swing.JLabel positionl;
    private javax.swing.JButton resetbutton;
    private javax.swing.JButton savebutton;
    private javax.swing.JTextField zonefield;
    private javax.swing.JLabel zonel;
    // End of variables declaration//GEN-END:variables
}
