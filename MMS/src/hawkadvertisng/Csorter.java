package hawkadvertisng;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public final class Csorter {

    Object[][] records;
    ResultSet rs;
    int Datasize;
    Object[] headers;
    JTable myTable;
    int[] req_index;
    int[] index;
    public int count;
    boolean isUpdate=false;
    myTableModel k;
    DefaultTableModel tableModel ;

    public Csorter(){}

  public Csorter(ResultSet rs,Object[] headers,JTable myTable, int[] req_index,int[] index) throws SQLException
  {
   init(req_index, headers, myTable, index, rs);
  }

  public Csorter(ResultSet rs,Object[] headers,JTable myTable, int[] req_index,int[] index,boolean update) throws SQLException
  {
     isUpdate = true;
     init(req_index, headers, myTable, index, rs);
  }
  public Csorter(Object[] headers,JTable myTable,Object[][] r) throws SQLException
  {
     init( headers, myTable,r);

  }
    public String calcColumn(int index) {
        double sum = 0;
        for (int i = 0; i < records.length; i++) {
            sum += Double.parseDouble(records[i][index].toString());
        }



        return String.valueOf(sum);
}


  public void updateTable()
  {
      
      k=new myTableModel(records, headers);
      myTable.setModel(k);

  }
  public void setAndUpdateTable(Object[][] records,Object[] headers)
  {
      k = new myTableModel(records, headers);
      myTable.setModel(k);
  }
  public void updateTable(DefaultTableModel model)
  {
      myTable.setModel(model);
  }
 public myTableModel getModel(){
    return k;
 }

  public void setTable(JTable table)
  {
      this.myTable = table;

  }

  public void textSearch(String val, int col)
  {
      DefaultTableModel model= new DefaultTableModel();
      model.setColumnCount(count);
      model.setRowCount(0);
      model.setColumnIdentifiers(headers);

      for(int i=0; i<Datasize; i++)
      {
          if(records[i][col].toString().toUpperCase().contains(val.toUpperCase()))
          {
              model.addRow(records[i]);
          }
      }

      updateTable(model);
  }

  public void setHeaders(Object[] headers)
  {
        this.headers=headers;
  }

  public void setResultSet(ResultSet rs) throws SQLException
  {
        this.rs=rs;
        ResultSetMetaData rsmd = rs.getMetaData();

        try
        {
            Datasize=0;

            int d=0;


            //rs.next();
            while(rs.next())
            {
                //int k=0;
               for (int j = 1 ; j<=rsmd.getColumnCount();j++)
               {
                   if (req_index[j-1]!=0)
                   {
                       records[d][index[j-1]]=rs.getString(j);

                   }
               }
               d++;
               Datasize++;
            }

        }
        catch (SQLException ex) {
            //system.out.println(ex.getMessage());
        }


  }
public void setResultSetUpdate(ResultSet rs) throws SQLException
  {
        this.rs=rs;
        ResultSetMetaData rsmd = rs.getMetaData();

        try
        {
            Datasize=0;

            int d=0;


            //rs.next();
            while(rs.next())
            {
                //int k=0;
               for (int j = 1 ; j<=rsmd.getColumnCount();j++)
               {
                   if(j-1 == 0 )
                   {
                      records[d][0] = String.valueOf(d+1);
                   }
                   else if (req_index[j-1]!=0)
                   {
                       records[d][index[j-1]]=rs.getString(j);
                   }
               }
               d++;
               Datasize++;
            }

        }
        catch (SQLException ex) {
            //system.out.println(ex.getMessage());
        }


  }
  public int getDtSize()
  {
        return Datasize;
  }


  public void sortString(int index, int low, int high)
    {
    int i = low, j = high;

    String pivot = records[low + (high-low)/2][index].toString();
    pivot=pivot.toLowerCase();

    while (i <= j) {

      while(pivot.compareTo(records[i][index].toString().toLowerCase())>0)
      //while (Integer.parseInt(records[i][index].toString()) < pivot)
      {
        i++;
      }

      while(pivot.compareTo(records[j][index].toString().toLowerCase())<0)
      //while (Integer.parseInt(records[j][index].toString()) > pivot)
      {
        j--;
      }

      if (i <= j) {
        swap(index,i, j);
        i++;
        j--;
      }
    }

    if (low < j)
      sortString(index,low, j);
    if (i < high)
      sortString(index,i, high);


  }
  public void sortDate(int index, int low, int high)
    {

    try{
        int i = low, j = high;

    SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
    Date pivot= sdf.parse(records[low + (high-low)/2][index].toString());
   


    while (i <= j) {

      while(pivot.compareTo(sdf.parse(records[i][index].toString())) >0)
      //while (Integer.parseInt(records[i][index].toString()) < pivot)
      {
        i++;

      }

      while(pivot.compareTo(sdf.parse(records[j][index].toString())) <0)
      //while (Integer.parseInt(records[j][index].toString()) > pivot)
      {
        j--;
      }

      if (i <= j) {
        swap(index,i, j);
        i++;
        j--;
      }
    }

    if (low < j)
      sortDate(index,low, j);
    if (i < high)
      sortDate(index,i, high);
    }
    catch (Exception e)
        {
         JOptionPane.showMessageDialog(null,e.getMessage());
        }

  }

  public void sortInt(int index, int low, int high) {
    int i = low, j = high;

    int pivot = Integer.parseInt(records[low + (high-low)/2][index].toString());
    while (i <= j) {

      while (Integer.parseInt(records[i][index].toString()) < pivot && i<=j)
            {
            // //system.out.println(records[i][index].toString() + " " + i + " " +pivot);
             i++;
            }

      while (Integer.parseInt(records[j][index].toString()) > pivot && j>=i)
      {
          ////system.out.println(records[j][index].toString() + " " + j + " " +pivot);

        j--;
      }

      if (i <= j) 
      {swap(index,i, j);
        i++;
        j--;
      }
    }

    if (low < j)
      sortInt(index,low, j);
    if (i < high)
      sortInt(index,i, high);

  }
  
public void sortDouble(int index, int low, int high) {
    int i = low, j = high;

    double pivot = Double.parseDouble(records[low + (high-low)/2][index].toString());
    while (i <= j) {

      while (Double.parseDouble(records[i][index].toString()) < pivot )
            {
             i++;
            }

      while (Double.parseDouble(records[j][index].toString()) > pivot)
        {
        j--;
        }

      if (i <= j) {
        swap(index,i, j);
        i++;
        j--;
      }
    }

    if (low < j)
      sortDouble(index,low, j);
    if (i < high)
      sortDouble(index,i, high);
  }

    private void swap(int index,int y,int z)
    {

        Object[] r = new Object[count];

        for(int i=0; i<count;i++)
        {
        r[i]= records[y][i];
        }


        for(int i=0; i<count;i++)
        {
        records[y][i]=records[z][i];
        }

        for(int i=0; i<count;i++)
        {
        records[z][i]=r[i];
        }
    }

    private void setDataSize(ResultSet rs)  {
        try {
            rs.last();
            Datasize = rs.getRow();
            rs.beforeFirst();
        } catch (SQLException ex) {
            
            Logger.getLogger(Csorter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    
    public void init(int[] req_index, Object[] headers, JTable myTable, int[] index, ResultSet rs) throws SQLException {
        count=0;
        //JOptionPane.showMessageDialog(null, "req_index.length = "+req_index.length);

        for (int i=0; i<req_index.length;i++)
            {
            if (req_index[i] == 1)
                count++;
            }
          ///JOptionPane.showMessageDialog(null, "count = "+count);
         setDataSize(rs);

        this.req_index=req_index;
        this.records = null;
        this.records=  new Object[Datasize][count];
        this.headers=headers;
        this.myTable=myTable;
        this.index=index;

        if(isUpdate)
            setResultSetUpdate(rs);
        else
            this.setResultSet(rs);

    }
    public void init( Object[] headers, JTable myTable, Object[][] r) throws SQLException {

        this.records = null;
        this.records=  r;
        this.headers=headers;
        this.Datasize = r.length;
        count=5;
        setTable(myTable);
        this.setAndUpdateTable(records, headers);

    }

}
