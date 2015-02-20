
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class press extends javax.swing.JPanel {
    
    
    MainWindow Home;
    Boolean IsEdit;
    private Double rateContract, qty;
    public press(MainWindow master) {
        initComponents();
        Home= master;
        rateContract=qty=0.0;
        Mainshow.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mainshow = new javax.swing.JPanel();
        qtyTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rates = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        widthTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        heightTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PartiTxt = new javax.swing.JTextField();
        amountTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mcode = new javax.swing.JTextField();
        ccode = new javax.swing.JTextField();
        clientSearch = new javax.swing.JButton();
        mSearch = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        home = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setLayout(null);

        Mainshow.setOpaque(false);
        Mainshow.setLayout(null);

        qtyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTxtActionPerformed(evt);
            }
        });
        qtyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyTxtKeyReleased(evt);
            }
        });
        Mainshow.add(qtyTxt);
        qtyTxt.setBounds(490, 190, 160, 30);

        jLabel4.setText("Rates");
        Mainshow.add(jLabel4);
        jLabel4.setBounds(30, 190, 120, 30);

        rates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratesActionPerformed(evt);
            }
        });
        rates.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ratesKeyReleased(evt);
            }
        });
        Mainshow.add(rates);
        rates.setBounds(170, 190, 150, 30);

        jLabel1.setText("Quantity:");
        Mainshow.add(jLabel1);
        jLabel1.setBounds(350, 190, 70, 30);

        widthTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthTxtActionPerformed(evt);
            }
        });
        widthTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                widthTxtKeyReleased(evt);
            }
        });
        Mainshow.add(widthTxt);
        widthTxt.setBounds(490, 240, 160, 30);

        jLabel5.setText("Width");
        Mainshow.add(jLabel5);
        jLabel5.setBounds(350, 240, 60, 30);

        heightTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTxtActionPerformed(evt);
            }
        });
        heightTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                heightTxtKeyReleased(evt);
            }
        });
        Mainshow.add(heightTxt);
        heightTxt.setBounds(170, 240, 150, 30);

        jLabel8.setText("Height");
        Mainshow.add(jLabel8);
        jLabel8.setBounds(30, 240, 120, 30);

        jLabel12.setText("Particulars:");
        Mainshow.add(jLabel12);
        jLabel12.setBounds(30, 290, 120, 30);

        PartiTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartiTxtActionPerformed(evt);
            }
        });
        PartiTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PartiTxtKeyReleased(evt);
            }
        });
        Mainshow.add(PartiTxt);
        PartiTxt.setBounds(170, 290, 480, 30);
        Mainshow.add(amountTxt);
        amountTxt.setBounds(170, 350, 150, 30);

        jLabel7.setText("Total Amount:");
        Mainshow.add(jLabel7);
        jLabel7.setBounds(30, 350, 120, 30);

        jLabel3.setText("Item:");
        Mainshow.add(jLabel3);
        jLabel3.setBounds(30, 150, 120, 30);
        Mainshow.add(iname);
        iname.setBounds(170, 150, 150, 30);

        mname.setEditable(false);
        Mainshow.add(mname);
        mname.setBounds(170, 110, 150, 30);

        jLabel9.setText("Manufacturer Name:");
        Mainshow.add(jLabel9);
        jLabel9.setBounds(30, 110, 120, 30);

        jLabel2.setText("Client Name:");
        Mainshow.add(jLabel2);
        jLabel2.setBounds(30, 70, 120, 30);

        t2.setEditable(false);
        Mainshow.add(t2);
        t2.setBounds(170, 70, 150, 30);

        t1.setEnabled(false);
        Mainshow.add(t1);
        t1.setBounds(170, 30, 150, 30);

        jLabel11.setText("Order ID :");
        Mainshow.add(jLabel11);
        jLabel11.setBounds(30, 40, 70, 20);

        jLabel6.setText("Client Code:");
        Mainshow.add(jLabel6);
        jLabel6.setBounds(350, 70, 120, 30);

        jLabel10.setText("Manufacturer Code:");
        Mainshow.add(jLabel10);
        jLabel10.setBounds(350, 110, 120, 30);

        mcode.setEditable(false);
        Mainshow.add(mcode);
        mcode.setBounds(490, 110, 150, 30);

        ccode.setEditable(false);
        ccode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccodeActionPerformed(evt);
            }
        });
        Mainshow.add(ccode);
        ccode.setBounds(490, 70, 150, 30);

        clientSearch.setText("Search");
        clientSearch.setOpaque(false);
        clientSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientSearchActionPerformed(evt);
            }
        });
        Mainshow.add(clientSearch);
        clientSearch.setBounds(670, 70, 65, 23);

        mSearch.setText("Search");
        mSearch.setOpaque(false);
        mSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSearchActionPerformed(evt);
            }
        });
        Mainshow.add(mSearch);
        mSearch.setBounds(670, 110, 65, 23);

        add(Mainshow);
        Mainshow.setBounds(0, 170, 890, 420);

        jButton4.setText("Save");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(270, 610, 110, 30);

        jButton5.setText("New Form");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(40, 613, 110, 30);

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(160, 613, 100, 30);

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
        home.setBounds(920, 20, 80, 80);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete);
        Delete.setBounds(390, 610, 90, 30);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/homepage_background.png"))); // NOI18N
        add(BackGround);
        BackGround.setBounds(0, 0, 1024, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void clientSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientSearchActionPerformed
        this.setEnabled(false);
        new search("select id,name from cust where 1",this,true);
    }//GEN-LAST:event_clientSearchActionPerformed

    private void mSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSearchActionPerformed
        
        this.setEnabled(false);
        new search("select id,name from press where 1",this,false);
    }//GEN-LAST:event_mSearchActionPerformed

    private void widthTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthTxtActionPerformed

    private void ratesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ratesKeyReleased
    try {
            rateContract = Double.parseDouble(rates.getText());
            
            amountTxt.setText(String.format("%.2f", rateContract * qty));
        } catch (NumberFormatException numberFormatException) {
        }
    }//GEN-LAST:event_ratesKeyReleased

    private void heightTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightTxtKeyReleased

    }//GEN-LAST:event_heightTxtKeyReleased

    private void qtyTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTxtKeyReleased
        try {
            qty = Double.parseDouble(qtyTxt.getText());
            
            amountTxt.setText(String.format("%.2f", rateContract * qty));
        } catch (NumberFormatException numberFormatException) {
        }
    }//GEN-LAST:event_qtyTxtKeyReleased

    private void widthTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthTxtKeyReleased
        try {
        } catch (NumberFormatException numberFormatException) {
        }
    }//GEN-LAST:event_widthTxtKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (ValidateFields()) {
            DataBase obj = new DataBase();
            obj.connectToDB("media");
            
            if (!IsEdit) {                
                
                String Query = "INSERT INTO `pressorder`(`Orderid`, `Cname`, `Ccode`, `Vname`, `Vcode`, `Rate`, `height`,"
                        + " `width`, `Qty`,`PItem`,`Parti`) VALUES "
                        + "('" + t1.getText() + "','" + t2.getText() + "','" + ccode.getText() + "','" + mname.getText() + "',"
                        + "'" + mcode.getText() + "','" + rates.getText() + "','" + heightTxt.getText() + "','" + widthTxt.getText() + "',"
                        + "'" + qtyTxt.getText() + "','" + iname.getText() + "','" + PartiTxt.getText() + "')";
                obj.runQuerry(Query);
                new CodeGen().SaveNo("POrderNO");
                
            } else {
                JOptionPane.showConfirmDialog(null, "Are you sure you want to update?");
                String Query = "update pressorder set `Cname`='" + t2.getText() + "',`Ccode`='" + ccode.getText() + "',`Vname`='" + mname.getText() + "',"
                        + "`Vcode`='" + mcode.getText() + "',`Rate`='" + rates.getText() + "',`height`='" + heightTxt.getText() + "',`width`='" + widthTxt.getText() + "',"
                        + "`Qty`='" + qtyTxt.getText() + "',`PItem`='" + iname.getText() + "',`Parti`='" + PartiTxt.getText() + "',";
                obj.runQuerry(Query);
                
            }            
            obj.DisconnectFromDB();;
            
            Mainshow.setVisible(false);
            resetAll();
        } else {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        IsEdit=false;
        Mainshow.setVisible(true);
        t1.setText(new CodeGen().GetCode("POrderNO"));
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        
        Home.ShowWindow(new HomePage(Home));
    }//GEN-LAST:event_homeMouseClicked

    private void ratesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratesActionPerformed
        
    }//GEN-LAST:event_ratesActionPerformed

    private void ccodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccodeActionPerformed
        
    }//GEN-LAST:event_ccodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id= JOptionPane.showInputDialog("Please Enter id : ");
        
        
        setAll(id);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String id= JOptionPane.showInputDialog("Please Enter id : ");
        DataBase obj = new DataBase();
        obj.connectToDB("media");
        if (obj.deletefuction("DELETE FROM `pressorder` WHERE Orderid='"+id+"'"));
        else
            JOptionPane.showMessageDialog(null, "ID not Fount.");
        
        obj.DisconnectFromDB();
    }//GEN-LAST:event_DeleteActionPerformed

    private void PartiTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PartiTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_PartiTxtKeyReleased

    private void PartiTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartiTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PartiTxtActionPerformed

    private void qtyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTxtActionPerformed

    private void heightTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton Delete;
    private javax.swing.JPanel Mainshow;
    private javax.swing.JTextField PartiTxt;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField ccode;
    private javax.swing.JButton clientSearch;
    private javax.swing.JTextField heightTxt;
    private javax.swing.JLabel home;
    private javax.swing.JTextField iname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton mSearch;
    private javax.swing.JTextField mcode;
    private javax.swing.JTextField mname;
    private javax.swing.JTextField qtyTxt;
    private javax.swing.JTextField rates;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField widthTxt;
    // End of variables declaration//GEN-END:variables

