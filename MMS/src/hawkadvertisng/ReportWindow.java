
package hawkadvertisng;

import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import printer_package.Print;


public class ReportWindow extends javax.swing.JFrame {
    
     DataBase db=new DataBase ();
    MainWindow parent;
    ResultSet rs;
    
    String query;
    String[] heading;
    Object[][] records;
    int columnSelected=0;
    private double sumArray[] = new double[]{0,0};
    private int counter = 0; //for indicating the index of sum in sumArray
    private final String deductQuery;
    
   
      public ReportWindow(String q,String rprtnm,String dtl,String Deduct,MainWindow p) {
        initComponents();
         try{
            ImageIcon img = new ImageIcon("logo.png");
            this.setIconImage(img.getImage());
            }catch (Exception e){
             //system.out.println(e.getMessage());
            }
         
        setVisible(true);
        reportname.setText(rprtnm);
        detail.setText(dtl);
        
        parent=p;
        query=q;
        deductQuery=Deduct;
        
        
        serviceQuery(query);
        rs=db.getData(query);
        SetDeduction(Deduct);
    }
     private void serviceQuery(String queryArg)
    {
        
        
        try
        {
            db.connectToDB("media");
            rs=db.getData(queryArg);
            
            int queryWidth=rs.getMetaData().getColumnCount();//get no/ of colums of query
            int depth=setDataSize(rs);//get no. of rows of query
            if(depth == 0 ){
            dispose();
            processWindowEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING) );
            JOptionPane.showMessageDialog(null, "No records Found for the selected report", "Report Generation", JOptionPane.ERROR_MESSAGE);
            }
            
            heading=new String[queryWidth];
            records=new Object[depth][queryWidth];
            
            rs.next();
            
            //loop for setting headings of table based on query's colums
            for (int i=1;i<=queryWidth;i++)
                {
                    heading[i-1]=rs.getMetaData().getColumnName(i);
                    list.addItem(heading[i-1]);
                }
            
            
            //loop for setting rows of table based on query's rows
            for(int i=0;i<depth;i++,rs.next())
            {
                for(int j=1;j<=queryWidth;j++)
                {
                    records[i][j-1]=rs.getString(j);
                   
                    
                }
            }
            
            //set the table on display
            myTableModel tb=new myTableModel(records,heading);
            displayTable.setModel(tb);
            
