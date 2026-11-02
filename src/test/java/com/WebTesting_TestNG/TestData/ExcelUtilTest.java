package com.WebTesting_TestNG.TestData;

import org.testng.annotations.Test;

import com.Generic_1.ExcelUtil;

public class ExcelUtilTest {
  @Test(priority=1)
  public void testStringData() {
	  
	  String authorName = ExcelUtil.getStringData("Data", "BookData", 2, 1);
	  System.out.println(authorName);
	  String un = ExcelUtil.getStringData("Data", "UserData", 4, 0);
	  System.out.println(un);
	}
  
  @Test(priority=2)
  public void testDataAsPerType() {
	  
	  String data = ExcelUtil.getData("Data", "BookData", 3, 2);
	  System.out.println(data);
	  double price = Double.valueOf(data);
	  System.out.println((int)price);
	  
	  
	  
  }
}
