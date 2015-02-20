
package hawkadvertisng;


public class Profile extends javax.swing.JPanel {

    MainWindow Homeh;
    public Profile(MainWindow Homeh) {
        initComponents();
        this.Homeh=  Homeh;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewsPaper = new javax.swing.JButton();
        NewEmedia = new javax.swing.JButton();
        NewCust = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newspap = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        newcust = new javax.swing.JLabel();
        hawklogo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        newmidp = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        PressProfile = new javax.swing.JButton();
        newcust1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setLayout(null);

        NewsPaper.setText("Visit Profiles");
        NewsPaper.setOpaque(false);
        NewsPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewsPaperActionPerformed(evt);
            }
        });
        add(NewsPaper);
        NewsPaper.setBounds(90, 350, 130, 30);

        NewEmedia.setText("Visit Profiles");
        NewEmedia.setOpaque(false);
        NewEmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewEmediaActionPerformed(evt);
            }
        });
        add(NewEmedia);
        NewEmedia.setBounds(710, 350, 130, 30);

        NewCust.setText("Visit Profiles");
        NewCust.setOpaque(false);
        NewCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCustActionPerformed(evt);
            }
        });
        add(NewCust);
        NewCust.setBounds(400, 350, 130, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("click on the visit Profiles button");
        add(jLabel2);
        jLabel2.setBounds(80, 290, 250, 20);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("To edit or create newspaper profile");
        add(jLabel3);
        jLabel3.setBounds(80, 270, 260, 20);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("    Electronic Media Profile");
        add(jLabel1);
        jLabel1.setBounds(690, 200, 270, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("    News Paper Profile");
        add(jLabel4);
        jLabel4.setBounds(70, 200, 270, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("To edit or create customer profile");
        add(jLabel5);
        jLabel5.setBounds(390, 270, 260, 20);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("click on the visit Profiles button");
        add(jLabel6);
        jLabel6.setBounds(390, 290, 250, 20);

        newspap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(newspap);
        newspap.setBounds(690, 180, 270, 220);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("click on the visit Profiles button");
        add(jLabel9);
        jLabel9.setBounds(700, 290, 250, 20);

        newcust.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(newcust);
        newcust.setBounds(70, 180, 270, 220);

        hawklogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/hawk_logo.png"))); // NOI18N
        add(hawklogo);
        hawklogo.setBounds(0, 0, 350, 100);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("To edit or create E-Media profile");
        add(jLabel8);
        jLabel8.setBounds(700, 270, 260, 20);

        newmidp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(newmidp);
        newmidp.setBounds(380, 180, 270, 220);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("     Customer Profile");
        add(jLabel7);
        jLabel7.setBounds(380, 200, 270, 30);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/button_home.png"))); // NOI18N
        home.setText("jLabel10");
        home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        home.setMaximumSize(new java.awt.Dimension(80, 80));
        home.setMinimumSize(new java.awt.Dimension(80, 80));
        home.setPreferredSize(new java.awt.Dimension(80, 80));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        add(home);
        home.setBounds(940, 20, 80, 80);

        PressProfile.setText("Visit Profiles");
        PressProfile.setOpaque(false);
        PressProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PressProfileActionPerformed(evt);
            }
        });
        add(PressProfile);
        PressProfile.setBounds(120, 600, 130, 30);

        newcust1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(newcust1);
        newcust1.setBounds(70, 430, 270, 220);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("click on the visit Profiles button");
        add(jLabel10);
        jLabel10.setBounds(80, 540, 250, 20);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setText("To edit or create newspaper profile");
        add(jLabel11);
        jLabel11.setBounds(80, 520, 260, 20);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Press Profile");
        add(jLabel12);
        jLabel12.setBounds(70, 450, 270, 30);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(BackGround);
        BackGround.setBounds(0, 0, 1024, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void NewsPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewsPaperActionPerformed

        Homeh.ShowWindow(new NewNewsPaper(Homeh));

    }//GEN-LAST:event_NewsPaperActionPerformed

    private void NewEmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewEmediaActionPerformed
        Homeh.ShowWindow(new ElectronicMedia(Homeh));

    }//GEN-LAST:event_NewEmediaActionPerformed

    private void NewCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCustActionPerformed
        Homeh.ShowWindow(new NewCustomer(Homeh));
    }//GEN-LAST:event_NewCustActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Homeh.ShowWindow(new HomePage(Homeh));
    }//GEN-LAST:event_homeMouseClicked

    private void PressProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PressProfileActionPerformed
       
         Homeh.ShowWindow(new NewPress(Homeh));
        
    }//GEN-LAST:event_PressProfileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton NewCust;
    private javax.swing.JButton NewEmedia;
    private javax.swing.JButton NewsPaper;
    private javax.swing.JButton PressProfile;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel newcust;
    private javax.swing.JLabel newcust1;
    private javax.swing.JLabel newmidp;
    private javax.swing.JLabel newspap;
    // End of variables declaration//GEN-END:variables
}
