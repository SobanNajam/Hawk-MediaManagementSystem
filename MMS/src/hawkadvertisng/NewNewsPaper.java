/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AbdulRehman
 */
@SuppressWarnings("empty-statement")
public class NewNewsPaper extends javax.swing.JPanel {

   
    public int Click;
    public MainWindow Home;
    String Station ;
    myTableModel tb;
    int rowCount;
    private boolean isEdit=false;
    private int index=-1;
    
    public NewNewsPaper(MainWindow Home) {
        initComponents();
        this.Home=Home;
        Codetxt.setEnabled(false);
        Click=0;
        mainPanel.setVisible(false);
        tb = tableSet();
        publication.setVisible(false);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        publication = new javax.swing.JPanel();
        CRatetxt = new javax.swing.JTextField();
        GvtComm = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PureGvt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        station = new javax.swing.JTextField();
        Publicationdone = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CRatetxtS = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CRatetxtW = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Done = new javax.swing.JButton();
        Emedia = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        New = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Codetxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PhoneNumbertxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FaxNumbertxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MobileNumbertxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmailAddresstxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        publTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        editPublication = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        hawklogo = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setLayout(null);

        publication.setBackground(new java.awt.Color(0, 153, 153));
        publication.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray));
        publication.setLayout(null);

        CRatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRatetxtActionPerformed(evt);
            }
        });
        publication.add(CRatetxt);
        CRatetxt.setBounds(130, 70, 90, 20);
        publication.add(GvtComm);
        GvtComm.setBounds(430, 40, 120, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Comercial Week:");
        publication.add(jLabel13);
        jLabel13.setBounds(10, 70, 120, 17);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Govt Commercial:");
        publication.add(jLabel14);
        jLabel14.setBounds(310, 40, 120, 17);
        publication.add(PureGvt);
        PureGvt.setBounds(130, 40, 90, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pure Govt:");
        publication.add(jLabel15);
        jLabel15.setBounds(10, 40, 90, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Station");
        publication.add(jLabel6);
        jLabel6.setBounds(10, 10, 90, 17);

        station.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationActionPerformed(evt);
            }
        });
        publication.add(station);
        station.setBounds(130, 10, 450, 20);

        Publicationdone.setText("Done");
        Publicationdone.setOpaque(false);
        Publicationdone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicationdoneActionPerformed(evt);
            }
        });
        publication.add(Publicationdone);
        Publicationdone.setBounds(430, 100, 70, 23);

        jButton3.setText("Cancel");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        publication.add(jButton3);
        jButton3.setBounds(510, 100, 70, 23);

        CRatetxtS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRatetxtSActionPerformed(evt);
            }
        });
        publication.add(CRatetxtS);
        CRatetxtS.setBounds(430, 70, 120, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Comercial Sunday:");
        publication.add(jLabel18);
        jLabel18.setBounds(310, 70, 120, 17);

        CRatetxtW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRatetxtWActionPerformed(evt);
            }
        });
        publication.add(CRatetxtW);
        CRatetxtW.setBounds(130, 100, 90, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Supplement:");
        publication.add(jLabel19);
        jLabel19.setBounds(10, 100, 120, 17);

        jButton2.setText("Other");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        publication.add(jButton2);
        jButton2.setBounds(350, 100, 70, 23);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("rs.");
        publication.add(jLabel9);
        jLabel9.setBounds(560, 70, 20, 20);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("rs.");
        publication.add(jLabel12);
        jLabel12.setBounds(230, 40, 20, 20);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("rs.");
        publication.add(jLabel20);
        jLabel20.setBounds(230, 70, 20, 20);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("rs.");
        publication.add(jLabel21);
        jLabel21.setBounds(230, 100, 20, 20);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("rs.");
        publication.add(jLabel22);
        jLabel22.setBounds(560, 40, 20, 20);

        add(publication);
        publication.setBounds(10, 20, 600, 130);

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
        Done.setBounds(660, 110, 80, 30);

        Emedia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Emedia.setText("New NewsPaper");
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
        Delete.setBounds(220, 150, 73, 23);

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

        mainPanel.setOpaque(false);
        mainPanel.setLayout(null);
        mainPanel.add(jSeparator1);
        jSeparator1.setBounds(0, 30, 58, 10);
        mainPanel.add(jSeparator2);
        jSeparator2.setBounds(180, 30, 841, 10);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Basic Information");
        mainPanel.add(jLabel1);
        jLabel1.setBounds(60, 20, 111, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("NewsPaper Code:");
        mainPanel.add(jLabel2);
        jLabel2.setBounds(60, 60, 130, 17);

        Codetxt.setEditable(false);
        Codetxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Codetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodetxtActionPerformed(evt);
            }
        });
        mainPanel.add(Codetxt);
        Codetxt.setBounds(200, 60, 150, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("NewsPaper Name: ");
        mainPanel.add(jLabel7);
        jLabel7.setBounds(60, 90, 120, 17);

        Nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GvtCommActionPerformed(evt);
            }
        });
        mainPanel.add(Nametxt);
        Nametxt.setBounds(200, 90, 150, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Phone Number:");
        mainPanel.add(jLabel3);
        jLabel3.setBounds(390, 200, 96, 17);

        PhoneNumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GvtCommActionPerformed(evt);
            }
        });
        mainPanel.add(PhoneNumbertxt);
        PhoneNumbertxt.setBounds(490, 200, 203, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Fax Number:");
        mainPanel.add(jLabel4);
        jLabel4.setBounds(60, 200, 80, 17);

        FaxNumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaxNumbertxtActionPerformed(evt);
            }
        });
        mainPanel.add(FaxNumbertxt);
        FaxNumbertxt.setBounds(170, 200, 200, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Mobile Number:");
        mainPanel.add(jLabel8);
        jLabel8.setBounds(60, 230, 99, 17);
        mainPanel.add(MobileNumbertxt);
        MobileNumbertxt.setBounds(170, 230, 203, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Email Address:");
        mainPanel.add(jLabel5);
        jLabel5.setBounds(390, 230, 93, 17);

        EmailAddresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GvtCommActionPerformed(evt);
            }
        });
        mainPanel.add(EmailAddresstxt);
        EmailAddresstxt.setBounds(490, 230, 203, 20);
        mainPanel.add(jSeparator3);
        jSeparator3.setBounds(0, 180, 58, 10);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Contact Information");
        mainPanel.add(jLabel10);
        jLabel10.setBounds(60, 170, 130, 17);
        mainPanel.add(jSeparator4);
        jSeparator4.setBounds(190, 180, 830, 10);
        mainPanel.add(jSeparator5);
        jSeparator5.setBounds(0, 280, 60, 10);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Stations");
        mainPanel.add(jLabel11);
        jLabel11.setBounds(60, 270, 70, 20);
        mainPanel.add(jSeparator6);
        jSeparator6.setBounds(110, 280, 910, 10);

        publTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Publication", "Pure Govt.", "Govt Commercial", "Commercial week", "Commercial sunday", "Supplements"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setBounds(60, 300, 660, 130);

        jButton1.setText("Add station");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1);
        jButton1.setBounds(730, 370, 100, 23);

        editPublication.setText("edit");
        editPublication.setOpaque(false);
        editPublication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPublicationActionPerformed(evt);
            }
        });
        mainPanel.add(editPublication);
        editPublication.setBounds(730, 400, 100, 23);

        remove.setText("remove");
        remove.setOpaque(false);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        mainPanel.add(remove);
        remove.setBounds(730, 340, 100, 23);

        add(mainPanel);
        mainPanel.setBounds(0, 170, 1020, 490);

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

    private void stationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stationActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
                
     new search(Home,"select id,name from newspaper where 1",this);
      Done.setEnabled(true);  
        Click=3;   
        
        SETButton(3);
    }//GEN-LAST:event_DeleteActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        mainPanel.setVisible(true);
        Done.setEnabled(true);
        this.Codetxt.setText("Not Given yet ");
        Click=1;
        SETButton(1);
        
        
    }//GEN-LAST:event_NewActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Done.setEnabled(true);
        new search(Home,"select id,name from newspaper where 1",this);
        Click=2;
        SETButton(2);
        
    }//GEN-LAST:event_EditActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      
        SETButton(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Home.ProfilePageB();

    }//GEN-LAST:event_jLabel17MouseClicked

    private void CRatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRatetxtActionPerformed
   
    private String[] GetPanelValues() {
        return new String[]{Codetxt.getText(),Nametxt.getText(),station.getText(),PureGvt.getText(),GvtComm.getText(),CRatetxt.getText().trim(),CRatetxtS.getText(),CRatetxtW.getText()};
    }
    private void PublicationdoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublicationdoneActionPerformed
        
        if (!isEdit)
        {
        if( !validatePubl() ){
            javax.swing.JOptionPane.showMessageDialog(null, "Invalid Data!");
        }
        else{
             tb.setRowCount(rowCount+1);
             tb.setValueAt( station.getText()  ,rowCount  ,0);
             tb.setValueAt( PureGvt.getText()  ,rowCount  ,1);
             tb.setValueAt( GvtComm.getText()  ,rowCount  ,2);
             tb.setValueAt(CRatetxt.getText(),rowCount,3);
             tb.setValueAt(CRatetxtS.getText(),rowCount,4);
             tb.setValueAt(CRatetxtW.getText(),rowCount,5);
             
             if(Click==2)
             {    
              DataBase db=new DataBase();
              db.connectToDB("media");
              db.insertGen("`id`, `name`, `publication`, `PureGovt`, `GovtCommercial`, `commercialWeek`, `sunday`, `Whole`",DBValues.get(GetPanelValues()),"newspaperrates");
              db.DisconnectFromDB();
             }
           
             rowCount++;
             publTable.setModel(tb);
             SetPanelNull();
             showPublications(false);
        
        }
        
        
        }
        else{
        
        if( !validatePubl() ){
            javax.swing.JOptionPane.showMessageDialog(null, "Invalid Data!");
        }
        else{
             
              index= publTable.getSelectedRow();

             tb.setValueAt( station.getText()  ,index  ,0);
             tb.setValueAt( PureGvt.getText()  ,index  ,1);
             tb.setValueAt( GvtComm.getText()  ,index  ,2);
             tb.setValueAt(CRatetxt.getText(),index,3);
             tb.setValueAt(CRatetxtS.getText(),index,4);
             tb.setValueAt(CRatetxtW.getText(),index,5);
             
             if(Click==2)
             {    
              DataBase db=new DataBase();
              db.connectToDB("media");
              db.runQuerry("UPDATE `newspaperrates` SET `id`='"+Codetxt.getText()+"',`name`='"+Nametxt.getText()+"',`publication`='"+station.getText()+"',`PureGovt`='"+PureGvt.getText()+"',`GovtCommercial`='"+GvtComm.getText()+"',`commercialWeek`='"+CRatetxt.getText()+"',`sunday`='"+CRatetxtS.getText()+"',`Whole`='"+CRatetxtW.getText()+"' WHERE id='" +Codetxt.getText()+"' And  publication ='"+Station+"'");
              db.DisconnectFromDB();
           }
           
             
             publTable.setModel(tb);
             SetPanelNull();
             showPublications(false);
        
            }
        
        }
    }//GEN-LAST:event_PublicationdoneActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SetPanelNull();
        showPublications(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CRatetxtSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRatetxtSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRatetxtSActionPerformed

    private void CRatetxtWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRatetxtWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRatetxtWActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        index= publTable.getSelectedRow();
        if (index != -1 ){
         
           if(Click==2)
           {    
            DataBase db=new DataBase();
            db.connectToDB("media");
           
            db.runQuerry("DELETE FROM `newspaperrates` WHERE id= '"+Codetxt.getText().trim()+"' And publication ='"+tb.getValueAt(index, 0).toString()+"'");
            db.DisconnectFromDB();
           }
           
           removeRow(index);
        }
        else{

        }
    }//GEN-LAST:event_removeActionPerformed

    private void editPublicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPublicationActionPerformed
        int index= publTable.getSelectedRow();
        if (index != -1){
            showPublications(true);
            Station=tb.getValueAt(index, 0).toString();
            station.setText(tb.getValueAt(index, 0).toString());
            PureGvt.setText(tb.getValueAt(index, 1).toString());
            GvtComm.setText(tb.getValueAt(index, 2).toString());
            CRatetxt.setText(tb.getValueAt(index, 3).toString());
            CRatetxtS.setText(tb.getValueAt(index, 4).toString());
            CRatetxtW.setText(tb.getValueAt(index, 5).toString());
           
            isEdit=true;
        }
        else{

        }
    }//GEN-LAST:event_editPublicationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showPublications(true);
        isEdit=false;
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GvtCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GvtCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GvtCommActionPerformed

    private void FaxNumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaxNumbertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FaxNumbertxtActionPerformed

    private void CodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodetxtActionPerformed

    }//GEN-LAST:event_CodetxtActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        // TODO add your handling code here:
       if(ISValid())
       {    
        if(JOptionPane.showConfirmDialog( null,"Are You sure you want to perform this action ")==0)
        {
            DataBase Datab =new DataBase();
            Datab.connectToDB("media");
            switch(Click){
                case 1:
                {   this.Codetxt.setText(new CodeGen().GetCode("NNewsCode"));
                 
                    JOptionPane.showMessageDialog(null, "Newspapere Code is "+this.Codetxt.getText()+" ", "Cofirmation", JOptionPane.OK_OPTION);
                    Datab.insertGen("`id`, `name`,  `ph`, `fax`, `mobile`, `email`",DBValues.get(this.GetAttri()), "newspaper");
                    
                      for (int i =0; i < tb.getRowCount(); i++)
                           Datab.insertGen("`id`, `name`, `publication`, `PureGovt`, `GovtCommercial`, `commercialWeek`, `sunday`, `Whole`",DBValues.get(TableValuesAt(i)),"newspaperrates");
                   
                      new CodeGen().SaveCode("NNewsCode");
                    break;
                }
                case 2:
                    Datab.EditProfileNews(this.GetAttri(),"newspaper");
                break;
                    
                case 3:
                {
                    Datab.DeleteProfile(Codetxt.getText(), "Newspaper");
                    Datab.DeleteProfile(Codetxt.getText(), "newspaperrates");
             //       System.out.println("Delete");
                    
                    break;
                }
            }

            SetNull();
        }
        
        mainPanel.setVisible(false);
        SETButton(0);
       }
    }//GEN-LAST:event_DoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        showPublications(false);
        this.setEnabled(false);
        new OtherRate(Home, this, Codetxt.getText(), station.getText(), Nametxt.getText());
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked
    
    
    
    private String[] TableValuesAt(int i) {
        return new String[]{Codetxt.getText(),Nametxt.getText(),tb.getValueAt(i, 0).toString(),tb.getValueAt(i, 1).toString(),tb.getValueAt(i, 2).toString(),tb.getValueAt(i, 3).toString(),tb.getValueAt(i, 4).toString(),tb.getValueAt(i, 5).toString()};
    }

    public void SetValues(String Id,String name, String PHnum,String Email, String MNumber,String FaxNum)
    {
        
     Codetxt.setText(Id);
     Nametxt.setText(name);
     PhoneNumbertxt.setText(PHnum);
     EmailAddresstxt.setText(Email);
     MobileNumbertxt.setText(MNumber);
     FaxNumbertxt.setText(FaxNum);
     mainPanel.setVisible(true);
     setTable(Id);
     
     
    }  
    
    public void SetNull()
    {
     this.Codetxt.setText("");
     this.Nametxt.setText("");
     this.PhoneNumbertxt.setText("");
     this.EmailAddresstxt.setText("");
     this.MobileNumbertxt.setText("");
     this.FaxNumbertxt.setText("");
     tb=null;
     tb=tableSet();
     publTable.setModel(tb);
     rowCount=0;
     Click=0;
    }
     public String[] GetAttri()
    {
       
        String x[] ={this.Codetxt.getText(),this.Nametxt.getText(),this.PhoneNumbertxt.getText(),this.FaxNumbertxt.getText(),this.MobileNumbertxt.getText(),this.EmailAddresstxt.getText()};
        
        return x;
    }        
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CRatetxt;
    private javax.swing.JTextField CRatetxtS;
    private javax.swing.JTextField CRatetxtW;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Codetxt;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Done;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField EmailAddresstxt;
    private javax.swing.JLabel Emedia;
    private javax.swing.JTextField FaxNumbertxt;
    private javax.swing.JTextField GvtComm;
    private javax.swing.JTextField MobileNumbertxt;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JButton New;
    private javax.swing.JTextField PhoneNumbertxt;
    private javax.swing.JButton Publicationdone;
    private javax.swing.JTextField PureGvt;
    private javax.swing.JButton editPublication;
    private javax.swing.JLabel hawklogo;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable publTable;
    private javax.swing.JPanel publication;
    private javax.swing.JButton remove;
    private javax.swing.JTextField station;
    // End of variables declaration//GEN-END:variables

    public void showPublications(boolean b) {
        publication.setVisible(b);
        publication.setLocation(WIDTH/4, HEIGHT/4);
        mainPanel.setEnabled(!b);
    }

    private boolean validatePubl() {
       if(station.getText().isEmpty())
           return false;
       try{
           
       Double.parseDouble(CRatetxt.getText());
       Double.parseDouble(GvtComm.getText());
       Double.parseDouble(PureGvt.getText());
       Double.parseDouble(CRatetxtW.getText());
       Double.parseDouble(CRatetxtS.getText());
       }catch(NumberFormatException e){
       
       return false;
       }
        
        return true;
    }
    
    public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("Publications");
        Temp.addColumn("Pure govt");
        Temp.addColumn("Govt Commercial");
        Temp.addColumn("Commercial Weekday");
        Temp.addColumn("Comercial Sunday");
        Temp.addColumn(" Supplement ");
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
        
        ResultSet rs = dbObj.getData("select `publication`,`PureGovt`,`GovtCommercial`,`commercialWeek`, `sunday`, `Whole` from newspaperrates where id = '"+Id+"'");
       
        try {
            int len=GetDataSize(rs);
            String [][]Ary1=new String[len][6];        
            
            for(int i=0;i<len;i++)
            {
             rs.next();
             
             Ary1[i][0]=rs.getString("publication");
             Ary1[i][1]=rs.getString("PureGovt");
             Ary1[i][2]=rs.getString("GovtCommercial");
             Ary1[i][3]=rs.getString("commercialWeek");
             Ary1[i][4]=rs.getString("sunday");
             Ary1[i][5]=rs.getString("Whole");
            }    
            
           String []Ary2= {"Publications","Pure govt","Govt Commercial","Commercial Weekday","Comercial Sunday","Whole page"};
  
            myTableModel Temp= new myTableModel(Ary1,Ary2);
            tb=Temp;
            publTable.setModel(tb);
            rowCount=tb.getRowCount();
        } catch (SQLException ex) {
            Logger.getLogger(NewNewsPaper.class.getName()).log(Level.SEVERE, null, ex);
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
     
     
    void SetPanelNull() {
            station.setText("");
            PureGvt.setText("");
            GvtComm.setText("");
            CRatetxt.setText("");
            CRatetxtS.setText("");
            CRatetxtW.setText("");
            
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
       Done.setEnabled(false);
       mainPanel.setVisible(false);
      }
    
    }        
    
     private boolean ISValid() {
      
        if(Nametxt.getText().contentEquals(""))
        {
         JOptionPane.showMessageDialog(null, "Manger name not given");
         return false;
        }   
      
        return true;
    }
}
