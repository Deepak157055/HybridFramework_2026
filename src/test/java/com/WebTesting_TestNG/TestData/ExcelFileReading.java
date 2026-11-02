package com.WebTesting_TestNG.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.Generic_1.ExcelUtil;

public class ExcelFileReading {
  @Test
  public void testExcelFile() throws IOException {
	  
	  // File Path
	  File f1 = new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  // read file in stream
	  FileInputStream fs = new FileInputStream(f1);
	  
	  // Excelfile: Wb-->sheet-->row-->cell-->data
	  XSSFWorkbook wb = new  XSSFWorkbook(fs);
	  
	  // to get single record
	  String s1 = wb.getSheet("UserData").getRow(1).getCell(1).getStringCellValue();
	  
	  System.out.println(s1);
	  
	  // to get all data
	  int rows = wb.getSheet("UserData").getPhysicalNumberOfRows();
	  
	  int cells = wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
	  
	 // System.out.println(rows); 5
	  
	 // System.out.println(cells); 2
	  
	  Object[][] arr = new Object[rows-1][cells];
	  
	  for(int i=1;i<rows;i++) {
		  
		  for(int j=0;j<cells;j++) {
			  
			  arr[i-1][j] = wb.getSheet("UserData").getRow(i).getCell(j).getStringCellValue();
			  
			  System.out.print(arr[i-1][j] + " ");
		  }
		  
		  System.out.println();
		  
	  }
	  
	  
	  
	  
	  
	  
	  
  }
}
