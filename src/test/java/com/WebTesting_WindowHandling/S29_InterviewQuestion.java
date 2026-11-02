package com.WebTesting_WindowHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S29_InterviewQuestion {
  @Test
  public void testTab() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.google.in/");
	  
	  // Create a list to store all tab/window handles
	  
	  List<String> tabHandles = new ArrayList<>();
	  
	  tabHandles.add(driver.getWindowHandle());  // add google
	  
	  
	   // Open 10 Facebook tabs
	  
	  for(int i=1;i<=10;i++) {
		  
		  WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
		  newTab.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  tabHandles.add(driver.getWindowHandle());
		  
	  }
	  
	    Thread.sleep(2000);  
	 // Switch to the 5th Facebook tab (Google is at index 0, so Facebook tabs start from 1)
	    String fifthFacebookTab = tabHandles.get(5);
	    System.out.println(fifthFacebookTab);
	    driver.switchTo().window(fifthFacebookTab);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("deepak123");
	  
  }
}
