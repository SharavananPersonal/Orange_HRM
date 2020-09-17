package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class User_Credentials {

	

	public static String excel_username() throws Exception {
		// TODO Auto-generated method stub
		File credentials = new File("D:\\Practice\\Cucumber samle user credenetials.xls");
		FileInputStream fis = new FileInputStream(credentials);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet1 = wb.getSheetAt(0);
		
		String username = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		return username;
	}
	
	
	public static String excel_password() throws Exception {
		// TODO Auto-generated method stub
		File credentials = new File("D:\\Practice\\Cucumber samle user credenetials.xls");
		FileInputStream fis = new FileInputStream(credentials);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet1 = wb.getSheetAt(0);
		
		String password = sheet1.getRow(1).getCell(0).getStringCellValue();
		
		return password;
	}
	
}
