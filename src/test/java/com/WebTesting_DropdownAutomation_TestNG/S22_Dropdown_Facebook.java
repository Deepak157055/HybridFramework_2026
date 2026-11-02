package com.WebTesting_DropdownAutomation_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

public class S22_Dropdown_Facebook {
  @Test
  public void testDropdown() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	  
	  // Date Selection
	  driver.findElement(By.id("_r_3_")).click();
	  By dd = By.xpath("//div[@role='option' and @tabindex='-1']");
	  Utility.bootStrapBasedDropdown(driver, dd, "20");
	  
//	  List<WebElement> allOptions = driver.findElements(dd);
//      
//      System.out.println(allOptions.size());
//      
//      Thread.sleep(2000);
//      
//      for(WebElement i:allOptions) {
//    	  
//    	 System.out.println(i.getText());
//    	 
//    	 if(i.getText().contains("20"))
//    	 {
//    		 i.click();
//    		 
//    		 break;
//    	 }
//      }
	  
	  // Month Selection
	  driver.findElement(By.id("_r_9_")).click();
	  Utility.bootStrapBasedDropdown(driver, dd, "March");
	  
//      List<WebElement> allOptions2 = driver.findElements(By.xpath("//div[@role='option' and @tabindex='-1']"));
//      
//      System.out.println(allOptions2.size());
//      
//      Thread.sleep(2000);
//      
//      for(WebElement i:allOptions2) {
//    	  
//    	 System.out.println(i.getText());
//    	 
//    	 if(i.getText().contains("March"))
//    	 {
//    		 i.click();
//    		 
//    		 break;
//    	 }
//      }
	  
	  // Year Selection
	  driver.findElement(By.id("_r_f_")).click();
	  Utility.bootStrapBasedDropdown(driver, dd, "2020");
	  
//      List<WebElement> allOptions3 = driver.findElements(By.xpath("//div[@role='option' and @tabindex='-1']"));
//      
//      System.out.println(allOptions3.size());
//      
//      Thread.sleep(2000);
//      
//      for(WebElement i:allOptions3) {
//    	  
//    	 System.out.println(i.getText());
//    	 
//    	 if(i.getText().contains("2020"))
//    	 {
//    		 i.click();
//    		 
//    		 break;
//    	 }
//      }
	  
	  
  }
}
