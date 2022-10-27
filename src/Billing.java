

import java.sql.*;
import Project.ConnectionProvider;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author semha
 */
public class Billing extends javax.swing.JFrame {
    public int finalTotal = 0;

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
        dt();
        times();
    }
    
    public void dt(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a");
        String dd = sdf.format(d);
        dateactual.setText(dd);
    }
    
    Timer t;
    SimpleDateFormat st;
    
    public void times(){
        
        t=new Timer(0, new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e){
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");
                String tt = st.format(dt);
                timeactual.setText(tt);
                
                }
        });
        t.start();
        
        

        
        
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datee = new javax.swing.JLabel();
        timee = new javax.swing.JLabel();
        dateactual = new javax.swing.JLabel();
        timeactual = new javax.swing.JLabel();
        customerdetail = new javax.swing.JLabel();
        Firstname = new javax.swing.JLabel();
        MiddleName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        firstnamefield = new javax.swing.JTextField();
        middlenamefield = new javax.swing.JTextField();
        lastnamefield = new javax.swing.JTextField();
        genderfield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        Contact = new javax.swing.JLabel();
        HomeNumber = new javax.swing.JLabel();
        Kebele = new javax.swing.JLabel();
        City = new javax.swing.JLabel();
        Zone = new javax.swing.JLabel();
        contactfield = new javax.swing.JTextField();
        homenumberfield = new javax.swing.JTextField();
        kebelefield = new javax.swing.JTextField();
        cityfield = new javax.swing.JTextField();
        zonefield = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        RecordDetail = new javax.swing.JLabel();
        RecordId = new javax.swing.JLabel();
        recordidfield = new javax.swing.JTextField();
        MeterCount = new javax.swing.JLabel();
        metercountfield = new javax.swing.JTextField();
        Description = new javax.swing.JLabel();
        descriptionfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Calculation = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        PaidAmount = new javax.swing.JLabel();
        Return = new javax.swing.JLabel();
        totalfield = new javax.swing.JTextField();
        PaidAmountfield = new javax.swing.JTextField();
        ReturnField = new javax.swing.JTextField();
        PAybutton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        customerid = new javax.swing.JLabel();
        customeridfield = new javax.swing.JTextField();
        statusfield = new javax.swing.JTextField();
        CloseButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(363, 36));
        setMaximumSize(new java.awt.Dimension(1090, 770));
        setMinimumSize(new java.awt.Dimension(1090, 770));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setText("Billing");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, 84));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billlllll.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 140, -1));

        datee.setText("Date");
        getContentPane().add(datee, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 37, -1));

        timee.setText("Time");
        getContentPane().add(timee, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 37, -1));

        dateactual.setText("jLabel5");
        getContentPane().add(dateactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 80, -1));

        timeactual.setText("jLabel6");
        getContentPane().add(timeactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 90, -1));

        customerdetail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerdetail.setText("Customer Details");
        getContentPane().add(customerdetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        Firstname.setText("First Name");
        getContentPane().add(Firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        MiddleName.setText("Middle Name");
        getContentPane().add(MiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 83, -1));

        LastName.setText("Last Name");
        getContentPane().add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 67, -1));

        Gender.setText("Gender");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 43, -1));

        Email.setText("Email");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 43, -1));

        firstnamefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        firstnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 170, -1));

        middlenamefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(middlenamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 170, -1));

        lastnamefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 170, -1));

        genderfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(genderfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 170, -1));

        emailfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfieldActionPerformed(evt);
            }
        });
        getContentPane().add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 210, -1));

        Contact.setText("Contact");
        getContentPane().add(Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 43, -1));

        HomeNumber.setText("Home Number");
        getContentPane().add(HomeNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        Kebele.setText("Kebele");
        getContentPane().add(Kebele, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 43, -1));

        City.setText("City");
        getContentPane().add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 43, -1));

        Zone.setText("Zone");
        getContentPane().add(Zone, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 43, -1));

        contactfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contactfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactfieldActionPerformed(evt);
            }
        });
        getContentPane().add(contactfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 170, -1));

        homenumberfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(homenumberfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 170, -1));

        kebelefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(kebelefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 170, -1));

        cityfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(cityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 170, -1));

        zonefield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        zonefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonefieldActionPerformed(evt);
            }
        });
        getContentPane().add(zonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 210, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 1050, 10));

        RecordDetail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RecordDetail.setText("Record Detail");
        getContentPane().add(RecordDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        RecordId.setText("Record ID");
        getContentPane().add(RecordId, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 344, -1, -1));

        recordidfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        recordidfield.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                recordidfieldComponentShown(evt);
            }
        });
        recordidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordidfieldActionPerformed(evt);
            }
        });
        getContentPane().add(recordidfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 341, 170, -1));

        MeterCount.setText("Meter Count");
        getContentPane().add(MeterCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, 20));

        metercountfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        metercountfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metercountfieldActionPerformed(evt);
            }
        });
        getContentPane().add(metercountfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 170, -1));

        Description.setText("Description");
        getContentPane().add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        descriptionfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(descriptionfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 170, -1));

        jTable1.setBackground(new java.awt.Color(110, 190, 242));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Date", "Meter Count", "Status"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 1020, 200));

        Calculation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Calculation.setText("Calculation Details");
        getContentPane().add(Calculation, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        Total.setText("Total");
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, 43, -1));

        PaidAmount.setText("Paid Amount");
        getContentPane().add(PaidAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, -1));

        Return.setText("Return Amount");
        getContentPane().add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 710, -1, -1));

        totalfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        totalfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalfieldActionPerformed(evt);
            }
        });
        getContentPane().add(totalfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 123, -1));

        PaidAmountfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PaidAmountfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaidAmountfieldActionPerformed(evt);
            }
        });
        getContentPane().add(PaidAmountfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 710, 123, -1));

        ReturnField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(ReturnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 700, 122, -1));

        PAybutton.setText("Pay");
        PAybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAybuttonActionPerformed(evt);
            }
        });
        getContentPane().add(PAybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 680, -1, -1));

        resetbutton.setText("Reset");
        resetbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(resetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, 50, -1));

        Status.setText("Status");
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, -1, -1));

        customerid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerid.setText("Customer Id");
        getContentPane().add(customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, -1, -1));

        customeridfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeridfieldActionPerformed(evt);
            }
        });
        getContentPane().add(customeridfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 120, -1));

        statusfield.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(statusfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 150, -1));

        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 720, -1, -1));

        jPanel1.setBackground(new java.awt.Color(110, 190, 242));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1090, 120));

        jPanel2.setBackground(new java.awt.Color(110, 190, 242));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1090, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldActionPerformed

    }//GEN-LAST:event_emailfieldActionPerformed

    private void zonefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zonefieldActionPerformed

    private void recordidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordidfieldActionPerformed
        // TODO add your handling code here:
        String rid = recordidfield.getText();
         try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from record where rid like '"+rid+"%'");
            if(rs.next()){
                recordidfield.setText(rs.getString(1));
                metercountfield.setText(rs.getString(3));
                descriptionfield.setText(rs.getString(4));
                statusfield.setText(rs.getString(5));
                metercountfield.setEditable(false);
                descriptionfield.setEditable(false);
                statusfield.setEditable(false);
                double total = Integer.parseInt(rs.getString(3));
                total = total * 0.35;
                String s = String.valueOf(total);
                totalfield.setText(s);
                
               
            }else{
                metercountfield.setText("");
                descriptionfield.setText("");
                statusfield.setText("");
                metercountfield.setEditable(false);
                descriptionfield.setEditable(false);
                statusfield.setEditable(false);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_recordidfieldActionPerformed

    private void totalfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalfieldActionPerformed

    private void firstnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnamefieldActionPerformed

    }//GEN-LAST:event_firstnamefieldActionPerformed

    private void contactfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactfieldActionPerformed
