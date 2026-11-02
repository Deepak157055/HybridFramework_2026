package com.WebTesting_WindowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S25_MultipleWindowHandling {
  @Test
  public void testMultipleWindow() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	 // driver.manage().window().maximize();
	  
	  String ParentId = driver.getWindowHandle();
	  
	  System.out.println(ParentId);
	  
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  
	  // Thread.sleep(2000);
	  
	  // driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
	  
	  Set<String> allWindowsId = driver.getWindowHandles();
	  
	  List<String> allWindowsHandle = new ArrayList<String>(allWindowsId);
	  
	  System.out.println(allWindowsHandle);
	  
	  
	  
	   for(String i:allWindowsHandle) {
		  if(!ParentId.equals(i)) {
			  driver.switchTo().window(i);
			  System.out.println(driver.getWindowHandle());
			  Thread.sleep(2000);
			  if(driver.getTitle().contains("OrangeHRM")){
				  
			  
			  // driver.findElement(By.xpath("//span[text()='Email address or phone number']")).sendKeys("deepak123");
			  driver.findElement(By.xpath("//button[@aria-label='Close banner']")).click();
			  driver.findElement(By.name("EmailHomePage")).sendKeys("test123@gmail.com");
			  }
			}
		  
	   }
	  
	  driver.switchTo().window(ParentId);
  }
}
