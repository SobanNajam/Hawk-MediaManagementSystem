
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class ClientBills extends JPanel {

boolean IsNew;
String Num,Amount,Remarks, Authority,Dat,deduct;
MainWindow Home;
myTableModel tb;

int rowCount;
private RONewsp roObj;

public ClientBills(MainWindow Home)
{
   initComponents();
   this.Home=Home; 
   deduct="0.0";
   Deduct.setText("0.0");
   SetBillVariable("","0.0","","","");
   
   SetBillFields();
   tb=tableSet();
   detailTb.setModel(tb);
   rowCount=0; 
   showCalender(false);
}

  public void ResetBill()
  {
    SetBillVariable("","0.0","","","");
   SetBillFields();
   tb=tableSet();
   detailTb.setModel(tb);
   rowCount=0; 
  }        
  public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("RO Number");
        Temp.addColumn("RO Date");
        Temp.addColumn("Client Name");
        Temp.addColumn("Manager Name");
        
        
        return Temp;

    }

  
public void SetBillVariable(String num,String Amt,String re,String Auth,String date,String deduction)
{
  Num=num;
  Amount=String.format("%.2f",Double.parseDouble(Amt));
  Remarks=re;
  Authority=Auth;
  Dat=date;
  deduct=deduction;
  SetBillFields2();
}        

  
public void SetBillVariable(String num,String Amt,String re,String Auth,String date)
{
  Num=num;
  Amount=String.format("%.2f",Double.parseDouble(Amt));
  Remarks=re;
  Authority=Auth;
  Dat=date;
 
  SetBillFields();
}        



