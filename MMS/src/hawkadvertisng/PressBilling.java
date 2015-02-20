
package hawkadvertisng;

import java.awt.Desktop;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

@SuppressWarnings("empty-statement")
public class PressBilling extends javax.swing.JPanel {

   
    public int Click;
    public MainWindow Home;
    String Station ;
    myTableModel tb;
    Double Tot;
    int rowCount;
    private boolean isEdit=false;
    private int index=-1;
    
    public PressBilling(MainWindow Home) {
        initComponents();
        this.Home=Home;
        Codetxt.setEnabled(false);
        Click=0;
        mainPanel.setVisible(false);
        tb = tableSet();
        Tot=0.0;
       
        
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
        jdpPanel = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        cancelSD = new javax.swing.JButton();
        jdp = new com.toedter.calendar.JCalendar();
        mainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Codetxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        publTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Totaltxt = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        Date3 = new javax.swing.JLabel();
        Calender = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        print = new javax.swing.JButton();
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
        Done.setBounds(640, 110, 80, 30);

        Emedia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Emedia.setText("Promotion Bill");
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
        Delete.setBounds(220, 150, 73, 20);

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

        mainPanel.setOpaque(false);
        mainPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Bill Number:");
        mainPanel.add(jLabel2);
        jLabel2.setBounds(60, 60, 90, 17);

        Codetxt.setEditable(false);
        Codetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodetxtActionPerformed(evt);
            }
        });
        mainPanel.add(Codetxt);
        Codetxt.setBounds(200, 60, 150, 20);

        publTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SNo", "P O ", "Items", "Rates", "Qty", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(publTable);
        publTable.getColumnModel().getColumn(0).setResizable(false);
        publTable.getColumnModel().getColumn(1).setResizable(false);
        publTable.getColumnModel().getColumn(2).setResizable(false);

        mainPanel.add(jScrollPane1);
        jScrollPane1.setBounds(60, 130, 660, 300);

        jButton1.setText("Add station");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1);
        jButton1.setBounds(730, 370, 100, 23);

        remove.setText("remove");
        remove.setOpaque(false);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        mainPanel.add(remove);
        remove.setBounds(730, 340, 100, 23);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Total:");
        mainPanel.add(jLabel9);
        jLabel9.setBounds(510, 450, 77, 17);

        Totaltxt.setEditable(false);
        Totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaltxtActionPerformed(evt);
            }
        });
        mainPanel.add(Totaltxt);
        Totaltxt.setBounds(580, 450, 140, 20);

        Date.setEditable(false);
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        mainPanel.add(Date);
        Date.setBounds(470, 60, 150, 20);

        Date3.setBackground(new java.awt.Color(255, 255, 255));
        Date3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date3.setText("Date:");
        mainPanel.add(Date3);
        Date3.setBounds(410, 60, 50, 20);

        Calender.setText("calender");
        Calender.setOpaque(false);
        Calender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalenderActionPerformed(evt);
            }
        });
        mainPanel.add(Calender);
        Calender.setBounds(630, 60, 100, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Client Name:");
        mainPanel.add(jLabel3);
        jLabel3.setBounds(60, 100, 110, 20);

        CName.setEditable(false);
        CName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNameActionPerformed(evt);
            }
        });
        mainPanel.add(CName);
        CName.setBounds(200, 100, 150, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Client Code:");
        mainPanel.add(jLabel4);
        jLabel4.setBounds(370, 100, 110, 20);

        Cid.setEditable(false);
        Cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidActionPerformed(evt);
            }
        });
        mainPanel.add(Cid);
        Cid.setBounds(470, 100, 150, 20);

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton2);
        jButton2.setBounds(630, 90, 100, 23);

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        mainPanel.add(print);
        print.setBounds(60, 450, 90, 23);

        add(mainPanel);
        mainPanel.setBounds(-10, 160, 1020, 490);

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
                
         
           Done.setEnabled(true); 
           new search(Home,"select BillNo,Date from pressbill where 1",this,false,false);
        Click=3;   
        
        SETButton(3);
    }//GEN-LAST:event_DeleteActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        mainPanel.setVisible(true);
        Done.setEnabled(true);
        this.Codetxt.setText(new CodeGen().GetCode("PBillNo"));
        Click=1;
        rowCount=0;
        SETButton(1);
        
        
    }//GEN-LAST:event_NewActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      
        SETButton(0);
        SetNull();
    }//GEN-LAST:event_CancelActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Home.ProfilePageB();

    }//GEN-LAST:event_jLabel17MouseClicked
   
    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        
     if(Click==1)
     {
        new CodeGen().SaveNo("PBillNo");
        DataBase obj = new DataBase();
        obj.connectToDB("media");
        String Query="INSERT INTO `pressbill`(`BillNo`, `TotalAmount`, `Date`,`Cid`, `Cname`) VALUES ('"+Codetxt.getText()+"','"+Double.toString(Tot)+"','"+Date.getText()+"','"+Cid.getText()+"','"+CName.getText()+"')";
        obj.runQuerry(Query);
        obj.DisconnectFromDB();
     }
     else if(Click ==3) {
      DataBase obj = new DataBase();
      obj.connectToDB("media");
      obj.runQuerry("DELETE FROM `pressbill` WHERE BillNo='"+Codetxt.getText()+"'");
      obj.runQuerry("DELETE FROM `pressorder` WHERE BillNo='"+Codetxt.getText()+"'");
      obj.DisconnectFromDB();
     }
     else if(Click ==2) {
      DataBase obj = new DataBase();
      obj.connectToDB("media");
      obj.runQuerry("UPDATE `pressbill` SET `TotalAmount`='"+Double.toString(Tot)+"',`Date`='"+Date.getText()+"' WHERE BillNo='"+Codetxt.getText()+"'");
      obj.DisconnectFromDB();
     }

      SETButton(0);
      
    }//GEN-LAST:event_DoneActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        index= publTable.getSelectedRow();
        if (index != -1 ){

            if(Click==2)
            {   Tot=Tot-Double.parseDouble(publTable.getValueAt(index,5)+"");
                
                DataBase db=new DataBase();
                db.connectToDB("media");

                db.runQuerry("UPDATE `pressorder` SET `Billno`='-1' WHERE Orderid='"+publTable.getValueAt(index,1).toString() +"'");
                Totaltxt.setText(Double.toString(Tot));

                db.DisconnectFromDB();
            }

            removeRow(index);
        }
        else{

        }
    }//GEN-LAST:event_removeActionPerformed

   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
        this.setEnabled(false);
        String Query;
         Query="SELECT `Orderid`,`Cname` FROM `pressorder` WHERE Billno ='-1' And CCode='"+Cid.getText()+"'";
        new search(Home,Query,this,true,true);
 
         

    }//GEN-LAST:event_jButton1ActionPerformed

    public void AddOrder(String id, String Rate ,String Qty,String Parti)
    {
        tb.setRowCount(rowCount+1);
     
             tb.setValueAt( Integer.toString(rowCount+1),rowCount  ,0);
             tb.setValueAt(id,rowCount,1);
             
             tb.setValueAt( Rate  ,rowCount  ,3);
             tb.setValueAt( Qty  ,rowCount  ,4);
             tb.setValueAt(Parti,rowCount,2);
             tb.setValueAt(Double.toString(Double.parseDouble(Rate)*Double.parseDouble(Qty)),rowCount,5);
             
             
              DataBase db=new DataBase();
              db.connectToDB("media");
              db.runQuerry("UPDATE `pressorder` SET `Billno`='"+Codetxt.getText()+"' WHERE Orderid='"+id+"'");
              Tot=Tot+Double.parseDouble(Double.toString(Double.parseDouble(Rate)*Double.parseDouble(Qty)));
               Totaltxt.setText(Double.toString(Tot));
              db.DisconnectFromDB();
             
             rowCount++;
             publTable.setModel(tb);
    }        
    private void CodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodetxtActionPerformed

    }//GEN-LAST:event_CodetxtActionPerformed

    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void CalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalenderActionPerformed
        showCalender(true);
    }//GEN-LAST:event_CalenderActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date.setText(myFormat.format(jdp.getDate()));
        showCalender(false);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void cancelSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSDActionPerformed
        showCalender(false);
    }//GEN-LAST:event_cancelSDActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Done.setEnabled(true);
        new search(Home,"select BillNo,Date from pressbill where 1",this,false,false);

        Click=2;

        SETButton(2);
    }//GEN-LAST:event_EditActionPerformed

    private void CNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNameActionPerformed

    private void CidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setEnabled(false);
        new search(Home,"select id,name from cust where 1",this,true,false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        
         try {
            
            String str1= null,str2= null,str3 = null,str4 = null,str5 = null;
            
            str1 = Codetxt.getText();
            str2 = Date.getText();
            str3 = CName.getText();
            str4 = Cid.getText();
            str5 = Totaltxt.getText();
            
            String[] str = new String[]{str1,str2,str3,str4,str5};            
            
            reporter(publTable,str); //function that generates Reports excel file. Populates Jtable into Excel file.

        } catch (Exception ex) {

        }
        
        
    }//GEN-LAST:event_printActionPerformed
    
    
    public void SetCus(String a, String b)
    {
     CName.setText(b);
     Cid.setText(a);
    
    }        
   
    public void SetValues(String Id,String Dat, String Total)   {
     
     Codetxt.setText(Id);
     Date.setText(Dat);
     Totaltxt.setText(Total);
     Tot=Double.parseDouble(Total);
     Totaltxt.setText(Double.toString(Tot));
     mainPanel.setVisible(true);
     setTable(Id);
     
     
    }  
    
    public void SetNull()
    {
     this.Codetxt.setText("");
     Date.setText("");
     Cid.setText("");
     CName.setText("");
     tb=null;
     tb=tableSet();
     publTable.setModel(tb);
     
     Click=0;
    }
          
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CName;
    private javax.swing.JButton Calender;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Cid;
    private javax.swing.JTextField Codetxt;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel Date3;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Done;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel Emedia;
    private javax.swing.JButton New;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JButton cancelSD;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JCalendar jdp;
    private javax.swing.JPanel jdpPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton print;
    private javax.swing.JTable publTable;
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables

  
    
    public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("Sno");
        Temp.addColumn("P O");
        Temp.addColumn("Items");
        Temp.addColumn("Quantity");
        Temp.addColumn("Rate");
        Temp.addColumn("Amount");
        return Temp;

    }
    
