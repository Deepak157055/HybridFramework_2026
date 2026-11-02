package com.WebTesting_WebTableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S38_DynamicWebTableAutomation {
  @Test
  public void testDynamicWebTable() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele = driver.findElement(By.xpath("//table[@id='taskTable']"));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  // to find required heading
	  int colNo = 0;
	  int rowNo = 0;
	  String expHeading = "Name";
	  String expBname = "Chrome";
      List<WebElement> allHeadings = driver.findElements(By.xpath("//table[@id='taskTable']//th"));
      System.out.println(allHeadings.size());
      for(WebElement i:allHeadings) {
    	  colNo++;
    	  //System.out.println(i.getText());
    	  if(i.getText().contains(expHeading)) {
    		  // Search where chrome is present
    		  List<WebElement> pRdata = driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr/td["+colNo+"]"));
    		  for(WebElement j:pRdata) {
    			  rowNo++;
    			  if(j.getText().contains(expBname)) {
    				 // search where cpu% is present
    				  List<WebElement> pCdata = driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr["+rowNo+"]/td"));
    				  for(WebElement k:pCdata) {
    					  System.out.println(k.getText());
    				  }
    				  
    			  }
    		  }
    		 
    	  }
    	  
      }
      
      
	  
	  
	  
  }
}
