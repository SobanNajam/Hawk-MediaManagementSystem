
package hawkadvertisng;

import static hawkadvertisng.ElectronicRo.dateCreator;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ElectronicRo extends javax.swing.JFrame {

    EClientBills Main;
    String BillNumber;
    boolean IsNew ;
    double amount=0;
    
    private javax.swing.JTextField[] ta;
    private javax.swing.JTextField t12= new javax.swing.JTextField(),NBillNo= new javax.swing.JTextField(),CBillNo= new javax.swing.JTextField(),timeform= new javax.swing.JTextField(),CBillDate= new javax.swing.JTextField();
    myTableModel tb;
    boolean isFromBill;
    boolean saved;
    private int rowCount,qty=0;
    private double rate=0;
    private String RONum=null;
    
    public ElectronicRo(EClientBills Main,String BillNumber, boolean IsNew ) {
        this.Main=Main;
        initComponents();
        initWindow(IsNew, BillNumber,true);
         try{
            ImageIcon img = new ImageIcon("logo.png");
            this.setIconImage(img.getImage());
            }catch (Exception e){
             //system.out.println(e.getMessage());
            }
       
    }
    public ElectronicRo(EClientBills Main,String BillNumber,String RONum) {
        this.Main=Main;
        initComponents();
         try{
            ImageIcon img = new ImageIcon("logo.png");
            this.setIconImage(img.getImage());
            }catch (Exception e){
             //system.out.println(e.getMessage());
            }
        this.BillNumber=BillNumber;
        this.RONum=RONum;
        this.setVisible(true);
        this.setBounds(0, 0,745, 578);
        initFields();
        setROFields();
        Main.Amount = String.valueOf(Double.parseDouble(Main.Amount)-Double.parseDouble(amountTxt.getText()));
        showCalender(false);
        showCalender2(false);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jdpPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        cancelSD = new javax.swing.JButton();
        jdp = new com.toedter.calendar.JCalendar();
        Qty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jdpPanel2 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        cancelSD1 = new javax.swing.JButton();
        jdp1 = new com.toedter.calendar.JCalendar();
        mainPanel = new javax.swing.JPanel();
        ClientSearch = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mat2 = new javax.swing.JCheckBox();
        Save = new javax.swing.JButton();
        OpeningBalancelbl5 = new javax.swing.JLabel();
        ManagerCode = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        RONumber = new javax.swing.JLabel();
        mat1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        DateLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        AmountLbl1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        t2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insertiontable = new javax.swing.JTable();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        OpeningBalancelbl7 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        t6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        OpeningBalancelbl2 = new javax.swing.JLabel();
        mat3 = new javax.swing.JCheckBox();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        OpeningBalancelbl = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        OpeningBalancelbl1 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        t14 = new javax.swing.JTextField();
        Calender = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        t9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        EmailAddressLbl = new javax.swing.JLabel();
        ClientCode = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        Station = new javax.swing.JLabel();
        AddressLbl2 = new javax.swing.JLabel();
        ManagerName = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        mat4 = new javax.swing.JCheckBox();
        ManagerSearch = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        t5 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        sec = new javax.swing.JRadioButton();
        min = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        buttonGroup1.add(min);
        buttonGroup1.add(sec);

        getContentPane().setLayout(null);

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
        jButton2.setBounds(430, 200, 70, 23);

        cancelSD.setText("cancel");
        cancelSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSDActionPerformed(evt);
            }
        });
        jdpPanel.add(cancelSD);
        cancelSD.setBounds(330, 200, 80, 23);

        jdp.setBackground(new java.awt.Color(255, 255, 255));
        jdp.setDecorationBackgroundVisible(false);
        jdpPanel.add(jdp);
        jdp.setBounds(10, 10, 510, 220);

        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });
        jdpPanel.add(Qty);
        Qty.setBounds(560, 30, 60, 20);

        jLabel2.setText("Qty:");
        jdpPanel.add(jLabel2);
        jLabel2.setBounds(530, 30, 30, 14);

        getContentPane().add(jdpPanel);
        jdpPanel.setBounds(760, 350, 680, 240);

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
        jButton8.setBounds(400, 250, 70, 23);

        cancelSD1.setText("cancel");
        cancelSD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelSD1ActionPerformed(evt);
            }
        });
        jdpPanel2.add(cancelSD1);
        cancelSD1.setBounds(300, 250, 80, 23);

        jdp1.setBackground(new java.awt.Color(255, 255, 255));
        jdp1.setDecorationBackgroundVisible(false);
        jdpPanel2.add(jdp1);
        jdp1.setBounds(10, 10, 480, 270);

        getContentPane().add(jdpPanel2);
        jdpPanel2.setBounds(760, 40, 500, 290);

        mainPanel.setLayout(null);

        ClientSearch.setText("Search");
        ClientSearch.setOpaque(false);
        ClientSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientSearchActionPerformed(evt);
            }
        });
        mainPanel.add(ClientSearch);
        ClientSearch.setBounds(250, 170, 70, 23);

        t3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        mainPanel.add(t3);
        t3.setBounds(130, 140, 160, 20);

        insertButton.setText("Insert New Date");
        insertButton.setOpaque(false);
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        mainPanel.add(insertButton);
        insertButton.setBounds(540, 450, 160, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Spots information");
        mainPanel.add(jLabel5);
        jLabel5.setBounds(90, 350, 140, 17);

        mat2.setText("Email");
        mat2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mat2ItemStateChanged(evt);
            }
        });
        mainPanel.add(mat2);
        mat2.setBounds(210, 300, 50, 23);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        mainPanel.add(Save);
        Save.setBounds(20, 510, 100, 30);

        OpeningBalancelbl5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl5.setText("Duration:");
        mainPanel.add(OpeningBalancelbl5);
        OpeningBalancelbl5.setBounds(380, 270, 60, 20);

        ManagerCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ManagerCode.setText("Channel Code:");
        mainPanel.add(ManagerCode);
        ManagerCode.setBounds(480, 110, 100, 20);

        t7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t7);
        t7.setBounds(90, 240, 90, 20);

        RONumber.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RONumber.setText("RO Number:");
        mainPanel.add(RONumber);
        RONumber.setBounds(20, 110, 100, 20);

        mat1.setText("USB");
        mat1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mat1ItemStateChanged(evt);
            }
        });
        mainPanel.add(mat1);
        mat1.setBounds(150, 300, 50, 23);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Airing information");
        mainPanel.add(jLabel4);
        jLabel4.setBounds(90, 220, 130, 20);

        DateLbl.setBackground(new java.awt.Color(255, 255, 255));
        DateLbl.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        DateLbl.setText("Airing Date:");
        mainPanel.add(DateLbl);
        DateLbl.setBounds(230, 110, 80, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Basic Information");
        mainPanel.add(jLabel3);
        jLabel3.setBounds(90, 80, 140, 17);

        t4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t4);
        t4.setBounds(130, 170, 110, 19);
        mainPanel.add(jSeparator10);
        jSeparator10.setBounds(220, 230, 490, 10);

        AmountLbl1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AmountLbl1.setText("Amount");
        mainPanel.add(AmountLbl1);
        AmountLbl1.setBounds(380, 300, 50, 20);
        mainPanel.add(jSeparator5);
        jSeparator5.setBounds(10, 480, 700, 30);
        mainPanel.add(jSeparator7);
        jSeparator7.setBounds(230, 360, 480, 10);

        t2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t2);
        t2.setBounds(580, 110, 80, 20);

        Insertiontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Number of Spot", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Insertiontable.setOpaque(false);
        jScrollPane1.setViewportView(Insertiontable);

        mainPanel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 380, 680, 60);
        mainPanel.add(jSeparator14);
        jSeparator14.setBounds(10, 340, 700, 20);
        mainPanel.add(jSeparator3);
        jSeparator3.setBounds(10, 210, 700, 10);

        OpeningBalancelbl7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl7.setText("Remarks");
        mainPanel.add(OpeningBalancelbl7);
        OpeningBalancelbl7.setBounds(410, 240, 70, 20);

        t8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t8);
        t8.setBounds(90, 270, 280, 20);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator8);
        jSeparator8.setBounds(10, 230, 20, 110);

        t6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t6);
        t6.setBounds(350, 140, 360, 20);

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1);
        jButton1.setBounds(390, 450, 140, 23);

        OpeningBalancelbl2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl2.setText("Materials:");
        mainPanel.add(OpeningBalancelbl2);
        OpeningBalancelbl2.setBounds(20, 300, 70, 20);

        mat3.setSelected(true);
        mat3.setText("Others");
        mat3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mat3ItemStateChanged(evt);
            }
        });
        mainPanel.add(mat3);
        mat3.setBounds(270, 300, 60, 23);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator6);
        jSeparator6.setBounds(10, 90, 60, 120);
        mainPanel.add(jSeparator2);
        jSeparator2.setBounds(210, 90, 500, 20);

        OpeningBalancelbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl.setText("Rate Contract:");
        mainPanel.add(OpeningBalancelbl);
        OpeningBalancelbl.setBounds(190, 240, 100, 20);

        amountTxt.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        amountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTxtActionPerformed(evt);
            }
        });
        mainPanel.add(amountTxt);
        amountTxt.setBounds(440, 300, 200, 20);

        OpeningBalancelbl1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpeningBalancelbl1.setText("Time:");
        mainPanel.add(OpeningBalancelbl1);
        OpeningBalancelbl1.setBounds(20, 240, 130, 20);

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator12);
        jSeparator12.setBounds(10, 360, 30, 120);

        t14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        t14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t14KeyReleased(evt);
            }
        });
        mainPanel.add(t14);
        t14.setBounds(290, 240, 80, 20);

        Calender.setText("calender");
        Calender.setBorderPainted(false);
        Calender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalenderActionPerformed(evt);
            }
        });
        mainPanel.add(Calender);
        Calender.setBounds(450, 110, 20, 20);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator4);
        jSeparator4.setBounds(710, 90, 10, 120);

        t9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t9);
        t9.setBounds(470, 240, 230, 20);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("EMedia Release Order Entry");
        mainPanel.add(jLabel1);
        jLabel1.setBounds(30, 10, 460, 50);

        t1.setEditable(false);
        t1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t1);
        t1.setBounds(130, 110, 90, 20);

        EmailAddressLbl.setBackground(new java.awt.Color(255, 255, 255));
        EmailAddressLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EmailAddressLbl.setText("Client Name:");
        mainPanel.add(EmailAddressLbl);
        EmailAddressLbl.setBounds(340, 170, 100, 20);

        ClientCode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ClientCode.setText("Client Code:");
        mainPanel.add(ClientCode);
        ClientCode.setBounds(20, 170, 100, 20);

        duration.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        duration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                durationKeyReleased(evt);
            }
        });
        mainPanel.add(duration);
        duration.setBounds(440, 270, 110, 19);

        Station.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Station.setText(" Station:");
        mainPanel.add(Station);
        Station.setBounds(290, 140, 70, 20);

        AddressLbl2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddressLbl2.setText("Caption:");
        mainPanel.add(AddressLbl2);
        AddressLbl2.setBounds(20, 270, 130, 20);

        ManagerName.setBackground(new java.awt.Color(255, 255, 255));
        ManagerName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ManagerName.setText("Chanel Name:");
        mainPanel.add(ManagerName);
        ManagerName.setBounds(20, 140, 100, 20);

        Date.setEditable(false);
        mainPanel.add(Date);
        Date.setBounds(310, 110, 130, 20);

        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        mainPanel.add(cancel);
        cancel.setBounds(600, 510, 90, 30);

        mat4.setText("CD");
        mat4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mat4ItemStateChanged(evt);
            }
        });
        mainPanel.add(mat4);
        mat4.setBounds(100, 300, 40, 23);

        ManagerSearch.setText("Search");
        ManagerSearch.setBorderPainted(false);
        ManagerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerSearchActionPerformed(evt);
            }
        });
        mainPanel.add(ManagerSearch);
        ManagerSearch.setBounds(670, 103, 30, 30);
        mainPanel.add(jSeparator9);
        jSeparator9.setBounds(10, 230, 80, 10);
        mainPanel.add(jSeparator13);
        jSeparator13.setBounds(10, 360, 80, 2);

        t5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        mainPanel.add(t5);
        t5.setBounds(450, 170, 220, 20);

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator11);
        jSeparator11.setBounds(710, 230, 10, 110);

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        mainPanel.add(jSeparator15);
        jSeparator15.setBounds(710, 360, 20, 120);
        mainPanel.add(jSeparator1);
        jSeparator1.setBounds(10, 90, 80, 2);

        sec.setText("sec");
        sec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secItemStateChanged(evt);
            }
        });
        sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secActionPerformed(evt);
            }
        });
        mainPanel.add(sec);
        sec.setBounds(610, 270, 50, 23);

        min.setSelected(true);
        min.setText("min");
        min.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                minItemStateChanged(evt);
            }
        });
        mainPanel.add(min);
        min.setBounds(560, 270, 50, 23);

        jLabel6.setText("per min");
        mainPanel.add(jLabel6);
        jLabel6.setBounds(370, 240, 50, 20);

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 800, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientSearchActionPerformed
        new search("select id,name from cust where 1",this,true);
    }//GEN-LAST:event_ClientSearchActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        showCalender(true);
    }//GEN-LAST:event_insertButtonActionPerformed

    private void mat2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mat2ItemStateChanged

    }//GEN-LAST:event_mat2ItemStateChanged

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        if (ValidateRO() )
            return;
        
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to save the new RO", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0)
        {
            
            t12.setText(Material());
            
            if(RONum==null)
                saveRO();
            else
                updateRO();
           
           
            Main.setVisible(true);    
            Main.setEnabled(true);
            Main.SetTable(BillNumber);
            setVisible(false);
            //this.dispose();
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void mat1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mat1ItemStateChanged

    }//GEN-LAST:event_mat1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            if (Qty.getText().matches("[1-9]|[1-9][0-9]")) {
                tb.setRowCount(rowCount + 1);
                tb.setValueAt(myFormat.format(jdp.getDate()), rowCount, 1);
                tb.setValueAt(Qty.getText(), rowCount, 0);
                qty+=Integer.parseInt(Qty.getText());
                calcAmount();
                showCalender(false);
                rowCount++;
                
                Insertiontable.setModel(tb);
                
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Invalid Spots! Please enter a valid number");
                jdpPanel.setVisible(true);
                jdpPanel.setEnabled(true);
                return;
            }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void cancelSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSDActionPerformed
        showCalender(false);
    }//GEN-LAST:event_cancelSDActionPerformed

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int index = Insertiontable.getSelectedRow();
        if(index!=-1)
        {
            qty-= Integer.parseInt(tb.getValueAt(index, 0).toString());
            calcAmount();
            tb.removeRow(index);
            Insertiontable.setModel(tb);
            rowCount--;
            tb.setRowCount(rowCount);
        }
        else
        {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mat3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mat3ItemStateChanged

    }//GEN-LAST:event_mat3ItemStateChanged

    private void amountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTxtActionPerformed

    }//GEN-LAST:event_amountTxtActionPerformed

    private void CalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalenderActionPerformed
        showCalender2(true);
    }//GEN-LAST:event_CalenderActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
            Main.setVisible(true);    
            Main.setEnabled(true);
            Main.SetTable(BillNumber);
            
            if(RONum!=null)
            {
                     Main.Amount=   Double.toString( (Double.parseDouble(amountTxt.getText())+Double.parseDouble(Main.Amount)) );
    
            }
            
            t2.setText("");
            t3.setText("");
            t6.setText("");
            t14.setText("");
            rate=0;
            amount=0;
            amountTxt.setText("");
           setVisible(false);
            //this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void mat4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mat4ItemStateChanged

    }//GEN-LAST:event_mat4ItemStateChanged

    private void ManagerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerSearchActionPerformed
        //Code where eronews (the client) creates database object and result set object
        //to get the result from database then creates ratesearch for the viewing and selection of result 
        DataBase db =  new DataBase();
        db.connectToDB("media");
        ResultSet rs = db.getData("SELECT * FROM `emediarates` WHERE 1");
        new Ratessearch(rs ,this);
        //---facade pattern can solve this.
    }//GEN-LAST:event_ManagerSearchActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateLbl.setText(myFormat.format(jdp1.getDate()));
        showCalender2(false);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cancelSD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelSD1ActionPerformed
        showCalender2(false);
    }//GEN-LAST:event_cancelSD1ActionPerformed

    private void durationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_durationKeyReleased

        
       if( validateDouble(duration.getText()))
            calcAmount();
       else if(duration.getText().isEmpty())
           duration.setText("0");
       else
           duration.setText(duration.getText().substring(0, t14.getText().length()-1));
    }//GEN-LAST:event_durationKeyReleased

    private void minItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_minItemStateChanged
         if (min.isSelected())
            {
            timeform.setText("0");
            rate = Double.parseDouble(t14.getText()) ;
            calcAmount();
            }
    }//GEN-LAST:event_minItemStateChanged

    private void secItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secItemStateChanged
        if (sec.isSelected())
            {
             timeform.setText("1");
             rate = Double.parseDouble(t14.getText()) / 60.0;
             calcAmount();
            }
    }//GEN-LAST:event_secItemStateChanged

    private void t14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t14KeyReleased
         try {
                if (sec.isSelected()) {
                    rate = Double.parseDouble(t14.getText()) / 60;
                    calcAmount();
                   } else {
                    rate = Double.parseDouble(t14.getText());
                    calcAmount();
                   }
              } catch (NumberFormatException numberFormatException) {
                if (!t14.getText().isEmpty())
                    t14.setText(t14.getText().substring(0, t14.getText().length()-1));
                else
                    t14.setText("0");
            }
        
    }//GEN-LAST:event_t14KeyReleased

    private void secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl2;
    private javax.swing.JLabel AmountLbl1;
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
    private javax.swing.JLabel OpeningBalancelbl7;
    private javax.swing.JTextField Qty;
    private javax.swing.JLabel RONumber;
    private javax.swing.JButton Save;
    private javax.swing.JLabel Station;
    private javax.swing.JTextField amountTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancelSD;
    private javax.swing.JButton cancelSD1;
    private javax.swing.JTextField duration;
    private javax.swing.JButton insertButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private com.toedter.calendar.JCalendar jdp;
    private com.toedter.calendar.JCalendar jdp1;
    private javax.swing.JPanel jdpPanel;
    private javax.swing.JPanel jdpPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JCheckBox mat1;
    private javax.swing.JCheckBox mat2;
    private javax.swing.JCheckBox mat3;
    private javax.swing.JCheckBox mat4;
    private javax.swing.JRadioButton min;
    private javax.swing.JRadioButton sec;
    private javax.swing.JTextField t1;
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
private void showCalender(boolean check) {
        jdpPanel.setVisible(check);
        jdpPanel.setEnabled(check);
        disableAll(!check);
        if (check){
            jdpPanel.setLocation(10,this.getHeight()/4);
            
        }
}
private void showCalender2(boolean check) {
        jdpPanel2.setVisible(check);
        jdpPanel2.setEnabled(check);
        disableAll(!check);
        if (check){
             jdpPanel2.setLocation(10,this.getHeight()/4);
            
        }
        
}

 public void ResetALL()
   {
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
    t6.setText("");
    t7.setText("");
    t8.setText("");
    t9.setText("");
    duration.setText("");
    t12.setText("");
    amountTxt.setText("");
    t14.setText("");
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
  
  
    public static String dateCreator(int toAdd) {

        Calendar c = Calendar.getInstance();
        c.add(c.DATE, toAdd);

        if (c.get(Calendar.DAY_OF_WEEK)==1)
            c.add(c.DATE,1);

        String date= c.get(Calendar.YEAR)+"-" +( c.get(Calendar.MONTH )+1)+"-" + c.get(Calendar.DATE);
        
        return date;
    }

    public void disableAll(boolean check) {
        
        mainPanel.setEnabled(check);
        Insertiontable.setEnabled(check);
        Calender.setEnabled(check);
        ManagerSearch.setEnabled(check);
        for(javax.swing.JTextField x: ta)
            x.setEditable(check);
    
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
        ta = new javax.swing.JTextField[]{t1,Date,t2,t3,t4,t5,t6,t7,t8,t9,
            duration,t12,t14,NBillNo,CBillNo,amountTxt,timeform,CBillDate};
        
        for(javax.swing.JTextField x: ta)
            x.setText("");
        CBillNo.setText(BillNumber);
        
        NBillNo.setText("-1");
        Date.setText(dateCreator(0));
        CBillDate.setText(Main.Dat);
        duration.setText("0");
        timeform.setText("0");
    }
    
    
private void saveRO() {
        DataBase obj = new DataBase();
        obj.connectToDB("media");
        
        
        t1.setText(new CodeGen().GetCode("ERONo"));
        
        if(IsNew)
        {  
           BillNumber=new CodeGen().GetCode("EBillNo");
           Main.Num=BillNumber;
           CBillNo.setText(BillNumber);
           Main.Amount=  amountTxt.getText();
          
           obj.insertGen("`billNo`, `amount`, `authority`, `remarks`, `date`", DBValues.get(new String[]{Main.Num,amountTxt.getText(),Main.Authority,Main.Remarks,Date.getText()}) ,"ecbill");
           Main.IsNew=false;
           new CodeGen().SaveNo("EBillNo");
        }
        else
        {
         Main.Amount= Double.toString( (Double.parseDouble(amountTxt.getText())+Double.parseDouble(Main.Amount)) );
         obj.runQuerry("UPDATE `ecbill` SET `amount`='"+Main.Amount+"',`authority`='"+Main.Authority+"',`remarks`='"+Main.Remarks+"',`date`='"+Main.Dat+"' WHERE  billNo='"+BillNumber+"'");
        }  
       
        
         new CodeGen().SaveNo("ERONo");
         JOptionPane.showMessageDialog(null, "RONumber  is "+this.t1.getText()+" ", "Cofirmation", JOptionPane.OK_OPTION);
                   
        
        obj.insertGen("`RONum`, `date`, `Mcode`, `MName`,"
                + " `CCode`,`CName`,  `Mstation`,`Position`, "
                + "`Caption`,`Remarks`,`Duration` ,   `Material`,"
                + "`rateContract`, `NBill`, `CBill`,  `amount`,"
                + "`timeFormat`,`cbillDate`",DBValues.get(ta) , "e_ro");
        
        for (int i =0; i < tb.getRowCount(); i++)
           obj.insertGen("`RONum`,`qty`,`date`",DBValues.get(TableValuesAt(i)),"spots");
        
        
        
        
            
            Main.SetBillFields();
            t2.setText("");
            t3.setText("");
            t6.setText("");
            t14.setText("");
            amountTxt.setText("0.0");
            amount=0.0;
            rate=0;
            
            obj.DisconnectFromDB();
            
}
  
public void setChannel(String id,String name,String publ,String rates){
            if(t14.getText().isEmpty())
            {
                t3.setText(name);
                t2.setText(id);
                t6.setText(publ);
                t14.setText(rates);
            }
            else
            {
              t6.setText(t6.getText()+"+"+publ);
              t14.setText(Integer.toString(Integer.parseInt(t14.getText())+Integer.parseInt(rates)));
            }    
            if (validateDouble(rates))
            {  Double temp;
               temp= Double.parseDouble(rates);; 
                rate=rate+temp; 
            }
            else
              {
               t14.setText("0");
              }
            
            calcAmount();
}           
   private String[] TableValuesAt(int i) {
        return new String[]{t1.getText(),tb.getValueAt(i, 0).toString(),tb.getValueAt(i, 1).toString()};
    }
public String Material()
{
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
public void Material(String mat){
        switch (mat.toLowerCase()) {
            case "usb":
                mat1.setSelected(true);
                break;
            case "email":
                mat2.setSelected(true);
                break;
            case "other":
                mat3.setSelected(true);
                break;
            case "cd":
                mat4.setSelected(true);
                break;
        }
}  
public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("insertion Number");
        Temp.addColumn("Date");
        
        
        return Temp;

    }

    private void calcAmount() {
        try {
            amount = Double.parseDouble(duration.getText());
            amount = (amount * rate * qty);
            
            amountTxt.setText(String.format("%.2f", amount));
        } catch (NumberFormatException e) {
            //system.out.println(e.getMessage());
            
        }
    }
    public void setROFields(){
        t1.setText(RONum);
        DataBase obj = new DataBase();
        try {
            
            obj.connectToDB("media");
             
            java.sql.ResultSet rs = obj.getData("select* from e_ro where RONum = '"+RONum+"'");
            rs.next();
            Date.setText(rs.getString(("date")));
            t2.setText(rs.getString(("Mcode")));
            t3.setText(rs.getString(("MName")));
            t6.setText(rs.getString(("Mstation")));
            t4.setText(rs.getString(("CCode")));
            t5.setText(rs.getString(("CName")));
            t7.setText(rs.getString(("Position")));
            t8.setText(rs.getString(("Caption")));
            t9.setText(rs.getString(("Remarks")));
            duration.setText(rs.getString(("Duration")));
            t14.setText(rs.getString("rateContract"));
            rate = Float.parseFloat(t14.getText());
            Material(rs.getString("Material"));
            setTable();
            amountTxt.setText(rs.getString("amount"));
            if (rs.getInt("timeFormat")==0)
               min.setSelected(true);
            else
                sec.setSelected(true);
            
        
        } catch (SQLException ex) {
            
            obj.displaySQLErrors(ex);
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
        
         ResultSet rs= db.getData("select qty,date from spots where RONum = '"+t1.getText()+"'");
         
         int loop=0;
         
         while(rs.next())
         {
             tb.setRowCount(loop+1);
             tb.setValueAt(rs.getString("qty"),loop , 0);
             qty+= Integer.parseInt(tb.getValueAt(loop, 0).toString());
             tb.setValueAt(rs.getString("date"),loop ,  1);
             loop++;
         }
         
         Insertiontable.setModel(tb);
         rowCount=tb.getRowCount();
                 
         db.DisconnectFromDB();
     } catch (SQLException ex) {
         Logger.getLogger(ClientBills.class.getName()).log(Level.SEVERE, null, ex);
         db.DisconnectFromDB();
     }
     //</editor-fold>
    
    
}        
    private void updateRO() {
       saveFields();
        saveTable();
        amount=0.0;
        rate=0;       
        
    }

    private void saveFields() {
      DataBase db = new DataBase();
        db.connectToDB("media");
        String querry = "UPDATE `e_ro` SET `date`='"+Date.getText()+"'"
        + ",`MCode`='"+t2.getText()+"',`MName`='"+t3.getText()+"',`CCode`='"+t4.getText()
        +"',`CName`='"+t5.getText()+"',`Mstation`='"+t6.getText()
        +"',`Position`='"+t7.getText()+"',`Caption`='"+t8.getText()
        +"',`Remarks`='"+t9.getText()+"',`rateContract`='"
        +t14.getText()+"',`amount`='"+amountTxt.getText()
        +"',`timeFormat` = '"+timeform.getText()
        +"' WHERE RONum = '"+RONum+"'";
        
         db.runQuerry(querry);
        
         Main.Amount=   Double.toString( (Double.parseDouble(amountTxt.getText())+Double.parseDouble(Main.Amount)) );
         //system.out.println(Main.Amount);
         db.runQuerry("UPDATE `ecbill` SET `amount`='"+Main.Amount+"',`authority`='"+Main.Authority+"',`remarks`='"+Main.Remarks+"',`date`='"+Main.Dat+"' WHERE  billNo='"+BillNumber+"'");
         Main.SetBillFields();
        
        
        db.DisconnectFromDB();
       


} 
    
     private void saveTable() {
      DataBase db = new DataBase();
      db.connectToDB("media");
      db.deletefuction("delete from spots where RONum = '"+t1.getText()+"'");
    
       for (int i =0; i < tb.getRowCount(); i++)
           db.insertGen("`RONum`,`qty`,`date`",DBValues.get(TableValuesAt(i)),"spots");
        
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
       if(duration.getText().isEmpty() )
         {
           JOptionPane.showMessageDialog(null,"Please Enter Valid Duration time !");
           return true;
         }
       
       return false;
    }

    private boolean validateDouble(String text) {
       
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException ex) {
           return false;
          }
    }

    private void initWindow(boolean IsNew, String BillNumber,boolean isCopy) {
        this.IsNew=IsNew;
        this.BillNumber=BillNumber;
        this.setVisible(true);
        this.setBounds(0, 0, 745, 578);
        if(isCopy)
            initFields();
        
        t1.setText("Not Yet given");
        showCalender(false);
        showCalender2(false);
    }

    void showWindow(EClientBills aThis, String Num, boolean IsNew) {
        initWindow(IsNew, BillNumber, false);
    }
    

}
