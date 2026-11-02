package com.WebTesting_TestNG.Annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RealtimeUseofAnnotation extends BaseClass {
	
//   public WebDriver driver; 
 
//   @BeforeClass
//   public void setUp() {
//		  driver = new ChromeDriver();
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		  driver.get("https://automationplayground.com/crm/");
//	 }
//   
//   @BeforeMethod
//   public void testUrl() {
//	   
//	   System.out.println(driver.getCurrentUrl());
//   }
//   
//   @AfterMethod
//   public void testTitle() {
//	   System.out.println(driver.getTitle());
//   }
	
  @Test(priority=1)
  public void testSignInLink() {
	  
      WebElement link = driver.findElement(By.linkText("Sign In"));
	  if(link.isDisplayed() && link.isEnabled()) {
		  link.click();
	  }
    }	
    
    @Test(priority=2)
    public void testLogin() {
    	
  	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
  	  driver.findElement(By.id("password")).sendKeys("test123");
  	  driver.findElement(By.id("submit-id")).click();
	    
  }


//  @AfterClass
//  public void tearDown() {
//	  driver.findElement(By.linkText("Sign Out")).click();
//	  driver.quit(); 
//	  
//  }
  
  

}
