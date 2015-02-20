
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class search extends javax.swing.JFrame {
    
    DataBase dbase;
    ResultSet rs;
    boolean CS;
    boolean IsCus;
    Boolean Add;
    String  Colum=null;
    private int[] g;
    private int[] index;
    private Csorter sorter=null;
    
    String[] heading={"ID No","Name"};
    MainWindow Home ;
    RONewsp roObject;
    ElectronicRo EroObject;
    NewNewsPaper News;
    NewCustomer Cus;
    ElectronicMedia EMedia;
    ClientBills CBill;
    NewsBills newsBill;
    EMediaBills MBill;
    Reports Rep;
    Ratessearch  RS;
    NewPress NewP;
    PressBilling Pbill;
    EClientBills ECBill;
    ClientBills AddRO;
     SettingAdmin Sett;
   
     
    private boolean isNReport=false;
    private String billColum;
    boolean ROSearch;
    private boolean isMediaSearch;
   String Id,
          Name,
          Publ;
    private press proObject;
   
    
  
    public search(MainWindow home,String querry,SettingAdmin Sett) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        buttonGroup1.add(b1);
        b2.setText("User Name");
        buttonGroup1.add(b2);
        b1.setText("Password");
        heading=new String[]{"User Name ","Password"};
        this.Sett = Sett;
       initSearchPageAc(querry);
        
    }
    
    public search(String querry,RONewsp ro,boolean custSearch) {
        initComponents();
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        CS= custSearch;
        roObject = ro;
        initSearchPage(querry);
        
    }
     
    public search(MainWindow home,String querry,ClientBills cbill) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        buttonGroup1.add(b1);
        b2.setText("Bill No");
        buttonGroup1.add(b2);
        b1.setText("Date");
        heading=new String[]{"Bill No","Date"};
        CBill = cbill;
        initSearchPage(querry);
        
    }
    
    public search(MainWindow home,String querry,PressBilling bill,boolean CusSearch,boolean Add) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        if(CusSearch)
        {
        buttonGroup1.add(b1);
        b2.setText("Customer No");
        buttonGroup1.add(b2);
        b1.setText("Name");
        heading=new String[]{"Id","Name"};
        
        }
        else
        {    
        buttonGroup1.add(b1);
        b2.setText("Bill No");
        buttonGroup1.add(b2);
        b1.setText("Date");
        heading=new String[]{"Bill No","Date"};
        }
        Pbill = bill;
        this.CS=CusSearch;
        this.Add=Add;
        initSearchPage(querry);
        
    }
     
    public search(String querry,ElectronicRo  ro,boolean custSearch) {
        initComponents();
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        CS= custSearch;
        EroObject = ro;
        initSearchPage(querry);
    }
    
    public search(String querry,press pr,boolean custSearch) {
        initComponents();
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        CS= custSearch;
        proObject = pr;
        initSearchPage(querry);
    }
   
    public search(String querry,Ratessearch RX,RONewsp RO,String Id,String name ,String Publ) {
        initComponents();
       
        setVisible(true);
        buttonGroup1.add(b1);
        b2.setText("Bill No");
        buttonGroup1.add(b2);
        b1.setText("Date");
        this.Id=Id;
        this.Name=name;
        this.Publ=Publ;
                
        heading=new String[]{"Name","Rate"};
        RS = RX;
        roObject=RO;
        initSearchPage(querry);
        
    }
    
    public search(MainWindow home,String querry,Reports Reps,String str,boolean IScus) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        Rep = Reps;
        initSearchPage(querry);
        Colum=str;
        this.IsCus=IScus;
        isNReport=false;
    }
    
    public search(MainWindow home,String querry,Reports Reps,boolean nReport) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        Rep = Reps;
        initSearchPage(querry);
        IsCus=false;
        isNReport = nReport;
        
    }
    
    public search(MainWindow home,String querry,EMediaBills bill,boolean ROSearch) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
          setVisible(true);
        this.ROSearch=ROSearch;
        if(!ROSearch)
        {     
        buttonGroup1.add(b1);
        b2.setText("Bill No");
        buttonGroup1.add(b2);
        b1.setText("Date");
        heading=new String[]{"Bill No","Date"};
        }
        MBill = bill;
        initSearchPage(querry);
        
    }
     
    public search(MainWindow home,String querry,NewsBills bill,boolean ROSearch) {
        initComponents();
         
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        this.ROSearch=ROSearch;
       
        if(!ROSearch)
        {     
        buttonGroup1.add(b1);
        b2.setText("Bill No");
        buttonGroup1.add(b2);
        b1.setText("Date");
        heading=new String[]{"Bill No","Date"};
        }
        
        newsBill = bill;
        initSearchPage(querry);
        
    }
    
    public search(MainWindow home,String querry,EClientBills cbill) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        buttonGroup1.add(b1);
        b2.setText("Bill No");
        buttonGroup1.add(b2);
        b1.setText("Date");
        heading=new String[]{"Bill No","Date"};
        ECBill = cbill;
        initSearchPage(querry);
        
    }
   
    public search(MainWindow home,String querry,NewCustomer Cus) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        
        this.Cus= Cus;
        initSearchPage(querry);
        
    }
    
    public search(MainWindow home,String querry,NewNewsPaper New) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        News=New;
        initSearchPage(querry);
        
    }
    
    public search(MainWindow home,String querry,NewPress New) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        NewP=New;
        initSearchPage(querry);
        
    }
     
    public search(MainWindow home,String querry,ElectronicMedia EMedia) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        this.EMedia=EMedia;
        initSearchPage(querry);
       
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "RO No", "name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setText("select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        b1.setSelected(true);
        b1.setText("Name");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("ID Number");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2)
                            .addComponent(b1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b2)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       setVisible(false);
        int i= table.getSelectedRow();
                
                if(i!=-1 )
                {
                 Set(i);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Select First!");
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Set(int i) 
    {
      
       
        if(Cus!=null)
        {
           try {
               rs=dbase.getData("SELECT * FROM `cust` WHERE id='"+table.getValueAt(i, 0).toString()+"'");
               rs.next();
               Cus.SetValues(rs.getString("id"),rs.getString("name") ,rs.getString("adr1"), rs.getString("adr2"),rs.getString("ph") ,rs.getString("email"),  rs.getString("mobile"), rs.getString("fax"));
            } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        
        
        else if (RS !=null && roObject != null)
        {
            
         roObject.setNewspaper(Id, Name, Publ, table.getValueAt(i, 1).toString());
         roObject.setEnabled(true);
         roObject.setVisible(true);
         
        
        
        }    
        else if(News!=null)
        {
          
            try {
               rs=dbase.getData("SELECT * FROM `newspaper` WHERE id='"+table.getValueAt(i, 0).toString()+"'");
               rs.next();
               News.SetValues(rs.getString("id"),rs.getString("name") ,rs.getString("ph") ,rs.getString("email"), rs.getString("mobile"), rs.getString("fax"));
            } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }    
       
        else if(NewP!=null)
        {
          
            try {
               rs=dbase.getData("SELECT * FROM `Press` WHERE id='"+table.getValueAt(i, 0).toString()+"'");
               rs.next();
               NewP.SetValues(rs.getString("id"),rs.getString("name") ,rs.getString("PhoneNumber") ,rs.getString("EmailAddress"), rs.getString("MobileNumber"), rs.getString("FaxNumber"));
            } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        else if(EMedia!=null)
        {
          
          try {
               rs=dbase.getData("SELECT * FROM `emedia` WHERE id='"+table.getValueAt(i, 0).toString()+"'");
               rs.next();
               EMedia.SetValues(rs.getString("id"),rs.getString("name") ,rs.getString("ph") ,rs.getString("email"), rs.getString("mobile"), rs.getString("fax"));
               rs.next();
            
          } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }  
            
        }    

        else if(CBill !=null)
        {
            try {
               rs=dbase.getData("SELECT * FROM `cbill` WHERE billNo='"+table.getValueAt(i, 0).toString()+"'");
               rs.next();
               CBill.SetBillVariable(table.getValueAt(i, 0).toString(),rs.getString(2) ,rs.getString(4), rs.getString(3),table.getValueAt(i, 1).toString(),rs.getString(6));
               CBill.SetTable(CBill.Num);
            } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         }
        else if(Pbill !=null)
        {
            try {
               
                if(CS)
                { 
                  if(Add)
                  {
                   rs=dbase.getData("SELECT  `Rate`, `Qty`,  `Parti`, `Billno` FROM `pressorder` Where Orderid='"+table.getValueAt(i, 0)+"'");
                   rs.next();   
                   Pbill.AddOrder(table.getValueAt(i,0).toString(),rs.getString("Rate"),rs.getString("Qty"),rs.getString("Parti"));
                  }
                  else
                  {     
                  Pbill.SetCus(table.getValueAt(i, 0).toString(),table.getValueAt(i, 1).toString());
                  }
           }
                else {
                rs=dbase.getData("SELECT * FROM `pressbill` WHERE billNo='"+table.getValueAt(i, 0).toString()+"'");
                rs.next();
                Pbill.SetCus(rs.getString(4),rs.getString(5));
                Pbill.SetValues(rs.getString(1),rs.getString(3) ,rs.getString(2) );
                
               }
             } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         }
        else if(MBill !=null)
        {
            try {
              
                if(ROSearch)
               {
                
                 MBill.SetROField(table.getValueAt(i, 0).toString());
              
               }    
               else
                {
                
                   rs=dbase.getData("SELECT * FROM `mbill` WHERE billNo='"+table.getValueAt(i, 0).toString()+"'");
                   rs.next();
                   MBill.SetValues(table.getValueAt(i, 0).toString(),rs.getString(2) ,rs.getString(3), rs.getString(4),table.getValueAt(i, 1).toString());
                   MBill.SetROField(rs.getString("RONum"));
               }
         
            } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         }
        else if(ECBill !=null)
        {
            try {
                rs=dbase.getData("SELECT * FROM `ecbill` WHERE billNo='"+table.getValueAt(i, 0).toString()+"'");
                rs.next();
                ECBill.SetBillVariable(table.getValueAt(i, 0).toString(),rs.getString(2) ,rs.getString(4), rs.getString(3),table.getValueAt(i, 1).toString(),rs.getString(6));
                ECBill.SetTable(ECBill.Num);
                
            } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         }
        else if(newsBill !=null)
        {
            try {
               if(ROSearch)
               {
                    newsBill.SetROField(table.getValueAt(i, 0).toString());
                
              
               }    
               else{
                   rs=dbase.getData("SELECT * FROM `nbill` WHERE billNo='"+table.getValueAt(i, 0).toString()+"'");
                   rs.next();
                   newsBill.SetValues(table.getValueAt(i, 0).toString(),rs.getString(2) ,rs.getString(3), rs.getString(4),table.getValueAt(i, 1).toString());
                   newsBill.SetROField(rs.getString("RONum"));
               }
            } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         }
        
        else if(Rep!=null)
        {
         if(Colum==null){
             
             if (isNReport) {
                 try {
                     rs = dbase.getData("SELECT * FROM `newspaper` WHERE id='" + table.getValueAt(i, 0).toString() + "'");
                     rs.next();
                     Rep.SetValuesReport(rs.getString("id"), rs.getString("name"), isNReport);
                     
                 } catch (SQLException ex) {
                     dbase.displaySQLErrors(ex);
                     Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
                  //   System.out.print("here");
                 }
             } else{
                 try {
                     rs = dbase.getData("SELECT * FROM `emedia` WHERE id='" + table.getValueAt(i, 0).toString() + "'");
                     rs.next();
                     Rep.SetValuesReport(rs.getString("id"), rs.getString("name"), isNReport);

                 } catch (SQLException ex) {
                     dbase.displaySQLErrors(ex);
                     Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
         }
         else {
         try {
               rs=dbase.getData("SELECT * FROM `"+Colum+"` WHERE id='"+table.getValueAt(i, 0).toString()+"'");
               rs.next();
               Rep.SetValues(rs.getString("id"),rs.getString("name"),IsCus);
                       
            } catch (SQLException ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        
        }  
         else if(Sett!=null)
        {
         Sett.setValue(table.getValueAt(i, 0).toString(),table.getValueAt(i, 1).toString());
        
        }  
        else if(roObject!=null)
        {
           roObject.setFields(table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString(),CS);
           roObject.setEnabled(true);
           roObject.setVisible(true);
        }
        else if(EroObject!=null)
        {
           EroObject.setFields(table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString(),CS);
           EroObject.setEnabled(true);
           EroObject.setVisible(true);
        }
        else if(AddRO!=null)
        {
                
        }
        else if(proObject !=null){
           proObject.setFields(table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString(),CS);
           proObject.setEnabled(true);
           proObject.setVisible(true);
        }
       
       
       //to close this window and go back to main window
       if(Home!=null){
        Home.setEnabled(true);
        Home.setVisible(true);
       }
       
      dbase.DisconnectFromDB();
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if(b1.isSelected())
            sorter.textSearch(jTextField1.getText(),1 );
        else
            sorter.textSearch(jTextField1.getText(), 0);
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (Home != null) {
            Home.setEnabled(true);
            Home.setVisible(true);
        }
        if (roObject != null) {
            roObject.setEnabled(true);
            roObject.setVisible(true);
        } 
        if (EroObject != null) {
            EroObject.setEnabled(true);
            EroObject.setVisible(true);
        }
        if (proObject != null) {
            proObject.setEnabled(true);
            proObject.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void triggerChange(String querry) {
      dbase = new DataBase();
      dbase.connectToDB("media");
      rs = dbase.getData(querry);
    }

    private void initSearchPage(String querry) {
        g = new int[2];
        index = new int[2];
        
        for (int i = 0; i < 2; i++) {
            g[i] = 1;
            index[i]=i;
        }
        
        triggerChange(querry);
        try {
            sorter = new Csorter(rs, heading, table, g, index);
            sorter.updateTable();
        } catch (SQLException ex) {
          }
        
    }
    
    private void triggerChangeAc(String querry) {
      dbase = new DataBase();
      dbase.connectToDB("hawklogin");
      rs = dbase.getData(querry);

    }
    
    private void initSearchPageAc(String querry) {
        g = new int[14];
        index = new int[14];
        
        for (int i = 2; i < 14; i++) {
            g[i] = 0;
        }
        g[0]=g[1]=1;
        index[0]=0;
        index[1]=1;
        
        triggerChangeAc(querry);
        try {
            sorter = new Csorter(rs, heading, table, g, index);
            sorter.updateTable();
        } catch (SQLException ex) {
          }
        
    }
}
