package com.WebTesting_TestNG.Annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
  
	   public WebDriver driver; 
	   
	   @BeforeClass
	   public void setUp() {
			  driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  // driver.get("https://automationplayground.com/crm/");
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 }
	   
	   @BeforeMethod
	   public void testUrl() {
		   
		   System.out.println(driver.getCurrentUrl());
	   }
	   
	   @AfterMethod
	   public void testTitle() {
		   System.out.println(driver.getTitle());
	   }
	
	
	   @AfterClass
	   public void tearDown() {
	 	  // driver.findElement(By.linkText("Sign Out")).click();
	 	  driver.quit(); 
	 	  
	   }
	
	
	
}
