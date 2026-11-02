package com.WebTesting_TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase4_Assertion {
  @Test(enabled=false)
  public void testHardAssertion() {
	  
	  String act="Selenium webdriver is webui automation api";
	  String exp="TestNG";
	  
	 // Assert.assertEquals(act,exp,"Test Fail: Strings are not equal");
	  
	 // Assert.assertTrue(act.contains(exp),"Test Fail: Strings are not equal");
	  
	 // Assert.assertFalse(act.contains(exp), "Test Fail: Strings are equal"); // to validate negative scenario
	  
	  System.out.println("Test Pass: Strings are not equal");
	  
	  System.out.println("--------------------");
	  
	  System.out.println("--------------------");
	  
	  System.out.println("--------------------");
	 
  }  
	@Test
    public void testSoftAssertion() {
	
		SoftAssert sf = new SoftAssert();
		
		String act="Selenium webdriver is webui automation api";
		String exp="TestNG";
		
		Assert.assertEquals(act,exp,"Test Fail: Strings are not equal");
		
		  System.out.println("Test Pass: Strings are equal");
		  
		  System.out.println("--------------------");
		  
		  System.out.println("--------------------");
		  
		  System.out.println("--------------------");
		  
		  sf.assertAll();  // To get correct output
		
		
	}
}
