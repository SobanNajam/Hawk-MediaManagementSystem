
package hawkadvertisng;

public class DBValues {
    
   public static String get(javax.swing.JTextField[] textFields){
    String val="";
       
    for (javax.swing.JTextField x: textFields)
    {  val+="'"+x.getText()+"',";
      
    }   
    return val.substring(0, val.length()-1);
   }
   
   public static String get(String[] str){
    String val="";
       
    for (String x: str)
            val+="'"+x+"',";
   
   // //system.out.println(val.substring(0, val.length()-1));
    
   return val.substring(0, val.length()-1);
   }
   
    
}
