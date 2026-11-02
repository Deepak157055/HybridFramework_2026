package com.WebTesting_TestNG.DataDrivenTesting;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

public class CustomData {
	
	public static XSSFWorkbook wb;

	@DataProvider(name = "mydata")
	public Object[][] testData() {
		
		Object[][] data = { {"standard_user","secret_sauce"},{"problem_user","secret_sauce"},{"visual_user","secret_sauce"},{"Arun","Arun123"}};
		
	     return data;
	}
	
	@DataProvider(name="exceldata")
	public static Object[][] excelData() {
		
		File f1 = new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		Object arr[][]=null;
		
		try {
			FileInputStream fs = new FileInputStream(f1);
			wb = new XSSFWorkbook(fs);
			int rows = wb.getSheet("Sauce").getPhysicalNumberOfRows();
			int cells = wb.getSheet("Sauce").getRow(0).getPhysicalNumberOfCells();
			arr = new Object[rows-1][cells];
			
			for(int i=1;i<rows;i++) {
				
				for(int j=0;j<cells;j++) {
					
				arr[i-1][j] = wb.getSheet("Sauce").getRow(i).getCell(j).getStringCellValue();
					
				}
				
			}
						
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return arr;
		
	}
	
	
	
}
