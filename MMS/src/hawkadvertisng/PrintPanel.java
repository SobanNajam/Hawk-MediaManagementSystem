package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import printer_package.Conversions;
import printer_package.Print;

//<editor-fold defaultstate="collapsed" desc="Constructor">
public class PrintPanel extends javax.swing.JPanel {
    String RONumber;
    
    MainWindow Homeh;
    public String BillNumber;
    
    public PrintPanel(MainWindow Homeh) {
        initComponents();
        this.Homeh=Homeh;
        taxpanel.setVisible(false);
        CodeGen object = new CodeGen();
        taxval1.setText(object.Getaddress("GST")); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EMB = new javax.swing.JButton();
        MROPrint = new javax.swing.JButton();
        NRO = new javax.swing.JButton();
        NPB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb5 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        Eratescb = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        Nratescb = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        hawklogo = new javax.swing.JLabel();
        cb4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        taxpanel = new javax.swing.JPanel();
        tax1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        taxval1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        t1 = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setBackground(new java.awt.Color(25, 31, 36));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setLayout(null);

        EMB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        EMB.setText("Print");
        EMB.setOpaque(false);
        EMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMBActionPerformed(evt);
            }
        });
        add(EMB);
        EMB.setBounds(80, 400, 120, 30);

        MROPrint.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        MROPrint.setText("Print");
        MROPrint.setOpaque(false);
        MROPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MROPrintActionPerformed(evt);
            }
        });
        add(MROPrint);
        MROPrint.setBounds(330, 400, 120, 30);

        NRO.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NRO.setText("Print");
        NRO.setOpaque(false);
        NRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NROActionPerformed(evt);
            }
        });
        add(NRO);
        NRO.setBounds(590, 400, 120, 30);

        NPB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        NPB.setText("Print");
        NPB.setOpaque(false);
        NPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPBActionPerformed(evt);
            }
        });
        add(NPB);
        NPB.setBounds(840, 400, 120, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Newspaper Bill");
        add(jLabel8);
        jLabel8.setBounds(780, 140, 230, 50);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Newspaper RO");
        add(jLabel7);
        jLabel7.setBounds(530, 140, 230, 50);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Electronic RO");
        add(jLabel6);
        jLabel6.setBounds(275, 140, 230, 50);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Electronic Media Bill");
        add(jLabel5);
        jLabel5.setBounds(20, 140, 230, 50);

        cb5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cb5.setText("Apply Tax");
        cb5.setOpaque(false);
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });
        add(cb5);
        cb5.setBounds(50, 250, 140, 25);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setMaximumSize(new java.awt.Dimension(250, 300));
        jLabel1.setMinimumSize(new java.awt.Dimension(250, 300));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 300));
        add(jLabel1);
        jLabel1.setBounds(20, 140, 230, 300);

        Eratescb.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Eratescb.setText("Hide Rates");
        Eratescb.setOpaque(false);
        add(Eratescb);
        Eratescb.setBounds(300, 250, 120, 25);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setMaximumSize(new java.awt.Dimension(250, 300));
        jLabel2.setMinimumSize(new java.awt.Dimension(250, 300));
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 300));
        add(jLabel2);
        jLabel2.setBounds(275, 140, 230, 300);

        Nratescb.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Nratescb.setText("Hide Rates");
        Nratescb.setOpaque(false);
        add(Nratescb);
        Nratescb.setBounds(570, 250, 120, 25);

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setMaximumSize(new java.awt.Dimension(250, 300));
        jLabel4.setMinimumSize(new java.awt.Dimension(250, 300));
        jLabel4.setPreferredSize(new java.awt.Dimension(250, 300));
        add(jLabel4);
        jLabel4.setBounds(530, 140, 230, 300);

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

        hawklogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/hawk_logo.png"))); // NOI18N
        add(hawklogo);
        hawklogo.setBounds(0, 0, 350, 100);

        cb4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cb4.setText("Apply Tax");
        cb4.setOpaque(false);
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });
        add(cb4);
        cb4.setBounds(820, 250, 160, 25);

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setMaximumSize(new java.awt.Dimension(250, 300));
        jLabel3.setMinimumSize(new java.awt.Dimension(250, 300));
        jLabel3.setPreferredSize(new java.awt.Dimension(250, 300));
        add(jLabel3);
        jLabel3.setBounds(780, 140, 230, 300);

        taxpanel.setOpaque(false);
        taxpanel.setLayout(null);

        tax1.setEditable(false);
        tax1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tax1.setText("Add Sales Tax");
        tax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tax1ActionPerformed(evt);
            }
        });
        taxpanel.add(tax1);
        tax1.setBounds(140, 40, 250, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Tax Label: ");
        taxpanel.add(jLabel20);
        jLabel20.setBounds(50, 40, 70, 20);

        taxval1.setEditable(false);
        taxval1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        taxval1.setText("16");
        taxval1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxval1ActionPerformed(evt);
            }
        });
        taxpanel.add(taxval1);
        taxval1.setBounds(430, 40, 30, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("Tax ");
        taxpanel.add(jLabel28);
        jLabel28.setBounds(400, 40, 40, 20);

        jLabel33.setText("%");
        taxpanel.add(jLabel33);
        jLabel33.setBounds(460, 40, 20, 20);

        t1.setOpaque(false);
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        taxpanel.add(t1);
        t1.setBounds(10, 40, 20, 23);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Tax Additions");
        taxpanel.add(jLabel34);
        jLabel34.setBounds(10, 10, 280, 20);

        add(taxpanel);
        taxpanel.setBounds(530, 450, 480, 100);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(BackGround);
        BackGround.setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents
//</editor-fold>
     //</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Bill and RO Print Buttons">
    private void NROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NROActionPerformed
        
        if (RONumberValid())
           {
           try {
               
                //<editor-fold defaultstate="collapsed" desc="Connection to database table">
               DataBase db=new DataBase();
               db.connectToDB("media");
               ResultSet rs=db.getData("SELECT *  FROM  `n_ro` WHERE RONum = "+RONumber);
               //</editor-fold>
                
                if (rs.next())
                { 
                //<editor-fold defaultstate="collapsed" desc="Array 1 Assignment">
                   String []ary1= new String[7];
                   ary1[0]=RONumber;
                   ary1[1]=datechanger(dateCreator(0));
                   ary1[2]=rs.getString("MName");
                   ary1[3]=rs.getString("MStation");
                   ary1[4]=rs.getString("CName");
                   ary1[5]=rs.getString("Caption");
                   ary1[6]=rs.getString("remarks");
                   //</editor-fold>
                
                //<editor-fold defaultstate="collapsed" desc="Check Array1 Contents">
//                   for(int i=0;i<ary1.length;i++)
//                   {
//                       System.out.println("Checking Array1 at"+i+" == "+ary1[i]);
//                   }
                   //</editor-fold>
                
                //<editor-fold defaultstate="collapsed" desc="Array 2 Assignment">
                   ResultSet rs1=db.getData("SELECT * FROM `insertions` WHERE RONum= "+RONumber);
                   
                   String [][]ary2= new String[GetDataSize(rs1)][6];
                   //System.out.println("size "+ary2[0].length);
                   int len=GetDataSize(rs1);
                   
                   for(int i=0;i<len;i++)
                   {
                       
                       rs1.next();
                       
                       ary2[i][0]=rs.getString("Position");
                       ary2[i][1]=maker(Integer.parseInt(rs1.getString("Qty")));
                       ary2[i][2]=datechanger(rs1.getString("Date"));
                       ary2[i][3]=rs.getString("Height")+" x "+rs.getString("Colum");
                       ary2[i][4]=rs.getString("rateContract");
                       ary2[i][5]=rs.getString("Material");
                       //</editor-fold>
                
                //<editor-fold defaultstate="collapsed" desc="Check Array 2 Contents">
//                for(int j=0;j<ary2[0].length;j++)
//                {System.out.print("Checking Array 2 at ["+i+"]"+"["+j+"] == "+ary2[i][j]+"      ");}
//                System.out.println("");
                   }
                //</editor-fold>
                   
               if (Nratescb.isSelected()){new Print(ary1,ary2,5);}
               else {new Print(ary1,ary2,4);}
                }
                
           db.DisconnectFromDB();
           } catch (SQLException ex) {
               Logger.getLogger(PrintPanel.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }          
           
    }//GEN-LAST:event_NROActionPerformed
    
    private void EMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMBActionPerformed
           if(EBillNumberValid())
        {
             try {
                 //<editor-fold defaultstate="collapsed" desc="Connect to database table">
                 DataBase db=new DataBase();
                 db.connectToDB("media");
                 ResultSet rs=db.getData("SELECT *  FROM  `e_ro` WHERE CBill = "+BillNumber);
                 //</editor-fold>
              
                 //<editor-fold defaultstate="collapsed" desc="Init Comps">
                 int i=0;
                 int len= GetEbillSize(BillNumber);
                 
                 String []ary1= new String[8];
                 String [][]ary2= new String[len][8];
                 //</editor-fold>
               
                 
               while (rs.next())
               {
               
               String RONumber=rs.getString("RONum");
                 

                 //<editor-fold defaultstate="collapsed" desc="Array 1 Assignment">
               if(i==0)
               {
                   ResultSet rs1=db.getData("SELECT  adr1 FROM `cust` WHERE id ='"+rs.getString("CCode")+"'");
                   ResultSet rs4=db.getData("SELECT  date,amount,authority,remarks from ecbill where billNo ='"+BillNumber+"'");   
                
                   rs1.next();
                   rs4.next();
                   
                   
                   ary1[0]=BillNumber;
                   ary1[1]= datechanger(rs4.getString("date"));
                   ary1[2]=rs1.getString("adr1");
                   ary1[3]=rs.getString("RONum");
                   ary1[4]=rs4.getString("authority");
                   ary1[5]=rs4.getString("remarks");
                   ary1[6]=rs4.getString("amount");
                   ary1[7]=rs.getString("Mstation");
               }
               else
               {
                   ary1[3]=rs.getString("RONum")+"-"+ary1[3];
               }
               //</editor-fold>
                 
                 //<editor-fold defaultstate="collapsed" desc="Check Array 1">
//               for (int var=0;var<ary1.length;var++)
//               {
//                   System.out.println("Checking Array1 at ["+var+"] = "+ary1[var]);
//               }
               //</editor-fold>
               
                 //<editor-fold defaultstate="collapsed" desc="Array 2 Assignment">
               ResultSet rs1=db.getData("SELECT * FROM `e_ro` WHERE RONum= "+RONumber);
               ResultSet rs2=db.getData("SELECT * FROM `spots` WHERE RONum= "+RONumber);
               rs1.next();
               
               
               
               ary2[i][0]=rs1.getString("MName");
               ary2[i][1]=rs1.getString("Duration");
               
               ary2[i][2]="";
               ary2[i][3]="";
               int tot=0;
               while(rs2.next())
               {
                   ary2[i][2]=maker(Integer.parseInt(rs2.getString("Qty")))+"\n"+ary2[i][2];
                   ary2[i][3]=datechanger(rs2.getString("Date"))+"\n"+ary2[i][3];
                   tot=tot+Integer.parseInt(rs2.getString("Qty"));
               }
               
               ary2[i][4]=Integer.toString(tot);
               ary2[i][5]=rs.getString("Position");
               ary2[i][6]=rs.getString("rateContract");
               ary2[i][7]=rs.getString("amount");
               //</editor-fold>
                
                 //<editor-fold defaultstate="collapsed" desc="Check Array 2">
              
               /*for(int j=0;j<8;j++)
               {
                   System.out.print(ary2[i][j]+"      ");
               }
               */
               //System.out.println("");
               
               i++;
               //</editor-fold>
               }
               
                 //<editor-fold defaultstate="collapsed" desc="Array 3 Assignment">
               CodeGen object = new CodeGen();
               ResultSet rsx = db.getData("SELECT `deduction`  FROM  `ecbill` WHERE billNo = "+BillNumber);
               rsx.next();
               String[] ary3 = new String[4];
               ary3[0] = tax1.getText();
               ary3[1] = taxval1.getText();
               ary3[2] = object.Getaddress("comm");
               ary3[3] = rsx.getString("deduction");
               //</editor-fold>
               
               if (cb5.isSelected()) {new Print(ary1,ary2,ary3,2);} 
               else {new Print(ary1,ary2,2);}
               
                
               

               db.DisconnectFromDB();
           } catch (SQLException ex) {
               Logger.getLogger(PrintPanel.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        }           
    }//GEN-LAST:event_EMBActionPerformed

    private void MROPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MROPrintActionPerformed
       if(MRONumberValid())
       {
           try {
               //<editor-fold defaultstate="collapsed" desc="Connection to database table">
               DataBase db=new DataBase();
               db.connectToDB("media");
               ResultSet rs=db.getData("SELECT *  FROM  `e_ro` WHERE RONum = "+RONumber);
               //</editor-fold>
               
               if (rs.next())
               { 
               //<editor-fold defaultstate="collapsed" desc="Array 1 Assignment">
                   String []ary1= new String[6];
                   ary1[0]=rs.getString("MName");
                   ary1[1]=rs.getString("CName");
                   ary1[2]=""; //Product goes here.. not available from database at this time
                   ary1[3]=RONumber;
                   ary1[4]= datechanger(dateCreator(0));
                   ary1[5]=rs.getString("amount");
                   //</editor-fold>
                
               //<editor-fold defaultstate="collapsed" desc="Check Array 1 Contents">
//                   for(int i=0;i<ary1.length;i++)
//                   {System.out.println("Checking Array1 at ["+i+"] = "+ary1[i]);}
                   //</editor-fold>
    
               //<editor-fold defaultstate="collapsed" desc="Array 2 Assignment">
                   ResultSet rs1=db.getData("SELECT * FROM `spots` WHERE RONum= "+RONumber);
                   
                   String [][]ary2= new String[GetDataSize(rs1)][8];
                   int len=GetDataSize(rs1);
                   String var = rs.getString("timeFormat");
                   for(int i=0;i<len;i++)
                   {
                       
                       rs1.next();
                       
                       ary2[i][0]=datechanger(rs1.getString("Date"));
                       ary2[i][1]=rs.getString("Mstation");
                       ary2[i][2]=""; // Query for program goes here. Unavailable at the moment
                       ary2[i][3]=rs1.getString("Qty")+" Spot Per Day";
                       ary2[i][4]=rs.getString("Position");
                       
                       if (var.compareTo("0") == 1)
                       ary2[i][5]=rs.getString("Duration")+" Sec";
                       else
                       ary2[i][5]=rs.getString("Duration")+" Min";
                       
                       ary2[i][6]=rs.getString("rateContract");
                       ary2[i][7]=rs.getString("caption");
                       
                       //</editor-fold>
                
               //<editor-fold defaultstate="collapsed" desc="Check Array 2 Contents">
//                       for(int j=0;j<ary2[0].length;j++)
//                       {System.out.println("Checking Array2 at ["+i+"]"+"["+j+"] = "+ary2[i][j]);}
                    }   
                   //</editor-fold>
    

                if (Eratescb.isSelected()){new Print(ary1,ary2,6);}
                else {new Print(ary1,ary2,3);}
               
               }
           } catch (SQLException ex) {
               Logger.getLogger(PrintPanel.class.getName()).log(Level.SEVERE, null, ex);
           }
       }    
     
    }//GEN-LAST:event_MROPrintActionPerformed

    private void NPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPBActionPerformed
       
        if(BillNumberValid())
        {
             try {
                 //<editor-fold defaultstate="collapsed" desc="Connect to database table">
                 DataBase db=new DataBase();
                 db.connectToDB("media");
                 ResultSet rs=db.getData("SELECT *  FROM  `n_ro` WHERE CBill = "+BillNumber);
                 //</editor-fold>
               
                 //<editor-fold defaultstate="collapsed" desc="Init Comps">
                 int i=0,j=0,k=0;
                 int len= GetbillSize(BillNumber);
                 String []ary1= new String[8];
                 String [][]ary2= new String[len][12];
                 //</editor-fold>
                 
              
               while (rs.next())
               { 
                String RONumber=rs.getString("RONum");
              
                //<editor-fold defaultstate="collapsed" desc="Array 1 Assignment">
                if(i==0)
                {
                 ResultSet rs1=db.getData("SELECT  adr1,name FROM `cust` WHERE id ='"+rs.getString("CCode")+"'");   
                 ResultSet rs4=db.getData("SELECT  date,amount,authority,remarks from cbill where billNo ='"+BillNumber+"'");   
                 
                 rs1.next();
                 rs4.next();
                 
                 ary1[0]=BillNumber;
                 ary1[1]=datechanger(rs4.getString("date"));
                 ary1[2]=rs1.getString("adr1");
                 ary1[3]=rs.getString("RONum");   
                 ary1[4]=rs4.getString("authority");
                 ary1[5]=rs.getString("Caption");  
                 ary1[6]=rs4.getString("amount");
                 ary1[7]=rs4.getString("remarks");
                 rs4.close();
                }
                else
                {
                    ary1[3]=rs.getString("RONum")+"-"+ary1[3];
                }
                //</editor-fold>
                 
                //<editor-fold defaultstate="collapsed" desc="Array 2 Assignment">
                ResultSet rs1=db.getData("SELECT * FROM `n_ro` WHERE RONum= '"+RONumber+"' ORDER BY RONum Desc");
                ResultSet rs2=db.getData("SELECT * FROM `insertions` WHERE RONum= '"+RONumber+"' ORDER BY Qty Desc");
                
                
                rs1.next();
                
                
                ary2[i][0]=rs1.getString("MName") ;
               
                ary2[i][1]=rs1.getString("Height")+" cm x "+rs1.getString("Colum")+" col";
                
                ary2[i][2]="";
                ary2[i][3]="";
                int numOfInsertions =0;
                while(rs2.next())
                {
                    ary2[i][2]=maker(Integer.parseInt(rs2.getString("Qty")))+"\n"+ary2[i][2];
                    ary2[i][3]=datechanger(rs2.getString("Date"))+"\n"+ary2[i][3];
                    numOfInsertions++;
                }
                int space = (Integer.parseInt(rs1.getString("Height"))*Integer.parseInt(rs1.getString("Colum")));
                
                ary2[i][4]= String.valueOf(space);
                ary2[i][5]=rs.getString("Position");
                ary2[i][6]=rs.getString("rateContract");
               
                ary2[i][7]=calculateAmount(numOfInsertions,space,Double.parseDouble(ary2[i][6]));
                ary2[i][8]=rs.getString("MStation");
                
                ary2[i][9]=rs.getString("color");
                ary2[i][10]=rs.getString("posper");
                ary2[i][11]=rs.getString("lang");
                
                //</editor-fold>
                i++;
               }
                //<editor-fold defaultstate="collapsed" desc="Array 3 Assignment">
               CodeGen object = new CodeGen();
               ResultSet rsx = db.getData("SELECT `deduction`  FROM  `cbill` WHERE billNo = "+BillNumber);
               rsx.next();
               String[] ary3 = new String[4];
               ary3[0] = tax1.getText();
               ary3[1] = taxval1.getText();
               ary3[2] = object.Getaddress("comm");
               ary3[3] = rsx.getString("deduction");
               //</editor-fold>
               
               
               if (cb4.isSelected()) {new Print(ary1,ary2,ary3,1);} 
               else {new Print(ary1,ary2,1);}
         
                db.DisconnectFromDB();
           } catch (SQLException ex) {
               Logger.getLogger(PrintPanel.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        }    
    }//GEN-LAST:event_NPBActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Homeh.ShowWindow(new HomePage(Homeh));
    }//GEN-LAST:event_homeMouseClicked

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        // TODO add your handling code here:
        if(cb4.isSelected())taxpanel.setVisible(true);
        else if(!cb4.isSelected())taxpanel.setVisible(false);
        
    }//GEN-LAST:event_cb4ActionPerformed

    private void tax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tax1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tax1ActionPerformed

    private void taxval1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxval1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxval1ActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        // TODO add your handling code here:
        if (t1.isSelected())
        {
         tax1.setEditable(true);
         taxval1.setEditable(true);
        }
        else if (!t1.isSelected())
        {
         tax1.setEditable(false);
         taxval1.setEditable(false);
        }
    }//GEN-LAST:event_t1MouseClicked

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        // TODO add your handling code here:
        if(cb5.isSelected())taxpanel.setVisible(true);
        else if(!cb5.isSelected())taxpanel.setVisible(false);
    }//GEN-LAST:event_cb5ActionPerformed
    //</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Validity Functions">   
 public boolean RONumberValid()
    {
        try {
            String Temp=JOptionPane.showInputDialog("EnterRO");
            DataBase db=new DataBase();
            db.connectToDB("media");
            ResultSet rs=db.getData("SELECT RONum FROM  `n_ro` WHERE RONum = "+Temp);
            
            if(rs.next())
            { 
              RONumber=Temp;
              db.DisconnectFromDB();
              return true;
            }
            else
            {
             JOptionPane.showMessageDialog(null, "Wrong RO Number");
             db.DisconnectFromDB();
              return false;
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

      return false;
    }    
 
  public boolean BillNumberValid()
    {
        try {
            String Temp=JOptionPane.showInputDialog("Enter BillNumber");
            DataBase db=new DataBase();
            db.connectToDB("media");
            
            ResultSet rs=db.getData("SELECT billNo FROM  `cbill` WHERE billNo = '"+Temp+"'");
         //   System.out.println("SELECT billNo FROM  `cbill` WHERE billNo = '"+Temp+"'");
            if(rs.next())
            { 
              BillNumber=Temp;
              db.DisconnectFromDB();
              return true;
            }
            else
            {
             JOptionPane.showMessageDialog(null, "Wrong RO Number");
             db.DisconnectFromDB();
              return false;
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

      return false;
    }  
  
 public boolean EBillNumberValid()
    {
        try {
            String Temp=JOptionPane.showInputDialog("Enter BillNumber");
            DataBase db=new DataBase();
            db.connectToDB("media");
            
            ResultSet rs=db.getData("SELECT billNo FROM  `ecbill` WHERE billNo = "+Temp);
            
            if(rs.next())
            { 
              BillNumber=Temp;
              db.DisconnectFromDB();
              return true;
            }
            else
            {
             JOptionPane.showMessageDialog(null, "Wrong RO Number");
             db.DisconnectFromDB();
              return false;
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

      return false;
    }  
 
 public boolean MRONumberValid()
    {
        try {
            String Temp=JOptionPane.showInputDialog("EnterRO");
            DataBase db=new DataBase();
            db.connectToDB("media");
            ResultSet rs=db.getData("SELECT RONum FROM  `e_ro` WHERE RONum = "+Temp);
            
            if(rs.next())
            { 
              RONumber=Temp;
              db.DisconnectFromDB();
              return true;
            }
            else
            {
             JOptionPane.showMessageDialog(null, "Wrong RO Number");
             db.DisconnectFromDB();
              return false;
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

      return false;
    }    
//</editor-fold> 
 
//<editor-fold defaultstate="collapsed" desc="Bill Sizes"> 
 private int  GetbillSize(String BillNumber)  {
        try {
            
              DataBase db=new DataBase();
              db.connectToDB("media");
             ResultSet rs=db.getData("SELECT count(*)  FROM  `n_ro` WHERE CBill = "+BillNumber);
            rs.next(); 
            int Datasize = rs.getInt(1);
//            while(rs.next())
//            {
//             
//            Datasize++;            
//             
//            }        
//            
//            rs.beforeFirst();
      //      System.out.println("...\nsize  = "+Datasize+"\n.....");
            return Datasize;
        
        } catch (SQLException ex) {
            
            Logger.getLogger(Csorter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     return 0;
     
    }

 private int  GetEbillSize(String BillNumber)  {
        try {
            
              DataBase db=new DataBase();
              db.connectToDB("media");
             ResultSet rs=db.getData("SELECT *  FROM  `e_ro` WHERE CBill = "+BillNumber);
             
            int Datasize = 0;
            while(rs.next())
            {
             
            Datasize++;            
             
            }        
            
            rs.beforeFirst();
            return Datasize;
        
        } catch (SQLException ex) {
            
            Logger.getLogger(Csorter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     return 0;
     
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
 
 //</editor-fold> 
 
//<editor-fold defaultstate="collapsed" desc="variables & date creator">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton EMB;
    private javax.swing.JCheckBox Eratescb;
    private javax.swing.JButton MROPrint;
    private javax.swing.JButton NPB;
    private javax.swing.JButton NRO;
    private javax.swing.JCheckBox Nratescb;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox t1;
    private javax.swing.JTextField tax1;
    private javax.swing.JPanel taxpanel;
    private javax.swing.JTextField taxval1;
    // End of variables declaration//GEN-END:variables

public static String dateCreator(int toAdd) {

        Calendar c = Calendar.getInstance();
        c.add(c.DATE, toAdd);

        if (c.get(Calendar.DAY_OF_WEEK)==1)
            c.add(c.DATE,1);

        String date= c.get(Calendar.YEAR)+"-" +( c.get(Calendar.MONTH )+1)+"-" + c.get(Calendar.DATE);
        
        return date;
    }

    private String calculateAmount(int numOfInsertions, int space, double rateContract) {
        double ans = numOfInsertions *space * rateContract;
        return String.valueOf(ans);
    }

    public static String maker(int a) {
    Conversions obj = new Conversions();
    String ans = null;
    int x = 0,y = 0,z = 0,zz = 0;
    z = a%1000;
    zz  = a-z;
    x = a%100;
    y = a-x;
    
    if (z == 0){ans = obj.convert(y);}
    else if (a > 1000 && x == 0) {ans = obj.convert(zz)+" & "+obj.convertLessThanOneThousand(z);}
    else if (a < 101){ans = obj.convertLessThanOneThousand(a);}
    else {ans = obj.convert(y)+" & "+obj.convertLessThanOneThousand(x);}
    
return ans;    
}
    
    public static String datechanger(String x)
    {
     String arr[] = x.split("-");
     return arr[2]+"-"+arr[1]+"-"+arr[0];
    }
    
}
 //</editor-fold>