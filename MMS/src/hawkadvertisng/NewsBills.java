
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class NewsBills extends JPanel {

    MainWindow Home;
    JTextField[] textFields;
    Boolean ROType=true;
    String RONumber;
    private boolean Saved;
    private float TotalAmount,commision=0;
    public boolean IsEdit=false;
    
    public NewsBills(MainWindow Home ) {
        initComponents();
        this.Home=Home;
        Delete.setVisible(false);
        jPanel2.setVisible(false);
        initTextFields();
        SetEnableFalse();
        Saved=true;
     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jdpPanel = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        cancelSD = new javax.swing.JButton();
        jdp = new com.toedter.calendar.JCalendar();
        OpeningBalancelbl5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ManagerCode1 = new javax.swing.JLabel();
        EmailAddressLbl1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RONumber1 = new javax.swing.JLabel();
        ManagerName1 = new javax.swing.JLabel();
        DateLbl1 = new javax.swing.JLabel();
        Station1 = new javax.swing.JLabel();
        AddressLbl2 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        Date1 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        AmountLbl = new javax.swing.JLabel();
        OpeningBalancelbl6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insertiontable = new javax.swing.JTable();
        t10 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        ClientCode1 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        OpeningBalancelbl = new javax.swing.JLabel();
        OpeningBalancelbl7 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        OpeningBalancelbl1 = new javax.swing.JLabel();
        OpeningBalancelbl2 = new javax.swing.JLabel();
        AuthorityLbl = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Date4 = new javax.swing.JLabel();
        ratesC = new javax.swing.JTextField();
        Amounttxt = new javax.swing.JTextField();
        remarksLbl = new javax.swing.JLabel();
        billNoLbl = new javax.swing.JLabel();
        billNo = new javax.swing.JTextField();
        Date3 = new javax.swing.JLabel();
        commText = new javax.swing.JTextField();
        Calender = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tl = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        generate = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        hawklogo = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

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

        jPanel2.add(jdpPanel);
        jdpPanel.setBounds(460, 170, 510, 290);

        OpeningBalancelbl5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl5.setText("Colum:");
        jPanel2.add(OpeningBalancelbl5);
        OpeningBalancelbl5.setBounds(370, 320, 60, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Basic Information");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(290, 160, 140, 17);

        ManagerCode1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ManagerCode1.setText("Newspaper Code:");
        jPanel2.add(ManagerCode1);
        ManagerCode1.setBounds(480, 190, 110, 20);

        EmailAddressLbl1.setBackground(new java.awt.Color(255, 255, 255));
        EmailAddressLbl1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EmailAddressLbl1.setText("Client Name:");
        jPanel2.add(EmailAddressLbl1);
        EmailAddressLbl1.setBounds(290, 250, 100, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Printing information");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(290, 290, 130, 20);

        RONumber1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RONumber1.setText("RO Number:");
        jPanel2.add(RONumber1);
        RONumber1.setBounds(20, 190, 100, 20);

        ManagerName1.setBackground(new java.awt.Color(255, 255, 255));
        ManagerName1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ManagerName1.setText("Newspaper Name:");
        jPanel2.add(ManagerName1);
        ManagerName1.setBounds(20, 220, 110, 20);

        DateLbl1.setBackground(new java.awt.Color(255, 255, 255));
        DateLbl1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        DateLbl1.setText("Date:");
        jPanel2.add(DateLbl1);
        DateLbl1.setBounds(290, 190, 40, 20);

        Station1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Station1.setText("Station:");
        jPanel2.add(Station1);
        Station1.setBounds(290, 220, 60, 20);

        AddressLbl2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddressLbl2.setText("Caption:");
        jPanel2.add(AddressLbl2);
        AddressLbl2.setBounds(20, 350, 60, 20);

        t11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });
        jPanel2.add(t11);
        t11.setBounds(90, 350, 170, 20);

        t3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel2.add(t3);
        t3.setBounds(130, 220, 140, 20);

        Date1.setEditable(false);
        jPanel2.add(Date1);
        Date1.setBounds(380, 190, 90, 20);

        t4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(t4);
        t4.setBounds(130, 250, 140, 19);

        AmountLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AmountLbl.setText("Amount");
        jPanel2.add(AmountLbl);
        AmountLbl.setBounds(520, 320, 60, 20);

        OpeningBalancelbl6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl6.setText("Height:");
        jPanel2.add(OpeningBalancelbl6);
        OpeningBalancelbl6.setBounds(210, 320, 60, 20);

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

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 470, 660, 60);

        t10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(t10);
        t10.setBounds(260, 320, 80, 20);

        t12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });
        jPanel2.add(t12);
        t12.setBounds(420, 320, 70, 19);

        ClientCode1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ClientCode1.setText("Client Code:");
        jPanel2.add(ClientCode1);
        ClientCode1.setBounds(20, 250, 80, 20);

        amountTxt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });
        jPanel2.add(amountTxt);
        amountTxt.setBounds(580, 320, 80, 20);

        OpeningBalancelbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl.setText("RateContract:");
        jPanel2.add(OpeningBalancelbl);
        OpeningBalancelbl.setBounds(20, 320, 100, 20);

        OpeningBalancelbl7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl7.setText("Remarks");
        jPanel2.add(OpeningBalancelbl7);
        OpeningBalancelbl7.setBounds(280, 350, 70, 20);

        t2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(t2);
        t2.setBounds(590, 190, 100, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Insertion information");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(280, 440, 140, 17);

        t1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1);
        t1.setBounds(130, 190, 140, 20);

        t13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });
        jPanel2.add(t13);
        t13.setBounds(90, 380, 170, 20);

        t5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(t5);
        t5.setBounds(380, 250, 180, 20);

        t7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(t7);
        t7.setBounds(350, 380, 310, 20);

        t9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        jPanel2.add(t9);
        t9.setBounds(350, 350, 310, 20);

        t6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel2.add(t6);
        t6.setBounds(380, 220, 180, 20);

        t8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        jPanel2.add(t8);
        t8.setBounds(130, 320, 70, 20);

        OpeningBalancelbl1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl1.setText("Premium:");
        jPanel2.add(OpeningBalancelbl1);
        OpeningBalancelbl1.setBounds(280, 380, 130, 20);

        OpeningBalancelbl2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl2.setText("Materials:");
        jPanel2.add(OpeningBalancelbl2);
        OpeningBalancelbl2.setBounds(20, 380, 70, 20);

        AuthorityLbl.setBackground(new java.awt.Color(255, 255, 255));
        AuthorityLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        AuthorityLbl.setText("Commision:");
        jPanel2.add(AuthorityLbl);
        AuthorityLbl.setBounds(10, 90, 90, 20);

        Date.setEditable(false);
        jPanel2.add(Date);
        Date.setBounds(510, 60, 130, 20);

        Date4.setBackground(new java.awt.Color(255, 255, 255));
        Date4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date4.setText("Amount");
        jPanel2.add(Date4);
        Date4.setBounds(240, 60, 60, 20);
        jPanel2.add(ratesC);
        ratesC.setBounds(330, 90, 120, 20);

        Amounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmounttxtActionPerformed(evt);
            }
        });
        jPanel2.add(Amounttxt);
        Amounttxt.setBounds(330, 60, 120, 20);

        remarksLbl.setBackground(new java.awt.Color(255, 255, 255));
        remarksLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        remarksLbl.setText("Rate");
        jPanel2.add(remarksLbl);
        remarksLbl.setBounds(240, 90, 90, 20);

        billNoLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        billNoLbl.setText("Bill Number:");
        jPanel2.add(billNoLbl);
        billNoLbl.setBounds(10, 60, 90, 20);

        billNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jPanel2.add(billNo);
        billNo.setBounds(90, 60, 130, 20);

        Date3.setBackground(new java.awt.Color(255, 255, 255));
        Date3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Date3.setText("Date:");
        jPanel2.add(Date3);
        Date3.setBounds(470, 60, 50, 20);

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
        jPanel2.add(commText);
        commText.setBounds(90, 90, 130, 20);

        Calender.setText("calender");
        Calender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalenderActionPerformed(evt);
            }
        });
        jPanel2.add(Calender);
        Calender.setBounds(550, 90, 90, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Position :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(280, 410, 60, 20);

        tp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpActionPerformed(evt);
            }
        });
        tp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tpKeyReleased(evt);
            }
        });
        jPanel2.add(tp);
        tp.setBounds(340, 410, 80, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("%");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(420, 410, 17, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Color:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(520, 410, 50, 20);

        tc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tcKeyReleased(evt);
            }
        });
        jPanel2.add(tc);
        tc.setBounds(570, 410, 80, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("%");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(650, 410, 17, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Language:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 410, 80, 20);

        tl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tlKeyReleased(evt);
            }
        });
        jPanel2.add(tl);
        tl.setBounds(90, 410, 80, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("%");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(170, 410, 17, 20);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel15.setText("Billing Information");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 10, 300, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setText("Release Order");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 130, 300, 30);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(10, 450, 270, 10);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(10, 170, 280, 10);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(400, 170, 300, 10);
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(10, 300, 280, 10);
        jPanel2.add(jSeparator7);
        jSeparator7.setBounds(420, 300, 280, 10);
        jPanel2.add(jSeparator8);
        jSeparator8.setBounds(420, 450, 280, 10);

        add(jPanel2);
        jPanel2.setBounds(20, 130, 1010, 540);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Newspaper Bill Entry");
        add(jLabel2);
        jLabel2.setBounds(320, 60, 240, 40);

        jButton3.setText("New Bill");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(230, 680, 70, 20);

        jButton2.setText("save bill");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(310, 680, 71, 20);

        jButton4.setText("Cancel");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(930, 650, 70, 23);

        generate.setText("Edit");
        generate.setOpaque(false);
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        add(generate);
        generate.setBounds(390, 680, 80, 20);

        Delete.setText("Delete");
        Delete.setOpaque(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete);
        Delete.setBounds(480, 680, 63, 23);

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    public static String dateCreator(int toAdd) {

        Calendar c = Calendar.getInstance();
        c.add(c.DATE, toAdd);

        if (c.get(Calendar.DAY_OF_WEEK)==1)
            c.add(c.DATE,1);

        String date= c.get(Calendar.YEAR)+"-" +( c.get(Calendar.MONTH )+1)+"-" + c.get(Calendar.DATE);
        
        return date;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if( !Saved && JOptionPane.showConfirmDialog(null, "Are you sure you want a new bill without saving ?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 1)
        {   
           return;
        }
         else 
          {   
            jPanel2.setVisible(true);
            
            Saved=false;        
            new search(Home,"SELECT `RONum`,  `CName`  FROM `n_ro` WHERE  NBill='-1'",this,true);  
          } 
    }//GEN-LAST:event_jButton3ActionPerformed
    
     
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
            ResultSet rs = dbase.getData("Select date,qty from `insertions`  where RONum ="+No);
            Csorter sorter = new Csorter(rs, new String[]{"Date","Number"} , Insertiontable, g, index);
            sorter.updateTable();
            dbase.DisconnectFromDB();
        } catch (SQLException ex) {
          }
    }
    
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
    
     public void ChangeRO()
     {
       
         DataBase db =new DataBase();
         db.connectToDB("media");
         db.runQuerry("UPDATE  `n_ro` SET  `NBill` ='"+billNo.getText()+"' WHERE RONum ='"+t1.getText()+"'");
         db.DisconnectFromDB();
     
     }
     
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Home.jPanel1.setVisible(false);
        Home.Remove();
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_jButton4ActionPerformed
     
     public boolean RONumberValid()
    {
        DataBase db=new DataBase();
      
        try {
            String Temp=JOptionPane.showInputDialog("EnterRO");
            
            db.connectToDB("media");
            ResultSet rs=db.getData("SELECT RONum FROM  `n_ro` WHERE RONum ="+Temp.trim());
            
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
        db.DisconnectFromDB();
      return false;
    }
    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        new search(Home,"select billNo,date from nbill ",this,false);
        jPanel2.setVisible(true);
        IsEdit=true;
        Delete.setVisible(true);
        Saved=false;
    }//GEN-LAST:event_generateActionPerformed

    private void cancelSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSDActionPerformed
        showCalender(false);
    }//GEN-LAST:event_cancelSDActionPerformed

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

    private void CalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalenderActionPerformed
        showCalender(true);
    }//GEN-LAST:event_CalenderActionPerformed

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed

    }//GEN-LAST:event_t8ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed

    }//GEN-LAST:event_amountTxtActionPerformed

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed

    }//GEN-LAST:event_t12ActionPerformed

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t11ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed

    }//GEN-LAST:event_t3ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void AmounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmounttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmounttxtActionPerformed

    private void commTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_commTextKeyReleased
        try {
            
            commision =(float) Double.parseDouble(commText.getText());
            Amounttxt.setText(String.valueOf((int)( TotalAmount - (TotalAmount*(commision/100)))));
   

        } catch (NumberFormatException numberFormatException) {
        }
    }//GEN-LAST:event_commTextKeyReleased

    private void tpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpActionPerformed

    private void tpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpKeyReleased
     
    }//GEN-LAST:event_tpKeyReleased

    private void tcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcKeyReleased
      
    }//GEN-LAST:event_tcKeyReleased

    private void tlKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tlKeyReleased
      
    }//GEN-LAST:event_tlKeyReleased

    private void commTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commTextActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
         
         try{
         DataBase db =new DataBase();
         db.connectToDB("media");
         db.runQuerry("DELETE FROM `nbill` WHERE billNo='"+billNo.getText()+"'");
         db.runQuerry("UPDATE  `n_ro` SET  `NBill` ='-1' WHERE RONum ='"+t1.getText()+"'");
         db.DisconnectFromDB();
         Saved=true;
         Reset();
         JOptionPane.showMessageDialog(null,"Bill  Deleted");
        
         }catch(Exception ex)
         {
            JOptionPane.showMessageDialog(null,"Bill Not Deleted");
        
         }   
    }//GEN-LAST:event_DeleteActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

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
    private javax.swing.JLabel EmailAddressLbl1;
    private javax.swing.JTable Insertiontable;
    private javax.swing.JLabel ManagerCode1;
    private javax.swing.JLabel ManagerName1;
    private javax.swing.JLabel OpeningBalancelbl;
    private javax.swing.JLabel OpeningBalancelbl1;
    private javax.swing.JLabel OpeningBalancelbl2;
    private javax.swing.JLabel OpeningBalancelbl5;
    private javax.swing.JLabel OpeningBalancelbl6;
    private javax.swing.JLabel OpeningBalancelbl7;
    private javax.swing.JLabel RONumber1;
    private javax.swing.JLabel Station1;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField billNo;
    private javax.swing.JLabel billNoLbl;
    private javax.swing.JButton cancelSD;
    private javax.swing.JTextField commText;
    private javax.swing.JButton generate;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private com.toedter.calendar.JCalendar jdp;
    private javax.swing.JPanel jdpPanel;
    private javax.swing.JTextField ratesC;
    private javax.swing.JLabel remarksLbl;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JTextField tc;
    private javax.swing.JTextField tl;
    private javax.swing.JTextField tp;
    // End of variables declaration//GEN-END:variables
 
  

    private void saveBill() {
        
        DataBase obj = new DataBase();
        obj.connectToDB("media");
        
        obj.insertGen("`billNo`, `amount`, `Commision`, `rate`, `date`, `RONum`",DBValues.get(textFields) , "nbill");
        
        obj.DisconnectFromDB();
    }
   
     private void UpdateBill() {
        
        DataBase obj = new DataBase();
        obj.connectToDB("media");
        
        obj.runQuerry("UPDATE `nbill` SET `billNo`='"+billNo.getText()+"',`amount`='"+Amounttxt.getText()+"',`Commision`='"+commText.getText()+"' WHERE RONum='"+t1.getText()+"'");
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
               t12.setEnabled(false);
               t13.setEnabled(false);
               
    }        
    
    public void SetROField(String RO)
    {
      
        try {
            DataBase db= new DataBase ();
            db.connectToDB("media");
            
            ResultSet rs =db.getData("SELECT * FROM `n_ro` WHERE RONum ="+RO+";");
            
            if(rs.next())
            {  t1.setText(rs.getString("RONum"));
               Date1.setText(rs.getString("date"));
               t2.setText(rs.getString("MCode"));
               t3.setText(rs.getString("MName"));
               t4.setText(rs.getString("CCode"));
               t5.setText(rs.getString("CName"));
               t6.setText(rs.getString("MStation"));
               
               t7.setText(rs.getString("Position"));
               t8.setText(rs.getString("rateContract"));
               ratesC.setText(t8.getText());
               t9.setText(rs.getString("Remarks"));
               t11.setText(rs.getString("Caption"));
               t10.setText(rs.getString("Height"));
               t12.setText(rs.getString("Colum"));
               t13.setText(rs.getString("Material"));
               tl.setText(rs.getString("lang"));
               tc.setText(rs.getString("color"));
               tp.setText(rs.getString("Posper"));
               amountTxt.setText(rs.getString("Amount"));
               Amounttxt.setText(amountTxt.getText());
               TotalAmount=(float)Double.parseDouble(amountTxt.getText());
                commision =(float) Double.parseDouble(commText.getText());
                Amounttxt.setText(String.valueOf((int)( TotalAmount - (TotalAmount*(commision/100)))));

               updateTable(RO);
               RONumber =RO;
            }
            else
            {    
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewsBills.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        
    
    private void initTextFields() {
        
    
    textFields= null;
    textFields = new JTextField[]{billNo,Amounttxt,commText,ratesC,Date,t1};
        
        for(JTextField x: textFields)
            x.setText("");  
        
        showCalender(false);
        commText.setText("0");
        Date.setText(dateCreator(0));
        
    
    }
    
    
    public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("insertion Number");
        Temp.addColumn("Date");
        
        
        return Temp;

    }

    
    private void showCalender(boolean check) {
        jdpPanel.setVisible(check);
        jdpPanel.setEnabled(check);
        this.setEnabled(!check);
        
        
        if (check){
            jdpPanel.setLocation(this.getWidth()/4,this.getHeight()/4);
            jdpPanel.setSize(510, 290);
        }
    }

    

    private boolean validateBill() {
       
        if (billNo.getText().contentEquals("")){
            JOptionPane.showMessageDialog(null, "Invalid billNo");
            return false;
        }
        if( Amounttxt.getText().contentEquals("")){
            JOptionPane.showMessageDialog(null, "Invalid Amount");
            return false;
        }
        if(Date.getText().contentEquals("")){
            JOptionPane.showMessageDialog(null, "Invalid Date");
            return false;
        }
        
        return true;    
    }

    void SetValues(String billno, String amnt, String comm, String remar, String dt) {
        billNo.setText(billno);
        
       
        Amounttxt.setText(amnt);
        Date.setText(dt);
        commText.setText(comm);
        
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
               ratesC.setText("");
               t9.setText("");
               t11.setText("");
               t10.setText("");
               t12.setText("");
               t13.setText("");              
               tl.setText("");
               tc.setText("");
               tp.setText("");
               amountTxt.setText("");
               TotalAmount=0;
               RONumber ="";
               Insertiontable.setModel(tableSet());
               jPanel2.setVisible(false);
               Delete.setVisible(false);
               Saved=true;
    
    }
}
