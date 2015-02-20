
package hawkadvertisng;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MainWindow extends javax.swing.JFrame {

    public javax.swing.JPanel jPanel1;
    
    public String User;
    public int  Type;
    public MainWindow(int Type,String Usr) {
       
        initComponents();
        new serverBitChecker(this).start();
        setDimensions();
          try{
            ImageIcon img = new ImageIcon("logo.png");
            this.setIconImage(img.getImage());
            }catch (Exception e){
             //system.out.println(e.getMessage());
            }
          
         ShowWindow(new HomePage(this));
         User=Usr;
         this.Type=Type;
    }

    
     public void HomePageB()
     {
       
     ShowWindow(new HomePage(this));
     
     }
     
     public void PrintPageB()
     {
      
      ShowWindow(new PrintPanel(this));   
     
     }        
     public void SettingPageB()
     {
      if(Type==1)
       {
        ShowWindow (new SettingAdmin(this));
       }
      else
      {
        ShowWindow(new SettingsNormal(this, User));       
      }   
     }  
     
     
     public void ProfilePageB()
     {
     ShowWindow(new Profile(this));
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HAWK MEDIA");
        setResizable(false);
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

            
   
    
  
    public void ShowPanel()
    {
      getContentPane().add(jPanel1);
      jPanel1.setBounds(0,0, 1024, 740);
      jPanel1.setVisible(true);
     
     
    }   
    
    public void Remove()
    {
      if(jPanel1!=null)
        {
         getContentPane().remove(jPanel1);
        }
        
    }        
            
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

   
    public void ShowWindow(JPanel obj ) {
        Remove();
        jPanel1=null;
        jPanel1= obj;
        ShowPanel();
    }
    private void setDimensions() {
        Dimension d= new Dimension(1024,768);
        this.setResizable(false);
        this.setMinimumSize(d);
        this.setMaximumSize(d);
        this.setPreferredSize(d);
    }
}