           db.DisconnectFromDB();
           
        
        TotalAmount.setText(calcColumn(4));
        mbilltotal.setText(calcColumn(8));
        commision.setText( String.format("%.2f",sumArray[0]-sumArray[1]));
        }
        catch(SQLException e)
        {
          // System.out.println(queryArg);
           //System.out.println( e.getMessage());
           db.displaySQLErrors(e);
        }
        
    }
    
      private void serviceQuery2(String queryArg)
    {
        
        
        try
        {
            db.connectToDB("media");
            rs=db.getData(queryArg);
            
            int queryWidth=rs.getMetaData().getColumnCount();//get no/ of colums of query
            int depth=setDataSize(rs);//get no. of rows of query
            
            
            heading=new String[queryWidth];
            records=new Object[depth][queryWidth];
            
            rs.next();
            
            //loop for setting headings of table based on query's colums
            for (int i=1;i<=queryWidth;i++)
                {
                    heading[i-1]=rs.getMetaData().getColumnName(i);
                    list.addItem(heading[i-1]);
                }
            
            
            //loop for setting rows of table based on query's rows
            for(int i=0;i<depth;i++,rs.next())
            {
                for(int j=1;j<=queryWidth;j++)
                {
                    records[i][j-1]=rs.getString(j);
                   
                    
                }
            }
            
            //set the table on display
            myTableModel tb=new myTableModel(records,heading);
            displayTable.setModel(tb);
            
           db.DisconnectFromDB();
           
        if(depth == 0 ){
       
        TotalAmount.setText("0.00");
        mbilltotal.setText("0.00");
        commision.setText( "0.00");
        
        }
        else{
        TotalAmount.setText(calcColumn(4));
        mbilltotal.setText(calcColumn(8));
        commision.setText( String.format("%.2f",sumArray[0]-sumArray[1]));
        
        
        
        }
        }
        catch(SQLException e)
        {
         //  System.out.println(queryArg);
          // System.out.println( e.getMessage());
           db.displaySQLErrors(e);
        }
        
    }
    
     
    private int setDataSize(ResultSet rs)  {
        int DataSize=0;
        try {
            rs.last();
            DataSize = rs.getRow();
            rs.beforeFirst();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return DataSize;
    }
  
    
       public String calcColumn(int index) {
        double sum = 0;
        
        for (int i = 0; i < records.length; i++) {
            sum += Double.parseDouble(records[i][index].toString());
            
        }
        sumArray[counter++]=sum;
        return String.format("%.2f", sum);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        list = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        searcbBar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        TotalAmount = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        mbilltotal = new javax.swing.JLabel();
        amountLabel1 = new javax.swing.JLabel();
        amountLabel2 = new javax.swing.JLabel();
        commision = new javax.swing.JLabel();
        amountLabel3 = new javax.swing.JLabel();
        deduct = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        reportname = new javax.swing.JLabel();
        detail = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(null);

        getContentPane().add(list);
        list.setBounds(100, 90, 120, 20);

        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(displayTable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 150, 790, 430);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hawk Advertising");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 10, 240, 30);

        date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Date");
        getContentPane().add(date);
        date.setBounds(290, 70, 210, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Option");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 60, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 60, 20);

        searcbBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searcbBarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searcbBarKeyTyped(evt);
            }
        });
        getContentPane().add(searcbBar);
        searcbBar.setBounds(100, 120, 500, 20);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(null);

        TotalAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TotalAmount.setText("0.00");
        jPanel1.add(TotalAmount);
        TotalAmount.setBounds(630, 590, 120, 30);

        amountLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        amountLabel.setText("Total Bill Amount");
        jPanel1.add(amountLabel);
        amountLabel.setBounds(470, 590, 150, 30);

        mbilltotal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mbilltotal.setText("0.00");
        jPanel1.add(mbilltotal);
        mbilltotal.setBounds(630, 620, 120, 30);

        amountLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        amountLabel1.setText("Media Bill Amount");
        jPanel1.add(amountLabel1);
        amountLabel1.setBounds(470, 620, 150, 30);

        amountLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        amountLabel2.setText("Commision");
        jPanel1.add(amountLabel2);
        amountLabel2.setBounds(470, 650, 150, 30);

        commision.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        commision.setText("0.00");
        jPanel1.add(commision);
        commision.setBounds(630, 650, 120, 30);

        amountLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        amountLabel3.setText("Total Deduction:");
        jPanel1.add(amountLabel3);
        amountLabel3.setBounds(470, 680, 150, 30);

        deduct.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deduct.setText("0.00");
        jPanel1.add(deduct);
        deduct.setBounds(630, 680, 120, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Print");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 600, 100, 23);

        reportname.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        reportname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportname.setText("REPORT NAME");
        jPanel1.add(reportname);
        reportname.setBounds(90, 40, 620, 30);

        detail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        detail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detail.setText("detail");
        jPanel1.add(detail);
        detail.setBounds(120, 90, 550, 20);

        refresh.setText("Refresh table");
        refresh.setOpaque(false);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh);
        refresh.setBounds(620, 110, 121, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String[] details = new String[12];
        details[0] = jLabel1.getText();
        details[1] = reportname.getText();
        details[2] = date.getText();
        details[3] = detail.getText();
        details[4] = amountLabel.getText();
        details[5] = TotalAmount.getText();
        details[6] = amountLabel1.getText();
        details[7] = mbilltotal.getText();
        details[8] = amountLabel2.getText();
        details[9] = commision.getText();
        details[10] = amountLabel3.getText();       
        details[11] = deduct.getText();
                
        new Print(records,heading,details);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searcbBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searcbBarKeyReleased
        String q,ddq;
        if (query.contains("where")) {
            q= query+ " and r.`"+list.getSelectedItem().toString()+"` like '%"+searcbBar.getText()+"%'";
             ddq =deductQuery.substring(0, deductQuery.length()-1)+ " and r.`"+list.getSelectedItem().toString()+"` like '%"+searcbBar.getText()+"%')";
           
        }
        else {
            q= query+ " where `"+list.getSelectedItem().toString()+"` like '%"+searcbBar.getText()+"%'";
            ddq = deductQuery.substring(0, deductQuery.length()-1)+ " where `"+list.getSelectedItem().toString()+"` like '%"+searcbBar.getText()+"%')";
            
        }
        counter=0;
        serviceQuery2(q);
        SetDeduction(ddq);
    }//GEN-LAST:event_searcbBarKeyReleased

    private void searcbBarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searcbBarKeyTyped

    }//GEN-LAST:event_searcbBarKeyTyped

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        serviceQuery(query);
        SetDeduction(deductQuery);
    }//GEN-LAST:event_refreshActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalAmount;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel amountLabel1;
    private javax.swing.JLabel amountLabel2;
    private javax.swing.JLabel amountLabel3;
    private javax.swing.JLabel commision;
    private javax.swing.JLabel date;
    private javax.swing.JLabel deduct;
    private javax.swing.JLabel detail;
    private javax.swing.JTable displayTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox list;
    private javax.swing.JLabel mbilltotal;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel reportname;
    private javax.swing.JTextField searcbBar;
    // End of variables declaration//GEN-END:variables

    private void SetDeduction(String Deduct) {
        deduct.setText("0");
        try
        {
            db.connectToDB("media");
            rs=db.getData(Deduct);
            rs.next();
            deduct.setText(rs.getString(1));
            
            rs=db.getData("select sysdate()");
            rs.next();
            date.setText(rs.getString(1));
            
            
            db.DisconnectFromDB();
        }catch(Exception e){
             
        }
    }
}
