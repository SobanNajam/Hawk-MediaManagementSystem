package printer_package;

import java.awt.Desktop;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.*;
import jxl.write.*;
import hawkadvertisng.CodeGen;
import hawkadvertisng.DataBase;
import java.sql.ResultSet;
import jxl.format.UnderlineStyle;

public class Print {
    
   public   Print(Object[] arr,Object[][] arr2,int selection){
        if (selection == 1){bill_newspaper(arr,arr2);}
        else if (selection == 2){bill_electronic(arr,arr2);}
        else if (selection == 3){ro_electronic(arr,arr2);}
        else if (selection == 4){ro_newspaper(arr,arr2);}
        else if (selection == 5){ro_newspaperNR(arr,arr2);}
        else if (selection == 6){ro_electronicNR(arr,arr2);}
    }
    
   public   Print(Object[] arr,Object[][] arr2,Object[] arr3,int selection){
        if (selection == 1){bill_newspaperTAX(arr,arr2,arr3);}
        else if (selection == 2){bill_electronicTAX(arr,arr2,arr3);}        
    }
   
   public   Print(Object[][] arr,String[] arr2,String[] arr3 ){
       report(arr,arr2,arr3);
   
   }

    public static void bill_electronic(Object[] arr,Object[][] arr2){
        // TODO code application logic here
   
    try {     
            
            //<editor-fold defaultstate="collapsed" desc="Setup Workbook">
        Workbook book1 =  Workbook.getWorkbook(new File("Bill_Electronic.xls"));
        WritableWorkbook book2,book3;
        book2 = Workbook.createWorkbook(new File("Bill_Electronic - output.xls"),book1);
        WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
        //</editor-fold>
        
            //<editor-fold defaultstate="collapsed" desc="Sheet Set">
            //<editor-fold defaultstate="collapsed" desc="Header Setting">
        
        //<editor-fold defaultstate="collapsed" desc="Fonts and Formatting">
        WritableCellFormat cellFormat = new WritableCellFormat();
        WritableCellFormat cellFormat3 = new WritableCellFormat();
        cellFormat.setWrap(true);
        WritableFont cellFont = new WritableFont(WritableFont.createFont("Calibri"),13);
        cellFont.setBoldStyle(WritableFont.BOLD);
        cellFormat.setAlignment(jxl.format.Alignment.RIGHT);
        cellFormat3.setAlignment(jxl.format.Alignment.LEFT);
        cellFormat3.setVerticalAlignment(jxl.format.VerticalAlignment.TOP);
        cellFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
        cellFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
        cellFormat.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
        WritableFont cellFontz = new WritableFont(WritableFont.createFont("Calibri"),11);
        cellFontz.setBoldStyle(WritableFont.BOLD);
        WritableCellFormat cellFormatsmallr = new WritableCellFormat(cellFontz);
        cellFormatsmallr.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormatz = new WritableCellFormat(cellFont);
        cellFormatz.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormatzz = new WritableCellFormat();
        cellFormatzz.setAlignment(jxl.format.Alignment.LEFT);
        WritableFont cellFont3 = new WritableFont(WritableFont.createFont("Calibri"),13);
        cellFont3.setBoldStyle(WritableFont.BOLD);
        WritableCellFormat zx = new WritableCellFormat(cellFont3);
        zx.setAlignment(jxl.format.Alignment.LEFT);
        zx.setBorder(jxl.format.Border.TOP, jxl.format.BorderLineStyle.THIN);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Header Population">
        int a=0;
        double b=0;
        
        String str = String.valueOf(arr[6].toString());
        b = Double.parseDouble(str);
        a = (int)b;
        System.out.println("value of a "+a);
        
        Label label = new Label(10, 7,arr[0].toString());
        sheet1.addCell(label);
        
        label = new Label(10, 8,arr[1].toString());
        sheet1.addCell(label);
        
        label = new Label(1, 7,arr[2].toString(),cellFormat3);
        sheet1.addCell(label);
        
        label = new Label(2, 12,arr[3].toString());
        sheet1.addCell(label);
     
        label = new Label(1, 6,arr[5].toString(),zx);
        sheet1.addCell(label);
        
        label = new Label(3, 13,arr[4].toString());
        sheet1.addCell(label);
        
        label = new Label(3, 14,"");//caption not provided, not available
        sheet1.addCell(label);
        
        int typerow=23;
        DataBase db=new DataBase();
        db.connectToDB("media");
        ResultSet rsx = db.getData("SELECT `deduction`  FROM  `ecbill` WHERE billNo = "+Integer.parseInt(arr[0].toString()));
        rsx.next();
        
        int deduction = 0,amount = 0;
        deduction =(int) Double.parseDouble(rsx.getString("deduction"));
        db.DisconnectFromDB();         
        amount = a - deduction;
        
        label = new Label(10, typerow,"Total :",cellFormatsmallr);
        sheet1.addCell(label);
        label = new Label(11, typerow,String.valueOf(a),cellFormatsmallr);
        sheet1.addCell(label);
        typerow++;
        
        label = new Label(11, typerow,String.valueOf((int)deduction),cellFormatsmallr);
        sheet1.addCell(label);
        label = new Label(10, typerow,"Deduction:",cellFormatsmallr);
        sheet1.addCell(label);
        typerow++;
        
        label = new Label(11, typerow,"Net Amount (Rs.) :"+String.valueOf(amount),cellFormatz);
        sheet1.addCell(label);
        
        label = new Label(1,typerow,"Rupees ("+maker(amount)+" Only)",cellFormatzz);
        sheet1.addCell(label);
        //</editor-fold>
                
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Row Calculation & Insertion">        

            int num = arr2.length;
              //<editor-fold defaultstate="collapsed" desc="set Cell Formater Array">
            jxl.format.CellFormat lastRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,21).getCellFormat(),
            sheet1.getCell(2,21).getCellFormat(),sheet1.getCell(3,21).getCellFormat(),
            sheet1.getCell(4,21).getCellFormat(),sheet1.getCell(5,21).getCellFormat(),
            sheet1.getCell(6,21).getCellFormat(),sheet1.getCell(7,21).getCellFormat(),
            sheet1.getCell(8,21).getCellFormat(),sheet1.getCell(9,21).getCellFormat(),
            sheet1.getCell(10,21).getCellFormat(),sheet1.getCell(11,21).getCellFormat(),
            sheet1.getCell(12,21).getCellFormat()
            };
            
