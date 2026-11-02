package com.WebTesting_WebTableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S42_GoIbiboDatePickerAutomation {
  @Test
  public void testGoIbibo() {
	  
	  WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.goibibo.com/flights/");
      driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//span[text()='Departure']")).click();
      
      String expMonth = "April";
      String expYear = "2027";
      String expDate = "11";
	  
	  while(true) {
		  String g1 = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		  System.out.println(g1);
		  String currMonth = g1.split(" ")[0];
		  String currYear = g1.split(" ")[1];
	  
	  if(currMonth.contains(expMonth)&&currYear.contains(expYear)) {
		  break;
	    }
	  else {
		 driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton--next')]")).click();
		    
	     }
	  
	}  
	  
  List<WebElement> allDates = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[1]//div[@class='dateInnerCell']/p[1]"));
		 for(WebElement i:allDates) {
			 
			 if(i.getText().contains(expDate)) {
				 
				 i.click();
				 
				 break;
			 }
			 
		 }  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
