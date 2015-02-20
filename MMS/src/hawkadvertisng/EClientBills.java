
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class EClientBills extends JPanel {

    boolean IsNew;
    String Num,Amount,Remarks, Authority,Dat,deduct;
    MainWindow Home;
    myTableModel tb;
    int rowCount;   
    private ElectronicRo eroObj;
    
   public EClientBills(MainWindow Home)
    {
    initComponents();
    this.Home=Home; 
   
   Deduct.setText("0.0"); 
   deduct="0.0";
   SetBillVariable("","0.00","","","");
   SetBillFields();
   tb=tableSet();
   detailTb.setModel(tb);
   rowCount=0;
  showCalender(false);
}
   
   
public void SetBillVariable(String num,String Amt,String re,String Auth,String date,String deduction)
{
  Num=num;
  Amount=String.format("%.2f",Double.parseDouble(Amt));
  Remarks=re;
  deduct=deduction;
  Authority=Auth;
  Dat=date;
  SetBillFields2();
}        
   
public void SetBillVariable(String num,String Amt,String re,String Auth,String date)
{
  Num=num;
  Amount=String.format("%.2f", Double.parseDouble(Amt));
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
  Amounttxt.setText(Double.toString(Double.parseDouble(Amount)-Double.parseDouble(deduct)));
  billNo.setText(Num);

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
       
  Amounttxt.setText(Double.toString(Double.parseDouble(Amount)-Double.parseDouble(deduct)));
  billNo.setText(Num);

}        

public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("RO Number");
        Temp.addColumn("RO Date");
        Temp.addColumn("Client Name");
        Temp.addColumn("Manager Name");
        
        
        return Temp;

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JLabel();
        jdpPanel = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        cancelSD = new javax.swing.JButton();
        jdp = new com.toedter.calendar.JCalendar();
        billNoLbl = new javax.swing.JLabel();
        billNo = new javax.swing.JTextField();
        AuthorityLbl = new javax.swing.JLabel();
        AuthorityTxt = new javax.swing.JTextField();
        Date3 = new javax.swing.JLabel();
        RemarksTxt = new javax.swing.JTextField();
        Date4 = new javax.swing.JLabel();
        Amounttxt = new javax.swing.JTextField();
        remarksLbl = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Calender = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailTb = new javax.swing.JTable();
        updateBill = new javax.swing.JButton();
        addRO = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        NewBill = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        hawklogo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Deduct = new javax.swing.JTextField();
        home1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
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
        jButton8.setBounds(400, 250, 70, 23);

        cancelSD.setText("cancel");
        cancelSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSDActionPerformed(evt);
            }
        });
        jdpPanel.add(cancelSD);
        cancelSD.setBounds(300, 250, 80, 23);

        jdp.setBackground(new java.awt.Color(255, 255, 255));
        jdpPanel.add(jdp);
        jdp.setBounds(10, 10, 480, 270);

        add(jdpPanel);
        jdpPanel.setBounds(1020, 10, 510, 290);

        billNoLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        billNoLbl.setText("Bill Number:");
        add(billNoLbl);
        billNoLbl.setBounds(20, 210, 90, 20);

        billNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        add(billNo);
        billNo.setBounds(120, 210, 130, 20);

        AuthorityLbl.setBackground(new java.awt.Color(255, 255, 255));
        AuthorityLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        AuthorityLbl.setText("Authority:");
        add(AuthorityLbl);
        AuthorityLbl.setBounds(20, 240, 90, 20);

        AuthorityTxt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        add(AuthorityTxt);
        AuthorityTxt.setBounds(120, 240, 240, 20);

        Date3.setBackground(new java.awt.Color(255, 255, 255));
        Date3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date3.setText("Date:");
        add(Date3);
        Date3.setBounds(260, 210, 50, 20);
        add(RemarksTxt);
        RemarksTxt.setBounds(120, 270, 240, 20);

        Date4.setBackground(new java.awt.Color(255, 255, 255));
        Date4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date4.setText("Amount");
        add(Date4);
        Date4.setBounds(370, 240, 60, 20);

        Amounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmounttxtActionPerformed(evt);
            }
        });
        add(Amounttxt);
        Amounttxt.setBounds(450, 240, 150, 20);

        remarksLbl.setBackground(new java.awt.Color(255, 255, 255));
        remarksLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        remarksLbl.setText("Remarks:");
        add(remarksLbl);
        remarksLbl.setBounds(20, 270, 70, 20);

        Date.setEditable(false);
        add(Date);
        Date.setBounds(330, 210, 150, 20);

        Calender.setText("calender");
        Calender.setOpaque(false);
        Calender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalenderActionPerformed(evt);
            }
        });
        add(Calender);
        Calender.setBounds(490, 210, 100, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("E-Customer Bill Entry");
        add(jLabel2);
        jLabel2.setBounds(390, 70, 240, 40);

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
        jScrollPane1.setBounds(20, 350, 700, 310);

        updateBill.setText("Update bill");
        updateBill.setOpaque(false);
        updateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBillActionPerformed(evt);
            }
        });
        add(updateBill);
        updateBill.setBounds(260, 680, 100, 23);

        addRO.setText("Add RO");
        addRO.setEnabled(false);
        addRO.setOpaque(false);
        addRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addROActionPerformed(evt);
            }
        });
        add(addRO);
        addRO.setBounds(180, 680, 69, 23);

        Search.setText("Search");
        Search.setOpaque(false);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        add(Search);
        Search.setBounds(100, 680, 73, 23);

        NewBill.setText("New Bill");
        NewBill.setOpaque(false);
        NewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBillActionPerformed(evt);
            }
        });
        add(NewBill);
        NewBill.setBounds(20, 680, 69, 23);

        jButton2.setText("Delete RO");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(470, 680, 100, 23);

        edit.setText("Edit RO");
        edit.setOpaque(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        add(edit);
        edit.setBounds(370, 680, 90, 23);

        Delete.setText("Delete Bill");
        Delete.setOpaque(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete);
        Delete.setBounds(580, 680, 90, 23);

        hawklogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/hawk_logo.png"))); // NOI18N
        add(hawklogo);
        hawklogo.setBounds(0, 0, 350, 100);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel5.setText("Billing Information");
        add(jLabel5);
        jLabel5.setBounds(20, 150, 300, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel6.setText("Release Order");
        add(jLabel6);
        jLabel6.setBounds(20, 310, 300, 30);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel3.setText("Deduction:");
        add(jLabel3);
        jLabel3.setBounds(370, 270, 80, 20);

        Deduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeductActionPerformed(evt);
            }
        });
        Deduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DeductFocusLost(evt);
            }
        });
        Deduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DeductKeyReleased(evt);
            }
        });
        add(Deduct);
        Deduct.setBounds(450, 270, 150, 20);

        home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/button_home.png"))); // NOI18N
        home1.setText("jLabel10");
        home1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        home1.setMaximumSize(new java.awt.Dimension(80, 80));
        home1.setMinimumSize(new java.awt.Dimension(80, 80));
        home1.setPreferredSize(new java.awt.Dimension(80, 80));
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });
        add(home1);
        home1.setBounds(940, 20, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date.setText(myFormat.format(jdp.getDate()));
            showCalender(false);
         
    }//GEN-LAST:event_jButton8ActionPerformed

    public static String dateCreator(int toAdd) {

        Calendar c = Calendar.getInstance();
        c.add(c.DATE, toAdd);

        if (c.get(Calendar.DAY_OF_WEEK)==1)
            c.add(c.DATE,1);

        String date= c.get(Calendar.YEAR)+"-" +( c.get(Calendar.MONTH )+1)+"-" + c.get(Calendar.DATE);
        
        return date;
    }

    private void cancelSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSDActionPerformed
        showCalender(false);
    }//GEN-LAST:event_cancelSDActionPerformed
    
    private void CalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalenderActionPerformed
        showCalender(true);
    }//GEN-LAST:event_CalenderActionPerformed
     
    private void AmounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmounttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmounttxtActionPerformed

    private void updateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBillActionPerformed
        
        if(Date.getText().isEmpty())
          {
           JOptionPane.showMessageDialog(null,"Please select a Date First!");
           return;
          }
        DataBase obj = new DataBase();
        obj.connectToDB("media");
        obj.runQuerry("UPDATE `ecbill` SET `amount`='"+Amount+"',`authority`='"+AuthorityTxt.getText()+"',`remarks`='"+RemarksTxt.getText()+"',`date`='"+Date.getText()+"',`deduction`='"+Deduct.getText()+"' WHERE  billNo='"+billNo.getText()+"'");
        obj.runQuerry("UPDATE `e_ro` SET `cbillDate`='"+Date.getText()+"' WHERE  CBill='"+billNo.getText()+"'");
        obj.DisconnectFromDB();
    }//GEN-LAST:event_updateBillActionPerformed

    private void addROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addROActionPerformed
        if(Date.getText().isEmpty())
          {
           JOptionPane.showMessageDialog(null,"Please select a Date First!");
           return;
          }
        
        this.setEnabled(false);
        SetBillVariable(billNo.getText(),Amount , RemarksTxt.getText(), AuthorityTxt.getText(), Date.getText());
        if (eroObj ==  null)
            eroObj = new ElectronicRo(this, Num, IsNew);
        else 
            eroObj.showWindow(this, Num, IsNew);
    }//GEN-LAST:event_addROActionPerformed
    public void SetTable(String BillNumber)
    {
     DataBase db= new DataBase();
     
     //enable buttons
     addRO.setEnabled(true);  
     updateBill.setEnabled(true);
     //<editor-fold defaultstate="collapsed" desc="Fill ROs in table">
     
     
     try {
         db.connectToDB("media");
        
         ResultSet rs= db.getData("SELECT `RONum`,`date`,`MName`,`CName` FROM `e_ro` WHERE CBill ='"+BillNumber+"'");
         
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
    
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        new search(Home,"SELECT billNo , date FROM `ecbill` ",this);
        IsNew=false;

    }//GEN-LAST:event_SearchActionPerformed
public void ResetBill()
  {
    SetBillVariable("","0.00","","","");
   SetBillFields();
   tb=tableSet();
   detailTb.setModel(tb);
   rowCount=0; 
  }   
    private void NewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBillActionPerformed

        ResetBill();
        Deduct.setText("0.0");
        deduct="0.0";
        
        SetBillVariable("","0.00","","","");
        billNo.setText("Not Yet Given");
        IsNew=true;
        addRO.setEnabled(true);
        updateBill.setEnabled(true);
    }//GEN-LAST:event_NewBillActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int index = detailTb.getSelectedRow();
        if(index!=-1)
        {
            this.setEnabled(false);
            SetBillVariable(billNo.getText(),Amount , RemarksTxt.getText(), AuthorityTxt.getText(), Date.getText());
            new ElectronicRo(this, Num,detailTb.getValueAt(index, 0).toString());
        }
        else
        {

        }

    }//GEN-LAST:event_editActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete this bill", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
        {

            DataBase db = new DataBase();
            db.connectToDB("media");
            db.runQuerry("DELETE FROM `ecbill` WHERE billNo='"+billNo.getText()+"'");
            db.runQuerry( "DELETE FROM `e_ro`  WHERE CBill='"+billNo.getText()+"'");

            ResetBill();

            db.DisconnectFromDB();
        }

    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int index = detailTb.getSelectedRow();
         DataBase db = new DataBase();
        if(index!=-1 && JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete R.O.s Number: \""+tb.getValueAt(index, 0)+"\"", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
        {
             try {
                 
                 db.connectToDB("media");
                 java.sql.ResultSet rs = db.getData("select amount from e_ro where RONum = '"+tb.getValueAt(index, 0).toString()+"'");
                 rs.next();
                 Amount = String.valueOf(Double.parseDouble(Amount) - Double.parseDouble(rs.getString("amount")));
                 Amounttxt.setText( String.valueOf(Double.parseDouble(Amount)-Double.parseDouble(deduct)));
                 db.runQuerry( "DELETE FROM `e_ro`  WHERE RONum ='"+tb.getValueAt(index, 0).toString()+"'");
                 db.runQuerry( "DELETE FROM `spots`  WHERE RONum ='"+tb.getValueAt(index, 0).toString()+"'");
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked
        // TODO add your handling code here:
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_home1MouseClicked

    private void DeductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeductActionPerformed

    private void DeductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeductKeyReleased

         deduct=Deduct.getText();
         
         if(deduct.isEmpty())
         {
          deduct="0.0";
         }    

         Amounttxt.setText(Double.toString(Double.parseDouble(Amount)-Double.parseDouble(deduct)));

   
    }//GEN-LAST:event_DeductKeyReleased

    private void DeductFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DeductFocusLost
 
    }//GEN-LAST:event_DeductFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amounttxt;
    private javax.swing.JLabel AuthorityLbl;
    private javax.swing.JTextField AuthorityTxt;
    private javax.swing.JButton Calender;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel Date3;
    private javax.swing.JLabel Date4;
    private javax.swing.JTextField Deduct;
    private javax.swing.JButton Delete;
    private javax.swing.JButton NewBill;
    private javax.swing.JTextField RemarksTxt;
    private javax.swing.JButton Search;
    private javax.swing.JButton addRO;
    private javax.swing.JTextField billNo;
    private javax.swing.JLabel billNoLbl;
    private javax.swing.JButton cancelSD;
    private javax.swing.JTable detailTb;
    private javax.swing.JButton edit;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JLabel home1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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

    private void Remove() {
       
    }

    private boolean validateBill() {
       
        if (!billNo.getText().matches("[0-9]{5,}")){
            JOptionPane.showMessageDialog(null, "Invalid billNo");
            return false;
        }
        if( Amounttxt.getText().contentEquals("") || !Amounttxt.getText().matches("[0-9.]?")){
            JOptionPane.showMessageDialog(null, "Invalid Amount");
            return false;
        }
        if(Date.getText().contentEquals("")){
            JOptionPane.showMessageDialog(null, "Invalid Date");
            return false;
        }
        
        return true;    
    }

    void SetValues(String billno, String amnt, String auth, String remar, String dt) {
        billNo.setText(billno);
    //    Amounttxt.setText(amnt);
      //  Date.setText(dt);
        //AuthorityTxt.setText(auth);
        
    }
    
    void Setbill(String Num)
    {
    
        billNo.setText(Num);
    }        
            
}
