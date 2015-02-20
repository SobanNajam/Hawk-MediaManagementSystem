
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SettingAdmin extends javax.swing.JPanel {

    MainWindow Homeh;
    private boolean Admin;
    String Address;
    public SettingAdmin(MainWindow Home) {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        GstDone.setVisible(false);
        Gsttxt.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false); 
        jButton9.setVisible(false);
        jPanel4.setVisible(false);
        NumberChangePannel.setVisible(false);
        Homeh=Home;
        Admin=false;
        
        //setaddresskhi();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        switchServer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        RePass = new javax.swing.JPasswordField();
        Pass = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        hawklogo = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        Gsttxt = new javax.swing.JTextField();
        GstDone = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        NumberChangePannel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton15 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jt1 = new javax.swing.JTextField();
        jt2 = new javax.swing.JTextField();
        jt3 = new javax.swing.JTextField();
        jt4 = new javax.swing.JTextField();
        jt5 = new javax.swing.JTextField();
        jt6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setOpaque(false);
        setLayout(null);

        jButton4.setText("Create New Acount");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(30, 150, 190, 23);

        jButton1.setText("Modify ");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(30, 180, 190, 23);

        switchServer.setText("Change Server");
        switchServer.setOpaque(false);
        switchServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchServerActionPerformed(evt);
            }
        });
        add(switchServer);
        switchServer.setBounds(30, 300, 190, 23);

        jPanel3.setBackground(new java.awt.Color(25, 31, 36));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jButton6.setText("Delete");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(10, 10, 63, 23);

        jButton7.setText("edit");
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(90, 10, 70, 23);

        jButton8.setText("cancel");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(180, 10, 63, 23);

        add(jPanel3);
        jPanel3.setBounds(400, 320, 290, 40);

        jPanel2.setBackground(new java.awt.Color(25, 31, 36));
        jPanel2.setOpaque(false);

        jButton2.setText("Okay");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("Cancel");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        add(jPanel2);
        jPanel2.setBounds(670, 270, 150, 40);

        jPanel1.setBackground(new java.awt.Color(25, 31, 36));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 70, 70, 20);

        jLabel3.setText("Re-Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 120, 70, 20);

        jLabel4.setText("User Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 30, 70, 20);

        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jPanel1.add(User);
        User.setBounds(90, 30, 140, 20);
        jPanel1.add(RePass);
        RePass.setBounds(90, 120, 140, 20);
        jPanel1.add(Pass);
        Pass.setBounds(90, 70, 140, 20);
        jPanel1.add(jPanel5);
        jPanel5.setBounds(110, 220, 100, 10);

        add(jPanel1);
        jPanel1.setBounds(400, 160, 260, 190);

        jButton11.setText("Change lahore address");
        jButton11.setOpaque(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        add(jButton11);
        jButton11.setBounds(30, 430, 190, 23);

        jButton12.setText("Change Islammabad address");
        jButton12.setOpaque(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        add(jButton12);
        jButton12.setBounds(30, 460, 190, 23);

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

        jButton5.setText("Change Password");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(30, 210, 190, 23);

        jButton10.setText("View");
        jButton10.setOpaque(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10);
        jButton10.setBounds(30, 240, 190, 23);

        jButton9.setText("Change Karachi address");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9);
        jButton9.setBounds(30, 400, 190, 23);

        jButton13.setText("Change GST");
        jButton13.setOpaque(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        add(jButton13);
        jButton13.setBounds(30, 330, 190, 23);
        add(Gsttxt);
        Gsttxt.setBounds(730, 560, 170, 20);

        GstDone.setText("Done");
        GstDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GstDoneActionPerformed(evt);
            }
        });
        add(GstDone);
        GstDone.setBounds(910, 560, 70, 23);

        jButton14.setText("Number Change");
        jButton14.setOpaque(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        add(jButton14);
        jButton14.setBounds(30, 360, 190, 23);

        NumberChangePannel.setOpaque(false);
        NumberChangePannel.setLayout(null);
        NumberChangePannel.add(jTextField1);
        jTextField1.setBounds(50, 20, 230, 20);

        jLabel6.setText("Number");
        NumberChangePannel.add(jLabel6);
        jLabel6.setBounds(10, 10, 50, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RONumber", "BillNumber", "ERONumber", "EbillNumber" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        NumberChangePannel.add(jComboBox1);
        jComboBox1.setBounds(290, 20, 90, 20);

        jButton15.setText("Done");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        NumberChangePannel.add(jButton15);
        jButton15.setBounds(390, 20, 79, 23);

        add(NumberChangePannel);
        NumberChangePannel.setBounds(320, 370, 510, 90);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);
        jPanel4.add(jt1);
        jt1.setBounds(10, 60, 460, 20);

        jt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt2ActionPerformed(evt);
            }
        });
        jPanel4.add(jt2);
        jt2.setBounds(10, 90, 460, 20);

        jt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt3ActionPerformed(evt);
            }
        });
        jPanel4.add(jt3);
        jt3.setBounds(10, 120, 460, 20);
        jPanel4.add(jt4);
        jt4.setBounds(10, 150, 460, 20);
        jPanel4.add(jt5);
        jt5.setBounds(10, 180, 460, 20);
        jPanel4.add(jt6);
        jt6.setBounds(10, 210, 460, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 0, 460, 40);

        add(jPanel4);
        jPanel4.setBounds(30, 500, 480, 240);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        ResetValue();
        
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    public void Display()
    {
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
    
    }        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Display();
        ResetValue();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
      
    }//GEN-LAST:event_UserActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Okay();
       
        ResetValue();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Okay()
    {
      if(Valid())
       {
       DataBase db =new DataBase();
       db.connectToDB("hawklogin");
       if(Admin)
       {    
       db.runQuerry("Update `info` set `User`='"+User.getText()+"' `Passwd`='"+Pass.getText()+"' where Type=1 ");
       Admin=false;
       }
       else
       {
        
       db.runQuerry("INSERT INTO `info`(`User`, `Passwd`, `Type`) VALUES ('"+User.getText()+"','"+Pass.getText()+"',2)");
       }
       db.DisconnectFromDB();
       }
    
    }        
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        ResetValue();
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        try {
            DataBase db =new DataBase();
            db.connectToDB("hawklogin");
            ResultSet rs= db.getData("Select * From info where `Type`=1");
            rs.next();
            User.setText(rs.getString("User"));
            Admin=true;
            db.DisconnectFromDB();
        } catch (SQLException ex) {
            Logger.getLogger(SettingAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ResetValue();
        new search (Homeh,"SELECT * FROM `info` WHERE Type=2",this);
        jPanel1.setVisible(true);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DataBase db=new DataBase();
        db.connectToDB("hawklogin");
        db.runQuerry("DELETE FROM `info` WHERE User='"+User.getText()+"'");
        db.DisconnectFromDB();
        ResetValue();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DataBase db=new DataBase();
        db.connectToDB("hawklogin");
        db.runQuerry("UPDATE `info` SET `User`='"+User.getText()+"', `Passwd`='"+Pass.getText() +"' , `Type` = 2 WHERE User='"+User.getText()+"'");
        db.DisconnectFromDB();
        ResetValue();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void switchServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchServerActionPerformed
        DataBase obj= new DataBase();
        obj.connectToDB("media");
        obj.runQuerry("update codegen set serverBit = 1");
        obj.DisconnectFromDB();
    }//GEN-LAST:event_switchServerActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
          Display();
        ResetValue();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Homeh.ShowWindow(new HomePage(Homeh));
    }//GEN-LAST:event_homeMouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       GstDone.setVisible(true);
       Gsttxt.setVisible(true);
       Gsttxt.setText(new CodeGen().Getaddress("GST"));
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void GstDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GstDoneActionPerformed
        GstDone.setVisible(false);
        Gsttxt.setVisible(false);
       new CodeGen().SaveAddress("GST",Gsttxt.getText());
    }//GEN-LAST:event_GstDoneActionPerformed

    private void jt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt3ActionPerformed

    private void jt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        NumberChangePannel.setVisible(false);
        
        new CodeGen().SaveAddress(GetCol(jComboBox1.getSelectedIndex()),jTextField1.getText());
        
    }//GEN-LAST:event_jButton15ActionPerformed

    String GetCol(int index)
    {
     String col="";
        
     switch (index)
     {
         case 0:
         col="NRONo";        
         break;
         case 1:
         col="CBillNo";        
         break;
         case 2:
         col="ERONo";        
         break;
         case 3:
         col="EBillNo";        
         break;
         
             
             
     }
     return col;
    }        
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        NumberChangePannel.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public boolean Valid()
    {  
       
        if(User.getText().isEmpty() || Pass.getText().isEmpty()) 
        {
          return false;
        }
        
        if ( !Pass.getText().contentEquals(RePass.getText() )   )
        {
           
         return false ;
        } 
        
        return true;
    }        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GstDone;
    private javax.swing.JTextField Gsttxt;
    private javax.swing.JPanel NumberChangePannel;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JPasswordField RePass;
    private javax.swing.JTextField User;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    private javax.swing.JTextField jt4;
    private javax.swing.JTextField jt5;
    private javax.swing.JTextField jt6;
    private javax.swing.JButton switchServer;
    // End of variables declaration//GEN-END:variables

    void setValue(String str,String str1) {
        User.setText(str);
        Pass.setText(str1);
    
    }
    
    void ResetValue() {
        User.setText("");
        Pass.setText("");
        RePass.setText("");
          Display();
      
    }
/*
    private void setaddresskhi() {
        CodeGen object = new CodeGen();
        String[] address = new String[6];
        
        address = object.Getaddress("khi").split("\n");
        for (int i=0;i<6;i++)address[i] = address[i].substring(0,address[i].length()-2);
            
        
    }*/
}
