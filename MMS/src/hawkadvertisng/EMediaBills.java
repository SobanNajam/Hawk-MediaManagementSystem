
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class EMediaBills extends JPanel {

    MainWindow Home;
    JTextField[] textFields;
    Boolean ROType=true;
    String RONumber;
    
    private float TotalAmount,commision=0;
    private boolean Saved;
   public boolean IsEdit=false;
    
    
    
    public EMediaBills(MainWindow Home ) {
        initComponents();
        this.Home=Home;
        
        initTextFields();
        SetEnableFalse();
        Saved=true;
        
       Delete.setEnabled(false);
       
        jPanel1.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jdpPanel = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        cancelSD = new javax.swing.JButton();
        jdp = new com.toedter.calendar.JCalendar();
        EmailAddressLbl1 = new javax.swing.JLabel();
        OpeningBalancelbl6 = new javax.swing.JLabel();
        Date1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        OpeningBalancelbl2 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        OpeningBalancelbl7 = new javax.swing.JLabel();
        ManagerName1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        AmountLbl = new javax.swing.JLabel();
        t13 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        OpeningBalancelbl1 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        amountTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insertiontable = new javax.swing.JTable();
        DateLbl1 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        Station1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddressLbl2 = new javax.swing.JLabel();
        ClientCode1 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        OpeningBalancelbl = new javax.swing.JLabel();
        RONumber1 = new javax.swing.JLabel();
        ManagerCode1 = new javax.swing.JLabel();
        billNoLbl = new javax.swing.JLabel();
        AuthorityLbl = new javax.swing.JLabel();
        commText = new javax.swing.JTextField();
        billNo = new javax.swing.JTextField();
        remarksLbl = new javax.swing.JLabel();
        RateTxt = new javax.swing.JTextField();
        Date4 = new javax.swing.JLabel();
        Amounttxt = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        Date3 = new javax.swing.JLabel();
        Calender = new javax.swing.JButton();
        format = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        gotoHome = new javax.swing.JLabel();
        hawklogo = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(940, 570));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jdpPanel.setBackground(new java.awt.Color(153, 204, 255));
        jdpPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jdpPanel.setPreferredSize(new java.awt.Dimension(100, 100));
        jdpPanel.setLayout(null);

        jButton8.setText("DONE");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jdpPanel.add(jButton8);
        jButton8.setBounds(400, 230, 70, 23);

        cancelSD.setText("cancel");
        cancelSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSDActionPerformed(evt);
            }
        });
        jdpPanel.add(cancelSD);
        cancelSD.setBounds(300, 230, 80, 23);

        jdp.setBackground(new java.awt.Color(255, 255, 255));
        jdpPanel.add(jdp);
        jdp.setBounds(10, 10, 450, 230);

        jPanel1.add(jdpPanel);
        jdpPanel.setBounds(440, 130, 480, 270);

        EmailAddressLbl1.setBackground(new java.awt.Color(255, 255, 255));
        EmailAddressLbl1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EmailAddressLbl1.setText("Client Name:");
        jPanel1.add(EmailAddressLbl1);
        EmailAddressLbl1.setBounds(20, 280, 82, 20);

        OpeningBalancelbl6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl6.setText("Duration");
        jPanel1.add(OpeningBalancelbl6);
        OpeningBalancelbl6.setBounds(580, 350, 60, 20);

        Date1.setEditable(false);
        jPanel1.add(Date1);
        Date1.setBounds(440, 220, 120, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Basic Information");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 170, 140, 17);

        t11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(t11);
        t11.setBounds(120, 380, 200, 20);

        t7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(t7);
        t7.setBounds(120, 350, 200, 20);

        t5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(120, 280, 200, 20);

        OpeningBalancelbl2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl2.setText("Materials:");
        jPanel1.add(OpeningBalancelbl2);
        OpeningBalancelbl2.setBounds(20, 410, 70, 20);

        t6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel1.add(t6);
        t6.setBounds(440, 250, 240, 20);

        t10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        jPanel1.add(t10);
        t10.setBounds(640, 350, 100, 20);

        OpeningBalancelbl7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl7.setText("Remarks");
        jPanel1.add(OpeningBalancelbl7);
        OpeningBalancelbl7.setBounds(350, 380, 100, 20);

        ManagerName1.setBackground(new java.awt.Color(255, 255, 255));
        ManagerName1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ManagerName1.setText("Channel Name:");
        jPanel1.add(ManagerName1);
        ManagerName1.setBounds(20, 220, 110, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Airing information");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 320, 130, 20);

        t2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(440, 190, 120, 20);

        t3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(120, 220, 200, 20);

        AmountLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AmountLbl.setText("Amount");
        jPanel1.add(AmountLbl);
        AmountLbl.setBounds(350, 410, 60, 20);

        t13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });
        jPanel1.add(t13);
        t13.setBounds(120, 410, 200, 20);

        t1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(120, 190, 200, 20);

        OpeningBalancelbl1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl1.setText("Time");
        jPanel1.add(OpeningBalancelbl1);
        OpeningBalancelbl1.setBounds(20, 350, 130, 20);

        t4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(120, 250, 200, 19);

        amountTxt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });
        jPanel1.add(amountTxt);
        amountTxt.setBounds(450, 410, 90, 20);

        Insertiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Insertion  Number", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Insertiontable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 490, 650, 60);

        DateLbl1.setBackground(new java.awt.Color(255, 255, 255));
        DateLbl1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        DateLbl1.setText("Date:");
        jPanel1.add(DateLbl1);
        DateLbl1.setBounds(350, 220, 40, 20);

        t8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        jPanel1.add(t8);
        t8.setBounds(450, 350, 100, 20);

        Station1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Station1.setText("Station:");
        jPanel1.add(Station1);
        Station1.setBounds(350, 250, 60, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Insertion information");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 460, 150, 17);

        AddressLbl2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddressLbl2.setText("Caption:");
        jPanel1.add(AddressLbl2);
        AddressLbl2.setBounds(20, 380, 130, 20);

        ClientCode1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ClientCode1.setText("ClientCode:");
        jPanel1.add(ClientCode1);
        ClientCode1.setBounds(20, 250, 80, 20);

        t9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(t9);
        t9.setBounds(450, 380, 290, 20);

        OpeningBalancelbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl.setText("Rate :");
        jPanel1.add(OpeningBalancelbl);
        OpeningBalancelbl.setBounds(350, 350, 130, 20);

        RONumber1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RONumber1.setText("RO Number:");
        jPanel1.add(RONumber1);
        RONumber1.setBounds(20, 190, 90, 20);

        ManagerCode1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ManagerCode1.setText("Channel Code");
        jPanel1.add(ManagerCode1);
        ManagerCode1.setBounds(350, 190, 90, 20);

        billNoLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        billNoLbl.setText("Bill Number:");
        jPanel1.add(billNoLbl);
        billNoLbl.setBounds(20, 70, 90, 20);

        AuthorityLbl.setBackground(new java.awt.Color(255, 255, 255));
        AuthorityLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        AuthorityLbl.setText("Commision:");
        jPanel1.add(AuthorityLbl);
        AuthorityLbl.setBounds(20, 100, 90, 20);

        commText.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        commText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commTextActionPerformed(evt);
            }
        });
        commText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                commTextKeyReleased(evt);
            }
        });
        jPanel1.add(commText);
        commText.setBounds(120, 100, 200, 20);

        billNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel1.add(billNo);
        billNo.setBounds(120, 70, 200, 20);

        remarksLbl.setBackground(new java.awt.Color(255, 255, 255));
        remarksLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        remarksLbl.setText("Rate:");
        jPanel1.add(remarksLbl);
        remarksLbl.setBounds(350, 100, 90, 20);
        jPanel1.add(RateTxt);
        RateTxt.setBounds(440, 100, 120, 20);

        Date4.setBackground(new java.awt.Color(255, 255, 255));
        Date4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date4.setText("Amount");
        jPanel1.add(Date4);
        Date4.setBounds(350, 70, 80, 20);

        Amounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmounttxtActionPerformed(evt);
            }
        });
        jPanel1.add(Amounttxt);
        Amounttxt.setBounds(440, 70, 120, 20);

        Date.setEditable(false);
        jPanel1.add(Date);
        Date.setBounds(610, 70, 130, 20);

        Date3.setBackground(new java.awt.Color(255, 255, 255));
        Date3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date3.setText("Date:");
        jPanel1.add(Date3);
        Date3.setBounds(570, 70, 50, 20);

        Calender.setText("calender");
        Calender.setOpaque(false);
        Calender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalenderActionPerformed(evt);
            }
        });
        jPanel1.add(Calender);
        Calender.setBounds(650, 100, 90, 23);

        format.setText("format");
        jPanel1.add(format);
        format.setBounds(740, 350, 40, 20);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel3.setText("Billing Information");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 300, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel8.setText("Release Order");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 130, 300, 30);

        add(jPanel1);
        jPanel1.setBounds(20, 120, 940, 570);

        Delete.setText("Delete");
        Delete.setOpaque(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete);
        Delete.setBounds(390, 710, 63, 23);

        jButton2.setText("save bill");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(140, 710, 71, 23);

        jButton3.setText("New Bill");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(60, 710, 70, 23);

        jButton4.setText("Cancel");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(310, 710, 70, 23);

        Edit.setText("Edit");
        Edit.setOpaque(false);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        add(Edit);
        Edit.setBounds(220, 710, 80, 23);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("E-Media Bill Entry");
        add(jLabel2);
        jLabel2.setBounds(320, 60, 240, 40);

        gotoHome.setToolTipText("HOME");
        gotoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotoHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoHomeMouseClicked(evt);
            }
        });
        add(gotoHome);
        gotoHome.setBounds(250, 60, 50, 40);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {

            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            if (myFormat.parse(myFormat.format(jdp.getDate())).compareTo(myFormat.parse(dateCreator(0))) < 0) {
                JOptionPane.showMessageDialog(null, "Invalid Date! Please select a valid Date");
                jdpPanel.setVisible(true);
                jdpPanel.setEnabled(true);
                return;
            }
            Date.setText(myFormat.format(jdp.getDate()));
            showCalender(false);
         } catch (ParseException ex) {
        }
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if( !Saved && JOptionPane.showConfirmDialog(null, "Are you sure you want a new bill without saving ?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 1)
        {   
           return;
        }
         else
          {  
            jPanel1.setVisible(true);
            Saved=false;        
            new search(Home,"SELECT `RONum`,  `CName`  FROM `e_ro` WHERE  NBill='-1'",this,true); 
          }     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       if (!validateBill())
        {
         return;
        }
        try
        {
       
        if(!IsEdit)
        {    
         saveBill();
         ChangeRO();
         JOptionPane.showMessageDialog(null,"Bill Saved");
         Saved=true;
         Reset();   
        
        }
        else
        {
        
         
            
         IsEdit=false;
         Saved=true;
         UpdateBill();
         Reset();   
        JOptionPane.showMessageDialog(null,"Bill UpDated");

        }
        }catch(Exception ex)
        {
         
            JOptionPane.showMessageDialog(null,"Bill Not Saved");
        
        }
          
    }//GEN-LAST:event_jButton2ActionPerformed
    
     private void UpdateBill() {
        
        DataBase obj = new DataBase();
        obj.connectToDB("media");
        
        obj.runQuerry("UPDATE `mbill` SET `billNo`='"+billNo.getText()+"',`amount`='"+Amounttxt.getText()+"',`Commision`='"+commText.getText()+"' WHERE RONum='"+t1.getText()+"'");
        obj.DisconnectFromDB();
    }
   
     public void ChangeRO()
     {
       
         DataBase db =new DataBase();
         db.connectToDB("media");
         db.runQuerry("UPDATE  `e_ro` SET  `NBill` ='"+billNo.getText()+"' WHERE RONum ='"+t1.getText()+"'");
     
     }
     
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Home.jPanel1.setVisible(false);
        Home.Remove();
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalenderActionPerformed
        showCalender(true);
    }//GEN-LAST:event_CalenderActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        new search(Home,"select billNo,date from mbill where 1",this,false);
        jPanel1.setVisible(true);
         IsEdit=true;
         Saved=false;
         
       Delete.setEnabled(true);
    }//GEN-LAST:event_EditActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed

    }//GEN-LAST:event_amountTxtActionPerformed
     
     public boolean RONumberValid()
    {
        try {
            String Temp=JOptionPane.showInputDialog("EnterRO");
            DataBase db=new DataBase();
            db.connectToDB("media");
            ResultSet rs=db.getData("SELECT RONum FROM  `e_ro` WHERE RONum ="+Temp);
            
            if(rs.next())
            { 
              RONumber=Temp;  
              return true;
            }
            else
            {
             JOptionPane.showMessageDialog(null, "Wrong RO Number");
             return false;
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

      return false;
    }
    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed

    }//GEN-LAST:event_t8ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void AmounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmounttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmounttxtActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void commTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commTextActionPerformed
    }//GEN-LAST:event_commTextActionPerformed

    private void commTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commTextKeyReleased
            
           try {
            commision = (float) Double.parseDouble(commText.getText());
            Amounttxt.setText(String.valueOf((float) (TotalAmount - (TotalAmount * (commision / 100)))));
        } catch (NumberFormatException e) {
            commText.setText("0");
            commision = (float) Double.parseDouble(commText.getText());
            Amounttxt.setText(String.valueOf(TotalAmount ));
        
        }
    }//GEN-LAST:event_commTextKeyReleased

    private void gotoHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoHomeMouseClicked
        Home.jPanel1.setVisible(false);
        Home.Remove();
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_gotoHomeMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        try{
            DataBase db =new DataBase();
            db.connectToDB("media");
            db.runQuerry("DELETE FROM `mbill` WHERE billNo='"+billNo.getText()+"'");
            db.runQuerry("UPDATE  `e_ro` SET  `NBill` ='-1' WHERE RONum ='"+t1.getText()+"'");
            db.DisconnectFromDB();
            Saved=true;
            Reset();
            JOptionPane.showMessageDialog(null,"Bill  Deleted");

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Bill Not Deleted");

        }
        
       Delete.setEnabled(false);
    }//GEN-LAST:event_DeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl2;
    private javax.swing.JLabel AmountLbl;
    private javax.swing.JTextField Amounttxt;
    private javax.swing.JLabel AuthorityLbl;
    private javax.swing.JButton Calender;
    private javax.swing.JLabel ClientCode1;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Date1;
    private javax.swing.JLabel Date3;
    private javax.swing.JLabel Date4;
    private javax.swing.JLabel DateLbl1;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel EmailAddressLbl1;
    private javax.swing.JTable Insertiontable;
    private javax.swing.JLabel ManagerCode1;
    private javax.swing.JLabel ManagerName1;
    private javax.swing.JLabel OpeningBalancelbl;
    private javax.swing.JLabel OpeningBalancelbl1;
    private javax.swing.JLabel OpeningBalancelbl2;
    private javax.swing.JLabel OpeningBalancelbl6;
    private javax.swing.JLabel OpeningBalancelbl7;
    private javax.swing.JLabel RONumber1;
    private javax.swing.JTextField RateTxt;
    private javax.swing.JLabel Station1;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField billNo;
    private javax.swing.JLabel billNoLbl;
    private javax.swing.JButton cancelSD;
    private javax.swing.JTextField commText;
    private javax.swing.JLabel format;
    private javax.swing.JLabel gotoHome;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JCalendar jdp;
    private javax.swing.JPanel jdpPanel;
    private javax.swing.JLabel remarksLbl;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
 
  

    private void saveBill() {
        
        DataBase obj = new DataBase();
        obj.connectToDB("media");
        obj.insertGen("`billNo`, `amount`, `Commision`, `rate`, `date`, `RONum`",DBValues.get(textFields) , "mbill");
        obj.DisconnectFromDB();
    }
    
    private void SetEnableFalse( )
    {
               t1.setEnabled(false);
               Date1.setEnabled(false);
               amountTxt.setEnabled(false);;
               t2.setEnabled(false);
               t3.setEnabled(false);
               t4.setEnabled(false);
               t5.setEnabled(false);
               t6.setEnabled(false);
               t7.setEnabled(false);
               t8.setEnabled(false);
               t9.setEnabled(false);
               t10.setEnabled(false);
               t11.setEnabled(false);
               t13.setEnabled(false);
              
    }        
    public void SetROField(String RO)
    {   
        try {
            DataBase db= new DataBase ();
            db.connectToDB("media");
            
            ResultSet rs =db.getData("SELECT * FROM `e_ro` WHERE RONum ="+RO+";");
            
            if(rs.next())
            { 
               t1.setText(rs.getString("RONum"));
               Date1.setText(rs.getString("date"));
               t2.setText(rs.getString("MCode"));
               t3.setText(rs.getString("MName"));
               t4.setText(rs.getString("CCode"));
               t5.setText(rs.getString("CName"));
               t6.setText(rs.getString("MStation"));
               t7.setText(rs.getString("Position"));
               t8.setText(rs.getString("rateContract"));
               RateTxt.setText(t8.getText());
               t9.setText(rs.getString("Remarks"));
               t11.setText(rs.getString("Caption"));
               t10.setText(rs.getString("Duration"));
              
               t13.setText(rs.getString("Material"));
               amountTxt.setText(rs.getString("Amount"));
               Amounttxt.setText(amountTxt.getText());
               TotalAmount=(float)Double.parseDouble(amountTxt.getText());
               updateTable(RO);
               RONumber=RO;
               if (rs.getInt("timeFormat")==0)
                format.setText("min");
               else
                 format.setText("sec");
                try {
            commision = (float) Double.parseDouble(commText.getText());
            Amounttxt.setText(String.valueOf((float) (TotalAmount - (TotalAmount * (commision / 100)))));
        } catch (NumberFormatException e) {
            commText.setText("0");
            commision = (float) Double.parseDouble(commText.getText());
            Amounttxt.setText(String.valueOf(TotalAmount ));   
        }   
            }
            else
            {    
            }
        } catch (SQLException ex) {
            Logger.getLogger(EMediaBills.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        
    private void initTextFields() {
        
    
    textFields= null;
    textFields = new JTextField[]{billNo,Amounttxt,commText,RateTxt,Date,t1};
        
        for(JTextField x: textFields)
            x.setText("");  
        
        Remove();
        showCalender(false);
        Date.setText(dateCreator(0));
        
    
    }
    
    
    
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
       
        if ( billNo.getText().contentEquals("")){
            JOptionPane.showMessageDialog(null, "Invalid billNo");
            return false;
        }
        if( Amounttxt.getText().contentEquals("") ){
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
        Amounttxt.setText(amnt);
        Date.setText(dt);
        commText.setText(auth);
        
    }
    
   
   
    
   
   
   
    
         
    
    
     private void updateTable(String No) {
        int[] g = new int[2];
        int[] index = new int[2];
        
        
        for (int i = 0; i < 2; i++) {
            g[i] = 1;
            index[i]=i;
        }
        
        try {
            DataBase dbase = new DataBase();
            dbase.connectToDB("media");
            ResultSet rs = dbase.getData("Select date,qty from `spots`  where RONum ="+No);
            Csorter sorter = new Csorter(rs, new String[]{"Date","Number"} , Insertiontable, g, index);
            sorter.updateTable();
            dbase.DisconnectFromDB();
        } catch (SQLException ex) {
          }
    }
   private JPanel panel=new JPanel(); 
  
   public void Reset() {
    
        SetValues("","0.0","0.0","","");
                   t1.setText("");
               Date1.setText("");
               t2.setText("");
               t3.setText("");
               t4.setText("");
               t5.setText("");
               t6.setText("");
               t7.setText("");
               t8.setText("");
               t9.setText("");
               t11.setText("");
               t10.setText("");
               t13.setText("");              
               amountTxt.setText("");
               RONumber ="";
               RateTxt.setText("");
               Insertiontable.setModel(tableSet());
               jPanel1.setVisible(false);
               Saved=true;
               TotalAmount=commision=0; 
    }
   
   public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("insertion Number");
        Temp.addColumn("Date");
        
        
        return Temp;

    }

}
