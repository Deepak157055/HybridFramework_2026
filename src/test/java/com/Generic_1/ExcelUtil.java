package com.Generic_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
    public static XSSFWorkbook wb;
	
	public static String getStringData(String filename,String sheetname,int row,int cell) {
		
		File f1 = new File(System.getProperty("user.dir")+"//TestData//"+filename+".xlsx");
		FileInputStream fs;
		
		try {
			fs = new FileInputStream(f1);
			wb = new  XSSFWorkbook(fs);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	
	public static String getData(String filename,String sheetname,int row,int cell) {
		File f1 = new File(System.getProperty("user.dir")+"//TestData//"+filename+".xlsx");
		FileInputStream fs;
		
		try {
			fs = new FileInputStream(f1);
			wb = new  XSSFWorkbook(fs);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
		
		XSSFCell cl = wb.getSheet(sheetname).getRow(row).getCell(cell);
		//get the type of that cell
		CellType ct = cl.getCellType();
		String data = null;
		
		if(ct==CellType.STRING){
			data = cl.getStringCellValue();
		} else if(ct==CellType.NUMERIC ){
			
		     double d = cl.getNumericCellValue();
		     data = String.valueOf(d);
		} else if(ct==CellType.BOOLEAN ){
			
			boolean b = cl.getBooleanCellValue();
			data = String.valueOf(b);
		}
		return data;
	}

}
