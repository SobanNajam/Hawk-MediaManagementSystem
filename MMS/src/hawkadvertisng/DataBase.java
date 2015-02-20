package hawkadvertisng;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DataBase {

public Connection connection;
    private String fileName = "ip.txt";
	

public void displaySQLErrors(SQLException e)
			{
			JOptionPane.showMessageDialog(null,"SQL state: " + e.getSQLState());
			JOptionPane.showMessageDialog(null,e.getMessage());
			}
public void connectToDB(String dbname){
        
	
        try {
            connectToIP(fileName, dbname,500);
            }
	catch(SQLException e){
             displaySQLErrors(e);
           int a = JOptionPane.showConfirmDialog(null, "Server Down Click ok to switch server!","Confirmation Message",JOptionPane.OK_CANCEL_OPTION);
           if(a==2)
               return;
            //this.displaySQLErrors(e);
           // JOptionPane.showMessageDialog(null, "Cannot connect to server!", "Error", JOptionPane.ERROR_MESSAGE);
            this.changeIP();
            enableServerBit();
          //  updateKeygen();
            connectToDB(dbname);
        }
        
       
    }

public void updateKeygen() {
        try {
            Scanner in = new Scanner(new FileReader("keygen"));
            String key = in.next();
            String querry ="UPDATE codegen SET rcpt_no =  \""+key+"\" WHERE srNo = 1 and STRCMP(\""+key+"\",rcpt_no)=1";
            connectToIP("ip.txt", "media",300);
            connection.createStatement().execute(querry);
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
        //System.out.println(iOException.getMessage());
        iOException.getStackTrace();
    }
}

public void enableServerBit() {
    try {
        connectToIP(fileName,"media",300);
        runQuerry("update codegen set serverBit = 0");
        DisconnectFromDB();
        } catch (Exception ex) {
           
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

public void connectToIP( String fileName, String dbname,int time) throws SQLException {
       Scanner in2 = null;  
       FileReader x =null;
        try {
            x = new FileReader(fileName);
            in2 = new Scanner(x);
            
            } catch (FileNotFoundException ex) {
             
                JOptionPane.showMessageDialog(null, ex.getMessage());
                
             in2.close();
            }
        //System.out.println("jdbc:mysql://"+in2.next()+"/"+dbname+"?user="+in2.next()+"&password=");
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
            this.displaySQLErrors(e);
            throw e;
        }
        in2.close();
    }


public boolean runQuerry(String querry) {
    try {
        Statement statement1 = connection.createStatement();
	statement1.executeUpdate(querry);
       // System.out.println("\nsuccessfull in insering or updating to db\n"+querry+"\n");
        statement1.close();
        return true;
    }
    catch(SQLException e)
        {
        displaySQLErrors(e);
     //   System.out.println("\nunsuccessfull in inserting to db\n");
	return false;
        }
}

public boolean deletefuction(String querry)
{
	try{
		Statement s = connection.createStatement();
		s.executeUpdate(querry);
                return true;
            }
	catch(SQLException e)
            {
               // System.out.println(e.getMessage());
                //displaySQLErrors(e);
                return false;
            }


}


public void insertGen(String fields,String values ,String TColum)        
{
   String Query="INSERT INTO `"+TColum+"`("+fields+") VALUES ("+values+")";
  // System.out.println(Query);
   runQuerry(Query);
}


public void DisconnectFromDB()
    {
     try{
        connection.close();
        }
     catch(SQLException e)
        {displaySQLErrors(e);}
    }

public ResultSet getData(String querry)
{
        ResultSet rs = null;
        
        try
        {
            rs=connection.createStatement().executeQuery(querry);
              
        }
        catch (SQLException ex)
        {
           // System.out.println("\n\nERROR\n\n");
            displaySQLErrors(ex);
            //System.out.println(ex.getMessage());
            //ex.getMessage();
        }
    
    
        return rs;
}

public void AddProfile(String Str_Array[] ,String TColum)        
{
   String Query="INSERT INTO `"+TColum+"`(`id`, `name`, `adr1`, `adr2`, `ph`, `fax`, `mobile`, `email`) VALUES (";
   
   for(int i=0;i<Str_Array.length;i++)
   {
    Query=Query.concat(" '"+Str_Array[i]+"',");
   } 
   Query=Query.substring(0, Query.length()-1).concat(")");
   runQuerry(Query);
}        

public void EditProfile(String Str_Array[] ,String TColum)        
{
   int i=1;
    String Query="UPDATE `"+TColum+"` SET ";
   
   
   String[] Temp={ "`name`","`adr1`","`adr2`","`ph`","`fax`","`mobile`","`email`"
               };     
   for(;i<Str_Array.length -1 ;i++)
   {
    Query=Query.concat(Temp[i-1]+" = '"+Str_Array[i]+"' ,");
   } 
   Query=Query.concat(Temp[i-1]+" = '"+Str_Array[i]+"'");
   
   Query=Query.concat(" Where `id` = '"+ Str_Array[0]+"'");
   runQuerry(Query);

}        

public void EditProfileNews(String Str_Array[] ,String TColum)        
{
   int i=1;
    String Query="UPDATE `"+TColum+"` SET ";
   
   
   String[] Temp={ "`name`","`ph`","`fax`","`mobile`","`email`"};     
   for(;i<Str_Array.length -1 ;i++)
   {
    Query=Query.concat(Temp[i-1]+" = '"+Str_Array[i]+"' ,");
   } 
   Query=Query.concat(Temp[i-1]+" = '"+Str_Array[i]+"'");
   
   Query=Query.concat(" Where `id` = '"+ Str_Array[0]+"'");
   runQuerry(Query);

}        

public void DeleteProfile(String Id ,String TColum)        
{
    String Query="DELETE FROM `"+TColum+"` WHERE `id`='"+Id +"'";
   // System.out.println(Query+"Delete profile function");
   
   runQuerry(Query);

}
public void DoneFun(int click,String Str_Array[] ,String TColum )
{
  
  if(click==1)
  {
    AddProfile(Str_Array, TColum);  
  }
  else if(click==2)
  {
    EditProfile(Str_Array, TColum);
  }    
  else if(click ==3)
  {
      
    DeleteProfile(Str_Array[0],TColum);
  }    
    
}   

}

