package com.WebTesting_WebTableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S37_StaticWebTableAutomation {
  @Test
  public void testStaticWebTable() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele = driver.findElement(By.xpath("//table[@name='BookTable']"));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  List<WebElement> allHeadings = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
	  
	  System.out.println(allHeadings.size());
	  
	  int colNo = 0;
	  int rowNo = 1;
	  
	  String expColName = "Subject";
	  String expRowName = "JAVA";
	  
	  for(WebElement i:allHeadings) {
		  colNo++; // to get column position
		  if(i.getText().contains(expColName)) {
				// get the data of that particular column
				List<WebElement> colData = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td["+colNo+" ]"));
				for(WebElement k:colData) {
					rowNo++; // to get row position
					if(k.getText().contains(expRowName)) {
						// get the data of specific row
						List<WebElement> rowData = driver.findElements(By.xpath("//table[@name='BookTable']//tr["+rowNo+"]/td"));
		                 for(WebElement j:rowData ) {
		    		    	System.out.print(j.getText()+" ");
			              }
						
				       }
				  
				   			   
			     }
			  
		    }
		  	
		  
	     }
	  
	  	  
	  
  }
}