            jxl.format.CellFormat MiddleRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,20).getCellFormat(),
            sheet1.getCell(2,20).getCellFormat(),sheet1.getCell(3,20).getCellFormat(),
            sheet1.getCell(4,20).getCellFormat(),sheet1.getCell(5,20).getCellFormat(),
            sheet1.getCell(6,20).getCellFormat(),sheet1.getCell(7,20).getCellFormat(),
            sheet1.getCell(8,20).getCellFormat(),sheet1.getCell(9,20).getCellFormat(),
            sheet1.getCell(10,20).getCellFormat(),sheet1.getCell(11,20).getCellFormat(),
            sheet1.getCell(12,20).getCellFormat()
            };
            
            
            //</editor-fold>
               
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="data rows">
            int col[] = {1,4,6,7,8,9,10,11,3}, row = 20,tempRow=20;
            String extra[],extra2[];
            sheet1.removeRow(20);
            
            for (int i = 0; i < arr2.length ; i++) {
                for (int j = 0; j < arr2[0].length ; j++) {
                    
                    if (j != 2 || j != 3) {
                        label = new Label(col[j], row, String.valueOf(arr2[i][j]), MiddleRow[col[j] - 1]);
                        sheet1.addCell(label);
                    //     label = new Label(col[j], row, "["+col[j]+"],["+row+"],["+(col[j] - 1)+"]", MiddleRow[col[j] - 1]);
                    //     sheet1.addCell(label);
                    }
                    //<editor-fold defaultstate="collapsed" desc="set merging">
                    
                    sheet1.mergeCells(1, row, 2, row);
                    sheet1.mergeCells(4, row, 5, row);
                    label = new Label(2, row, sheet1.getCell(2, row).getContents(), MiddleRow[1]);
                    sheet1.addCell(label);
                    label = new Label(3, row, sheet1.getCell(3, row).getContents(), MiddleRow[2]);
                    sheet1.addCell(label);
                    label = new Label(5, row, "", MiddleRow[4]);
                    sheet1.addCell(label);
                    //</editor-fold>
                }
                
                row = fillInsertions(arr2, i, col, row, MiddleRow, sheet1, lastRow,-1);
                row++;
                //System.out.println("row = "+row);
                if (i + 1 < arr2.length) {
                    sheet1.insertRow(row);
                }
                
            }
            //</editor-fold>
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Conclude Workbook">
            book2.write();
            book1.close();
            book2.close();
            Desktop.getDesktop().open(new File("Bill_Electronic - output.xls"));
            //</editor-fold>
       
        }catch (Exception ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ro_newspaper(Object[] arr,Object[][] arr2){
   
    try {     
            
            //<editor-fold defaultstate="collapsed" desc="Setup Workbook">
        Workbook book1 =  Workbook.getWorkbook(new File("RO_Newspaper.xls"));
        WritableWorkbook book2;
        book2 = Workbook.createWorkbook(new File("RO_Newspaper - output.xls"),book1);
        WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Sheet Set">
            //<editor-fold defaultstate="collapsed" desc="Header Setting">
        
            //<editor-fold defaultstate="collapsed" desc="Formatting">
        WritableFont cellFont = new WritableFont(WritableFont.createFont("Arial"),16);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableCellFormat boldcentre = new WritableCellFormat(cellFont);
        boldcentre.setAlignment(jxl.format.Alignment.CENTRE);
        boldcentre.setBorder(jxl.format.Border.BOTTOM, jxl.format.BorderLineStyle.THIN);
        WritableFont cellFont2 = new WritableFont(WritableFont.createFont("Arial"),12);
        WritableCellFormat boldcentre2 = new WritableCellFormat(cellFont2);        
        //</editor-fold>
        
            //<editor-fold defaultstate="collapsed" desc="Header population">
        Label label = new Label(3, 5,arr[0].toString(),boldcentre);
        sheet1.addCell(label);
        
        label = new Label(10, 5,arr[1].toString());
        sheet1.addCell(label);
        
        label = new Label(2, 10,arr[2].toString(),boldcentre2);
        sheet1.addCell(label);
        
        label = new Label(6, 10,arr[3].toString());
        sheet1.addCell(label);
        
        label = new Label(2, 12,arr[4].toString());
        sheet1.addCell(label);
        
        label = new Label(2, 14,arr[5].toString());
        sheet1.addCell(label);
        
        label = new Label(2, 23,arr[6].toString());
        sheet1.addCell(label);
        //</editor-fold>
        
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Row Insertion">
            int size = arr2.length;
            int i = 0;
            int x=19,y=20;
            
            if (size > 2)
            {
                for (;i<size-2;i++){
                    sheet1.insertRow(y);
                    
                    WritableCell[] cells;
                    cells = new WritableCell[] {sheet1.getWritableCell(2,x).copyTo(2,y),
                        sheet1.getWritableCell(3,x).copyTo(3,y),
                        sheet1.getWritableCell(5,x).copyTo(5,y),
                        sheet1.getWritableCell(7,x).copyTo(7,y),
                        sheet1.getWritableCell(9,x).copyTo(9,y),
                        sheet1.getWritableCell(10,x).copyTo(10,y)};
                    for (WritableCell cell:cells){sheet1.addCell(cell);}
                    
                    sheet1.mergeCells(3,y,4,y);
                    sheet1.mergeCells(5,y,6,y);
                    sheet1.mergeCells(7,y,8,y);
                    
                    x++;
                    y++;
                }
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Table Population">
            int col[] = {2,3,5,7,9,10};
            int j =0, row = 19;
            WritableCellFormat format = new WritableCellFormat();
            format.setBorder(jxl.format.Border.LEFT, jxl.format.BorderLineStyle.THIN);
            format.setAlignment(jxl.format.Alignment.CENTRE);
            WritableCellFormat format1 = new WritableCellFormat();
            format1.setWrap(true);
            format1.setBorder(jxl.format.Border.LEFT, jxl.format.BorderLineStyle.THIN);
            format1.setAlignment(jxl.format.Alignment.CENTRE);
                        
            for (i=0;i<arr2.length;i++)
            {
                for (j=0;j<arr2[0].length;j++)
                {
                    if (j==5){
                        label = new Label(col[j],row,arr2[i][j].toString(),format1);
                        sheet1.addCell(label);
                    }
                    else{
                        label = new Label(col[j],row,arr2[i][j].toString(),format);
                        sheet1.addCell(label);
                    }
                }
                
                label = new Label(11,row,"",format);
                sheet1.addCell(label);
                row++;
            }
            //</editor-fold>
            
            
            
           
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Conclude Workbook">
        book2.write();
        book1.close();
        book2.close();
        Desktop.getDesktop().open(new File("RO_Newspaper - output.xls"));
        //</editor-fold>
        
        }catch (Exception ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ro_newspaperNR(Object[] arr,Object[][] arr2){
   
    try {     
            
            //<editor-fold defaultstate="collapsed" desc="Setup Workbook">
        Workbook book1 =  Workbook.getWorkbook(new File("RO_Newspaper.xls"));
        WritableWorkbook book2;
        book2 = Workbook.createWorkbook(new File("RO_Newspaper - output.xls"),book1);
        WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Sheet Set">
            //<editor-fold defaultstate="collapsed" desc="Header Setting">
        
            //<editor-fold defaultstate="collapsed" desc="Formatting">
        WritableFont cellFont = new WritableFont(WritableFont.createFont("Calibri"),13);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableCellFormat boldcentre = new WritableCellFormat(cellFont);
        boldcentre.setAlignment(jxl.format.Alignment.CENTRE);
        boldcentre.setBorder(jxl.format.Border.BOTTOM, jxl.format.BorderLineStyle.THIN);
        //</editor-fold>
        
            //<editor-fold defaultstate="collapsed" desc="Header population">
        Label label = new Label(3, 5,arr[0].toString(),boldcentre);
        sheet1.addCell(label);
        
        label = new Label(10, 5,arr[1].toString());
        sheet1.addCell(label);
        
        label = new Label(1, 10,arr[2].toString());
        sheet1.addCell(label);
        
        label = new Label(6, 10,arr[3].toString());
        sheet1.addCell(label);
        
        label = new Label(2, 12,arr[4].toString());
        sheet1.addCell(label);
        
        label = new Label(2, 14,arr[5].toString());
        sheet1.addCell(label);
        
        
        label = new Label(2, 23,arr[6].toString());
        sheet1.addCell(label); 
        //</editor-fold>
        
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Row Insertion">
            int size = arr2.length;
            int i = 0;
            int x=19,y=20;
            
            if (size > 2)
            {
                for (;i<size-2;i++){
                    sheet1.insertRow(y);
                    
                    WritableCell[] cells;
                    cells = new WritableCell[] {sheet1.getWritableCell(2,x).copyTo(2,y),
                        sheet1.getWritableCell(3,x).copyTo(3,y),
                        sheet1.getWritableCell(5,x).copyTo(5,y),
                        sheet1.getWritableCell(7,x).copyTo(7,y),
                        sheet1.getWritableCell(9,x).copyTo(9,y),
                        sheet1.getWritableCell(10,x).copyTo(10,y)};
                    for (WritableCell cell:cells){sheet1.addCell(cell);}
                    
                    sheet1.mergeCells(3,y,4,y);
                    sheet1.mergeCells(5,y,6,y);
                    sheet1.mergeCells(7,y,8,y);
                    
                    x++;
                    y++;
                }
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Table Population">
            int col[] = {2,3,5,7,9,10};
            int j =0, row = 19;
            WritableCellFormat format = new WritableCellFormat();
            format.setBorder(jxl.format.Border.LEFT, jxl.format.BorderLineStyle.THIN);
            format.setAlignment(jxl.format.Alignment.CENTRE);
            WritableCellFormat format1 = new WritableCellFormat();
            format1.setWrap(true);
            format1.setBorder(jxl.format.Border.LEFT, jxl.format.BorderLineStyle.THIN);
            format1.setAlignment(jxl.format.Alignment.CENTRE);
                        
            for (i=0;i<arr2.length;i++)
            {
                for (j=0;j<arr2[0].length;j++)
                {
                    if (j==5){
                        label = new Label(col[j],row,arr2[i][j].toString(),format1);
                        sheet1.addCell(label);
                    }
                    else{
                        if (j==4){
                        label = new Label(col[j],row,"",format);
                        sheet1.addCell(label);
                        }
                        else{
                        label = new Label(col[j],row,arr2[i][j].toString(),format);
                        sheet1.addCell(label);
                        }
                    }
                }
                
                label = new Label(11,row,"",format);
                sheet1.addCell(label);
                row++;
            }
            //</editor-fold>
            
            
            
           
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Conclude Workbook">
        book2.write();
        book1.close();
        book2.close();
        Desktop.getDesktop().open(new File("RO_Newspaper - output.xls"));
        //</editor-fold>
        
        }catch (Exception ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ro_electronic(Object[] arr,Object[][] arr2){
        // TODO code application logic here
   
    try {     
            
            //<editor-fold defaultstate="collapsed" desc="Setup Workbook">
        Workbook book1 =  Workbook.getWorkbook(new File("RO_Electronic.xls"));
        WritableWorkbook book2;
        book2 = Workbook.createWorkbook(new File("RO_Electronic - output.xls"),book1);
        WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Sheet Set">
            //<editor-fold defaultstate="collapsed" desc="Header Setting">
        
        WritableFont cellFont = new WritableFont(WritableFont.createFont("Arial"),16);
        cellFont.setBoldStyle(WritableFont.BOLD);
        
        WritableCellFormat format2 = new WritableCellFormat();
        
        Label label = new Label(2, 6,arr[0].toString());
        sheet1.addCell(label);
        
        label = new Label(2, 7,arr[1].toString(),format2);
        sheet1.addCell(label);
        
        label = new Label(2, 8,arr[2].toString());
        sheet1.addCell(label);
        
        label = new Label(12, 7,arr[3].toString());
        sheet1.addCell(label);
        
        label = new Label(12, 6,arr[4].toString());
        sheet1.addCell(label);
        
        label = new Label(9, 18,arr[5].toString());
        sheet1.addCell(label);
        
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Row Insertion">
            int size = arr2.length;
            int i = 0;
            int x=12,y=13;
            
            if (size > 2)
            {
                for (;i<size-2;i++){
                    sheet1.insertRow(y);
                    
                    WritableCell[] cells;
                    cells = new WritableCell[] {sheet1.getWritableCell(2,x).copyTo(2,y),
                        sheet1.getWritableCell(4,x).copyTo(4,y),
                        sheet1.getWritableCell(5,x).copyTo(5,y),
                        sheet1.getWritableCell(7,x).copyTo(7,y),
                        sheet1.getWritableCell(9,x).copyTo(9,y),
                        sheet1.getWritableCell(10,x).copyTo(10,y),
                        sheet1.getWritableCell(11,x).copyTo(11,y),
                        sheet1.getWritableCell(13,x).copyTo(13,y)};
                    for (WritableCell cell:cells){sheet1.addCell(cell);}
                    x++;
                    y++;
                }
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Table Populating">
            int col[] = {2,3,4,6,8,9,10,12}, row = 13;
            int j = 0;
            WritableCellFormat format = new WritableCellFormat();
            format.setWrap(true);
            format.setBorder(jxl.format.Border.LEFT, jxl.format.BorderLineStyle.THIN);
            format.setAlignment(jxl.format.Alignment.CENTRE);
                
            for (i=0;i<arr2.length;i++)
            {
                for (j=0;j<arr2[0].length;j++)
                {
                 if (j == 0)
                 {
                  label  = new Label(col[j],row,arr2[i][j].toString(),format);
                  sheet1.addCell(label);
                 }
                 else{
                  label = new Label(col[j],row,arr2[i][j].toString(),format);
                  sheet1.addCell(label);
                  label = new Label(13,row,"",format);
                  sheet1.addCell(label);
                     }
                }
                row++;
            }
            //</editor-fold>
            
            
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Conclude Workbook">
        book2.write();
        book1.close();
        book2.close();
        Desktop.getDesktop().open(new File("RO_Electronic - output.xls"));
        //</editor-fold>
        
        }catch (Exception ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void ro_electronicNR(Object[] arr,Object[][] arr2){
        // TODO code application logic here
   
    try {     
            
            //<editor-fold defaultstate="collapsed" desc="Setup Workbook">
        Workbook book1 =  Workbook.getWorkbook(new File("RO_Electronic.xls"));
        WritableWorkbook book2;
        book2 = Workbook.createWorkbook(new File("RO_Electronic - output.xls"),book1);
        WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Sheet Set">
            //<editor-fold defaultstate="collapsed" desc="Header Setting">
        Label label = new Label(2, 6,arr[0].toString());
        sheet1.addCell(label);
        
        label = new Label(2, 7,arr[1].toString());
        sheet1.addCell(label);
        
        label = new Label(2, 8,arr[2].toString());
        sheet1.addCell(label);
        
        label = new Label(12, 7,arr[3].toString());
        sheet1.addCell(label);
        
        label = new Label(12, 6,arr[4].toString());
        sheet1.addCell(label);
        
        label = new Label(9, 18,arr[5].toString());
        sheet1.addCell(label);
        
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Row Insertion">
            int size = arr2.length;
            int i = 0;
            int x=12,y=13;
            
            if (size > 2)
            {
                for (;i<size-2;i++){
                    sheet1.insertRow(y);
                    
                    WritableCell[] cells;
                    cells = new WritableCell[] {sheet1.getWritableCell(2,x).copyTo(2,y),
                        sheet1.getWritableCell(4,x).copyTo(4,y),
                        sheet1.getWritableCell(5,x).copyTo(5,y),
                        sheet1.getWritableCell(7,x).copyTo(7,y),
                        sheet1.getWritableCell(9,x).copyTo(9,y),
                        sheet1.getWritableCell(10,x).copyTo(10,y),
                        sheet1.getWritableCell(11,x).copyTo(11,y),
                        sheet1.getWritableCell(13,x).copyTo(13,y)};
                    for (WritableCell cell:cells){sheet1.addCell(cell);}
                    x++;
                    y++;
                }
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Table Populating">
            int col[] = {2,3,4,6,8,9,10,12}, row = 13;
            int j = 0;
            WritableCellFormat format = new WritableCellFormat();
            format.setWrap(true);
            format.setBorder(jxl.format.Border.LEFT, jxl.format.BorderLineStyle.THIN);
            format.setAlignment(jxl.format.Alignment.CENTRE);
                
            for (i=0;i<arr2.length;i++)
            {
                for (j=0;j<arr2[0].length;j++)
                {
                 if (j == 0)
                 {
                  label  = new Label(col[j],row,arr2[i][j].toString(),format);
                  sheet1.addCell(label);
                 }
                 else{
                     if (j==6){
                  label = new Label(col[j],row,"",format);
                  sheet1.addCell(label);
                  label = new Label(13,row,"",format);
                  sheet1.addCell(label);
                     }
                     else{
                  label = new Label(col[j],row,arr2[i][j].toString(),format);
                  sheet1.addCell(label);
                  label = new Label(13,row,"",format);
                  sheet1.addCell(label);                     
                        }
                     }
                }
                row++;
            }
            //</editor-fold>
            
            
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Conclude Workbook">
        book2.write();
        book1.close();
        book2.close();
        Desktop.getDesktop().open(new File("RO_Electronic - output.xls"));
        //</editor-fold>
        
        }catch (Exception ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void bill_newspaper(Object[] arr,Object[][] arr2){
   
    try {     
            
            //<editor-fold defaultstate="collapsed" desc="Setup Workbook">
        Workbook book1 =  Workbook.getWorkbook(new File("Bill_Newspaper.xls"));
        WritableWorkbook book2;
        File file1 = new File("Bill_Newspaper - output.xls");
        book2 = Workbook.createWorkbook(file1,book1);
        WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
        CodeGen object = new CodeGen();
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Sheet Set">
            //<editor-fold defaultstate="collapsed" desc="Header Setting">

        //<editor-fold defaultstate="collapsed" desc="Fonts and Formatting">
        WritableFont cellFont = new WritableFont(WritableFont.createFont("Calibri"),13);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableFont cellFont23 = new WritableFont(WritableFont.createFont("Arial"),16);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableFont cellFont12 = new WritableFont(WritableFont.createFont("Arial"),12);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableFont cellFont2 = new WritableFont(WritableFont.createFont("Calibri"),12);
        cellFont2.setUnderlineStyle(UnderlineStyle.SINGLE);
        WritableCellFormat x = new WritableCellFormat(cellFont23);
        x.setAlignment(jxl.format.Alignment.CENTRE);
        WritableCellFormat cellFormat = new WritableCellFormat();
        cellFormat.setWrap(true);
        cellFormat.setVerticalAlignment(jxl.format.VerticalAlignment.TOP);
        cellFormat.setAlignment(jxl.format.Alignment.LEFT);
        WritableCellFormat cellFormaty = new WritableCellFormat(cellFont);
        cellFormaty.setBorder(jxl.format.Border.TOP, jxl.format.BorderLineStyle.THIN);
        WritableFont cellFont1 = new WritableFont(WritableFont.createFont("Calibri"),13);
        WritableCellFormat cellFormatx = new WritableCellFormat(cellFont);
        cellFormat.setWrap(true);
        WritableCellFormat cellFormatzzx = new WritableCellFormat();
        cellFormatzzx.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormatz = new WritableCellFormat(cellFont);
        cellFormatz.setAlignment(jxl.format.Alignment.RIGHT);

        WritableFont cellFontz = new WritableFont(WritableFont.createFont("Calibri"),11);
        cellFontz.setBoldStyle(WritableFont.BOLD);
        WritableCellFormat cellFormatsmallr = new WritableCellFormat(cellFontz);
        cellFormatsmallr.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormat16 = new WritableCellFormat(cellFont23);
        WritableCellFormat cellFormat12 = new WritableCellFormat(cellFont12);
        WritableCellFormat cellFormatzz = new WritableCellFormat(cellFont2);
        cellFormatzz.setAlignment(jxl.format.Alignment.LEFT);
        cellFormatzz.setAlignment(jxl.format.Alignment.LEFT);        
        cellFormatzz.setAlignment(jxl.format.Alignment.LEFT);
        //</editor-fold>
                
        //<editor-fold defaultstate="collapsed" desc="Header Populating">
        int a=0;
        double b=0;
        String str = String.valueOf(arr[6].toString());
        b = Double.parseDouble(str);
        a = (int)b;
        
        
        Label label = new Label(10, 7,arr[0].toString(),cellFormat16);
        sheet1.addCell(label);
        
        label = new Label(10, 8,arr[1].toString(),cellFormat12);
        sheet1.addCell(label);
        
        label = new Label(1, 7,arr[2].toString(),cellFormat);
        sheet1.addCell(label);
        
        label = new Label(2, 12,arr[3].toString());
        sheet1.addCell(label);
        
        label = new Label(3, 13,arr[4].toString());
        sheet1.addCell(label);
        
        label = new Label(7, 14,arr[5].toString(),x);
        
        sheet1.addCell(label);
        
        label = new Label(1, 6,arr[7].toString(),cellFormaty);
        sheet1.addCell(label);
        
        int typerow=22;
        DataBase db=new DataBase();
        db.connectToDB("media");
        ResultSet rsx = db.getData("SELECT `deduction`  FROM  `cbill` WHERE billNo = "+Integer.parseInt(arr[0].toString()));
        rsx.next();         
        int deduction = 0,amount = 0;

        deduction =(int) Double.parseDouble(rsx.getString("deduction"));
        db.DisconnectFromDB();         
        amount = a - deduction;
        
        label = new Label(10, typerow,"Total:",cellFormatsmallr);
        sheet1.addCell(label);        
        label = new Label(11, typerow,String.valueOf(a),cellFormatsmallr);
        sheet1.addCell(label);
        typerow++;
 
        label = new Label(11, typerow,String.valueOf((int)deduction),cellFormatsmallr);
        sheet1.addCell(label);
        label = new Label(10, typerow,"Deduction:",cellFormatsmallr);
        sheet1.addCell(label);
        typerow++;
        
        label = new Label(11, typerow,"Total (Rs.)  "+String.valueOf(amount),cellFormatz);
        sheet1.addCell(label);
          
        label = new Label(1,typerow,"Rupees ("+maker(amount)+" Only)",cellFormatzz);
        sheet1.addCell(label);

        //</editor-fold>
       
        //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Row Calculation & Insertion">        

            int num = arr2.length;
                       
            //<editor-fold defaultstate="collapsed" desc="set Cell Formater Array">
            jxl.format.CellFormat lastRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,21).getCellFormat(),
            sheet1.getCell(2,21).getCellFormat(),sheet1.getCell(3,21).getCellFormat(),
            sheet1.getCell(4,21).getCellFormat(),sheet1.getCell(5,21).getCellFormat(),
            sheet1.getCell(6,21).getCellFormat(),sheet1.getCell(7,21).getCellFormat(),
            sheet1.getCell(8,21).getCellFormat(),sheet1.getCell(9,21).getCellFormat(),
            sheet1.getCell(10,21).getCellFormat(),sheet1.getCell(11,21).getCellFormat(),
            sheet1.getCell(12,21).getCellFormat()
            };
            
            jxl.format.CellFormat MiddleRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,20).getCellFormat(),
            sheet1.getCell(2,20).getCellFormat(),sheet1.getCell(3,20).getCellFormat(),
            sheet1.getCell(4,20).getCellFormat(),sheet1.getCell(5,20).getCellFormat(),
            sheet1.getCell(6,20).getCellFormat(),sheet1.getCell(7,20).getCellFormat(),
            sheet1.getCell(8,20).getCellFormat(),sheet1.getCell(9,20).getCellFormat(),
            sheet1.getCell(10,20).getCellFormat(),sheet1.getCell(11,20).getCellFormat(),
            sheet1.getCell(12,20).getCellFormat()
            };
            
            
            //</editor-fold>
            
            
            
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="data rows">
            
             int col[] = {1,4,6,7,8,9,10,11,3}, row = 20,tempRow=20;
             String extra[],extra2[];
             sheet1.removeRow(20);
            
            for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[0].length -3; j++) {

                if (j != 2 || j != 3) {
                    label = new Label(col[j], row, String.valueOf(arr2[i][j]), MiddleRow[col[j] - 1]);
                    sheet1.addCell(label);
                }
                //<editor-fold defaultstate="collapsed" desc="set merging">
               
                sheet1.mergeCells(1, row, 2, row);
                sheet1.mergeCells(4, row, 5, row);
                
                label = new Label(2, row, "", MiddleRow[1]);
                sheet1.addCell(label);
                label = new Label(5, row, "", MiddleRow[4]);
                sheet1.addCell(label);
                //</editor-fold>
            }

            row = fillInsertions(arr2, i, col, row, MiddleRow, sheet1, lastRow,3);
            row++;
            if (i + 1 < arr2.length) {
                sheet1.insertRow(row);
            }

        }
           
            //</editor-fold>
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Conclude Workbook">
            book2.write();
            book1.close();
            book2.close();
            
            Desktop.getDesktop().open(new File("Bill_Newspaper - output.xls"));

            //</editor-fold>
            
         }catch (Exception ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void bill_newspaperTAX(Object[] arr,Object[][] arr2,Object[] arr3){
   
    try {     
            
            //<editor-fold defaultstate="collapsed" desc="Setup Workbook">
        Workbook book1 =  Workbook.getWorkbook(new File("Bill_Newspaper.xls"));
        WritableWorkbook book2;
        File file1 = new File("Bill_Newspaper - output.xls");
        book2 = Workbook.createWorkbook(file1,book1);
        WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
        CodeGen object = new CodeGen();
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Sheet Set">
            //<editor-fold defaultstate="collapsed" desc="Header Setting">

        //<editor-fold defaultstate="collapsed" desc="Fonts and Formatting">
        
        WritableFont cellFont = new WritableFont(WritableFont.createFont("Calibri"),13);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableCellFormat x = new WritableCellFormat(cellFont);
        x.setAlignment(jxl.format.Alignment.LEFT);        
        WritableFont cellFontB = new WritableFont(WritableFont.createFont("Calibri"),14);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableFont cellFont23 = new WritableFont(WritableFont.createFont("Arial"),16);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableFont cellFont12 = new WritableFont(WritableFont.createFont("Arial"),12);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableFont cellFont12a = new WritableFont(WritableFont.createFont("Arial"),10);
        WritableCellFormat cellFormat = new WritableCellFormat();
        cellFormat.setWrap(true);
        cellFormat.setVerticalAlignment(jxl.format.VerticalAlignment.TOP);
        cellFormat.setAlignment(jxl.format.Alignment.LEFT);
        WritableCellFormat cellFormaty = new WritableCellFormat(cellFont);
        cellFormaty.setBorder(jxl.format.Border.TOP, jxl.format.BorderLineStyle.THIN);
        WritableFont cellFont1 = new WritableFont(WritableFont.createFont("Calibri"),13);
        WritableCellFormat cellFormatx = new WritableCellFormat(cellFont);
        cellFormat.setWrap(true);
        WritableCellFormat cellFormatright = new WritableCellFormat();
        cellFormatright.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormatz = new WritableCellFormat(cellFontB);
        cellFormatz.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormatleft = new WritableCellFormat();
        cellFormatleft.setAlignment(jxl.format.Alignment.LEFT);
        WritableFont cellFontz = new WritableFont(WritableFont.createFont("Calibri"),11);
        cellFont.setBoldStyle(WritableFont.BOLD);
        WritableCellFormat cellFormatsmallr = new WritableCellFormat(cellFontz);
        cellFormatsmallr.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormat16 = new WritableCellFormat(cellFont23);
        cellFormat16.setAlignment(jxl.format.Alignment.LEFT);        
        WritableCellFormat cellFormat12 = new WritableCellFormat(cellFont12);
        cellFormat12.setAlignment(jxl.format.Alignment.LEFT); 
        WritableCellFormat cellFormatzz = new WritableCellFormat(cellFont12a);
        cellFormatzz.setAlignment(jxl.format.Alignment.LEFT);
        //</editor-fold>
                
        //<editor-fold defaultstate="collapsed" desc="Header Populating">
        int a=0;
        
        String str = String.valueOf(arr[6].toString());
        a = Integer.parseInt(str);
        
        Label label = new Label(10, 7,arr[0].toString(),cellFormat16);
        sheet1.addCell(label);
        
        label = new Label(10, 8,arr[1].toString(),cellFormat12);
        sheet1.addCell(label);
        
        label = new Label(1, 7,arr[2].toString(),cellFormat);
        sheet1.addCell(label);
        
        label = new Label(2, 12,arr[3].toString());
        sheet1.addCell(label);
        
        label = new Label(3, 13,arr[4].toString());
        sheet1.addCell(label);
        
        label = new Label(3, 14,arr[5].toString(),x);
        sheet1.addCell(label);
        
        label = new Label(1, 6,arr[7].toString(),cellFormaty);
        sheet1.addCell(label);
        
        //<editor-fold defaultstate="collapsed" desc="Tax Calculation and Application">
        
        double itotal=0,ftotal=0,commission=0,commrate=0;
        double taxrate=0,tax=0,nettotal=0;
        double deduction=0;
        int finalamount=0;

        deduction = Double.parseDouble(arr3[3].toString());        
        itotal = Double.parseDouble(arr[6].toString());
        ftotal = itotal-deduction;
        commrate = Double.parseDouble(arr3[2].toString())/100;
        commission = (ftotal*commrate);
        taxrate = Double.parseDouble(arr3[1].toString())/100;
        tax = (commission*taxrate);
        nettotal = ftotal+tax;
        finalamount = (int)(nettotal);
        
        //</editor-fold>
        int typerow=22;

        label = new Label(10, typerow,"Total:",cellFormatsmallr);
        sheet1.addCell(label);        
        label = new Label(11, typerow,String.valueOf((int)itotal),cellFormatsmallr);
        sheet1.addCell(label);
        typerow++;
 
        label = new Label(11, typerow,String.valueOf((int)deduction),cellFormatsmallr);
        sheet1.addCell(label);
        label = new Label(10, typerow,"Deduction:",cellFormatsmallr);
        sheet1.addCell(label);
        typerow++;        

        label = new Label(9,typerow,arr3[0].toString(),cellFormatright);
        sheet1.addCell(label);
        label = new Label(10,typerow,arr3[1].toString()+"% on",cellFormatleft);
        sheet1.addCell(label);
        label = new Label(11,typerow,String.valueOf((int)commission),cellFormatright);
        sheet1.addCell(label);
        typerow++;
        typerow++;
        
        label = new Label(11, typerow,"Net Amount (Rs.) "+finalamount,cellFormatz);
        sheet1.addCell(label);
        typerow++;  
        label = new Label(1,typerow,"Rupees ("+maker(finalamount)+" Only)",cellFormatzz);
        sheet1.addCell(label);
        
        //</editor-fold>
       
        //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Row Calculation & Insertion">        

            int num = arr2.length;
                       
            //<editor-fold defaultstate="collapsed" desc="set Cell Formater Array">
            jxl.format.CellFormat lastRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,21).getCellFormat(),
            sheet1.getCell(2,21).getCellFormat(),sheet1.getCell(3,21).getCellFormat(),
            sheet1.getCell(4,21).getCellFormat(),sheet1.getCell(5,21).getCellFormat(),
            sheet1.getCell(6,21).getCellFormat(),sheet1.getCell(7,21).getCellFormat(),
            sheet1.getCell(8,21).getCellFormat(),sheet1.getCell(9,21).getCellFormat(),
            sheet1.getCell(10,21).getCellFormat(),sheet1.getCell(11,21).getCellFormat(),
            sheet1.getCell(12,21).getCellFormat()
            };
            
            jxl.format.CellFormat MiddleRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,20).getCellFormat(),
            sheet1.getCell(2,20).getCellFormat(),sheet1.getCell(3,20).getCellFormat(),
            sheet1.getCell(4,20).getCellFormat(),sheet1.getCell(5,20).getCellFormat(),
            sheet1.getCell(6,20).getCellFormat(),sheet1.getCell(7,20).getCellFormat(),
            sheet1.getCell(8,20).getCellFormat(),sheet1.getCell(9,20).getCellFormat(),
            sheet1.getCell(10,20).getCellFormat(),sheet1.getCell(11,20).getCellFormat(),
            sheet1.getCell(12,20).getCellFormat()
            };
            
            
            //</editor-fold>
            
            
            
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="data rows">
            
             int col[] = {1,4,6,7,8,9,10,11,3}, row = 20,tempRow=20;
             String extra[],extra2[];
             sheet1.removeRow(20);
            
            for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[0].length -3; j++) {

                if (j != 2 || j != 3) {
                    label = new Label(col[j], row, String.valueOf(arr2[i][j]), MiddleRow[col[j] - 1]);
                    sheet1.addCell(label);
                }
                //<editor-fold defaultstate="collapsed" desc="set merging">
               
                sheet1.mergeCells(1, row, 2, row);
                sheet1.mergeCells(4, row, 5, row);
                
                label = new Label(2, row, "", MiddleRow[1]);
                sheet1.addCell(label);
                label = new Label(5, row, "", MiddleRow[4]);
                sheet1.addCell(label);
                //</editor-fold>
            }

            row = fillInsertions(arr2, i, col, row, MiddleRow, sheet1, lastRow,3);
            row++;
            if (i + 1 < arr2.length) {
                sheet1.insertRow(row);
            }

        }
           
            //</editor-fold>
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Conclude Workbook">
            book2.write();
            book1.close();
            book2.close();
            
            Desktop.getDesktop().open(new File("Bill_Newspaper - output.xls"));

            //</editor-fold>
            
         }catch (Exception ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void bill_electronicTAX(Object[] arr,Object[][] arr2,Object[] arr3){
        // TODO code application logic here
   
    try {     
            
            //<editor-fold defaultstate="collapsed" desc="Setup Workbook">
        Workbook book1 =  Workbook.getWorkbook(new File("Bill_Electronic.xls"));
        WritableWorkbook book2,book3;
        book2 = Workbook.createWorkbook(new File("Bill_Electronic - output.xls"),book1);
        WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
        //</editor-fold>
        
            //<editor-fold defaultstate="collapsed" desc="Sheet Set">
            //<editor-fold defaultstate="collapsed" desc="Header Setting">
        
        //<editor-fold defaultstate="collapsed" desc="Fonts and Formatting">
        WritableCellFormat cellFormat = new WritableCellFormat();
        WritableCellFormat cellFormat3 = new WritableCellFormat();
        cellFormat.setWrap(true);
        WritableFont cellFont = new WritableFont(WritableFont.createFont("Calibri"),13);
        cellFont.setBoldStyle(WritableFont.BOLD);
        cellFormat.setAlignment(jxl.format.Alignment.RIGHT);
        cellFormat3.setAlignment(jxl.format.Alignment.LEFT);
        cellFormat3.setVerticalAlignment(jxl.format.VerticalAlignment.TOP);
        cellFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
        cellFormat.setVerticalAlignment(jxl.format.VerticalAlignment.CENTRE);
        cellFormat.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
        WritableFont cellFontz = new WritableFont(WritableFont.createFont("Calibri"),11);
        cellFontz.setBoldStyle(WritableFont.BOLD);
        WritableCellFormat cellFormatsmallr = new WritableCellFormat(cellFontz);
        cellFormatsmallr.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormatz = new WritableCellFormat(cellFont);
        cellFormatz.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormatzz = new WritableCellFormat();
        cellFormatzz.setAlignment(jxl.format.Alignment.LEFT);
        WritableFont cellFont3 = new WritableFont(WritableFont.createFont("Calibri"),13);
        cellFont3.setBoldStyle(WritableFont.BOLD);
        WritableCellFormat zx = new WritableCellFormat(cellFont3);
        zx.setAlignment(jxl.format.Alignment.LEFT);
        zx.setBorder(jxl.format.Border.TOP, jxl.format.BorderLineStyle.THIN);
        WritableCellFormat cellFormatright = new WritableCellFormat();
        cellFormatright.setAlignment(jxl.format.Alignment.RIGHT);
        WritableCellFormat cellFormatleft = new WritableCellFormat();
        cellFormatleft.setAlignment(jxl.format.Alignment.LEFT);
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Header Population">
        int a=0;
        double b=0;
        
        String str = String.valueOf(arr[6].toString());
        b = Double.parseDouble(str);
        a = (int)b;
        
        Label label = new Label(10, 7,arr[0].toString());
        sheet1.addCell(label);
        
        label = new Label(10, 8,arr[1].toString());
        sheet1.addCell(label);
        
        label = new Label(1, 7,arr[2].toString(),cellFormat3);
        sheet1.addCell(label);
        
        label = new Label(2, 12,arr[3].toString());
        sheet1.addCell(label);
     
        label = new Label(1, 6,arr[5].toString(),zx);
        sheet1.addCell(label);
        
        label = new Label(3, 13,arr[4].toString());
        sheet1.addCell(label);
        
        label = new Label(3, 14,"");//caption not provided, not available
        sheet1.addCell(label);
        
        double itotal=0,ftotal=0,commission=0,commrate=0;
        double taxrate=0,tax=0,nettotal=0;
        double deduction=0;
        int finalamount=0;

        deduction = Double.parseDouble(arr3[3].toString());        
        itotal = Double.parseDouble(arr[6].toString());
        ftotal = itotal-deduction;
        //commrate = Double.parseDouble(arr3[2].toString())/100;
        //commission = (ftotal*commrate);
        taxrate = Double.parseDouble(arr3[1].toString())/100;
        tax = (itotal*taxrate);
        nettotal = (itotal+tax)-deduction;
        finalamount = (int)(nettotal);
        
        int typerow=22;

        label = new Label(10, typerow,"Total:",cellFormatsmallr);
        sheet1.addCell(label);        
        label = new Label(11, typerow,String.valueOf((int)itotal),cellFormatsmallr);
        sheet1.addCell(label);
        typerow++;
 
        label = new Label(9,typerow,arr3[0].toString(),cellFormatright);
        sheet1.addCell(label);
        label = new Label(10,typerow,arr3[1].toString()+"% on",cellFormatleft);
        sheet1.addCell(label);
        label = new Label(11,typerow,String.valueOf((int)itotal),cellFormatright);
        sheet1.addCell(label);
        typerow++;        
        typerow++;
        
        label = new Label(11, typerow,String.valueOf((int)deduction),cellFormatsmallr);
        sheet1.addCell(label);
        label = new Label(10, typerow,"Deduction:",cellFormatsmallr);
        sheet1.addCell(label);
        typerow++;

        label = new Label(11, typerow,"Net Amount (Rs.) "+finalamount,cellFormatz);
        sheet1.addCell(label);
          
        label = new Label(1,typerow,"Rupees ("+maker(finalamount)+" Only)",cellFormatleft);
        sheet1.addCell(label);
        sheet1.insertRow(typerow);
        sheet1.insertRow(typerow);        
        //</editor-fold>
                
        //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Row Calculation & Insertion">        

            int num = arr2.length;
              //<editor-fold defaultstate="collapsed" desc="set Cell Formater Array">
            jxl.format.CellFormat lastRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,21).getCellFormat(),
            sheet1.getCell(2,21).getCellFormat(),sheet1.getCell(3,21).getCellFormat(),
            sheet1.getCell(4,21).getCellFormat(),sheet1.getCell(5,21).getCellFormat(),
            sheet1.getCell(6,21).getCellFormat(),sheet1.getCell(7,21).getCellFormat(),
            sheet1.getCell(8,21).getCellFormat(),sheet1.getCell(9,21).getCellFormat(),
            sheet1.getCell(10,21).getCellFormat(),sheet1.getCell(11,21).getCellFormat(),
            sheet1.getCell(12,21).getCellFormat()
            };
            
            jxl.format.CellFormat MiddleRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,20).getCellFormat(),
            sheet1.getCell(2,20).getCellFormat(),sheet1.getCell(3,20).getCellFormat(),
            sheet1.getCell(4,20).getCellFormat(),sheet1.getCell(5,20).getCellFormat(),
            sheet1.getCell(6,20).getCellFormat(),sheet1.getCell(7,20).getCellFormat(),
            sheet1.getCell(8,20).getCellFormat(),sheet1.getCell(9,20).getCellFormat(),
            sheet1.getCell(10,20).getCellFormat(),sheet1.getCell(11,20).getCellFormat(),
            sheet1.getCell(12,20).getCellFormat()
            };
            
            
            //</editor-fold>
               
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="data rows">
            int col[] = {1,4,6,7,8,9,10,11,3}, row = 20,tempRow=20;
            String extra[],extra2[];
            sheet1.removeRow(20);
            
            for (int i = 0; i < arr2.length ; i++) {
                for (int j = 0; j < arr2[0].length ; j++) {
                    
                    if (j != 2 || j != 3) {
                        label = new Label(col[j], row, String.valueOf(arr2[i][j]), MiddleRow[col[j] - 1]);
                        sheet1.addCell(label);
                    //     label = new Label(col[j], row, "["+col[j]+"],["+row+"],["+(col[j] - 1)+"]", MiddleRow[col[j] - 1]);
                    //     sheet1.addCell(label);
                    }
                    //<editor-fold defaultstate="collapsed" desc="set merging">
                    
                   // sheet1.mergeCells(1, row, 2, row);
                    sheet1.mergeCells(4, row, 5, row);
                    label = new Label(2, row, sheet1.getCell(2, row).getContents(), MiddleRow[1]);
                    sheet1.addCell(label);
                    label = new Label(3, row, sheet1.getCell(3, row).getContents(), MiddleRow[2]);
                    sheet1.addCell(label);
                    label = new Label(5, row, "", MiddleRow[4]);
                    sheet1.addCell(label);
                    //</editor-fold>
                }
                
                row = fillInsertions(arr2, i, col, row, MiddleRow, sheet1, lastRow,-1);
                row++;
                //System.out.println("row = "+row);
                if (i + 1 < arr2.length) {
                    sheet1.insertRow(row);
                }
                
            }
            //</editor-fold>
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Conclude Workbook">
            book2.write();
            book1.close();
            book2.close();
            Desktop.getDesktop().open(new File("Bill_Electronic - output.xls"));
            //</editor-fold>
       
        }catch (Exception ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int fillInsertions(Object[][] arr2, int i, int[] col, int row, jxl.format.CellFormat[] MiddleRow, WritableSheet sheet1, jxl.format.CellFormat[] lastRow,int extralines)  {
        try {
            String[] extra;
            String[] extra2;
            Label label;
            extra = arr2[i][2].toString().split("\n");
            extra2 = arr2[i][3].toString().split("\n");
            
        
            for (int extraRows = 0; extraRows < extra.length; extraRows++) {
                label = new Label(col[2], row, extra[extraRows], MiddleRow[5]);
                sheet1.addCell(label);
                
                label = new Label(col[3], row, extra2[extraRows], MiddleRow[6]);
                sheet1.addCell(label);
                
                sheet1.insertRow(row + 1);
                System.out.println("filling borders for middlerow "+(row+1));
                fillBorders(MiddleRow, row+1, sheet1);
                row++;
            }
            
            for(int x = extralines; x > 0 ; x--){
                
               if(!arr2[i][arr2[i].length-x].equals("0"))  {    
               
                label = new Label(col[0], row,  arr2[i][arr2[i].length-x] +"% extra charges ", MiddleRow[0]);
                sheet1.addCell(label);
                
                label = new Label(3, row, printAttribute(x), MiddleRow[1]);
                sheet1.addCell(label);
                
                
                sheet1.mergeCells(1, row, 2, row);
                
                sheet1.mergeCells(3, row, 4, row);
                
                
                label = new Label(col[7], row, calculate(arr2[i][arr2[i].length-x],arr2[i][7]), MiddleRow[10]);
                sheet1.addCell(label);
             
                sheet1.insertRow(row + 1);
                fillBorders2(MiddleRow, row + 1, sheet1);
                row++;
               }
            
            }
            System.out.println("filling borders for lastrow "+(row));
            fillBorders(lastRow, row, sheet1);
            
            return row;
        } catch (WriteException ex) {
            System.out.println(ex.getMessage());
            return row;
        }
    }

    public static void fillBorders(jxl.format.CellFormat[] Row, int row, WritableSheet sheet1) throws WriteException {
        Label label;
        for (int w = 1; w < Row.length; w++) {
            if (w!=6 || w!=7) {
                
                label = new Label(w, row, sheet1.getCell(w, row).getContents(), Row[w - 1]);
                sheet1.addCell(label);
                // label = new Label(w, row, "["+w+"]["+row+"]["+(w - 1)+"]", Row[w - 1]);
               // sheet1.addCell(label);
            }
            
        }
         sheet1.mergeCells(1, row, 2, row);
         sheet1.mergeCells(4, row, 5, row);
                
    }

    public static void fillBorders2(jxl.format.CellFormat[] Row, int row, WritableSheet sheet1) throws WriteException {
        Label label;
        for (int w = 6; w < Row.length; w++) {
            
                
                label = new Label(w, row, sheet1.getCell(w, row).getContents(), Row[w - 1]);
                sheet1.addCell(label);
            
            
        }
        
                
    }
    
    public static String maker(int a) {
    Conversions obj = new Conversions();
    String ans = null;
    int x = 0,y = 0,z = 0,zz = 0;
    z = a%1000;
    zz  = a-z;
    x = a%100;
    y = a-x;
    
    if (z == 0){ans = obj.convert(y);}
    else if (a > 1000 && x == 0) {ans = obj.convert(zz)+" & "+obj.convertLessThanOneThousand(z);}
    else if (a < 101){ans = obj.convertLessThanOneThousand(a);}
    else {ans = obj.convert(y)+" & "+obj.convertLessThanOneThousand(x);}
    
return ans;    
}
    
    private static String calculate(Object object, Object object0) {
        
    double amt = Double.parseDouble(object0.toString());
    double pcntg = (Double.parseDouble(object.toString()))/100;
    double ans = 0;
    
    ans = (amt*pcntg);
    
    return String.valueOf(ans);
    }  

    private static String printAttribute( int x) {
        String sent ="";
        
       switch(x){
            case 3:sent = "for color"; 
                    return sent;
            case 2: sent = "for Position"; 
                    return sent;
            case 1:sent = "for Other language"; 
                    return sent;
            default :
                return sent;
    
            }
    }

    private void report(Object[][] arr, String[] arr2, String[] arr3) {
    try {     
            
            //<editor-fold defaultstate="collapsed" desc="Setup Workbook">
        Workbook book1 =  Workbook.getWorkbook(new File("Reports.xls"));
        WritableWorkbook book2;
        File file1 = new File("Reports - output.xls");
        book2 = Workbook.createWorkbook(file1,book1);
        WritableSheet sheet1 = (WritableSheet) book2.getSheet(0);
        reportsetter(sheet1, arr3, arr2,0);
        
            //<editor-fold defaultstate="collapsed" desc="Row Calculation & Insertion">        

            int num = arr2.length;
                       
            //<editor-fold defaultstate="collapsed" desc="set Cell Formater Array">
            jxl.format.CellFormat MiddleRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,7).getCellFormat(),
            sheet1.getCell(2,7).getCellFormat(),sheet1.getCell(3,7).getCellFormat(),
            sheet1.getCell(4,7).getCellFormat(),sheet1.getCell(5,7).getCellFormat(),
            sheet1.getCell(6,7).getCellFormat(),sheet1.getCell(7,7).getCellFormat(),
            sheet1.getCell(8,7).getCellFormat(),sheet1.getCell(9,7).getCellFormat(),
            sheet1.getCell(10,7).getCellFormat(),sheet1.getCell(11,7).getCellFormat(),
            sheet1.getCell(12,7).getCellFormat()
            };
            
            jxl.format.CellFormat lastRow[] = new jxl.format.CellFormat[]
            {sheet1.getCell(1,8).getCellFormat(),
            sheet1.getCell(2,8).getCellFormat(),sheet1.getCell(3,8).getCellFormat(),
            sheet1.getCell(4,8).getCellFormat(),sheet1.getCell(5,8).getCellFormat(),
            sheet1.getCell(6,8).getCellFormat(),sheet1.getCell(7,8).getCellFormat(),
            sheet1.getCell(8,8).getCellFormat(),sheet1.getCell(9,8).getCellFormat(),
            sheet1.getCell(10,8).getCellFormat(),sheet1.getCell(11,8).getCellFormat(),
            sheet1.getCell(12,8).getCellFormat()
            };
            
            jxl.format.CellFormat Totallabels = sheet1.getCell(9,10).getCellFormat();
            jxl.format.CellFormat TotalAmounts = sheet1.getCell(10,10).getCellFormat();
            Label labelTemp = new Label(9, 10, "", TotalAmounts);
                    sheet1.addCell(labelTemp);  
            //</editor-fold>
            
            
            
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="data rows">
            
             int row = 7;
             int limit = 32;
             String extra[],extra2[];
             sheet1.removeRow(7);
             Label label1; 
            
            for (int i = 0; i < arr.length ; i++) 
                {
                for (int j = 0; j < arr[0].length; j++) 
                    {
                    label1 = new Label(j+1, row, String.valueOf(arr[i][j]), MiddleRow[j]);
                    sheet1.addCell(label1);
                    }
                row++;
                sheet1.insertRow(row);
                
                if (row >= limit)
                   {
                     
                    for (int j = 0; j < arr[0].length; j++) 
                       {
                           label1 = new Label(j + 1, row, "", lastRow[j]);
                           sheet1.addCell(label1);
                       }
                    reportsetter(sheet1,arr3,arr2,limit+5);
                    limit += 32;
                    row+=11;
                   }
                }
            
            Label label;
            
            for (int j = 0; j < arr[0].length; j++) 
                {
                 label = new Label(j+1, row, "", lastRow[j]);
                 sheet1.addCell(label);
                }
                row++;
                sheet1.insertRow(row);
                
            for (int j = 4; j < arr3.length; j+=2) 
                {
                  row++;
                  sheet1.insertRow(row);
                
                 label = new Label(9, row, arr3[j], Totallabels);
                 sheet1.addCell(label);
                 
                 label = new Label(10, row, arr3[j+1], TotalAmounts);
                 sheet1.addCell(label);
                }
           
            //</editor-fold>
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Conclude Workbook">
            book2.write();
            book1.close();
            book2.close();
            
            Desktop.getDesktop().open(new File("Reports - output.xls"));

            //</editor-fold>
            
         }catch (Exception ex) {
            Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void reportsetter(WritableSheet sheet1, String[] arr3, String[] arr2,int var) throws WriteException {
        //</editor-fold>
        
            //<editor-fold defaultstate="collapsed" desc="Sheet Set">
        int ii=0;
        Label label;
        
        jxl.format.CellFormat tablehead = sheet1.getCell(1,5).getCellFormat();
        jxl.format.CellFormat tophead = sheet1.getCell(6,0).getCellFormat();
        jxl.format.CellFormat reporthead = sheet1.getCell(6,1).getCellFormat();
        jxl.format.CellFormat datehead = sheet1.getCell(6,2).getCellFormat();
        jxl.format.CellFormat periodhead = sheet1.getCell(6,3).getCellFormat();
            
        label = new Label(6,var,arr3[0],tophead);sheet1.addCell(label);    
        label = new Label(6,var+1,arr3[1],reporthead);sheet1.addCell(label);
        label = new Label(6,var+2,arr3[2],datehead);sheet1.addCell(label);
        label = new Label(6,var+3,arr3[3],periodhead);sheet1.addCell(label);

        for (ii=0;ii<arr2.length;ii++)
             {
              label = new Label(ii+1,var+5,arr2[ii],tablehead);
              sheet1.addCell(label);
             }
    }
    
}