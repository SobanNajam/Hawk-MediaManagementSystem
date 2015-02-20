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
public class ElectronicMedia extends javax.swing.JPanel {

   
    public int Click;
    public MainWindow Home;
    String Station;
    myTableModel tb;
    int rowCount;
    private boolean isEdit=false;
    private int index=-1;
    
    public ElectronicMedia(MainWindow Home) {
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
        jButton6 = new javax.swing.JButton();
        publication = new javax.swing.JPanel();
        GvtComm = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PureGvt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        station = new javax.swing.JTextField();
        Publicationdone = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        GvtPrime = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        GvtOffPrime = new javax.swing.JTextField();
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
        Done.setBounds(660, 110, 80, 30);

        Emedia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Emedia.setText("Electronic Media");
        add(Emedia);
        Emedia.setBounds(400, 70, 190, 28);

        Delete.setText("Delete");
        Delete.setOpaque(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete);
        Delete.setBounds(260, 130, 73, 23);

        New.setText("New");
        New.setOpaque(false);
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        add(New);
        New.setBounds(100, 130, 70, 23);

        Cancel.setText("Cancel");
        Cancel.setOpaque(false);
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        add(Cancel);
        Cancel.setBounds(340, 130, 73, 23);

        Edit.setText("Edit");
        Edit.setOpaque(false);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        add(Edit);
        Edit.setBounds(180, 130, 73, 23);

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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Channel Code:");
        mainPanel.add(jLabel2);
        jLabel2.setBounds(60, 60, 90, 17);

        Codetxt.setEditable(false);
        Codetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodetxtActionPerformed(evt);
            }
        });
        mainPanel.add(Codetxt);
        Codetxt.setBounds(170, 50, 100, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Channel Name: ");
        mainPanel.add(jLabel7);
        jLabel7.setBounds(60, 90, 90, 17);

        Nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GvtCommActionPerformed(evt);
            }
        });
        mainPanel.add(Nametxt);
        Nametxt.setBounds(170, 90, 190, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Phone Number:");
        mainPanel.add(jLabel3);
        jLabel3.setBounds(390, 200, 88, 17);

        PhoneNumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GvtCommActionPerformed(evt);
            }
        });
        mainPanel.add(PhoneNumbertxt);
        PhoneNumbertxt.setBounds(490, 200, 203, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Fax Number:");
        mainPanel.add(jLabel4);
        jLabel4.setBounds(60, 200, 74, 17);

        FaxNumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaxNumbertxtActionPerformed(evt);
            }
        });
        mainPanel.add(FaxNumbertxt);
        FaxNumbertxt.setBounds(170, 200, 200, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Mobile Number:");
        mainPanel.add(jLabel8);
        jLabel8.setBounds(60, 250, 91, 17);
        mainPanel.add(MobileNumbertxt);
        MobileNumbertxt.setBounds(170, 250, 203, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Email Address:");
        mainPanel.add(jLabel5);
        jLabel5.setBounds(390, 250, 84, 17);

        EmailAddresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GvtCommActionPerformed(evt);
            }
        });
        mainPanel.add(EmailAddresstxt);
        EmailAddresstxt.setBounds(490, 250, 203, 20);
        mainPanel.add(jSeparator3);
        jSeparator3.setBounds(0, 180, 58, 10);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Contact Information");
        mainPanel.add(jLabel10);
        jLabel10.setBounds(60, 170, 130, 17);
        mainPanel.add(jSeparator4);
        jSeparator4.setBounds(190, 180, 830, 10);
        mainPanel.add(jSeparator5);
        jSeparator5.setBounds(0, 290, 60, 10);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Stations");
        mainPanel.add(jLabel11);
        jLabel11.setBounds(60, 280, 70, 20);
        mainPanel.add(jSeparator6);
        jSeparator6.setBounds(110, 290, 910, 10);

        publTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Station", "PurePrime Time", "PureOff Prime Time", " Prime Time", "Off Prime Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
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
        jScrollPane1.setBounds(60, 320, 660, 130);

        jButton1.setText("Add station");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1);
        jButton1.setBounds(730, 390, 100, 23);

        editPublication.setText("edit");
        editPublication.setOpaque(false);
        editPublication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPublicationActionPerformed(evt);
            }
        });
        mainPanel.add(editPublication);
        editPublication.setBounds(730, 420, 100, 23);

        remove.setText("remove");
        remove.setOpaque(false);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        mainPanel.add(remove);
        remove.setBounds(730, 360, 100, 23);

        jButton6.setText("remove");
        jButton6.setOpaque(false);
        mainPanel.add(jButton6);
        jButton6.setBounds(730, 360, 100, 23);

        publication.setBackground(new java.awt.Color(0, 153, 153));
        publication.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(153, 153, 153)));
        publication.setLayout(null);
        publication.add(GvtComm);
        GvtComm.setBounds(420, 40, 120, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Off Prime Time:");
        publication.add(jLabel14);
        jLabel14.setBounds(250, 40, 130, 17);
        publication.add(PureGvt);
        PureGvt.setBounds(140, 40, 100, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Prime Time:");
        publication.add(jLabel15);
        jLabel15.setBounds(10, 40, 120, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Station");
        publication.add(jLabel6);
        jLabel6.setBounds(10, 10, 90, 17);

        station.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stationActionPerformed(evt);
            }
        });
        publication.add(station);
        station.setBounds(140, 10, 440, 20);

        Publicationdone.setText("Done");
        Publicationdone.setOpaque(false);
        Publicationdone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicationdoneActionPerformed(evt);
            }
        });
        publication.add(Publicationdone);
        Publicationdone.setBounds(420, 110, 80, 23);

        jButton3.setText("Cancel");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        publication.add(jButton3);
        jButton3.setBounds(505, 110, 70, 23);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Private Prime Time:");
        publication.add(jLabel18);
        jLabel18.setBounds(10, 80, 130, 20);
        publication.add(GvtPrime);
        GvtPrime.setBounds(140, 80, 100, 20);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("Private Off Prime Time:");
        publication.add(jLabel19);
        jLabel19.setBounds(250, 80, 150, 17);
        publication.add(GvtOffPrime);
        GvtOffPrime.setBounds(420, 80, 120, 20);

        mainPanel.add(publication);
        publication.setBounds(450, 30, 600, 140);

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
                
      new search(Home,"select id,name from emedia where 1",this);
      Done.setEnabled(true);  
        Click=3;
        
        SETButton(Click);
    }//GEN-LAST:event_DeleteActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        mainPanel.setVisible(true);
        Done.setEnabled(true);
        this.Codetxt.setText("Not Yet Given ");
        Click=1;
        SETButton(Click);
        
    }//GEN-LAST:event_NewActionPerformed
    
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
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Done.setEnabled(true);
        new search(Home,"select id,name from emedia where 1",this);
        Click=2;
        SETButton(2);
    }//GEN-LAST:event_EditActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      
        SETButton(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Home.ProfilePageB();

    }//GEN-LAST:event_jLabel17MouseClicked
   
    private String[] GetPanelValues() {
        return new String[]{Codetxt.getText(),Nametxt.getText(),station.getText(),PureGvt.getText(),GvtComm.getText(),GvtPrime.getText(),GvtOffPrime.getText()};
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
             tb.setValueAt( GvtPrime.getText()  ,rowCount  ,3);
             tb.setValueAt( GvtOffPrime.getText()  ,rowCount  ,4);
             
             if(Click==2)
             {    
              DataBase db=new DataBase();
              db.connectToDB("media");
              db.insertGen("`id`, `name`, `publication`, `Prime`,`OffPrime`,`PPrime`,`POffPrime`",DBValues.get(GetPanelValues()),"emediarates");
 
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

              
             
             
             if(Click==2)
             {    
              DataBase db=new DataBase();
              db.connectToDB("media");
              
             
              db.runQuerry("UPDATE `emediarates` SET `id`='"+Codetxt.getText().trim()+"',`name`='"+Nametxt.getText().trim()+"',`publication`='"+station.getText()+"',`Prime`='"+PureGvt.getText()+"',`OffPrime`='"+GvtComm.getText()+"',`PPrime`='"+GvtPrime.getText()+"',`POffPrime`='"+GvtOffPrime.getText()+"' WHERE id='" +Codetxt.getText().trim()+"' And  publication ='"+Station+"'");
              db.DisconnectFromDB();
           }
           
             
             setTable(Codetxt.getText());
             SetPanelNull();
             showPublications(false);

        }
        
        SetPanelNull();
        showPublications(false);
            
        }
        
    }//GEN-LAST:event_PublicationdoneActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                SetPanelNull();
        showPublications(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        index= publTable.getSelectedRow();
        if (index != -1 ){
           
           if(Click==2)
           {    
            DataBase db=new DataBase();
            db.connectToDB("media");
            db.deletefuction("DELETE FROM `emediarates` WHERE id= '"+Codetxt.getText()+"' And publication ='"+tb.getValueAt(index, 0).toString().trim()+"'");
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
            station.setText(tb.getValueAt(index, 0).toString());
            PureGvt.setText(tb.getValueAt(index, 1).toString());
            GvtComm.setText(tb.getValueAt(index, 2).toString());
            GvtPrime.setText(tb.getValueAt(index, 3).toString());
            GvtOffPrime.setText(tb.getValueAt(index, 4).toString());
            
            Station=tb.getValueAt(index, 0).toString();
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

     if(ISValid())
     {    
        if(JOptionPane.showConfirmDialog( null,"Are You sure you want to perform this action ")==0)
        {
            DataBase Datab =new DataBase();
            Datab.connectToDB("media");
            switch(Click){
                case 1:
                {    this.Codetxt.setText(new CodeGen().GetCode("EChannelCode"));
                     JOptionPane.showMessageDialog(null, "EChannel Code is "+this.Codetxt.getText()+" ", "Cofirmation", JOptionPane.OK_OPTION);
                   
                    Datab.insertGen("`id`, `name`,  `ph`, `fax`, `mobile`, `email`",DBValues.get(this.GetAttri()), "emedia");
                    
                      for (int i =0; i < tb.getRowCount(); i++)
                           Datab.insertGen("`id`, `name`, `publication`, `Prime`, `OffPrime`,`PPrime`,`POffPrime`",DBValues.get(TableValuesAt(i)),"emediarates");
                   
                      new CodeGen().SaveCode("EChannelCode");
                    break;
                }
                case 2:
                    Datab.EditProfileNews(this.GetAttri(),"emedia");
                break;
                case 3:
                {
                    Datab.DeleteProfile(Codetxt.getText(), "emedia");
                    Datab.DeleteProfile(Codetxt.getText(), "emediarates");

                    break;
                }
            }

            SetNull();
        }
        mainPanel.setVisible(false);
        
        
        SETButton(0);
        Done.setEnabled(false);
     }
    }//GEN-LAST:event_DoneActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked
    
    
    
    private String[] TableValuesAt(int i) {
        return new String[]{Codetxt.getText(),Nametxt.getText(),tb.getValueAt(i, 0).toString(),tb.getValueAt(i, 1).toString(),tb.getValueAt(i, 2).toString(),tb.getValueAt(i, 3).toString(),tb.getValueAt(i, 4).toString()};
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
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField Codetxt;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Done;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField EmailAddresstxt;
    private javax.swing.JLabel Emedia;
    private javax.swing.JTextField FaxNumbertxt;
    private javax.swing.JTextField GvtComm;
    private javax.swing.JTextField GvtOffPrime;
    private javax.swing.JTextField GvtPrime;
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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

    private void showPublications(boolean b) {
        publication.setVisible(b);
        publication.setLocation(WIDTH/4, HEIGHT/4);
        mainPanel.setEnabled(!b);
    }

    private boolean validatePubl() {
       if(station.getText().isEmpty())
           return false;
       try{
           
       Double.parseDouble(GvtComm.getText());
       Double.parseDouble(PureGvt.getText());
       Double.parseDouble(GvtOffPrime.getText());
       Double.parseDouble(GvtPrime.getText());
        
       }catch(NumberFormatException e){
       
       return false;
       }
        
        return true;
    }
    
    public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("Station");
        Temp.addColumn("Prime");
        Temp.addColumn("Off Prime");
        Temp.addColumn("Pure Prime");
        Temp.addColumn("Pure Off Prime");
       
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
        
        ResultSet rs = dbObj.getData("select `publication`,`Prime`,`OffPrime`,`PPrime`,`POffPrime` from emediarates where id = '"+Id+"'");
       
        try {
            int len=GetDataSize(rs);
            String [][]Ary1=new String[len][5];        
            
            for(int i=0;i<len;i++)
            {
             rs.next();
             
             Ary1[i][0]=rs.getString("publication");
             Ary1[i][1]=rs.getString("Prime");
             Ary1[i][2]=rs.getString("OffPrime");
             Ary1[i][3]=rs.getString("PPrime");
             Ary1[i][4]=rs.getString("POffPrime");
            
            }    
            
           String []Ary2= {"Publications","Prime govt","Off Prime Time","Pure Prime govt","Pure Off Prime Time"};
  
            myTableModel Temp= new myTableModel(Ary1,Ary2);
            tb=Temp;
            publTable.setModel(tb);
            rowCount=tb.getRowCount();
        } catch (SQLException ex) {
            Logger.getLogger(ElectronicMedia.class.getName()).log(Level.SEVERE, null, ex);
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
            GvtPrime.setText("");
            GvtOffPrime.setText("");
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
