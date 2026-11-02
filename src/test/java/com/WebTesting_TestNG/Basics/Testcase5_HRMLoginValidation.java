package com.WebTesting_TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase5_HRMLoginValidation {
  @Test
  public void testHRMLogin() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  
	  driver.findElement(By.xpath("//button[contains(@class,orangehrm-login-button)]")).click();
	  
	  Thread.sleep(2000);
	  
	  String act = driver.getCurrentUrl();
	  
	  String exp = "dashboard";
	  
	  Assert.assertTrue(act.contains(exp), "Test Fail:Url not contains dashboard");
	  
	  System.out.println("Test Pass:Url contains dashboard ");
	  
	  driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']")).click();
	  
	  driver.findElement(By.linkText("Logout")).click();
	  
	  
	  
	  
  }
}
