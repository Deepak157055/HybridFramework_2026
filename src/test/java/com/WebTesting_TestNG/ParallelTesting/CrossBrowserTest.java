package com.WebTesting_TestNG.ParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
  
  public WebDriver driver;
	
  @Parameters({"bname"})
  @Test
  public void testCrossBrowser(String bname) {
	  
	  if(bname.equals("chrome")) {
	  driver = new ChromeDriver();
	  }
	  else if(bname.equals("edge")) {
		  driver = new EdgeDriver();
	  }
	  else if(bname.equals("firefox")) {
		  driver = new FirefoxDriver();
	  }
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.saucedemo.com/v1/");
	  driver.findElement(By.id("user-name")).sendKeys("Robot");
	  
  }
}
