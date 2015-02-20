
package hawkadvertisng;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class serverBitChecker extends Thread{
  
    DataBase obj;
    Connection connection;
    MainWindow master;
    serverBitChecker(MainWindow master){
        obj = new DataBase();
        this.master = master;
     }
    
    
   @Override
   public void run ()
               {
                   while (true) {                       
                       try {
                           try {
                               checkServerBit();
                           } catch (IOException ex) {
                               Logger.getLogger(serverBitChecker.class.getName()).log(Level.SEVERE, null, ex);
                           }
                           ////system.out.println("running");
                           sleep(10000);
                       } catch (InterruptedException ex) {
                       }
                   }
                   
               }

    private void checkServerBit() throws InterruptedException, IOException {
        
        try {
           
            try{ connectToIP("ipServer.txt","media",300);
                }catch(myOwnException e){return;}
            ResultSet rs = getData("select * from codegen");
                rs.next();
               
             
                if (rs.getInt("serverBit") == 1)
                    {
                        changeIP();
                        //updateKeygen();
                         enableServerBit();
                         master.dispose();
                         new login().setVisible(true);
                         rs.close();
                         disconnectFromDB();
                         sleep(5000);
                         this.stop();
                  
                 }
                
                
           
            } catch (SQLException ex) {
            //javax.swing.JOptionPane.showMessageDialog(null, "Error in ServerBit "+ex.getMessage());
            }
    }
    
public void connectToIP( String fileName, String dbname,int time) throws SQLException,IOException, myOwnException {
       
       Scanner in2 = null; 
       File f = new File(fileName);
        if(f.exists()) { 
         
            FileReader x =null;
        try {
            x = new FileReader(fileName);
            
                in2 = new Scanner(x);
            } catch (FileNotFoundException ex) {
               
             in2.close();
            }
        ////system.out.println("jdbc:mysql://"+in2.next()+"/"+dbname+"?user="+in2.next()+"&password=");
        String host= in2.next();
        String user= in2.next();
        String pass=null;
        try{
        pass= in2.next();
        String url = "jdbc:mysql://"+host+"/"+dbname+"?connectTimeout="+time;
        if (!pass.matches("no"))
            connection = DriverManager.getConnection(url,user,pass);
        else
            connection =DriverManager.getConnection(url,user,"");
        
        
        }catch(SQLException e){
        throw e;
        }
        in2.close();
        }
        else 
            throw new myOwnException();
    }

    public ResultSet getData(String querry){
        ResultSet rs = null;
        
        try
        {
            rs=connection.createStatement().executeQuery(querry);
        }
        catch (Exception ex)
        {
            ////system.out.println(ex.getMessage());
            //ex.getMessage();
        }
    
    
        return rs;
}

    public void disconnectFromDB(){
     try{
        connection.close();
        }
     catch(SQLException e)
        {}
    }
void updateKeygen() {
        try {
            Scanner in = new Scanner(new FileReader("codegen"));
            String key = in.next();
            String querry ="UPDATE codegen SET rcpt_no =  \""+key+"\" WHERE srNo = 1 and STRCMP(\""+key+"\",rcpt_no)=1";
            connectToIP("ip.txt", "media",300);
            connection.createStatement().execute(querry);
            
        
        } catch (Exception ex) {
            }
    
    
    
    }

 public void enableServerBit() {
    try {
        connectToIP("ip.txt","media",300);
        connection.createStatement().execute("update codegen set serverBit = 0");
        
    
            } catch (Exception ex) {
                
          }
    }
 public static void changeIP() {
        File outFile;
        BufferedWriter writer;
       try {
            String[] ipNew = getDataFromFile("ip2.txt");
            String[] ipOld = getDataFromFile("ip.txt");
            
            outFile = new File("ip2.txt");
            writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(ipOld[0]+" "+ipOld[1]+" "+ipOld[2]);
            writer.close();
            
            outFile = new File("ip.txt");
            writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(ipNew[0]+" "+ipNew[1]+" "+ipNew[2]);
            writer.close();
            
            outFile = new File("ipServer.txt");
            writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(ipNew[0]+" "+ipNew[1]+" "+ipNew[2]);
            writer.close();
            
    } catch (IOException iOException) {
        
        //system.out.println("error change ip");
        //system.out.println(iOException.getMessage());
        iOException.getStackTrace();
    }
}
private static String[] getDataFromFile(String fileName){
    Scanner in=null;    
    try {
        in = new Scanner(new FileReader(fileName));
        return new String[]{in.next(),in.next(),in.next()};        

    } catch (FileNotFoundException ex) {
        return null;
    }
    
    
    }

}


