/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hawkadvertisng;

import javax.swing.JOptionPane;

/**
 *
 * @author AbdulRehman
 */
public class NewCustomer extends javax.swing.JPanel {

   
    public int Click;
    public MainWindow Home;
    
    public NewCustomer(MainWindow Home) {
        initComponents();
        this.Home=Home;
        Codetxt.setEnabled(false);
        Click=0;
        MainPanel.setVisible(false);
        
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
        MainPanel = new javax.swing.JPanel();
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
        jLabel6 = new javax.swing.JLabel();
        Addresstxt1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Addresstxt2 = new javax.swing.JTextField();
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
        Done.setOpaque(false);
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        add(Done);
        Done.setBounds(610, 140, 80, 30);

        Emedia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Emedia.setText("Client");
        add(Emedia);
        Emedia.setBounds(480, 70, 63, 28);

        Delete.setText("Delete");
        Delete.setOpaque(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete);
        Delete.setBounds(210, 140, 73, 23);

        New.setText("New");
        New.setOpaque(false);
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        add(New);
        New.setBounds(50, 140, 70, 23);

        Cancel.setText("Cancel");
        Cancel.setOpaque(false);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        add(Cancel);
        Cancel.setBounds(290, 140, 73, 23);

        Edit.setText("Edit");
        Edit.setOpaque(false);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        add(Edit);
        Edit.setBounds(130, 140, 73, 23);

        MainPanel.setBackground(new java.awt.Color(38, 47, 54));
        MainPanel.setOpaque(false);
        MainPanel.setLayout(null);
        MainPanel.add(jSeparator1);
        jSeparator1.setBounds(0, 30, 58, 10);
        MainPanel.add(jSeparator2);
        jSeparator2.setBounds(180, 30, 841, 10);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Basic Information");
        MainPanel.add(jLabel1);
        jLabel1.setBounds(60, 17, 111, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Client Code:");
        MainPanel.add(jLabel2);
        jLabel2.setBounds(60, 47, 68, 20);

        Codetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodetxtActionPerformed(evt);
            }
        });
        MainPanel.add(Codetxt);
        Codetxt.setBounds(160, 50, 100, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Client Name: ");
        MainPanel.add(jLabel7);
        jLabel7.setBounds(60, 87, 76, 20);
        MainPanel.add(Nametxt);
        Nametxt.setBounds(160, 90, 190, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Phone Number:");
        MainPanel.add(jLabel3);
        jLabel3.setBounds(390, 237, 88, 20);
        MainPanel.add(PhoneNumbertxt);
        PhoneNumbertxt.setBounds(490, 240, 203, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Fax Number:");
        MainPanel.add(jLabel4);
        jLabel4.setBounds(60, 237, 74, 20);

        FaxNumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaxNumbertxtActionPerformed(evt);
            }
        });
        MainPanel.add(FaxNumbertxt);
        FaxNumbertxt.setBounds(170, 240, 200, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Mobile Number:");
        MainPanel.add(jLabel8);
        jLabel8.setBounds(60, 287, 91, 20);

        MobileNumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileNumbertxtActionPerformed(evt);
            }
        });
        MainPanel.add(MobileNumbertxt);
        MobileNumbertxt.setBounds(170, 290, 203, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Email Address:");
        MainPanel.add(jLabel5);
        jLabel5.setBounds(390, 287, 84, 20);
        MainPanel.add(EmailAddresstxt);
        EmailAddresstxt.setBounds(490, 290, 203, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Address 1:");
        MainPanel.add(jLabel6);
        jLabel6.setBounds(60, 127, 60, 20);

        Addresstxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addresstxt1ActionPerformed(evt);
            }
        });
        MainPanel.add(Addresstxt1);
        Addresstxt1.setBounds(160, 130, 470, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Address 2:");
        MainPanel.add(jLabel9);
        jLabel9.setBounds(60, 167, 60, 20);

        Addresstxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addresstxt2ActionPerformed(evt);
            }
        });
        MainPanel.add(Addresstxt2);
        Addresstxt2.setBounds(160, 170, 470, 20);
        MainPanel.add(jSeparator3);
        jSeparator3.setBounds(0, 220, 58, 10);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Contact Information");
        MainPanel.add(jLabel10);
        jLabel10.setBounds(60, 207, 130, 20);
        MainPanel.add(jSeparator4);
        jSeparator4.setBounds(190, 220, 830, 10);

        add(MainPanel);
        MainPanel.setBounds(0, 190, 1030, 430);

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
        home.setBounds(920, 20, 80, 80);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(jLabel16);
        jLabel16.setBounds(0, 0, 1030, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        // TODO add your handling code here:
    if(ISValid())
    {   
        if(JOptionPane.showConfirmDialog( null,"Are You sure you want to perform this action ")==0)
        {
            DataBase Datab =new DataBase();
            Datab.connectToDB("media");
            if(Click==1)
            {
            this.Codetxt.setText(new CodeGen().GetCode("NCustCode"));
            new CodeGen().SaveCode("NCustCode");
            JOptionPane.showMessageDialog(null, "Client Code is "+this.Codetxt.getText()+" ", "Cofirmation", JOptionPane.OK_OPTION);
            
            }    
            
            Datab.DoneFun(Click,this.GetAttri(), "cust");
            SetNull();
        }
       SETButton(0);
    
    }    
    }//GEN-LAST:event_DoneActionPerformed

    private void CodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodetxtActionPerformed
        
    }//GEN-LAST:event_CodetxtActionPerformed

    private void FaxNumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaxNumbertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FaxNumbertxtActionPerformed

    private void Addresstxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addresstxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Addresstxt1ActionPerformed

    private void Addresstxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addresstxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Addresstxt2ActionPerformed

    private void MobileNumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileNumbertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileNumbertxtActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
      new search(Home,"select id,name from cust where 1",this);
        
       SETButton(3);
        Click=3;   
    }//GEN-LAST:event_DeleteActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        
         this.Codetxt.setText("Not Yet Given");
         
         Click=1;
         SETButton(1);
        
    }//GEN-LAST:event_NewActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
       new search(Home,"select id,name from cust where 1",this);
       Click=2;
       SETButton(2);
       
    }//GEN-LAST:event_EditActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
       
       SETButton(0);
   
    }//GEN-LAST:event_CancelActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
     Home.ProfilePageB();
        
    }//GEN-LAST:event_jLabel17MouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked
    
    public void SetValues(String Id,String name,String Add1,String Add2, String PHnum,String Email, String MNumber,String FaxNum)
    {
     this.Codetxt.setText(Id);
     this.Nametxt.setText(name);
     this.Addresstxt1.setText(Add1);
     this.Addresstxt2.setText(Add2);
     this.PhoneNumbertxt.setText(PHnum);
     this.EmailAddresstxt.setText(Email);
     this.MobileNumbertxt.setText(MNumber);
     this.FaxNumbertxt.setText(FaxNum);
    }  
    
    public void SetNull()
    {
     this.Codetxt.setText("");
     this.Nametxt.setText("");
     this.Addresstxt1.setText("");
     this.Addresstxt2.setText("");
     this.PhoneNumbertxt.setText("");
     this.EmailAddresstxt.setText("");
     this.MobileNumbertxt.setText("");
     this.FaxNumbertxt.setText("");
    }
     public String[] GetAttri()
    {
       
        String x[] ={this.Codetxt.getText(),this.Nametxt.getText(),this.Addresstxt1.getText(),this.Addresstxt2.getText(),this.PhoneNumbertxt.getText(),this.FaxNumbertxt.getText(),this.MobileNumbertxt.getText(),this.EmailAddresstxt.getText()};
        
        return x;
    }        
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addresstxt1;
    private javax.swing.JTextField Addresstxt2;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Codetxt;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Done;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField EmailAddresstxt;
    private javax.swing.JLabel Emedia;
    private javax.swing.JTextField FaxNumbertxt;
    private javax.swing.JPanel MainPanel;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
  
    public void SETButton(int click)
    {
      MainPanel.setVisible(true);
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
      MainPanel.setVisible(false);
      }
    
    }        
    
     private boolean ISValid() {
      
        if(Nametxt.getText().contentEquals(""))
        {
         JOptionPane.showMessageDialog(null, "Manger name not given");
         return false;
        }   
        if(Addresstxt1.getText().contentEquals(""))
        {
         JOptionPane.showMessageDialog(null, "Address 1 field cannot be empty");
         return false;
        }   
        if(PhoneNumbertxt.getText().contentEquals("") || MobileNumbertxt.getText().isEmpty())
        {
         JOptionPane.showMessageDialog(null, "Mobile or phone number missing.");
         return false;
        } 
        
      
        return true;
    }
}
