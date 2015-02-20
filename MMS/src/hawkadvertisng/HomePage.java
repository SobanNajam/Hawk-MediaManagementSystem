/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hawkadvertisng;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author AbdulRehman
 */
public class HomePage extends javax.swing.JPanel {

    /**
     * Creates new form HomeButton
     */
    MainWindow Homeh;
    public HomePage(MainWindow Home) {
        initComponents();
        this.Homeh=Home;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        hawklogo = new javax.swing.JLabel();
        reports = new javax.swing.JLabel();
        RO = new javax.swing.JLabel();
        ERO = new javax.swing.JLabel();
        Ebill = new javax.swing.JLabel();
        NBill = new javax.swing.JLabel();
        profiles = new javax.swing.JLabel();
        prints = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setLayout(null);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/button_logout.png"))); // NOI18N
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setMaximumSize(new java.awt.Dimension(130, 30));
        logout.setMinimumSize(new java.awt.Dimension(130, 30));
        logout.setPreferredSize(new java.awt.Dimension(130, 30));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        add(logout);
        logout.setBounds(880, 70, 130, 30);

        hawklogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/hawk_logo.png"))); // NOI18N
        add(hawklogo);
        hawklogo.setBounds(0, 0, 350, 100);

        reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/reports.png"))); // NOI18N
        reports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reports.setMaximumSize(new java.awt.Dimension(260, 80));
        reports.setMinimumSize(new java.awt.Dimension(260, 80));
        reports.setPreferredSize(new java.awt.Dimension(260, 80));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
        });
        add(reports);
        reports.setBounds(32, 234, 260, 80);

        RO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ro.png"))); // NOI18N
        RO.setToolTipText("");
        RO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RO.setMaximumSize(new java.awt.Dimension(260, 80));
        RO.setMinimumSize(new java.awt.Dimension(260, 80));
        RO.setPreferredSize(new java.awt.Dimension(260, 80));
        RO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ROMouseClicked(evt);
            }
        });
        add(RO);
        RO.setBounds(32, 334, 260, 80);

        ERO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Ero.png"))); // NOI18N
        ERO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ERO.setMaximumSize(new java.awt.Dimension(260, 80));
        ERO.setMinimumSize(new java.awt.Dimension(260, 80));
        ERO.setPreferredSize(new java.awt.Dimension(260, 80));
        ERO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EROMouseClicked(evt);
            }
        });
        add(ERO);
        ERO.setBounds(32, 434, 260, 80);

        Ebill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ebill.png"))); // NOI18N
        Ebill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ebill.setMaximumSize(new java.awt.Dimension(260, 80));
        Ebill.setMinimumSize(new java.awt.Dimension(260, 80));
        Ebill.setPreferredSize(new java.awt.Dimension(260, 80));
        Ebill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EbillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EbillMouseEntered(evt);
            }
        });
        add(Ebill);
        Ebill.setBounds(350, 234, 260, 80);

        NBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/bill.png"))); // NOI18N
        NBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NBill.setMaximumSize(new java.awt.Dimension(260, 80));
        NBill.setMinimumSize(new java.awt.Dimension(260, 80));
        NBill.setPreferredSize(new java.awt.Dimension(260, 80));
        NBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NBillMouseClicked(evt);
            }
        });
        add(NBill);
        NBill.setBounds(350, 334, 260, 80);

        profiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/profiles.png"))); // NOI18N
        profiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profiles.setMaximumSize(new java.awt.Dimension(260, 80));
        profiles.setMinimumSize(new java.awt.Dimension(260, 80));
        profiles.setPreferredSize(new java.awt.Dimension(260, 80));
        profiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilesMouseClicked(evt);
            }
        });
        add(profiles);
        profiles.setBounds(32, 534, 260, 80);

        prints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/prints.png"))); // NOI18N
        prints.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prints.setMaximumSize(new java.awt.Dimension(260, 80));
        prints.setMinimumSize(new java.awt.Dimension(260, 80));
        prints.setPreferredSize(new java.awt.Dimension(260, 80));
        prints.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printsMouseClicked(evt);
            }
        });
        add(prints);
        prints.setBounds(350, 434, 260, 80);

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/settings.png"))); // NOI18N
        settings.setMaximumSize(new java.awt.Dimension(260, 80));
        settings.setMinimumSize(new java.awt.Dimension(260, 80));
        settings.setPreferredSize(new java.awt.Dimension(260, 80));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });
        add(settings);
        settings.setBounds(350, 534, 260, 80);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background2.png"))); // NOI18N
        add(BackGround);
        BackGround.setBounds(0, 0, 1024, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       int value=JOptionPane.showConfirmDialog(null, "Exit Are you sure?");

        if (value==JOptionPane.YES_OPTION)
        {
            new login().setVisible(true);
            Homeh.dispose();
        }
        
       
    }//GEN-LAST:event_logoutActionPerformed

    
    
    
    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        // TODO add your handling code here:
         Homeh.ShowWindow(new Reports(Homeh));
    }//GEN-LAST:event_reportsMouseClicked

    private void ROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ROMouseClicked
        // TODO add your handling code here:
        Homeh.ShowWindow(new ClientBills(Homeh));
    }//GEN-LAST:event_ROMouseClicked

    private void EROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EROMouseClicked
        // TODO add your handling code here:
        Homeh.ShowWindow(new EClientBills(Homeh));
    }//GEN-LAST:event_EROMouseClicked

    private void EbillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EbillMouseClicked
        // TODO add your handling code here:
        Homeh.ShowWindow(new EMediaBills(Homeh));
    }//GEN-LAST:event_EbillMouseClicked

    private void NBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NBillMouseClicked
        // TODO add your handling code here:
        Homeh.ShowWindow(new NewsBills(Homeh)); 
    }//GEN-LAST:event_NBillMouseClicked

    private void profilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilesMouseClicked
        // TODO add your handling code here:
        Homeh.ProfilePageB();
    }//GEN-LAST:event_profilesMouseClicked

    private void printsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printsMouseClicked
        // TODO add your handling code here:
        Homeh.PrintPageB();   
    }//GEN-LAST:event_printsMouseClicked

    private void EbillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EbillMouseEntered
        
        //String ok = "GUI/selc_button_ebilling.png";
        //Ebill.setIcon(new javax.swing.ImageIcon(ok));
    }//GEN-LAST:event_EbillMouseEntered

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_reportsMouseEntered

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        // TODO add your handling code here:
        Homeh.SettingPageB();
    }//GEN-LAST:event_settingsMouseClicked

    
 

      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel ERO;
    private javax.swing.JLabel Ebill;
    private javax.swing.JLabel NBill;
    private javax.swing.JLabel RO;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JButton logout;
    private javax.swing.JLabel prints;
    private javax.swing.JLabel profiles;
    private javax.swing.JLabel reports;
    private javax.swing.JLabel settings;
    // End of variables declaration//GEN-END:variables
}
