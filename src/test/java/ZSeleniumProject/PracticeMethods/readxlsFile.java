package ZSeleniumProject.PracticeMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readxlsFile {
	
	@Test
	public static void Test123() throws IOException {
		
		File exfile = new File("C:\\Users\\bamar\\OneDrive\\Desktop\\Resume_Final\\Final\\SampleTest.xlsx");
		
		FileInputStream fis = new FileInputStream(exfile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet  sheet = workbook.getSheet("Login");
		
		
		//https://www.youtube.com/watch?v=KN9gfMGaRAM
		
		int rowCount = sheet.getLastRowNum(); //Get rowCount
		
		int columnCount = sheet.getRow(0).getLastCellNum();   //Get Column Count
		
		for(int i=0; i<rowCount; i++)
		{
		for(int j=0; j<columnCount; j++)
		{
			String str = sheet.getRow(i).getCell(j).getStringCellValue();
			  System.out.println(str);
			
		}
		 //System.out.println("================");
		}
		
		
		//==========================================================
		
		
		
		String s = sheet.getRow(0).getCell(0).getStringCellValue();
		  System.out.println(s);
		
		   s = sheet.getRow(1).getCell(0).getStringCellValue();
		  System.out.println(s);
		
		   s = sheet.getRow(2).getCell(0).getStringCellValue();
		  System.out.println(s);
		  
		  fis.close();
	}

}
