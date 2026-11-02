package com.WebTesting_TestNG.ParallelTesting;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting_1 {
  
	  @Test(priority=1)
	  public void chromeTest() 
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		  System.out.println("Title is: "+driver.getTitle());
	  }
	  
	  
	  @Test(priority=2)
	  public void EdgeTest() 
	  {
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.facebook.com");
		  System.out.println("Title is: "+driver.getTitle());
	  }
	  
	  
	  @Test(priority=3)
	  public void firefoxTest() 
	  {
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.amazon.com");
		  System.out.println("Title is: "+driver.getTitle());
	  }
	
	
	
}
