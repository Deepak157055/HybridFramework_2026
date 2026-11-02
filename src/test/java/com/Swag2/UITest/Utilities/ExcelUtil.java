package com.Swag2.UITest.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static XSSFWorkbook wb;
	
	public static String getStringData(String sname,int row, int cell) {
		
		//path of the file
		File f1 = new File(System.getProperty("user.dir")+"//TestData_3//Data.xlsx");
		
		//read the file
		FileInputStream fs;
		
		try {
			fs = new FileInputStream(f1);
			wb = new XSSFWorkbook(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return wb.getSheet(sname).getRow(row).getCell(cell).getStringCellValue();
		
   }
   public static String getData(String sname,int row, int cell) {
	   
	   File f1 = new File(System.getProperty("user.dir")+"//TestData_3//Data.xlsx");
	   
	   FileInputStream fs;
	try {
		fs = new FileInputStream(f1);
		wb = new XSSFWorkbook(fs);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	 XSSFCell cellValue = wb.getSheet(sname).getRow(row).getCell(cell); 
	 CellType ct = cellValue.getCellType();
	 String data=null;
	 
	 switch(ct) {
	 
	 case STRING:
		 data = cellValue.getStringCellValue();
	     break;
	 case NUMERIC:
		 double d = cellValue.getNumericCellValue();
		 data = String.valueOf(d);
		 break;
	 case BOOLEAN:
		 boolean b = cellValue.getBooleanCellValue();
		 data = String.valueOf(b);
		 break;
	default:
		break;
	 
	 }
	  
	 return data;
	   
   }
	

}
