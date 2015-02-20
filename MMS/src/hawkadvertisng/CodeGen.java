
package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CodeGen {
    
  DataBase Datab;
  ResultSet rs;
  
  public CodeGen()
  {
    Datab=new DataBase();
    Datab.connectToDB("media");
    }        
  
  public String Getaddress(String Colum)
  {
      try {
          rs=Datab.getData("SELECT  `"+Colum+"` FROM  `codegen` ");
          rs.next();
          
          return    rs.getString(Colum);
          } catch (SQLException ex) {
          Logger.getLogger(CodeGen.class.getName()).log(Level.SEVERE, null, ex);
      }
    return "";  
  }
  
  public void SaveAddress(String Colum,String cod)
  {
    
    
    Datab.runQuerry("UPDATE `codegen` SET "+Colum+"='"+cod+"';");
    Datab.DisconnectFromDB();
  }
  
  public String GetCode(String Colum)
  {
      try {
          rs=Datab.getData("SELECT  `"+Colum+"` FROM  `codegen` ");
          rs.next();
          
          return    rs.getString(Colum);
          } catch (SQLException ex) {
          Logger.getLogger(CodeGen.class.getName()).log(Level.SEVERE, null, ex);
      }
    return "";  
  }        
  
  public void SaveCode(String Colum)
  {
    
    String cod=GetCode(Colum);
    
    cod=cod.substring(0, 1).concat(Integer.toString(Integer.parseInt(cod.substring(1))+1));
    
    Datab.runQuerry("UPDATE `codegen` SET "+Colum+"='"+cod+"';");
    Datab.DisconnectFromDB();
  }
  
  
  public void SaveNo(String Colum)
  {
    
    String cod=GetCode(Colum);
    cod=Integer.toString(Integer.parseInt(cod)+1);
    
    Datab.runQuerry("UPDATE `codegen` SET "+Colum+"="+cod+";");
    Datab.DisconnectFromDB();  
  }
  
}
