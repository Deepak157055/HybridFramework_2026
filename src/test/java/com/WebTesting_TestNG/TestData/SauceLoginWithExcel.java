package com.WebTesting_TestNG.TestData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_1.ExcelUtil;

public class SauceLoginWithExcel {
  @Test
  public void testSauceLogin() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.saucedemo.com/");
	  
	  driver.findElement(By.name("user-name")).sendKeys(ExcelUtil.getStringData("Data", "Sauce", 1, 0));
	  
	  driver.findElement(By.id("password")).sendKeys(ExcelUtil.getData("Data", "Sauce", 1, 1));
	  
	  driver.findElement(By.id("login-button")).click();
	  
	  
  }
}
