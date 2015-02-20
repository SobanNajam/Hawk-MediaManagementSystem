
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class searchNewspaper extends javax.swing.JFrame {
    
    DataBase dbase;
    ResultSet rs;
    String[] Querry = new String[]{"select * from allnewspaper where 1","select * from allnewspaper where region = 1",
                                    "select * from allnewspaper where region = 2 ","select * from allnewspaper where region = 3"};
    boolean CS;
    private int[] g;
    private int[] index;
    private Csorter sorter=null;
    
    MainWindow Home ;
    String[] heading={"ID No","Name","Publication","Pure Govt"};
    String[] heading2={"ID No","Name","Publication","Govt. Commercial"};
    RONewsp roObject;
    ElectronicRo EroObject;
    NewNewsPaper News;
    NewCustomer Cus;
    
   // editRoNews editNRO;
    ElectronicMedia EMedia;
    private String rateStr,col="allnewspaper";;
    
   
     public searchNewspaper(MainWindow home,RONewsp ro) {
        initComponents();
         try{
            ImageIcon img = new ImageIcon("logo.png");
            this.setIconImage(img.getImage());
            }catch (Exception e){
             //system.out.println(e.getMessage());
            }
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        roObject = ro;
        initSearchPageGovt(Querry[0]);
        
    }
//     public searchNewspaper(String querry,editRoNews ero) {
//        initComponents();
//        editNRO= ero;
//        editNRO.setEnabled(false);
//        setVisible(true);
//        buttonGroup1.add(b1);
//        buttonGroup1.add(b2);
//        editNRO = ero;
//        rateStr = "PureGovt";
//        Querry[0]=querry;
//        initSearchPageGovt(querry);
//        
//    }
//   
    public searchNewspaper(MainWindow home,NewNewsPaper New) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        News=New;
        rate1.setVisible(false);
        rate2.setVisible(false);
        initSearchPageNewNews(Querry[0]);
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rate1 = new javax.swing.JRadioButton();
        rate2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        regions = new javax.swing.JComboBox();
        b3 = new javax.swing.JRadioButton();

        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        buttonGroup1.add(b3);

        buttonGroup2.add(rate1);
        buttonGroup2.add(rate2);

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
                "ID No", "name"
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
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(1).setResizable(false);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Search by:");

        rate1.setSelected(true);
        rate1.setText("Pure Govt.");
        rate1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rate1ItemStateChanged(evt);
            }
        });

        rate2.setText("Govt. Commercial");
        rate2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rate2ItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Show :");

        regions.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Mixed", "Punjab", "Sindh" }));
        regions.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                regionsItemStateChanged(evt);
            }
        });

        b3.setText("Publication");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regions, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(1, 1, 1)
                                .addComponent(b2)
                                .addGap(18, 18, 18)
                                .addComponent(b1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b3)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rate1)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1))
                            .addComponent(rate2)))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(regions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b2)
                            .addComponent(b1)
                            .addComponent(jLabel1)
                            .addComponent(b3))
                        .addGap(7, 7, 7)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rate1)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rate2)
                        .addGap(30, 30, 30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       setVisible(false);
       
        int i= table.getSelectedRow();
                
                if(i!=-1  )
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
      String querry = "select * from allnewspaper where id = '"+table.getValueAt(i, 0).toString()+"'";
      
      if(News!=null)
        {
            try {
               rs=dbase.getData(querry);
             //  //system.out.println("\n"+querry+"\n");
               rs.next();
//           News.SetValues(rs.getString("id"),rs.getString("name") ,rs.getString("ph") ,rs.getString("email"), rs.getString("obal"), rs.getString("mobile"), rs.getString("fax"),col);
            } catch (SQLException ex) {
                Logger.getLogger(searchNewspaper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//      else if(editNRO!=null)
//        {
//           try {
//                    editNRO.setEnabled(true);
//                    editNRO.setVisible(true);
//                    rs = dbase.getData(querry);
//                    //system.out.println(querry);
//                    rs.next();
//                    editNRO.setNewspaper(rs.getString("id"), rs.getString("name"), rs.getString("publication"), rs.getString(rateStr));
//                } catch (SQLException ex) {
//                    Logger.getLogger(searchNewspaper.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            
//        }
        else if(roObject!=null)
        {
           roObject.setNewspaper(table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString(),table.getValueAt(i, 2).toString(),table.getValueAt(i, 3).toString());
                
        }
        
        if (Home!=null) {
            
            Home.setEnabled(true);
            Home.setVisible(true);
        }
    }
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if(b1.isSelected())
            sorter.textSearch(jTextField1.getText(),1 );
        if(b2.isSelected())
            sorter.textSearch(jTextField1.getText(), 0);
        else
            sorter.textSearch(jTextField1.getText(), 2);
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       if(Home!=null){ 
           Home.setEnabled(true);
           Home.setVisible(true);
       
       }
       
       
    }//GEN-LAST:event_formWindowClosed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void rate2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rate2ItemStateChanged
        if (rate2.isSelected())
            initSearchPageGovtCommercial(Querry[regions.getSelectedIndex()]);
        rateStr= "GovtCommercial";
    }//GEN-LAST:event_rate2ItemStateChanged

    private void rate1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rate1ItemStateChanged
        if (rate1.isSelected())
            initSearchPageGovt(Querry[regions.getSelectedIndex()]);
        rateStr = "PureGovt";
    }//GEN-LAST:event_rate1ItemStateChanged

    private void regionsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_regionsItemStateChanged
        rate1.setSelected(true);
        switch (regions.getSelectedIndex())
                {
                case 0:
                       initSearchPageGovt(Querry[0]);col="allnewspaper";break;
                case 1:
                       initSearchPageGovt(Querry[1]);col="generalnewspaper"; break;                  
                case 2:
                       initSearchPageGovt(Querry[2]);col="punjabnewspaper"; break;
                case 3:
                       initSearchPageGovt(Querry[3]);col="sindhnewspaper";break;
                    
                }
    }//GEN-LAST:event_regionsItemStateChanged

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rate1;
    private javax.swing.JRadioButton rate2;
    private javax.swing.JComboBox regions;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void triggerChange(String querry) {
      dbase = new DataBase();
      dbase.connectToDB("media");
      rs = dbase.getData(querry);

    }

    private void initSearchPageGovt(String querry) {
        g = new int[16];
        index = new int[16];
        
        for (int i = 4; i < 16; i++) {
            g[i] = 0;
        }
        g[0]=g[1]=g[2]=g[3]=1;
        index[0]=0;
        index[1]=1;
        index[2]=2;
        index[3]=3;
        index[4]=4;
        
        
        triggerChange(querry);
        try {
            sorter = new Csorter(rs, heading, table, g, index);
            sorter.updateTable();
        } catch (SQLException ex) {
          }
    }
    private void initSearchPageGovtCommercial(String querry) {
        g = new int[15];
        index = new int[15];
        
        for (int i = 3; i < 15; i++) {
            g[i] = 0;
        }
        g[0]=g[1]=g[2]=g[4]=1;
        index[0]=0;
        index[1]=1;
        index[2]=2;
        index[4]=3;
        
        triggerChange(querry);
        try {
            sorter = new Csorter(rs, heading2, table, g, index);
            sorter.updateTable();
        } catch (SQLException ex) {
          }
    }

    private void initSearchPageNewNews(String querry) {
        g = new int[15];
        index = new int[15];
        
        for (int i = 3; i < 15; i++) {
            g[i] = 0;
        }
        g[0]=g[1]=g[2]=1;
        index[0]=0;
        index[1]=1;
        index[2]=2;
        
        
        triggerChange(querry);
        try {
            sorter = new Csorter(rs, new String[]{"ID No","Name","Publication"}, table, g, index);
            sorter.updateTable();
        } catch (SQLException ex) {
          }   
    
    }
}