String contact = contactfield.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer where contactnumber like '"+contact+"%'");
            if(rs.next()){
                String cid = rs.getString(11);
                firstnamefield.setText(rs.getString(1));
                middlenamefield.setText(rs.getString(2));
                lastnamefield.setText(rs.getString(3));
                genderfield.setText(rs.getString(10));
                emailfield.setText(rs.getString(5));
                contactfield.setText(rs.getString(4));
                homenumberfield.setText(rs.getString(6));
                kebelefield.setText(rs.getString(7));
                cityfield.setText(rs.getString(8));
                zonefield.setText(rs.getString(9));
                customeridfield.setText(rs.getString(11));
                customeridfield.setEditable(false);

 

            }else{
                firstnamefield.setText("");
                middlenamefield.setText("");
                lastnamefield.setText("");
                genderfield.setText("");
                emailfield.setText("");
                homenumberfield.setText("");
                kebelefield.setText("");
                cityfield.setText("");
                zonefield.setText("");
                customeridfield.setText("");
                customeridfield.setEditable(false);
                
            }
                            try{
                    String cid = customeridfield.getText();
            Connection con2 = ConnectionProvider.getCon();
            Statement st2 = con.createStatement();
            ResultSet rs2 = st.executeQuery("select * from record where cid like '"+cid+"%'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs2)); 
  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
//           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }     
    try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String cid = customeridfield.getText();
            ResultSet rs1 = st.executeQuery("select sum(mcount) * 0.35 from record where cid=\"" +cid+ "\" and status=\"" +"Unpaid"+'"');
            if(rs1.next()){
                customeridfield.setText(rs1.getString(1));
                customeridfield.setEditable(false);
//      
  
            }else{
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }     
        
         

    }//GEN-LAST:event_contactfieldActionPerformed

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        
    }//GEN-LAST:event_jTable1ComponentShown

    private void recordidfieldComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_recordidfieldComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_recordidfieldComponentShown

    private void customeridfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeridfieldActionPerformed
        String cid = customeridfield.getText();
           
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer where cid='"+cid+"%'");
            if(rs.next()){
                
                firstnamefield.setText(rs.getString(1));
                middlenamefield.setText(rs.getString(2));
                lastnamefield.setText(rs.getString(3));
                genderfield.setText(rs.getString(10));
                emailfield.setText(rs.getString(5));
                contactfield.setText(rs.getString(4));
                homenumberfield.setText(rs.getString(6));
                kebelefield.setText(rs.getString(7));
                cityfield.setText(rs.getString(8));
                zonefield.setText(rs.getString(9));
                customeridfield.setText(rs.getString(11));
                
                
              


            }else{
                firstnamefield.setText("");
                middlenamefield.setText("");
                lastnamefield.setText("");
                genderfield.setText("");
                contactfield.setText("");
                homenumberfield.setText("");
                kebelefield.setText("");
                cityfield.setText("");
                zonefield.setText("");
                customeridfield.setText("");
               }
                try{
//                    String cid = jTextField18.getText();
            Connection con2 = ConnectionProvider.getCon();
            Statement st2 = con.createStatement();
            ResultSet rs2 = st.executeQuery("select * from record where cid like '"+cid+"%'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs2)); 
  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }     
                
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        // TODO add your handling code here:
            try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
//            String cid = jTextField18.getText();
            ResultSet rs1 = st.executeQuery("select sum(mcount) * 0.35 from record where cid=\"" +cid+ "\" and status=\"" +"Unpaid"+'"');
            if(rs1.next()){
                totalfield.setText(rs1.getString(1));
                totalfield.setEditable(false);
//      

            }else{
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }     
    }//GEN-LAST:event_customeridfieldActionPerformed

    private void metercountfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metercountfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metercountfieldActionPerformed

    private void PaidAmountfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaidAmountfieldActionPerformed
        try{String paid = PaidAmountfield.getText();
        double paidint = Double.parseDouble(paid);
        String total = totalfield.getText();
        double totalint = Double.parseDouble(total);
        if(paidint>=totalint){
            double result = paidint-totalint;
            String resultt = String.valueOf(result);
            ReturnField.setText(resultt);
        }else{
            JOptionPane.showMessageDialog(null,"Insufficient money");
        }}catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_PaidAmountfieldActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
