package com.WebTesting_WindowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

public class S27_MultipleWindowHandling_InterviewQuestion {
  @Test
  public void testWindowHandling() throws InterruptedException {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  String parentId = driver.getWindowHandle();
	  
	  Thread.sleep(2000);
	  
	  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	  
	  System.out.println(allLinks.size());
	  
	  for(WebElement i:allLinks) {
		  
		  Thread.sleep(1000);
		  i.click();
	  }
	  
	  
	  String expTitle = "Facebook";
	  Set<String> allSwh = driver.getWindowHandles();
	  List<String> allLwh = new ArrayList<String>(allSwh);
	  
	  Boolean b = Utility.switchToRightWindow(driver, allLwh, expTitle);
	  
	    if(b){
			System.out.println(driver.getCurrentUrl());  
	    } 
//	  
//	  for(String i:allLwh) {
//		  
//		  String actTitle = driver.switchTo().window(i).getTitle();
//		  
//		  if(actTitle.contains(expTitle)) {
//			  System.out.println("Found right Window : "+expTitle);
//			  break;
//		  }
//	  }
	  
     // driver.switchTo().window(parentId);
	  
	  Utility.switchToParentWindow(driver, parentId);
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  driver.findElement(By.name("password")).sendKeys("admin123");
      
//	  for(String i:allLwh) {
//		  
//		  if(!parentId.equals(i)) {
//			  
//			  driver.switchTo().window(i).close();
//			  
//		  }
//		  
//	  }
	  
	  Utility.closeAllWindows(driver, allLwh, parentId);
	  
  }
}
