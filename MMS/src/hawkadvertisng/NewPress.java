/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AbdulRehman
 */
@SuppressWarnings("empty-statement")
public class NewPress extends javax.swing.JPanel {

   
    public int Click;
    public MainWindow Home;
    String Station ;
    int rowCount;
    private boolean isEdit=false;
    private int index=-1;
    
    public NewPress(MainWindow Home) {
        initComponents();
        this.Home=Home;
        Codetxt.setEnabled(false);
        Click=0;
        mainPanel.setVisible(false);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        Done = new javax.swing.JButton();
        Emedia = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        New = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Codetxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PhoneNumbertxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FaxNumbertxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MobileNumbertxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmailAddresstxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        hawklogo = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setLayout(null);

        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        add(jLabel17);
        jLabel17.setBounds(0, 74, 50, 50);

        Done.setText("done");
        Done.setEnabled(false);
        Done.setOpaque(false);
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        add(Done);
        Done.setBounds(660, 150, 80, 30);

        Emedia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Emedia.setText(" Promotions");
        add(Emedia);
        Emedia.setBounds(420, 70, 190, 28);

        Delete.setText("Delete");
        Delete.setOpaque(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete);
        Delete.setBounds(220, 150, 73, 23);

        New.setText("New");
        New.setOpaque(false);
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        add(New);
        New.setBounds(60, 150, 70, 23);

        Cancel.setText("Cancel");
        Cancel.setOpaque(false);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        add(Cancel);
        Cancel.setBounds(300, 150, 73, 23);

        Edit.setText("Edit");
        Edit.setOpaque(false);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        add(Edit);
        Edit.setBounds(140, 150, 73, 23);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(null);
        mainPanel.add(jSeparator1);
        jSeparator1.setBounds(0, 30, 58, 10);
        mainPanel.add(jSeparator2);
        jSeparator2.setBounds(180, 30, 841, 10);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Basic Information");
        mainPanel.add(jLabel1);
        jLabel1.setBounds(60, 20, 111, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Vendor Code:");
        mainPanel.add(jLabel2);
        jLabel2.setBounds(60, 60, 100, 17);

        Codetxt.setEditable(false);
        Codetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodetxtActionPerformed(evt);
            }
        });
        mainPanel.add(Codetxt);
        Codetxt.setBounds(200, 60, 150, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Vendor Name:");
        mainPanel.add(jLabel7);
        jLabel7.setBounds(60, 90, 120, 17);

        Nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GvtCommActionPerformed(evt);
            }
        });
        mainPanel.add(Nametxt);
        Nametxt.setBounds(200, 90, 150, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Phone Number:");
        mainPanel.add(jLabel3);
        jLabel3.setBounds(390, 200, 96, 17);

        PhoneNumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GvtCommActionPerformed(evt);
            }
        });
        mainPanel.add(PhoneNumbertxt);
        PhoneNumbertxt.setBounds(490, 200, 203, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Address:");
        mainPanel.add(jLabel4);
        jLabel4.setBounds(60, 200, 54, 17);

        FaxNumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaxNumbertxtActionPerformed(evt);
            }
        });
        mainPanel.add(FaxNumbertxt);
        FaxNumbertxt.setBounds(170, 200, 200, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Mobile Number:");
        mainPanel.add(jLabel8);
        jLabel8.setBounds(60, 230, 99, 17);
        mainPanel.add(MobileNumbertxt);
        MobileNumbertxt.setBounds(170, 230, 203, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Email Address:");
        mainPanel.add(jLabel5);
        jLabel5.setBounds(390, 230, 93, 17);

        EmailAddresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GvtCommActionPerformed(evt);
            }
        });
        mainPanel.add(EmailAddresstxt);
        EmailAddresstxt.setBounds(490, 230, 203, 20);
        mainPanel.add(jSeparator3);
        jSeparator3.setBounds(0, 180, 58, 10);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Contact Information");
        mainPanel.add(jLabel10);
        jLabel10.setBounds(60, 170, 130, 17);
        mainPanel.add(jSeparator4);
        jSeparator4.setBounds(190, 180, 830, 10);

        add(mainPanel);
        mainPanel.setBounds(0, 170, 1020, 490);

        hawklogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/hawk_logo.png"))); // NOI18N
        add(hawklogo);
        hawklogo.setBounds(0, 0, 350, 100);

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

        jLabel16.setForeground(new java.awt.Color(0, 102, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(jLabel16);
        jLabel16.setBounds(0, 0, 1030, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        new search(Home,"select id,name from press where 1",this);
        Done.setEnabled(true);  
        Click=3;   
        
        SETButton(3);
  
    }//GEN-LAST:event_DeleteActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        
        mainPanel.setVisible(true);
        Done.setEnabled(true);
        this.Codetxt.setText(new CodeGen().GetCode("PCode"));
        Click=1;
        SETButton(1);
        
    }//GEN-LAST:event_NewActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
         Done.setEnabled(true);
        new search(Home,"select id,name from press where 1",this);

        Click=2;   
        
        SETButton(2);
    }//GEN-LAST:event_EditActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      
        SETButton(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Home.ProfilePageB();

    }//GEN-LAST:event_jLabel17MouseClicked
   
 
    private void GvtCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GvtCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GvtCommActionPerformed

    private void FaxNumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaxNumbertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FaxNumbertxtActionPerformed

    private void CodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodetxtActionPerformed

    }//GEN-LAST:event_CodetxtActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        // TODO add your handling code here:
    if(Click == 1)
    {
     DataBase Datab =new DataBase();
     Datab.connectToDB("media");

     Datab.insertGen("`id`, `Name`, `FaxNumber`, `PhoneNumber`, `EmailAddress`, `MobileNumber`",DBValues.get(this.GetAttri()), "press");
     new CodeGen().SaveCode("PCode");
     Datab.DisconnectFromDB();
    }
    else if (Click == 2)
    {      
           DataBase Datab =new DataBase();
           Datab.connectToDB("media");
           
           String Querry="UPDATE `press` SET `Name`='"+Nametxt.getText()+"',`FaxNumber`='"+FaxNumbertxt.getText()+"',`PhoneNumber`='"+PhoneNumbertxt.getText()+"',`EmailAddress`='"+EmailAddresstxt.getText()+"',`MobileNumber`='"+MobileNumbertxt.getText()+"' WHERE id='"+Codetxt.getText()+"'";
           Datab.runQuerry(Querry);
           Datab.DisconnectFromDB();
    
   
    }
    else if(Click == 3)
    {
     DataBase Datab =new DataBase();
           Datab.connectToDB("media");
           
           String Querry="DELETE FROM `press` WHERE id='"+Codetxt.getText()+"'";
           Datab.runQuerry(Querry);
           Datab.DisconnectFromDB();
    }    
    
            SetNull();
            SETButton(0);

    }//GEN-LAST:event_DoneActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked
    
    
    

    public void SetValues(String Id,String name, String PHnum,String Email, String MNumber,String FaxNum)
    {
     
     Codetxt.setText(Id);
     Nametxt.setText(name);
     PhoneNumbertxt.setText(PHnum);
     EmailAddresstxt.setText(Email);
     MobileNumbertxt.setText(MNumber);
     FaxNumbertxt.setText(FaxNum);
     mainPanel.setVisible(true);
     
     
    }  
    
    public void SetNull()
    {
     this.Codetxt.setText("");
     this.Nametxt.setText("");
     this.PhoneNumbertxt.setText("");
     this.EmailAddresstxt.setText("");
     this.MobileNumbertxt.setText("");
     this.FaxNumbertxt.setText("");
    }
     public String[] GetAttri()
    {
       
        String x[] ={this.Codetxt.getText(),this.Nametxt.getText(),this.FaxNumbertxt.getText(),this.PhoneNumbertxt.getText(),this.EmailAddresstxt.getText(),this.MobileNumbertxt.getText()};
        
        return x;
    }        
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Codetxt;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Done;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField EmailAddresstxt;
    private javax.swing.JLabel Emedia;
    private javax.swing.JTextField FaxNumbertxt;
    private javax.swing.JTextField MobileNumbertxt;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JButton New;
    private javax.swing.JTextField PhoneNumbertxt;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

     
     
 
    
    
    public void SETButton(int click)
    {
      if(click==1)
      {
       Edit.setEnabled(false);
       Delete.setEnabled(false);
      }
      else if(click==2)
      {
       New.setEnabled(false);
       Delete.setEnabled(false);
      }
      else if(click==3)
      {
       Edit.setEnabled(false);
       New.setEnabled(false);
      }
      else if(click==0)
      {
       Edit.setEnabled(true);
       New.setEnabled(true);
      Delete.setEnabled(true);
      mainPanel.setVisible(false);
      }
    
    }        
    
     
}