setVisible(false);
        new Billing().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void PAybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAybuttonActionPerformed
        // TODO add your handling code here:
if(statusfield.getText().equals("Unpaid")){
            String firstname = firstnamefield.getText();
        String middlename = middlenamefield.getText();
        String lastname = lastnamefield.getText();
        String email = emailfield.getText();
        String contact = contactfield.getText();
        String recid = recordidfield.getText();
        String mcount = metercountfield.getText();
        String total = totalfield.getText();
        
        JFrame parentComponent = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        //some init
        int returnVal = fileChooser.showOpenDialog(parentComponent);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            
            File fileToSave = fileChooser.getSelectedFile();
            try{
                Document document = new Document();
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(fileToSave+".pdf"));
                document.open();
                
                Paragraph paragraph1 = new Paragraph("***************AAiT SiTE Section 1 Electricity Billing Management System************\n            ************Contact Number:+2519 11 52 80 92***************\n\n ");
                paragraph1.setAlignment(Element.ALIGN_CENTER);
                document.add(paragraph1);
                Paragraph paragraph2 = new Paragraph("Date: "+dateactual.getText() + "  \n"+"Time: "+timeactual.getText()+"\n"+"Customer Details\n");
                paragraph2.setAlignment(Element.ALIGN_CENTER);
                Paragraph paragraph9 = new Paragraph("Name: "+ firstname + " "+ middlename + " "+ lastname +" \n");
                document.add(paragraph9);
                Paragraph paragraph3 = new Paragraph("Contact Detail: \n Phone number: "+ contact + "\nEmail: " + email);
                document.add(paragraph2);
                document.add(paragraph3);
                Paragraph paragraph10 = new Paragraph("****************************************************************************************************************\n****************************************************************************************************************\n");
                document.add(paragraph10);
                
                Paragraph paragraph4 = new Paragraph("\nRecord ID: "+ recid + "\nMeter Count: " + mcount + "KWh\n" + "Rate: 20 Cent per KWh\n Tax: 15%\n");
                document.add(paragraph4);
                Paragraph paragraph11 = new Paragraph("****************************************************************************************************************\n****************************************************************************************************************\n");
                document.add(paragraph11);
                Paragraph paragraph5 = new Paragraph("Total Amount Paid: " +total );
                
                document.add(paragraph5);
                
                document.close();
                setVisible(false);
                new Billing().setVisible(true);
                
                
                
                JOptionPane.showMessageDialog(null,"Invoice Generated");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
}else{
    JOptionPane.showMessageDialog(null,"The Bill is already Paid");

}
        
        String rid = recordidfield.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            st.executeUpdate("update record set status='"+"Paid"+"' where rid='"+rid+"'");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }//GEN-LAST:event_PAybuttonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Calculation;
    private javax.swing.JLabel City;
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel Contact;
    private javax.swing.JLabel Description;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Firstname;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel HomeNumber;
    private javax.swing.JLabel Kebele;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel MeterCount;
    private javax.swing.JLabel MiddleName;
    private javax.swing.JButton PAybutton;
    private javax.swing.JLabel PaidAmount;
    private javax.swing.JTextField PaidAmountfield;
    private javax.swing.JLabel RecordDetail;
    private javax.swing.JLabel RecordId;
    private javax.swing.JLabel Return;
    private javax.swing.JTextField ReturnField;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Zone;
    private javax.swing.JTextField cityfield;
    private javax.swing.JTextField contactfield;
    private javax.swing.JLabel customerdetail;
    private javax.swing.JLabel customerid;
    private javax.swing.JTextField customeridfield;
    private javax.swing.JLabel dateactual;
    private javax.swing.JLabel datee;
    private javax.swing.JTextField descriptionfield;
    private javax.swing.JTextField emailfield;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JTextField genderfield;
    private javax.swing.JTextField homenumberfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kebelefield;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JTextField metercountfield;
    private javax.swing.JTextField middlenamefield;
    private javax.swing.JTextField recordidfield;
    private javax.swing.JButton resetbutton;
    private javax.swing.JTextField statusfield;
    private javax.swing.JLabel timeactual;
    private javax.swing.JLabel timee;
    private javax.swing.JTextField totalfield;
    private javax.swing.JTextField zonefield;
    // End of variables declaration//GEN-END:variables
}
