/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hawkadvertisng;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdulrehamn
 */
public class OtherRate extends javax.swing.JFrame {

    
    DataBase dbase;
    ResultSet rs;
     myTableModel tb;
     String Tname;
   
    private int[] g;
    private int[] index;
    private Csorter sorter=null;
    
    String[] heading={"Name ","Rate"};
    MainWindow Home ;
    NewNewsPaper News;
    int rowcount=0;
    String ID;
    String Nam;
    String Stat;
    Boolean ADD;
    
    public OtherRate (MainWindow home,NewNewsPaper New,String ID,String Station,String Nam) {
        initComponents();
        Home = home;
        Home.setEnabled(false);
        setVisible(true);
        News=New;
        this.Nam=Nam;
        this.ID=ID;
        tb=tableSet();
        Stat=Station;
        showPublications(false);
          setTable(ID, Station);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        publication = new javax.swing.JPanel();
        Name = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Publicationdone = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        Rates = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        close = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 510));
        setMinimumSize(new java.awt.Dimension(400, 510));
        setPreferredSize(new java.awt.Dimension(400, 510));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        publication.setBackground(new java.awt.Color(0, 153, 153));
        publication.setLayout(null);
        publication.add(Name);
        Name.setBounds(60, 40, 130, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Name:");
        publication.add(jLabel15);
        jLabel15.setBounds(10, 40, 60, 20);

        Publicationdone.setText("Done");
        Publicationdone.setOpaque(false);
        Publicationdone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicationdoneActionPerformed(evt);
            }
        });
        publication.add(Publicationdone);
        Publicationdone.setBounds(120, 70, 57, 23);

        jButton5.setText("Cancel");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        publication.add(jButton5);
        jButton5.setBounds(190, 70, 65, 23);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Rate:");
        publication.add(jLabel18);
        jLabel18.setBounds(210, 40, 50, 20);
        publication.add(Rates);
        Rates.setBounds(250, 40, 110, 20);

        getContentPane().add(publication);
        publication.setBounds(20, 200, 380, 100);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 40, 51, 23);

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 40, 60, 23);

        jButton4.setText("Remove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(180, 40, 71, 23);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 370, 402);

        close.setText("close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(260, 40, 57, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ADD=true;
       showPublications(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showPublications(boolean b) {
        publication.setVisible(b);
        publication.setLocation(0, HEIGHT/4 +200);
        Home.setEnabled(!b);
    }
  
    private String[] GetPanelValues() {
        return new String[]{ID,Nam,Stat,Name.getText(),Rates.getText()};
    }
    private void PublicationdoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublicationdoneActionPerformed
     
    if(ADD)
    {
               DataBase db=new DataBase();
              db.connectToDB("media");
              db.insertGen("`id`, `name`, `publication`, `RateType`,`Rate`",DBValues.get(GetPanelValues()),"othernewspaprerate");
 
              db.DisconnectFromDB();
            
           
             rowcount++;
             setTable(ID, Stat);
             SetPanelNull();
             showPublications(false);

    }
    else
    {
               DataBase db=new DataBase();
              db.connectToDB("media");
              
              db.runQuerry("UPDATE `othernewspaprerate` SET `id`='"+ID+"',`name`='"+Nam+"',`publication`='"+Stat+"',`RateType`='"+Name.getText()+"',`Rate`='"+Rates.getText()+"' WHERE id='"+ID+"' And  RateType ='"+Tname+"'");
              
              db.DisconnectFromDB();
          
           
             
             setTable(ID,Stat);
             SetPanelNull();
             showPublications(false);

    }        
       
    }//GEN-LAST:event_PublicationdoneActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SetPanelNull();
        showPublications(false);
        ADD=false;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       News.setEnabled(true);
       News.showPublications(true);
       this.dispose();
       setVisible(false);
     
    }//GEN-LAST:event_closeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int index= Table.getSelectedRow();
        if (index != -1){
       ADD=false;
       showPublications(true);
       Tname=Table.getValueAt(index, 0).toString();
       Name.setText(Table.getValueAt(index, 0).toString());
       Rates.setText(Table.getValueAt(index, 1).toString());
       }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int index= Table.getSelectedRow();
        
       if (index != -1 ){
           
            DataBase db=new DataBase();
            db.connectToDB("media");
           
            db.runQuerry("DELETE FROM `othernewspaprerate` WHERE  id= '"+ID+"' And publication ='"+Stat+"' And RateType='"+Table.getValueAt(index, 0)+"'");
            db.DisconnectFromDB();
           
           removeRow(index);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Home.setVisible(true);
        this.setEnabled(false);
        Home.setEnabled(true);
        News.setEnabled(true);
        News.showPublications(true);
    }//GEN-LAST:event_formWindowClosed
   
     void SetPanelNull() {
           
            Name.setText("");
            Rates.setText("");
       }

    /**
     * @param args the command line arguments
     */
    
    public myTableModel tableSet() {
        myTableModel Temp = new myTableModel();
        Temp.addColumn("Name");
        Temp.addColumn("Rate");
       
        return Temp;

    }

    private void removeRow(int index) {
        tb.removeRow(index);
        Table.setModel(tb);
        rowcount--;
        tb.setRowCount(rowcount);
    }

    private int  GetDataSize(ResultSet rs)  {
        try {
            rs.last();
            int Datasize = rs.getRow();
            rs.beforeFirst();
            return Datasize;
        } catch (SQLException ex) {
            
         
        }
     return 0;
     
    }
    
    private void setTable(String Id,String Station) {
        
        DataBase dbObj = new DataBase();
        dbObj.connectToDB("media");
        
        ResultSet rs = dbObj.getData("select `Rate`,`RateType` from othernewspaprerate where id = '"+Id+"' And publication='"+Station+"'");
      
        try {
            int len=GetDataSize(rs);
            String [][]Ary1=new String[len][2];        
            
            for(int i=0;i<len;i++)
            {
             rs.next();
             
             Ary1[i][0]=rs.getString("RateType");
             Ary1[i][1]=rs.getString("Rate");
            
            }    
            
           String []Ary2= {"Name","Rate"};
            myTableModel Temp= new myTableModel(Ary1,Ary2);
            tb=Temp;
            Table.setModel(tb);
            rowcount=tb.getRowCount();
        } catch (SQLException ex) {
       
        }
        
        
        
        
        dbObj.DisconnectFromDB();
                
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JButton Publicationdone;
    private javax.swing.JTextField Rates;
    private javax.swing.JTable Table;
    private javax.swing.JButton close;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel publication;
    // End of variables declaration//GEN-END:variables
}