package ZSeleniumProject.Utilities;




import org.apache.poi.xssf.usermodel.*;
import org.etsi.uri.x01903.v13.DataObjectFormatType;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class XLUtility {

    public FileInputStream fi;
    public FileOutputStream fo;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;
    public XSSFCellStyle style;
    String path = null;


    public XLUtility(String path)
    {
        this.path = path;
    }


  public int getRowCount(String sheetName) throws IOException {

        fi= new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        workbook.close();
        fi.close();
        return rowCount;

  }

  public int getCellCount(String sheetName,int rownum) throws IOException {

        fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet= workbook.getSheet(sheetName);
        row = sheet.getRow(rownum);
        int cellcount = row.getLastCellNum();
        workbook.close();
        fi.close();

        return cellcount;


  }

  public String getCellData(String sheetName,int rownum,int colnum) throws IOException {

        fi= new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(sheetName);

        row = sheet.getRow(rownum);
        cell = row.getCell(colnum);
        String data = "";

    /*  DataObjectFormatType formatter = new DataObjectFormatType();

        try{
            data = formatter.toString(); // returns the formatted value of cell as String regradless of the cell type.
        } catch (Exception e) {
            data="";
        }  */
        
        workbook.close();
        fi.close();

      return data;
  }

  public void setCellData(String sheetName, int rownum, int colnum, String data) throws IOException {

      fi = new FileInputStream(path);
      workbook = new XSSFWorkbook(fi);
      sheet = workbook.getSheet(sheetName);


      row = sheet.getRow(rownum);
      cell = row.createCell(colnum);
      cell.setCellValue(Boolean.parseBoolean(data));

      fo = new FileOutputStream(path);
      workbook.write(fo);
      workbook.close();

      fi.close();
      fo.close();



  }

  public void fillGreenColor(String sheetName, int rownum, int colnum) throws IOException {

        fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
       sheet = workbook.getSheet(sheetName);

       row = sheet.getRow(rownum);
       cell = row.getCell(colnum);

       style = workbook.createCellStyle();

       /*style.setFillForegroundColor(IndexedColors.GREEN,getIndex());
       style.setFillPattern(FillPath.SOLID_FOREGROUND);

       cell.setCellStyle(style);*/

       workbook.write(fo);
       workbook.close();

       fi.close();
       fo.close();

  }

  public void fillRedColor(String sheetName, int rownum, int colnum) throws IOException {

      fi = new FileInputStream(path);
      workbook = new XSSFWorkbook(fi);

      sheet = workbook.getSheet(sheetName);
      row = sheet.getRow(rownum);
      cell = row.getCell(colnum);

     /* style.setFillForegroundColor(IndexedColors.RED.getIndex());
      style.setFillPattern(FillPtternType.SOLID_FOREGROUND);
      cell.setCellStyle(style);
      workbook.write(fo); */

      workbook.close();
      fi.close();
      fo.close();


  }





}
