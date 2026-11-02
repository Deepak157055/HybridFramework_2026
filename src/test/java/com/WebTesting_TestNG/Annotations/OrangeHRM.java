package com.WebTesting_TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM extends BaseClass{
  @Test
  public void testOrangeLogin() {

	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[contains(@class,orangehrm-login-button)]")).click();
	  
     }
	
   @Test
   public void testOrangeLogout() {
	  driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
  }
}
