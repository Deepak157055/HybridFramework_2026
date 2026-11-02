package com.WebTesting_TestNG.TestData;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class TestDataUsingXMLFile {
	
  @Parameters({"un","pwd"})	
  @Test
  public void testDataFromXmlFile(String username,String password) {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
	  
  }
}
