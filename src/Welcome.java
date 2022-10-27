

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author semha
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        mainbadge = new javax.swing.JLabel();
        percent = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pay energy.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 40, 237, 176));

        mainbadge.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mainbadge.setText("ELECTRICITY BILLING MANAGEMENT SYSTEM");
        jPanel1.add(mainbadge, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 9, -1, -1));

        percent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        percent.setText("%");
        jPanel1.add(percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 37, -1));
        jPanel1.add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 417, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       Welcome welcome = new Welcome();
       welcome.setVisible(true);
       try{
       for(int i=0; i<= 100;i++){
         Thread.sleep(20);
        welcome.progress.setValue(i);
        welcome.percent.setText(Integer.toString(i) + "%");
       }
           
       }
       catch(Exception e){
       }
     new Login().setVisible(true);
       welcome.dispose();
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainbadge;
    private javax.swing.JLabel percent;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