public void setFields(String id,String name,boolean isCustomer){
        
       if (isCustomer) {
        t2.setText(name);
        ccode.setText(id);
        } else {
        mname.setText(name);
        mcode.setText(id);   
           
        }
        
        
            
    }


    private void resetAll() {
    t1.setText("");
    t2.setText("");    
    mname.setText(""); 
    ccode.setText(""); 
    mcode.setText(""); 
    iname.setText("");
    rates.setText("");
    qtyTxt.setText("");
    amountTxt.setText("");
    PartiTxt.setText("");
    heightTxt.setText("");
    widthTxt.setText("");
    }
    
    private void setAll(String id) {
    
     DataBase obj = new DataBase();
     obj.connectToDB("media");
     IsEdit=true;
     ResultSet rs= obj.getData("Select * From PressOrder Where Orderid='"+id+"'");
        try {
            if(rs.next())
            {
            t1.setText(rs.getString(1));
            t2.setText(rs.getString(2));    
            mname.setText(rs.getString(4)); 
            ccode.setText(rs.getString(3)); 
            mcode.setText(rs.getString(5)); 
            iname.setText(rs.getString(10));
            rates.setText(rs.getString(6));
            qtyTxt.setText(rs.getString(9));
            PartiTxt.setText(rs.getString(11));
            amountTxt.setText(Double.toString(Double.parseDouble(rs.getString(6))*Double.parseDouble(rs.getString(9))));
            
            heightTxt.setText(rs.getString(7));
            widthTxt.setText(rs.getString(8));
            Mainshow.setVisible(true);
            }
                
            
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Order Id Does not Exists", "Error", JOptionPane.ERROR_MESSAGE);    
            }
   obj.DisconnectFromDB();
  }

    private boolean ValidateFields() {
        
        if (iname.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Please Enter Item name!");
        return false;
        }
        if (rates.getText().isEmpty() && rates.getText().matches("0")){
        JOptionPane.showMessageDialog(null,"Please Enter a valid rate!");
        return false;
        }
        if (qtyTxt.getText().isEmpty() && qtyTxt.getText().matches("0")){
        JOptionPane.showMessageDialog(null,"Please enter valid items quantity!");
        return false;
        }
        if (heightTxt.getText().isEmpty() && heightTxt.getText().matches("0")){
        JOptionPane.showMessageDialog(null,"Please enter valid item height!");
        return false;
        }
        if (widthTxt.getText().isEmpty() && widthTxt.getText().matches("0")){
        JOptionPane.showMessageDialog(null,"Please enter valid item width!");
        return false;
        }
        if (PartiTxt.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Please enter particulars!");
        return false;
        }

        return true;
    }
    
  }
