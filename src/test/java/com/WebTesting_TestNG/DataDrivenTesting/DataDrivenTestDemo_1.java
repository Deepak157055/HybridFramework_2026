package com.WebTesting_TestNG.DataDrivenTesting;

import org.testng.annotations.Test;

public class DataDrivenTestDemo_1 {
	
	
  @Test(dataProvider="mydata",dataProviderClass=CustomData.class)
  public void testCase(String un, String pwd) {
  
     System.out.println("Username is :"+ un);
     
     System.out.println("Password is :"+ pwd);
  
    }
}
