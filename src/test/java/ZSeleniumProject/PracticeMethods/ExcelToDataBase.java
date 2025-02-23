package PracticeMethods;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class ExcelToDataBase {

    public static void main(String[] args) throws SQLException, IOException {

        //Database Conenction
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "usenrame","password");

        //statment/query
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from locations");

        //Excel
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Locations Data");


        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue(Boolean.parseBoolean("Emp_Id"));
        row.createCell(1).setCellValue(Boolean.parseBoolean("Emp_Name"));
        row.createCell(3).setCellValue(Boolean.parseBoolean("Emp_PhoneNubmer"));

      int r=1;
       while(rs.next())
       {

        int empid=   rs.getInt("Emp_Id");
        String empName=rs.getString("Emp_Name");
        int phonenum = rs.getInt("Emp_PhoneNubmer");

        row = sheet.createRow(r);

       /*    row.createCell(0).setCellValue(empid);
        row.createCell(0).setCellValue(empName);
        row.createCell(0).setCellValue(phonenum);*/


       }

        FileOutputStream fos = new FileOutputStream("paths of file ");
       workbook.write(fos);
       workbook.close();




    }
}
