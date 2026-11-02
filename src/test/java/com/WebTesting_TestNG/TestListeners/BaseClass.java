package com.WebTesting_TestNG.TestListeners;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.aventstack.chaintest.plugins.ChainTestListener;


public class BaseClass {
	
	 public WebDriver driver;
	 // public ExtentTest test;
	
	 @BeforeClass
     public void setUp() {
    	 
    	 driver = new ChromeDriver();
    	 driver.get("https://automationplayground.com/crm/");
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
        }
	 
   //  attached screenshot for failure
     @AfterMethod 
	 public void screenShot(ITestResult result) {
		 
		 if(!result.isSuccess()) {
			
			// Utility.getScreenshot(driver,"CRM");
			 
			 TakesScreenshot ts = (TakesScreenshot) driver;
			 byte arr[] = ts.getScreenshotAs(OutputType.BYTES);
			 ChainTestListener.embed(arr, "image/png");
			 
		 }

	 }
      
}
