package com.WebTesting_WindowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S26_xyz {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://orangehrm.com/");
	  
	  driver.findElement(By.xpath("//button[@aria-label='Close banner']")).click();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;

	 // js.executeScript("window.scrollTo(0,3000)");
	  
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
	  
	  String ParentId = driver.getWindowHandle();
	  
	  System.out.println(ParentId);
	  
	  driver.findElement(By.xpath("//a[@href='https://orangehrm.com/company/contact']")).click();
	  
	  driver.findElement(By.xpath("//a[@href='https://orangehrm.com/company/press-releases']")).click();
	  
	  driver.findElement(By.xpath("//a[@href='https://orangehrm.com/company/news-articles']")).click();
	  
	  driver.findElement(By.xpath("//a[@href='https://orangehrm.com/company/careers']")).click();
	  
	  Thread.sleep(2000);
	  
	  Set<String> allWindowIds = driver.getWindowHandles();
	  
	  List<String> allWindowHandle = new ArrayList<String>(allWindowIds);
	  
	  for(String i:allWindowHandle) {
		  
		if(!ParentId.equals(i)) {
		  
		  driver.switchTo().window(i);
		  
		  System.out.println(driver.getWindowHandle());
		  
		  Thread.sleep(2000);
		  
		    if(driver.getTitle().contains("OrangeHRM Newsroom")) {
			  
			  driver.findElement(By.id("searchBar")).sendKeys("Deepak Kumar BM");
			  
			  break;
		    }
		 }  
	  }
	  
	  Thread.sleep(2000);
	  driver.switchTo().window(ParentId);
	  
	  
  }
}
