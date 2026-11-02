package com.WebTesting_TestNG.TestListeners;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import com.aventstack.chaintest.plugins.ChainTestListener;



// @Listeners(com.WebTesting_TestNG.TestListeners.MyListeners.class)
   @Listeners(ChainTestListener.class)

public class TestListeners extends BaseClass {
  @Test(priority=1)
  public void testCase1() {
	  //Assert.assertEquals(true, true);
	 // System.out.println("Testcase 1 pass......");
	  WebElement link=driver.findElement(By.linkText("Sign In"));
	  if(link.isDisplayed() && link.isEnabled())
	  {
		  link.click();
		  Assert.assertTrue(driver.getTitle().contains("Customer Service"),"TestCase1 fail.......");
		  System.out.println("Testcase1 pass...");
		  ChainTestListener.log("Sign in Link is working.......");
	  }
	  
  }
  
  @Test(priority=2)
  public void testCase2() {
	 //Assert.assertEquals(true, false);
	// System.out.println("Testcase 2 pass......");
	  ChainTestListener.log("testcase 2 started executing");
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id236")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Testcase2 fail........");
	  System.out.println("Testcase2 pass...");
	  ChainTestListener.log("testcase 2 got completed");
	  }
  
   @Test(priority=3,dependsOnMethods="testCase2")
   public void testCase3() {
    	
	   driver.findElement(By.linkText("Sign Out")).click();
	   Assert.assertTrue(driver.getCurrentUrl().contains("sign-out"),"TestCase3 fail.......");
	   System.out.println("Testcase3 pass...");
	   ChainTestListener.log("testCase3 got completed");
    }
  
}
