/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hawkadvertisng;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
    //Variables
    DataBase db;
     
    public login() {
        initComponents();
        try{
        ImageIcon img = new ImageIcon("logo.png");
        this.setIconImage(img.getImage());
        }
        catch (Exception e){
            //system.out.println(e.getMessage());
        }
        setDimensions();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserIdTxt = new javax.swing.JTextField();
        UserPassFeild = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HAWK MEDIA LOGIN");
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        UserIdTxt.setPreferredSize(new java.awt.Dimension(60, 20));
        UserIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIdTxtActionPerformed(evt);
            }
        });
        getContentPane().add(UserIdTxt);
        UserIdTxt.setBounds(150, 360, 200, 30);

        UserPassFeild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserPassFeildKeyPressed(evt);
            }
        });
        getContentPane().add(UserPassFeild);
        UserPassFeild.setBounds(150, 440, 200, 30);

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setForeground(new java.awt.Color(51, 51, 51));
        Login.setText("Login");
        Login.setOpaque(false);
        Login.setPreferredSize(new java.awt.Dimension(75, 23));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(180, 530, 80, 30);

        Cancel.setBackground(new java.awt.Color(255, 255, 255));
        Cancel.setForeground(new java.awt.Color(51, 51, 51));
        Cancel.setText("Cancel");
        Cancel.setOpaque(false);
        Cancel.setPreferredSize(new java.awt.Dimension(75, 23));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel);
        Cancel.setBounds(270, 530, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logout.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIdTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_UserIdTxtActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
       
      //LoginFun("Default","Default");
      LoginFun(UserIdTxt.getText().trim(), UserPassFeild.getText().trim()); 
    }//GEN-LAST:event_LoginActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add you
        System.exit(0);
    }//GEN-LAST:event_CancelActionPerformed

    private void UserPassFeildKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserPassFeildKeyPressed
       if (evt.getKeyChar() == '\n')
           LoginFun(UserIdTxt.getText().trim(), UserPassFeild.getText().trim()); 
    }//GEN-LAST:event_UserPassFeildKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login log=new login();
                log.setVisible(true);
                log.setBounds(0, 0, 370, 340);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Login;
    private javax.swing.JTextField UserIdTxt;
    private javax.swing.JPasswordField UserPassFeild;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void LoginFun(String InputUser, String InputPasswd) {
        
        try {
            db= new DataBase();
            db.connectToDB("hawklogin");
            ResultSet rs = db.getData("SELECT * FROM  `info` WHERE User =  '" + InputUser + "' ");
            
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "User Name Does not Exists", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (rs.getString("Passwd").equals(InputPasswd)) {
                    MainWindow Main = new MainWindow(rs.getInt("Type"), UserIdTxt.getText());
                    Main.setBounds(0, 0, 1024, 768);
                    Main.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Unable To connect to server", "Error", JOptionPane.ERROR_MESSAGE);
                
        }
        
        
    }
    private void setDimensions() {
        Dimension d= new Dimension(1024,768);
        this.setResizable(false);
        this.setMinimumSize(d);
        this.setMaximumSize(d);
        this.setPreferredSize(d);
    }
}