public void SetBillFields2()
{
  RemarksTxt.setText(Remarks);
  AuthorityTxt.setText(Authority);
  Date.setText(Dat);
  Deduct.setText(deduct);
 Amounttxt.setText(String.format("%.2f",Double.parseDouble(Amount)-Double.parseDouble(deduct))); billNo.setText(Num);

}      
public void SetBillFields()
{
  RemarksTxt.setText(Remarks);
  AuthorityTxt.setText(Authority);
  Date.setText(Dat);
 if(deduct.isEmpty())
         {
          deduct="0.0";
         }    
 Amounttxt.setText(String.format("%.2f",Double.parseDouble(Amount)-Double.parseDouble(deduct)));
 billNo.setText(Num);

}      

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPanel = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        cancelSD = new javax.swing.JButton();
        jdp = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTb = new javax.swing.JTable();
        Calender = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        remarksLbl = new javax.swing.JLabel();
        AuthorityTxt = new javax.swing.JTextField();
        AuthorityLbl = new javax.swing.JLabel();
        billNoLbl = new javax.swing.JLabel();
        billNo = new javax.swing.JTextField();
        Date4 = new javax.swing.JLabel();
        Amounttxt = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        Date3 = new javax.swing.JLabel();
        RemarksTxt = new javax.swing.JTextField();
        NewBill = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        addRO = new javax.swing.JButton();
        updateBill = new javax.swing.JButton();
        editRO = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        gotoHome = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        hawklogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Date5 = new javax.swing.JLabel();
        Deduct = new javax.swing.JTextField();
        home = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(null);

        jdpPanel.setBackground(new java.awt.Color(153, 204, 255));
        jdpPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jdpPanel.setLayout(null);

        jButton8.setText("DONE");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jdpPanel.add(jButton8);
        jButton8.setBounds(400, 250, 70, 25);

        cancelSD.setText("cancel");
        jdpPanel.add(cancelSD);
        cancelSD.setBounds(300, 250, 80, 25);

        jdp.setBackground(new java.awt.Color(255, 255, 255));
        jdpPanel.add(jdp);
        jdp.setBounds(10, 10, 480, 270);

        add(jdpPanel);
        jdpPanel.setBounds(520, 180, 510, 290);

        detailTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(detailTb);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 350, 700, 310);

        Calender.setText("calender");
        Calender.setBorder(null);
        Calender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalenderActionPerformed(evt);
            }
        });
        add(Calender);
        Calender.setBounds(620, 290, 80, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Client Bill Entry");
        add(jLabel2);
        jLabel2.setBounds(370, 80, 240, 40);

        remarksLbl.setBackground(new java.awt.Color(255, 255, 255));
        remarksLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        remarksLbl.setText("Remarks:");
        add(remarksLbl);
        remarksLbl.setBounds(50, 260, 70, 20);

        AuthorityTxt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        add(AuthorityTxt);
        AuthorityTxt.setBounds(140, 230, 310, 20);

        AuthorityLbl.setBackground(new java.awt.Color(255, 255, 255));
        AuthorityLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        AuthorityLbl.setText("Authority:");
        add(AuthorityLbl);
        AuthorityLbl.setBounds(50, 230, 90, 20);

        billNoLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        billNoLbl.setText("Bill Number:");
        add(billNoLbl);
        billNoLbl.setBounds(50, 200, 90, 20);

        billNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        add(billNo);
        billNo.setBounds(140, 200, 140, 20);

        Date4.setBackground(new java.awt.Color(255, 255, 255));
        Date4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date4.setText("Amount");
        add(Date4);
        Date4.setBounds(300, 200, 60, 20);

        Amounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmounttxtActionPerformed(evt);
            }
        });
        add(Amounttxt);
        Amounttxt.setBounds(360, 200, 90, 20);

        Date.setEditable(false);
        Date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DateKeyReleased(evt);
            }
        });
        add(Date);
        Date.setBounds(550, 260, 150, 22);

        Date3.setBackground(new java.awt.Color(255, 255, 255));
        Date3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date3.setText("Bill Date:");
        add(Date3);
        Date3.setBounds(460, 260, 80, 20);

        RemarksTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemarksTxtActionPerformed(evt);
            }
        });
        add(RemarksTxt);
        RemarksTxt.setBounds(140, 260, 310, 20);

        NewBill.setText("New Bill");
        NewBill.setOpaque(false);
        NewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBillActionPerformed(evt);
            }
        });
        add(NewBill);
        NewBill.setBounds(50, 680, 77, 25);

        Search.setText("Search");
        Search.setOpaque(false);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        add(Search);
        Search.setBounds(130, 680, 73, 25);

        addRO.setText("Add RO");
        addRO.setEnabled(false);
        addRO.setOpaque(false);
        addRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addROActionPerformed(evt);
            }
        });
        add(addRO);
        addRO.setBounds(210, 680, 75, 25);

        updateBill.setText("Update bill");
        updateBill.setOpaque(false);
        updateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBillActionPerformed(evt);
            }
        });
        add(updateBill);
        updateBill.setBounds(520, 680, 100, 25);

        editRO.setText("Edit RO");
        editRO.setOpaque(false);
        editRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editROActionPerformed(evt);
            }
        });
        add(editRO);
        editRO.setBounds(290, 680, 100, 25);

        Delete.setText("Delete Bill");
        Delete.setOpaque(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete);
        Delete.setBounds(630, 680, 90, 25);

        gotoHome.setToolTipText("HOME");
        gotoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoHomeMouseClicked(evt);
            }
        });
        add(gotoHome);
        gotoHome.setBounds(250, 60, 50, 40);

        jButton2.setText("Delete RO");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(400, 680, 100, 25);

        hawklogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/hawk_logo.png"))); // NOI18N
        add(hawklogo);
        hawklogo.setBounds(0, 0, 350, 100);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setText("Release Order");
        add(jLabel1);
        jLabel1.setBounds(50, 300, 300, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel3.setText("Billing Information");
        add(jLabel3);
        jLabel3.setBounds(50, 160, 300, 30);

        Date5.setBackground(new java.awt.Color(255, 255, 255));
        Date5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date5.setText("Deduct");
        add(Date5);
        Date5.setBounds(470, 200, 60, 20);

        Deduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeductActionPerformed(evt);
            }
        });
        Deduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DeductKeyReleased(evt);
            }
        });
        add(Deduct);
        Deduct.setBounds(530, 200, 90, 20);

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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        background.setName(""); // NOI18N
        add(background);
        background.setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void CalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalenderActionPerformed
       showCalender(true);
    }//GEN-LAST:event_CalenderActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {

            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            /* if (myFormat.parse(myFormat.format(jdp.getDate())).compareTo(myFormat.parse(dateCreator(0))) < 0) {
             * JOptionPane.showMessageDialog(null, "Invalid Date! Please select a valid Date");
             * jdpPanel.setVisible(true);
             * jdpPanel.setEnabled(true);
             * return;
             * }*/
            Date.setText(myFormat.format(jdp.getDate()));
            showCalender(false);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void AmounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmounttxtActionPerformed
       
    }//GEN-LAST:event_AmounttxtActionPerformed

    private void RemarksTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemarksTxtActionPerformed
    }//GEN-LAST:event_RemarksTxtActionPerformed

    private void NewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBillActionPerformed
        
        IsNew=true;
        Amounttxt.setText("0.0");
        Deduct.setText("0.0");
        deduct="0.0";
        SetBillVariable("","0.00", "","","");
        billNo.setText("Not Yet given");
        tb=tableSet();
        detailTb.setModel(tb);
        rowCount=0; 
   
        addRO.setEnabled(true);
        updateBill.setEnabled(true);
    }//GEN-LAST:event_NewBillActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
       
      new search(Home,"SELECT billNo , date FROM `cbill` ",this);  
      IsNew=false;
      
    }//GEN-LAST:event_SearchActionPerformed

    private void addROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addROActionPerformed
        if (Date.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a Date First!");
            return;
        }
        this.setEnabled(false);
        SetBillVariable(billNo.getText(), Amount, RemarksTxt.getText(), AuthorityTxt.getText(), Date.getText());
        
        if (roObj == null)
            roObj = new RONewsp(this, Num, IsNew, Amount);
        else 
            roObj.showWindow(this, Num, IsNew, Amount);
    }//GEN-LAST:event_addROActionPerformed

    private void updateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBillActionPerformed
        UpdateBill();  
    }//GEN-LAST:event_updateBillActionPerformed

    private void editROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editROActionPerformed
      int index = detailTb.getSelectedRow();
        if(index!=-1)
        {
            this.setEnabled(false);
            SetBillVariable(billNo.getText(),Amount , RemarksTxt.getText(), AuthorityTxt.getText(), Date.getText());
            new RONewsp(this, Num, Amount,detailTb.getValueAt(index, 0).toString());
        }
        else
        {
            
        }
        
        
    }//GEN-LAST:event_editROActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
      
        
       if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete this bill", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) 
       {
           
        DataBase db = new DataBase();
        db.connectToDB("media");
        
        for (int i=0;i<rowCount;i++)
        {
             db.runQuerry( "DELETE FROM `insertions`  WHERE RONum ='"+tb.getValueAt(i, 0).toString()+"'");
        }    
        db.runQuerry("DELETE FROM `cbill` WHERE billNo='"+billNo.getText()+"'");
        db.runQuerry( "DELETE FROM `n_ro`  WHERE CBill='"+billNo.getText()+"'");
       
        ResetBill();
        
        
        db.DisconnectFromDB();
       }

        
    }//GEN-LAST:event_DeleteActionPerformed

    private void gotoHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoHomeMouseClicked
        Home.jPanel1.setVisible(false);
        Home.Remove();
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_gotoHomeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = detailTb.getSelectedRow();
        DataBase db = new DataBase();
        if(index!=-1 && JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete R.O.s Number: \""+tb.getValueAt(index, 0)+"\"", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
        {
            try {

                db.connectToDB("media");
                 java.sql.ResultSet rs = db.getData("select amount from `n_ro` where RONum = '"+tb.getValueAt(index, 0).toString()+"'");
                 rs.next();
                 Amount = String.format("%.2f",Double.parseDouble(Amount) - Double.parseDouble(rs.getString("amount")));
                 Amounttxt.setText(Amount);
                db.runQuerry( "DELETE FROM `n_ro`  WHERE RONum ='"+tb.getValueAt(index, 0).toString()+"'");
                db.runQuerry( "DELETE FROM `insertions`  WHERE RONum ='"+tb.getValueAt(index, 0).toString()+"'");
                tb.removeRow(index);
                detailTb.setModel(tb);
                rowCount--;
                tb.setRowCount(rowCount);
                db.DisconnectFromDB();
            } catch (SQLException ex) {
                Logger.getLogger(EClientBills.class.getName()).log(Level.SEVERE, null, ex);
                db.DisconnectFromDB();
            }
        }
        
      UpdateBill();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked

    private void DeductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeductActionPerformed

    private void DateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DateKeyReleased
 
    }//GEN-LAST:event_DateKeyReleased

    private void DeductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeductKeyReleased
              deduct=Deduct.getText();
         if(deduct.isEmpty())
         {
          deduct="0.0";
         }    
         Amounttxt.setText(String.format("%.2f",Double.parseDouble(Amount)-Double.parseDouble(deduct)));
 
    }//GEN-LAST:event_DeductKeyReleased
    
    
    
    public void SetTable(String BillNumber)
    {
     DataBase db= new DataBase();
     
     //enable buttons
     addRO.setEnabled(true);  
     updateBill.setEnabled(true);
     //<editor-fold defaultstate="collapsed" desc="Fill ROs in table">
     
     
     try {
         db.connectToDB("media");
        
         ResultSet rs= db.getData("SELECT `RONum`,`date`,`MName`,`CName` FROM `n_ro` WHERE CBill ='"+BillNumber+"'");
         
         int loop=0;
         
         while(rs.next())
         {
             tb.setRowCount(loop+1);
             tb.setValueAt(rs.getString("RONum"),loop , 0);
             tb.setValueAt(rs.getString("date"),loop ,  1);
             tb.setValueAt(rs.getString("CName"),loop , 2);
             tb.setValueAt(rs.getString("MName"),loop , 3);
             
             loop++;
         }
         
         detailTb.setModel(tb);
         rowCount=tb.getRowCount();
         addRO.setEnabled(true);
         db.DisconnectFromDB();
     } catch (SQLException ex) {
         Logger.getLogger(ClientBills.class.getName()).log(Level.SEVERE, null, ex);
         db.DisconnectFromDB();
     }
     //</editor-fold>
    
    
}        
    
    
    public static String dateCreator(int toAdd) {

        Calendar c = Calendar.getInstance();
        c.add(c.DATE, toAdd);

        if (c.get(Calendar.DAY_OF_WEEK)==1)
            c.add(c.DATE,1);

        String date= c.get(Calendar.YEAR)+"-" +( c.get(Calendar.MONTH )+1)+"-" + c.get(Calendar.DATE);
        
        return date;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amounttxt;
    private javax.swing.JLabel AuthorityLbl;
    private javax.swing.JTextField AuthorityTxt;
    private javax.swing.JButton Calender;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel Date3;
    private javax.swing.JLabel Date4;
    private javax.swing.JLabel Date5;
    private javax.swing.JTextField Deduct;
    private javax.swing.JButton Delete;
    private javax.swing.JButton NewBill;
    private javax.swing.JTextField RemarksTxt;
    private javax.swing.JButton Search;
    private javax.swing.JButton addRO;
    private javax.swing.JLabel background;
    private javax.swing.JTextField billNo;
    private javax.swing.JLabel billNoLbl;
    private javax.swing.JButton cancelSD;
    private javax.swing.JTable detailTb;
    private javax.swing.JButton editRO;
    private javax.swing.JLabel gotoHome;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JCalendar jdp;
    private javax.swing.JPanel jdpPanel;
    private javax.swing.JLabel remarksLbl;
    private javax.swing.JButton updateBill;
    // End of variables declaration//GEN-END:variables
 
  

    
    
    private void showCalender(boolean check) {
        jdpPanel.setVisible(check);
        jdpPanel.setEnabled(check);
        this.setEnabled(!check);
        if (check){
            jdpPanel.setLocation(this.getWidth()/4,this.getHeight()/4);
        }
    }

    private void UpdateBill() {
        Amount = Amounttxt.getText();
        if(!IsNew)
        {   
        DataBase obj = new DataBase();
         obj.connectToDB("media");
     //    System.out.println(Amounttxt.getText());
         obj.runQuerry("UPDATE `cbill` SET `amount`='"+Amounttxt.getText()+"',`authority`='"+AuthorityTxt.getText()+"',`remarks`='"+RemarksTxt.getText()+"',`date`='"+Date.getText()+"',`deduction`='"+Deduct.getText()+"' WHERE  billNo='"+billNo.getText()+"'");
         obj.runQuerry("UPDATE `n_ro` SET `cbillDate`='"+Date.getText()+"' WHERE CBill='"+billNo.getText()+"'");
         obj.DisconnectFromDB();
        }
    }


    
    
   
}
