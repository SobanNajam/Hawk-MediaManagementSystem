
package hawkadvertisng;

import static hawkadvertisng.RONewsp.dateCreator;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RONewsp extends javax.swing.JFrame {

    ClientBills Main;
    Boolean Saved;
    private int rowCount = 0;
    private javax.swing.JTextField[] ta;
    private javax.swing.JTextField t12= new javax.swing.JTextField(),NBillNo= new javax.swing.JTextField(),CBillNo= new javax.swing.JTextField(),CBillDate= new javax.swing.JTextField();
    myTableModel tb;
    int count;
    boolean isFromBill;
    private float col=0,rateContract=0,height=0,amount=0,Pos=0,Color=0,lang=0;
    boolean IsNew;
    String Tamount,BillNumber,RONum=null;
    
    
    public RONewsp(ClientBills Main,String BillNumber, boolean IsNew ,String Tamount) {
        this.Main=Main;
        initComponents();
        initWindow(Tamount, IsNew, BillNumber,true);
       
    }

    public RONewsp(ClientBills Main,String BillNumber,String Tamount,String RONum) {
        this.Main=Main;
        initComponents();
        this.Tamount=Tamount;
        this.BillNumber=BillNumber;
        this.RONum=RONum;
        this.setVisible(true);
        this.setBounds(0, 0, 742, 620);
        
        initFields();
        setROFields();
        this.Tamount=Double.toString(Double.parseDouble(this.Tamount)-Double.parseDouble(amountTxt.getText()));
        showCalender(false);
        showCalender2(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        cancelSD1 = new javax.swing.JButton();
        jdp1 = new com.toedter.calendar.JCalendar();
        jdpPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        cancelSD = new javax.swing.JButton();
        jdp = new com.toedter.calendar.JCalendar();
        mainPanel = new javax.swing.JPanel();
        OpeningBalancelbl = new javax.swing.JLabel();
        AddressLbl2 = new javax.swing.JLabel();
        ManagerSearch = new javax.swing.JButton();
        ClientSearch = new javax.swing.JButton();
        OpeningBalancelbl1 = new javax.swing.JLabel();
        OpeningBalancelbl2 = new javax.swing.JLabel();
        AmountLbl = new javax.swing.JLabel();
        OpeningBalancelbl5 = new javax.swing.JLabel();
        OpeningBalancelbl7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insertiontable = new javax.swing.JTable();
        insertButton = new javax.swing.JButton();
        amountTxt = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        mat1 = new javax.swing.JCheckBox();
        mat2 = new javax.swing.JCheckBox();
        mat3 = new javax.swing.JCheckBox();
        mat4 = new javax.swing.JCheckBox();
        Calender = new javax.swing.JButton();
        t14 = new javax.swing.JTextField();
        OpeningBalancelbl6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        RONumber = new javax.swing.JLabel();
        ManagerName = new javax.swing.JLabel();
        ClientCode = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        t4 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        DateLbl = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Station = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        EmailAddressLbl = new javax.swing.JLabel();
        ManagerCode = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        postxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        colortxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        langtxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jdpPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jdpPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jdpPanel2.setLayout(null);

        jButton8.setText("DONE");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jdpPanel2.add(jButton8);
        jButton8.setBounds(400, 250, 70, 25);

        cancelSD1.setText("cancel");
        cancelSD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSD1ActionPerformed(evt);
            }
        });
        jdpPanel2.add(cancelSD1);
        cancelSD1.setBounds(300, 250, 80, 25);

        jdp1.setBackground(new java.awt.Color(255, 255, 255));
        jdpPanel2.add(jdp1);
        jdp1.setBounds(10, 10, 480, 270);

        getContentPane().add(jdpPanel2);
        jdpPanel2.setBounds(730, 90, 500, 290);

        jdpPanel.setBackground(new java.awt.Color(153, 204, 255));
        jdpPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jdpPanel.setLayout(null);

        jButton2.setText("DONE");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jdpPanel.add(jButton2);
        jButton2.setBounds(440, 220, 70, 25);

        cancelSD.setText("cancel");
        cancelSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSDActionPerformed(evt);
            }
        });
        jdpPanel.add(cancelSD);
        cancelSD.setBounds(340, 220, 80, 25);

        jdp.setBackground(new java.awt.Color(255, 255, 255));
        jdpPanel.add(jdp);
        jdp.setBounds(10, 10, 510, 240);

        getContentPane().add(jdpPanel);
        jdpPanel.setBounds(730, 400, 540, 260);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(null);

        OpeningBalancelbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl.setText("Rate Contract:");
        mainPanel.add(OpeningBalancelbl);
        OpeningBalancelbl.setBounds(20, 170, 100, 20);

        AddressLbl2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddressLbl2.setText("Caption:");
        mainPanel.add(AddressLbl2);
        AddressLbl2.setBounds(20, 200, 60, 20);

        ManagerSearch.setFont(new java.awt.Font("Verdana", 1, 7)); // NOI18N
        ManagerSearch.setText("search");
        ManagerSearch.setOpaque(false);
        ManagerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerSearchActionPerformed(evt);
            }
        });
        mainPanel.add(ManagerSearch);
        ManagerSearch.setBounds(665, 40, 59, 17);

        ClientSearch.setText("Search");
        ClientSearch.setOpaque(false);
        ClientSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientSearchActionPerformed(evt);
            }
        });
        mainPanel.add(ClientSearch);
        ClientSearch.setBounds(250, 100, 50, 25);

        OpeningBalancelbl1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl1.setText("Premium:");
        mainPanel.add(OpeningBalancelbl1);
        OpeningBalancelbl1.setBounds(20, 230, 90, 20);

        OpeningBalancelbl2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl2.setText("Materials:");
        mainPanel.add(OpeningBalancelbl2);
        OpeningBalancelbl2.setBounds(240, 260, 70, 20);

        AmountLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AmountLbl.setText("Amount:");
        mainPanel.add(AmountLbl);
        AmountLbl.setBounds(560, 170, 60, 20);

        OpeningBalancelbl5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl5.setText("Colum:");
        mainPanel.add(OpeningBalancelbl5);
        OpeningBalancelbl5.setBounds(570, 200, 60, 20);

        OpeningBalancelbl7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl7.setText("Remarks");
        mainPanel.add(OpeningBalancelbl7);
        OpeningBalancelbl7.setBounds(210, 170, 130, 20);

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

        mainPanel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 360, 700, 60);

        insertButton.setText("Insert New Date");
        insertButton.setOpaque(false);
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        mainPanel.add(insertButton);
        insertButton.setBounds(520, 430, 160, 25);

        amountTxt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });
        mainPanel.add(amountTxt);
        amountTxt.setBounds(620, 170, 90, 20);

        t7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t7);
        t7.setBounds(120, 230, 280, 20);

        t8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t8);
        t8.setBounds(120, 200, 290, 20);

        t9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t9);
        t9.setBounds(270, 170, 280, 20);

        t10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        t10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t10KeyReleased(evt);
            }
        });
        mainPanel.add(t10);
        t10.setBounds(470, 200, 80, 20);

        t11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });
        t11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t11KeyReleased(evt);
            }
        });
        mainPanel.add(t11);
        t11.setBounds(620, 200, 90, 19);

        mat1.setText("USB");
        mat1.setOpaque(false);
        mat1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mat1ItemStateChanged(evt);
            }
        });
        mainPanel.add(mat1);
        mat1.setBounds(370, 260, 60, 25);

        mat2.setText("Email");
        mat2.setOpaque(false);
        mat2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mat2ItemStateChanged(evt);
            }
        });
        mainPanel.add(mat2);
        mat2.setBounds(430, 260, 60, 25);

        mat3.setSelected(true);
        mat3.setText("Others");
        mat3.setOpaque(false);
        mainPanel.add(mat3);
        mat3.setBounds(490, 260, 60, 25);

        mat4.setText("CD");
        mat4.setOpaque(false);
        mainPanel.add(mat4);
        mat4.setBounds(310, 260, 60, 25);

        Calender.setText("calender");
        Calender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalenderActionPerformed(evt);
            }
        });
        mainPanel.add(Calender);
        Calender.setBounds(410, 30, 40, 30);

        t14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t14ActionPerformed(evt);
            }
        });
        t14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t14KeyReleased(evt);
            }
        });
        mainPanel.add(t14);
        t14.setBounds(120, 170, 80, 20);

        OpeningBalancelbl6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl6.setText("Height:");
        mainPanel.add(OpeningBalancelbl6);
        OpeningBalancelbl6.setBounds(420, 200, 60, 20);

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1);
        jButton1.setBounds(370, 430, 140, 25);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator4);
        jSeparator4.setBounds(720, 20, 10, 120);
        mainPanel.add(jSeparator7);
        jSeparator7.setBounds(10, 320, 710, 10);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator8);
        jSeparator8.setBounds(10, 160, 10, 160);
        mainPanel.add(jSeparator10);
        jSeparator10.setBounds(10, 140, 710, 20);

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator11);
        jSeparator11.setBounds(720, 160, 10, 160);
        mainPanel.add(jSeparator5);
        jSeparator5.setBounds(10, 460, 710, 20);

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator12);
        jSeparator12.setBounds(10, 340, 10, 120);
        mainPanel.add(jSeparator13);
        jSeparator13.setBounds(10, 340, 70, 10);
        mainPanel.add(jSeparator14);
        jSeparator14.setBounds(220, 340, 500, 20);

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator15);
        jSeparator15.setBounds(720, 340, 10, 120);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Insertion information");
        mainPanel.add(jLabel5);
        jLabel5.setBounds(80, 330, 140, 17);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        mainPanel.add(Save);
        Save.setBounds(40, 510, 90, 30);

        jButton4.setText("cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton4);
        jButton4.setBounds(650, 513, 73, 30);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator6);
        jSeparator6.setBounds(10, 20, 10, 120);

        RONumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RONumber.setText("RO Number:");
        mainPanel.add(RONumber);
        RONumber.setBounds(20, 40, 100, 20);

        ManagerName.setBackground(new java.awt.Color(255, 255, 255));
        ManagerName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ManagerName.setText("Newspaper Name:");
        mainPanel.add(ManagerName);
        ManagerName.setBounds(20, 70, 110, 20);

        ClientCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ClientCode.setText("Client Code:");
        mainPanel.add(ClientCode);
        ClientCode.setBounds(20, 100, 100, 20);
        mainPanel.add(jSeparator3);
        jSeparator3.setBounds(10, 140, 710, 10);

        t4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t4);
        t4.setBounds(130, 100, 110, 19);

        t3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        mainPanel.add(t3);
        t3.setBounds(140, 70, 150, 20);

        t1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        mainPanel.add(t1);
        t1.setBounds(130, 40, 90, 20);

        DateLbl.setBackground(new java.awt.Color(255, 255, 255));
        DateLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        DateLbl.setText("Date:");
        mainPanel.add(DateLbl);
        DateLbl.setBounds(230, 40, 40, 20);

        Date.setEditable(false);
        mainPanel.add(Date);
        Date.setBounds(270, 40, 130, 20);

        Station.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Station.setText(" Station:");
        mainPanel.add(Station);
        Station.setBounds(290, 70, 70, 20);

        t6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        mainPanel.add(t6);
        t6.setBounds(350, 70, 290, 20);

        t5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t5);
        t5.setBounds(450, 100, 220, 20);

        EmailAddressLbl.setBackground(new java.awt.Color(255, 255, 255));
        EmailAddressLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EmailAddressLbl.setText("Client Name:");
        mainPanel.add(EmailAddressLbl);
        EmailAddressLbl.setBounds(340, 100, 100, 20);

        ManagerCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ManagerCode.setText("Newspaper Code:");
        mainPanel.add(ManagerCode);
        ManagerCode.setBounds(460, 40, 110, 20);
        mainPanel.add(jSeparator2);
        jSeparator2.setBounds(210, 20, 510, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Printing information");
        mainPanel.add(jLabel6);
        jLabel6.setBounds(90, 150, 130, 20);

        t2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t2);
        t2.setBounds(570, 40, 90, 20);
        mainPanel.add(jSeparator16);
        jSeparator16.setBounds(10, 160, 80, 10);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Basic Information");
        mainPanel.add(jLabel3);
        jLabel3.setBounds(90, 10, 140, 17);
        mainPanel.add(jSeparator1);
        jSeparator1.setBounds(10, 20, 80, 2);
        mainPanel.add(jSeparator17);
        jSeparator17.setBounds(220, 160, 500, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Position :");
        mainPanel.add(jLabel4);
        jLabel4.setBounds(410, 230, 60, 20);

        postxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postxtActionPerformed(evt);
            }
        });
        postxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                postxtKeyReleased(evt);
            }
        });
        mainPanel.add(postxt);
        postxt.setBounds(470, 230, 70, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("%");
        mainPanel.add(jLabel2);
        jLabel2.setBounds(540, 230, 17, 20);

        colortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                colortxtKeyReleased(evt);
            }
        });
        mainPanel.add(colortxt);
        colortxt.setBounds(620, 230, 70, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Color:");
        mainPanel.add(jLabel8);
        jLabel8.setBounds(570, 230, 50, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("%");
        mainPanel.add(jLabel9);
        jLabel9.setBounds(690, 230, 17, 20);

        langtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                langtxtKeyReleased(evt);
            }
        });
        mainPanel.add(langtxt);
        langtxt.setBounds(120, 260, 70, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("%");
        mainPanel.add(jLabel11);
        jLabel11.setBounds(200, 260, 17, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Language:");
        mainPanel.add(jLabel12);
        jLabel12.setBounds(20, 260, 80, 20);

        jButton3.setText("clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton3);
        jButton3.setBounds(650, 70, 60, 20);

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 760, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManagerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerSearchActionPerformed
        this.setEnabled(false);
        //Code where ronewsp (the client) creates database object and result set object
        //to get the result from database then create ratesearch for the viewing and selection of result 
        DataBase db =  new DataBase();
        db.connectToDB("media");
        ResultSet rs = db.getData("SELECT * FROM `newspaperrates` ");
        new Ratessearch(rs ,this);
        //---facade pattern can solve this.
        
    }//GEN-LAST:event_ManagerSearchActionPerformed

    private void ClientSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientSearchActionPerformed
     new search("select id,name from cust Order By name",this,true);

    }//GEN-LAST:event_ClientSearchActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        showCalender(true);
    }//GEN-LAST:event_insertButtonActionPerformed

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed

    }//GEN-LAST:event_amountTxtActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void t10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t10KeyReleased
        try {
             height = Integer.parseInt(t10.getText());
             SetPremium(); 
             amountTxt.setText(String.format("%.2f",(rateContract*height*col*(rowCount)+Pos+Color+lang)));
             
            } catch (NumberFormatException numberFormatException) {
            //  t10.setText(t10.getText().substring(0, t10.getText().length()-1));
        }
    }//GEN-LAST:event_t10KeyReleased

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed

    }//GEN-LAST:event_t11ActionPerformed

    private void t11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t11KeyReleased
        try {
              col = Integer.parseInt(t11.getText());
              SetPremium();
             amountTxt.setText(String.format("%.2f",rateContract*height*col*(rowCount)+Pos+Color+lang));
        } catch (NumberFormatException numberFormatException) {
            //t11.setText(t11.getText().substring(0, t11.getText().length()-1));
        }
    }//GEN-LAST:event_t11KeyReleased

    private void mat1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mat1ItemStateChanged

    }//GEN-LAST:event_mat1ItemStateChanged

    private void mat2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mat2ItemStateChanged

    }//GEN-LAST:event_mat2ItemStateChanged

    private void CalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalenderActionPerformed
        showCalender2(true);
    }//GEN-LAST:event_CalenderActionPerformed

    private void t14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t14ActionPerformed

    }//GEN-LAST:event_t14ActionPerformed

    private void t14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t14KeyReleased
        try {
            rateContract = Float.parseFloat(t14.getText());
            SetPremium();
            amountTxt.setText(String.format("%.2f", rateContract * height * col * (rowCount) + Pos + Color + lang));
        } catch (NumberFormatException numberFormatException) {
        }
    }//GEN-LAST:event_t14KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = Insertiontable.getSelectedRow();
        if(row!=-1)
        {
             
        String value=Insertiontable.getValueAt(row, 0).toString();
        int sr=Integer.parseInt(value);
        
        for(int i=sr;i<Insertiontable.getRowCount();i++)
            {
            //replicate SrNumber to the previous records
            Insertiontable.setValueAt(String.valueOf(i), i, 0);
            }
            tb.removeRow(row);
            Insertiontable.setModel(tb);
            rowCount--;
            count=rowCount;
            SetPremium();
            amountTxt.setText(String.valueOf(rateContract*height*col*(rowCount)+Pos+Color+lang));

            tb.setRowCount(rowCount);
        }
        else
        {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        if(ValidateRO() )
            return;
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to save the new RO", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
        {
            if(RONum==null)
                saveNewRO();
            else
                updateRO();
            
            
            
            
            Main.setEnabled(true);
            Main.SetTable(BillNumber);
            setVisible(false);
            //this.dispose();
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           // this.dispose();
        
        t2.setText("");
        t3.setText("");
        t6.setText("");
        t14.setText("");
        rateContract=0;
        amount=0;   
        setVisible(false);
        Main.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {

            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            /* if (myFormat.parse(myFormat.format(jdp1.getDate())).compareTo(myFormat.parse(dateCreator(0))) < 0) {
             * javax.swing.JOptionPane.showMessageDialog(null, "Invalid Date! Please select a valid Date");
             * showCalender2(true);
             * return;
             * }*/
            Date.setText(myFormat.format(jdp1.getDate()));
            showCalender2(false);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cancelSD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSD1ActionPerformed
        showCalender2(false);
    }//GEN-LAST:event_cancelSD1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            /*            if (myFormat.parse(myFormat.format(jdp.getDate())).compareTo(myFormat.parse(dateCreator(0))) < 0) {
             * javax.swing.JOptionPane.showMessageDialog(null, "Invalid Date! Please select a valid Date");
             * jdpPanel.setVisible(true);
             * jdpPanel.setEnabled(true);
             * return;
             * }*/
            count++;
            tb.setRowCount(rowCount+1);
            tb.setValueAt( myFormat.format(jdp.getDate())  ,rowCount  ,1);
            tb.setValueAt( count   ,rowCount  ,0);

            showCalender(false);
            rowCount++;
              SetPremium();
            amountTxt.setText(String.valueOf(rateContract*height*col*(rowCount)+Pos+Color+lang));
           Insertiontable.setModel(tb);
         

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cancelSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSDActionPerformed
        showCalender(false);

    }//GEN-LAST:event_cancelSDActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       Main.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void postxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postxtActionPerformed

    private void postxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_postxtKeyReleased
            SetPremium();
            amountTxt.setText(String.format("%.2f",rateContract*height*col*(rowCount)+Pos+Color+lang));
    }//GEN-LAST:event_postxtKeyReleased

    private void colortxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colortxtKeyReleased
            SetPremium();
            amountTxt.setText(String.format("%.2f",rateContract*height*col*(rowCount)+Pos+Color+lang));
    
    }//GEN-LAST:event_colortxtKeyReleased

    private void langtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_langtxtKeyReleased
          SetPremium();
          amountTxt.setText(String.format("%.2f",rateContract*height*col*(rowCount)+Pos+Color+lang));
    
    }//GEN-LAST:event_langtxtKeyReleased

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        t2.setText("");
        t3.setText("");
        t6.setText("");
        t14.setText("");
        rateContract=0;
        amount=0;
    }//GEN-LAST:event_jButton3ActionPerformed

    public void SetPremium()
    {
        int len=0;
        try {
            Pos = rateContract * height * col * (rowCount) * (float) (Double.parseDouble(postxt.getText()) / 100);
          } catch (NumberFormatException ex) {
              len=postxt.getText().length();
              if(len!=0) 
                postxt.setText(postxt.getText().substring(0,len-1));
              else
                  Pos=1;
        }   
        
        try {
             Color = rateContract * height * col * (rowCount) * (float) (Double.parseDouble(colortxt.getText()) / 100);
           } catch (NumberFormatException ex) {
            
               len=colortxt.getText().length();
              if(len!=0) 
                colortxt.setText(colortxt.getText().substring(0,len-1)); 
              else
                  Color=1;
        }
    
        try {
              lang = rateContract * height * col * (rowCount) * (float) (Double.parseDouble(langtxt.getText()) / 100);
            } catch (NumberFormatException ex) {
              
                len=langtxt.getText().length();
              if(len!=0) 
                langtxt.setText(langtxt.getText().substring(0,len-1)); 
              else
                  lang=1;
        }
      
    
    }   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl2;
    private javax.swing.JLabel AmountLbl;
    private javax.swing.JButton Calender;
    private javax.swing.JLabel ClientCode;
    private javax.swing.JButton ClientSearch;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel DateLbl;
    private javax.swing.JLabel EmailAddressLbl;
    private javax.swing.JTable Insertiontable;
    private javax.swing.JLabel ManagerCode;
    private javax.swing.JLabel ManagerName;
    private javax.swing.JButton ManagerSearch;
    private javax.swing.JLabel OpeningBalancelbl;
    private javax.swing.JLabel OpeningBalancelbl1;
    private javax.swing.JLabel OpeningBalancelbl2;
    private javax.swing.JLabel OpeningBalancelbl5;
    private javax.swing.JLabel OpeningBalancelbl6;
    private javax.swing.JLabel OpeningBalancelbl7;
    private javax.swing.JLabel RONumber;
    private javax.swing.JButton Save;
    private javax.swing.JLabel Station;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton cancelSD;
    private javax.swing.JButton cancelSD1;
    private javax.swing.JTextField colortxt;
    private javax.swing.JButton insertButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private com.toedter.calendar.JCalendar jdp;
    private com.toedter.calendar.JCalendar jdp1;
    private javax.swing.JPanel jdpPanel;
    private javax.swing.JPanel jdpPanel2;
    private javax.swing.JTextField langtxt;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JCheckBox mat1;
    private javax.swing.JCheckBox mat2;
    private javax.swing.JCheckBox mat3;
    private javax.swing.JCheckBox mat4;
    private javax.swing.JTextField postxt;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
 
    
    public static String dateCreator(int toAdd) {

        Calendar c = Calendar.getInstance();
        c.add(c.DATE, toAdd);

        if (c.get(Calendar.DAY_OF_WEEK)==1)
            c.add(c.DATE,1);

        String date= c.get(Calendar.YEAR)+"-" +( c.get(Calendar.MONTH )+1)+"-" + c.get(Calendar.DATE);
        
        return date;
    }
    
    public void disableAll(boolean check) {
//        for(javax.swing.JTextField x: ta)
//            x.setEditable(check);s
        mainPanel.setEnabled(check);
    
    }
    
    private void initFields() {
        jdpPanel.setVisible(false);
        jdpPanel.setEnabled(false);
        jdpPanel2.setVisible(false);
        jdpPanel2.setEnabled(false);
        //this.EnableAll(false);
        tb= null;
        tb = tableSet();
        
        
        Insertiontable.setModel(tb);
        ta= null;
        ta = new javax.swing.JTextField[]{t1,Date,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t14,NBillNo,CBillNo,CBillDate,amountTxt,colortxt,langtxt,postxt};
        
        for(javax.swing.JTextField x: ta)
            x.setText("");
    
        CBillNo.setText(BillNumber);
        CBillDate.setText(Main.Dat);
        NBillNo.setText("-1");
       
    }
    
    private void saveRO() {
        DataBase obj = new DataBase();
        obj.connectToDB("media");
        
        t1.setText(new CodeGen().GetCode("NRONo"));
       
        
        if(IsNew)
        {
           BillNumber=new CodeGen().GetCode("CBillNo");
           Main.Num=BillNumber;
           CBillNo.setText(BillNumber);
           obj.insertGen("`billNo`, `amount`, `authority`, `remarks`, `date`", DBValues.get(new String[]{Main.Num,amountTxt.getText(),Main.Authority,Main.Remarks,Main.Dat}) ,"cbill");
           Main.IsNew=false;
           new CodeGen().SaveNo("CBillNo");
           Main.Amount=  String.format("%.2f",Double.parseDouble(amountTxt.getText()));
           obj.runQuerry("UPDATE `cbill` SET `amount`='"+String.format("%.2f",Double.parseDouble(Tamount)+Double.parseDouble(Main.Amount))+"',`authority`='"+Main.Authority+"',`remarks`='"+Main.Remarks+"',`date`='"+Main.Dat+"' WHERE  billNo='"+BillNumber+"'");
    
        }
        else
        {
         Main.Amount=   String.format("%.2f",(Double.parseDouble(Tamount)+Double.parseDouble(amountTxt.getText())));
         //System.out.println(String.format("%.2f",(Double.parseDouble(Tamount)+Double.parseDouble(amountTxt.getText()))));
         obj.runQuerry("UPDATE `cbill` SET `amount`='"+Double.toString(Double.parseDouble(Tamount)+Double.parseDouble(amountTxt.getText()))+"',`authority`='"+Main.Authority+"',`remarks`='"+Main.Remarks+"',`date`='"+Main.Dat+"' WHERE  billNo='"+BillNumber+"'");
        }  
        
        
        new CodeGen().SaveNo("NRONo");
        JOptionPane.showMessageDialog(null, "RONumber  is "+this.t1.getText()+" ", "Cofirmation", JOptionPane.OK_OPTION);
                   
        
        obj.insertGen("`RONum`, `date`, `MCode`, `MName`, `CCode`, `CName`,"
                + " `Mstation`, `Position`, `Caption`, `Remarks`, `Height`, "
                + "`Colum`, `Material`, `rateContract`, `NBill`, `CBill`,"
                + " `cbillDate`, `amount`, `color`, `lang`, `Posper`",DBValues.get(ta) , "n_ro");
        for (int i =0; i < tb.getRowCount(); i++)
           obj.insertGen("`RONum`,`qty`,`date`",DBValues.get(TableValuesAt(i)),"insertions");
        
        Saved=true;
        
        
        Main.SetBillFields();
        obj.DisconnectFromDB();
            
}
    
    public String Material(){
 if(mat4.isSelected())
 {
  return "CD";
 }
 else if(mat1.isSelected())
 {
  return "USB";
 }
 else if(mat2.isSelected())
 {
  return "Email";
 }
 
 else if(mat3.isSelected())
 {
  return "Other";
 }
 
  return "";  
}  
    
    private String[] TableValuesAt(int i) {
        return new String[]{t1.getText(),tb.getValueAt(i, 0).toString(),tb.getValueAt(i, 1).toString()};
    }   
    
    public void ResetALL(){
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
    t6.setText("");
    t7.setText("");
    t8.setText("");
    t9.setText("");
    t10.setText("");
    t11.setText("");
    t12.setText("");
    amountTxt.setText("");
    t14.setText("");
    
    
    
   }        
    
    public void setNewspaper(String id,String name,String publ,String rates){
           
        if(t14.getText().isEmpty())
            {
                t3.setText(name);
                t2.setText(id);
                t6.setText(publ);
                t14.setText(String.format("%.2f",Double.parseDouble(rates)));
                
                if (validateDouble(rates))
                {  
                float temp;
               
               
                temp=(float) Double.parseDouble(String.format("%.2f",Double.parseDouble(rates))); 
                rateContract=rateContract+temp; 
                }
                else
                 {
                    t14.setText("0");
                 }
            }
            else
            {
              t6.setText(t6.getText()+"+"+publ);
              t14.setText(String.format("%.2f",Double.parseDouble(t14.getText())+(Double.parseDouble(rates))/2));
              
              if (validateDouble(rates))
              {  
                float temp;
                temp=(float) Double.parseDouble(String.format("%.2f",Double.parseDouble(rates)/2));
                
                rateContract=rateContract+temp; 
              //  System.out.println(rateContract);
                
              }
              else
               {
               t14.setText("0");
                }
            
            }  
            
                          
            SetPremium(); 
            amountTxt.setText(String.valueOf(rateContract*height*col*(rowCount)+Pos+Color+lang));
    }
    
     private boolean validateDouble(String text) {
       
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException ex) {
           return false;
          }
    }
     
    public void setFields(String id,String name,boolean check){
        
        if(!check){
            t3.setText(name);
            t2.setText(id);
        }
        else{
            t5.setText(name);
            t4.setText(id);
            }
            
    }
    
    private void showCalender(boolean check) {
        jdpPanel.setVisible(check);
        jdpPanel.setEnabled(check);
        disableAll(!check);
        if (check){
            jdpPanel.setLocation(this.getWidth()/4,this.getHeight()/4);
            
        }
}
    
    private void showCalender2(boolean check) {
        jdpPanel2.setVisible(check);
        jdpPanel2.setEnabled(check);
        disableAll(!check);
        if (check){
             jdpPanel2.setLocation(this.getWidth()/4,this.getHeight()/4);
            
        }
}
    
    public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("insertion Number");
        Temp.addColumn("Date");
        
        
        return Temp;

    }
    
    public void setROFields(){
        t1.setText(RONum);
        DataBase obj = new DataBase();
        try {
            
            obj.connectToDB("media");
             
            java.sql.ResultSet rs = obj.getData("select* from n_ro where RONum = '"+RONum+"'");
            rs.next();
            Date.setText(rs.getString(("date")));
            t2.setText(rs.getString((3)));
            t3.setText(rs.getString((4)));
            t6.setText(rs.getString((7)));
            t4.setText(rs.getString((5)));
            t5.setText(rs.getString((6)));
            t7.setText(rs.getString((8)));
            t8.setText(rs.getString((9)));
            t9.setText(rs.getString((10)));
            t10.setText(rs.getString((11)));
            t11.setText(rs.getString((12)));
            t14.setText(rs.getString((14)));
            rateContract = Float.parseFloat(t14.getText());
            setTable();
            height = Integer.parseInt(t10.getText());
            col = Integer.parseInt(t11.getText());
            colortxt.setText(rs.getString("color"));
            langtxt.setText(rs.getString("lang"));
            postxt.setText(rs.getString("Posper"));
            SetPremium();
            amountTxt.setText(String.valueOf(rs.getString("amount")));
            Material(rs.getString(13));
            
            
        
        } catch (Exception ex) {
            }
     
     obj.DisconnectFromDB();
     
     t1.setEditable(false);
    }
    
     public void setTable()
    {
     DataBase db= new DataBase();
     
     //enable buttons
    //<editor-fold defaultstate="collapsed" desc="Fill insertions in table">
     
     
     try {
         db.connectToDB("media");
        
         ResultSet rs= db.getData("select qty,date from insertions where RONum = '"+t1.getText()+"'");
         
         int loop=0;
         
         while(rs.next())
         {
             tb.setRowCount(loop+1);
             tb.setValueAt(rs.getString("qty"),loop , 0);
             tb.setValueAt(rs.getString("date"),loop ,  1);
             loop++;
         }
         
         Insertiontable.setModel(tb);
         rowCount=tb.getRowCount();
         count = rowCount;
         db.DisconnectFromDB();
     } catch (SQLException ex) {
         Logger.getLogger(ClientBills.class.getName()).log(Level.SEVERE, null, ex);
         db.DisconnectFromDB();
     }
     
     //</editor-fold>
    
    
}        
   
    
    public void Material(String mat){
        if (mat.toLowerCase().contentEquals("usb")) {
            mat1.setSelected(true);
        } else if (mat.toLowerCase().contentEquals("email")) {
            mat2.setSelected(true);
        } else if (mat.toLowerCase().contentEquals("other")) {
            mat3.setSelected(true);
        } else if (mat.toLowerCase().contentEquals("cd")) {
            mat4.setSelected(true);
        }
}  

    private void saveNewRO() {
        
        t12.setText(Material());
        saveRO();
        refresh(); 
        //  ResetALL();
    }

    public void refresh()
    {
       t2.setText("");
        t3.setText("");
        t6.setText("");
        t14.setText("");
        rateContract=0;
        amount=0;
       
    }         
    private void updateRO() {
        saveFields();
        saveTable();
        t2.setText("");
        t3.setText("");
        t6.setText("");
        t14.setText("");
        rateContract=0;
        amount=0;
        
    }

    private void saveFields() {
      DataBase db = new DataBase();
        db.connectToDB("media");
        String querry = "UPDATE `n_ro` SET `date`='"+Date.getText()+"'"
        + ",`MCode`='"+t2.getText()+"',`MName`='"+t3.getText()+"',`CCode`='"+t4.getText()
        +"',`CName`='"+t5.getText()+"',`Mstation`='"+t6.getText()
        +"',`Position`='"+t7.getText()+"',`Caption`='"+t8.getText()
        +"',`Remarks`='"+t9.getText()+"',`Height`='"+t10.getText()
        +"',`Colum`='"+t11.getText()+"',`Material`='"+Material()
        +"',`rateContract`='"+t14.getText()+"',`amount`='"
        +amountTxt.getText()+"',"+ "`color`='"+colortxt.getText()
        +"',`lang`='"+langtxt.getText()+"',`Posper`='"+postxt.getText()
        +"' WHERE RONum = '"+RONum+"'";
        
         db.runQuerry(querry);
        
         Main.Amount=   String.format("%.2f",(Double.parseDouble(Tamount)+Double.parseDouble(amountTxt.getText())));
         db.runQuerry("UPDATE `cbill` SET `amount`='"+Double.toString(Double.parseDouble(Tamount)+Double.parseDouble(amountTxt.getText()))+"',`authority`='"+Main.Authority+"',`remarks`='"+Main.Remarks+"',`date`='"+Main.Dat+"' WHERE  billNo='"+BillNumber+"'");
         Main.SetBillFields();
         db.DisconnectFromDB();
      
} 
    
     private void saveTable() {
      DataBase db = new DataBase();
      db.connectToDB("media");
      db.deletefuction("delete from insertions where RONum = '"+t1.getText()+"'");
    
       for (int i =0; i < tb.getRowCount(); i++)
           db.insertGen("`RONum`,`qty`,`date`",DBValues.get(TableValuesAt(i)),"insertions");
        
      db.DisconnectFromDB();
    }
     
     private boolean ValidateRO() {
        if(rowCount<1)
         {
           JOptionPane.showMessageDialog(null,"Please Enter atleast one Spot!");
           return true;
         }
        if(Date.getText().isEmpty())
          {
           JOptionPane.showMessageDialog(null,"Please select a Date First!");
           return true;
          } 
       if(t2.getText().isEmpty() || t3.getText().isEmpty() || t6.getText().isEmpty())
         {
           JOptionPane.showMessageDialog(null,"Please select a Manager First!");
           return true;
         }
       if(t4.getText().isEmpty() || t5.getText().isEmpty())
         {
           JOptionPane.showMessageDialog(null,"Please select a Client First!");
           return true;
         }
       if(t14.getText().isEmpty() )
         {
           JOptionPane.showMessageDialog(null,"Please Enter Valid Rate Contract!");
           return true;
         }
       if(t10.getText().isEmpty() || t11.getText().isEmpty()  )
         {
           JOptionPane.showMessageDialog(null,"Please Enter Valid Height and Column !");
           return true;
         }
       
       return false;
    }

    private void initWindow(String Tamount, boolean IsNew, String BillNumber,boolean isCopy) {
        this.Tamount=Tamount;
        this.IsNew=IsNew;
        this.BillNumber=BillNumber;
        this.setVisible(true);
        this.setBounds(0, 0, 750, 620);
        if (isCopy)
            {
            initFields();
            postxt.setText("0");
            colortxt.setText("0");
            langtxt.setText("0");
            }
        t1.setText("Not Yet Given");
        showCalender(false);
        showCalender2(false);
    }
void showWindow(ClientBills aThis, String Num, boolean IsNew, String Amount) {
        initWindow(Amount,IsNew,Num,false);
       // System.out.println("came here");
    }

}