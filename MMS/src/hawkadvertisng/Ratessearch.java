
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ratessearch extends javax.swing.JFrame {
    
    DataBase dbase;
    ResultSet rs;
   
    private int[] g;
    private int[] index;
    private Csorter sorter=null;
    RONewsp ROobj;
    String[] heading={"ID No","Name","Station","Govt.","Govt. commercial","Weekday","Sunday","Whole"};
    String[] heading1={"ID No","Name","Station","Prime Time","Off Prime Time","Govt Prime Time","Govt Off Prime Time"};
    
    MainWindow Home ;
    ElectronicRo ERO;
   
    
    
    public Ratessearch(ResultSet rs,RONewsp ROobj) {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        setVisible(true);
        buttonGroup1.add(b1);
        buttonGroup1.add(b2);
        
        buttonGroup2.add(c1);
        buttonGroup2.add(c2);
        buttonGroup2.add(c3);
        buttonGroup2.add(c4);
        buttonGroup2.add(c5);
        buttonGroup2.add(c5);
        buttonGroup2.add(c6);
        this.rs = rs;
        this.ROobj = ROobj;
        initSearchPage();
        
    }
    public Ratessearch(ResultSet rs,ElectronicRo ERO) {
        initComponents();
        
        setVisible(true);
        this.rs = rs;
        buttonGroup1.add(b1);;
        buttonGroup1.add(b2);
        
        c1.setText("Prime");
        c2.setText("Off Prime");
        c3.setText("Govt Prime");
        c4.setText("Govt Off Prime");
        this.remove(c5);
        this.remove(c6);
        
        buttonGroup2.add(c1);
        buttonGroup2.add(c2);
        buttonGroup2.add(c3);
        buttonGroup2.add(c4);
        
        
        this.ERO = ERO;
        table.setModel(tableSet());
        initSearchPage2();
        
    }
    
    public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("Id");
        Temp.addColumn("Name");
        Temp.addColumn("Publications");
        Temp.addColumn("Prime");
        Temp.addColumn("Off Prime");
        Temp.addColumn("Govt Prime");
        Temp.addColumn("Govt Off Prime");
        
        return Temp;

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        c2 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        c6 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        buttonGroup3.add(c1);
        buttonGroup3.add(c2);
        buttonGroup3.add(c3);
        buttonGroup3.add(c4);
        buttonGroup3.add(c5);
        buttonGroup3.add(c6);

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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID No", "name", "Station", "Govt.", "Govt. Commercial", "weekday", "sunday", "whole"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        c2.setText("Govt. Comercial");

        c1.setText("Govt. Rate");

        c3.setText("Weekdays");

        c4.setText("Sunday");

        c5.setText("Whole");

        c6.setText("Other");

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2)
                            .addComponent(b1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(c1)
                                .addGap(9, 9, 9)
                                .addComponent(c2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c3)
                                .addGap(9, 9, 9)
                                .addComponent(c4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c6)))
                        .addGap(0, 112, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b2)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c4)
                                .addComponent(c3)
                                .addComponent(c5)
                                .addComponent(c6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c2)
                                .addComponent(c1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i= table.getSelectedRow();
                
                if(i!=-1 && RateSelected()!=0 )
                {
                 Set(i);
                        
                        
                }
                else if(RateSelected()!=0)
                {
                      JOptionPane.showMessageDialog(this, "Select Rate First!");
                
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Select First!");
                }    
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Set(int i) 
    {
       if(ROobj!=null)
        {
          if(c6.isSelected())
          {
              String query="SELECT `RateType` ,`Rate` FROM `othernewspaprerate` Where `id`='"+table.getValueAt(i, 0).toString()+"' And `publication`='"+table.getValueAt(i, 2).toString()+"'";
             // //system.out.println(query);
              new search(query,this,ROobj,table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString(),table.getValueAt(i, 2).toString());
              this.dispose();
              setVisible(false);
         
          }
          
          else
          {    
           ROobj.setNewspaper(table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString(),table.getValueAt(i, 2).toString(),table.getValueAt(i, RateSelected()).toString());
           this.dispose();
           setVisible(false);
           ROobj.setEnabled(true);
           ROobj.setVisible(true);
          }
         }
       else if(ERO !=null)
       {
         
           ERO.setChannel(table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString(),table.getValueAt(i, 2).toString(),table.getValueAt(i, RateSelected()).toString());
           this.dispose();
           setVisible(false);
           ERO.setEnabled(true);
           ERO.setVisible(true);
       }   
       else{
             this.dispose();
             setVisible(false);
             Home.getFocusListeners();
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
      
    }//GEN-LAST:event_formWindowClosed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if(ROobj!=null)
        {
           this.dispose();
           setVisible(false);
           ROobj.setEnabled(true);
           ROobj.setVisible(true);
         }
       else if(ERO !=null)
       {
         
           this.dispose();
           setVisible(false);
           ERO.setEnabled(true);
           ERO.setVisible(true);
       }   
          
    }//GEN-LAST:event_jButton2ActionPerformed

    public int RateSelected()
    {
      if(c1.isSelected())
      {
       return 3;
      }  
      else if(c2.isSelected())
      {
       return 4;
      }
      else if(c3.isSelected())
      {
       return 5;
      }
       else if(c4.isSelected())
      {
       return 6;
      }
       else if(c5.isSelected())
      {
       return 7;
      }
       else if(c6.isSelected())
      {
       return 8;
      }
      return 0;
    }       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

   
    private void initSearchPage() {
        g = new int[15];
        index = new int[15];
        
        for (int i = 1; i < 15; i++) {
            g[i] = 0;
        }
        g[0]=g[1]=g[2]=g[3]=g[4]=g[5]=g[6]=g[7]=1;
        
        
        
        index[0]=0;
        index[1]=1;
        index[2]=2;
        index[3]=3;
        index[4]=4;
        index[5]=5;
        index[6]=6;
        index[7]=7;
        index[8]=8;
        
        
        try {
            sorter = new Csorter(rs, heading, table, g, index);
            sorter.updateTable();
        } catch (SQLException ex) {
          }
        
    }
   
     private void initSearchPage2() {
        g = new int[15];
        index = new int[15];
        
        for (int i = 1; i < 15; i++) {
            g[i] = 0;
        }
        g[0]=g[1]=g[2]=g[3]=g[4]=g[5]=g[6]=g[7]=1;
        
        
        
        index[0]=0;
        index[1]=1;
        index[2]=2;
        index[3]=3;
        index[4]=4;
        index[5]=5;
        index[6]=6;
        index[7]=7;
        
        try {
            sorter = new Csorter(rs, heading1, table, g, index);
            sorter.updateTable();
        } catch (SQLException ex) {
          }
        
    }
      
}