public myTableModel tableSet(String[] array) {
        myTableModel Temp = new myTableModel();
        for (String x:array)
            Temp.addColumn(x);
        
        return Temp;

    }

    private void removeRow(int index) {
        tb.removeRow(index);
        publTable.setModel(tb);
        rowCount--;
        tb.setRowCount(rowCount);
    }

    private void setTable(String Id) {
        
        DataBase dbObj = new DataBase();
        dbObj.connectToDB("media");
        
        ResultSet rs = dbObj.getData("SELECT * FROM `pressorder` WHERE Billno = '"+Codetxt.getText()+"' And Cname='"+CName.getText()+"'");
        String []Ary2= {"Sno","P O","Items","Rate","Qty","Amount"};
           
        
        try {
            
           if(rs.next())
           {   
               
            int len=GetDataSize(rs);
            String [][]Ary1=new String[len][6];        
            
            for(int i=0;i<len;i++)
            {
             rs.next();
              
             Ary1[i][0]=Integer.toString(i+1);
             Ary1[i][1]=rs.getString("OrderId");
             Ary1[i][2]=rs.getString("Parti");
             Ary1[i][3]=rs.getString("Rate");
             Ary1[i][4]=rs.getString("Qty");
             Ary1[i][5]=Double.toString(Double.parseDouble(rs.getString("Qty"))*Double.parseDouble(rs.getString("Rate")));
             Tot = Tot+Double.parseDouble(Ary1[i][5]);
            }    
           
  
            myTableModel Temp= new myTableModel(Ary1,Ary2);
            tb=Temp;
            publTable.setModel(tb);
            rowCount = tb.getRowCount();
            Totaltxt.setText(Tot.toString());
           }
        } catch (SQLException ex) {
            //system.out.println(ex.getMessage());
            Logger.getLogger(PressBilling.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        dbObj.DisconnectFromDB();
                
    }
     
     private int  GetDataSize(ResultSet rs)  {
        try {
            rs.last();
            int Datasize = rs.getRow();
            rs.beforeFirst();
            return Datasize;
        } catch (SQLException ex) {
            
            Logger.getLogger(Csorter.class.getName()).log(Level.SEVERE, null, ex);
        }
     return 0;
     
    }
     
     
  
    
    private void showCalender(boolean check) {
        jdpPanel.setVisible(check);
        jdpPanel.setEnabled(check);
        this.setEnabled(!check);
        
        
        if (check){
            jdpPanel.setLocation(this.getWidth()/4,this.getHeight()/4);
        }
    }

    
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
    
    void reporter(JTable table,String[] str) {

        try {

            //<editor-fold defaultstate="collapsed" desc="Initializer">
            
            Workbook book1 =  Workbook.getWorkbook(new File("Press_Bill.xls"));
            WritableWorkbook book2;
            File file1 = new File("Press_Bill-output.xls");
            book2 = Workbook.createWorkbook(file1,book1);
            WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
            
            
            TableModel model = table.getModel();
            WritableFont cellFont = new WritableFont(WritableFont.ARIAL, 8);
            cellFont.setBoldStyle(WritableFont.BOLD);
            WritableCellFormat cellFormat2 = new WritableCellFormat();
            cellFormat2.setWrap(true);
            WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
            cellFormat.setWrap(true);
            cellFormat.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
            cellFormat2.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);            
            cellFormat.setAlignment(Alignment.CENTRE);
            cellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
            
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="JTableSetter">
            
            //<editor-fold defaultstate="collapsed" desc="TableHeader">
            
            Label column,row;
            for (int i = 0; i < model.getColumnCount(); i++) {
                column = new Label(i+1, 13, model.getColumnName(i),cellFormat);
                sheet1.addCell(column);
            }
            
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="TableContent">
            int i=0,j=0;
            
            for (i = 0; i < model.getRowCount(); i++) {
                for (j = 0; j < model.getColumnCount(); j++) {
                    ////system.out.println(i+" "+j);
                    if (!model.getValueAt(i, j).equals(null))
                        row = new Label(j+1, i + 14,model.getValueAt(i, j).toString(),cellFormat2);
                    else
                        row = new Label(j+1, i + 14,"",cellFormat2);
                    sheet1.addCell(row);
                    
                }
                sheet1.insertRow(16);   
            }
            //</editor-fold>
           
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Client & Bill Info setter">
            Label header;
            header = new Label(7,10,str[0]);
            sheet1.addCell(header);
            header = new Label(7,9,str[1]);
            sheet1.addCell(header);
            header = new Label(2,9,str[2]);
            sheet1.addCell(header);
            header = new Label(2,10,str[3]);
            sheet1.addCell(header);
            header = new Label(6,17,str[4]);
            sheet1.addCell(header);
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Workbooks Close">
            book2.write();
            book2.close();
            book1.close();
            Desktop.getDesktop().open(new File("Press_Bill-output.xls"));
            //</editor-fold>
            
        } catch (Exception ex) {
            //system.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }  
      
    
}
