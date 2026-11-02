package com.WebTesting_WebTableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S41_RedBusDatePickerAutomation {
  @Test
  public void testRedBusCalender() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();

	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.redbus.in/");
	  
	  String expMonth = "April";
	  String expYear = "2027";
	  String expDate = "11";
	  
	  driver.findElement(By.xpath("//div[@aria-label='Select date of journey']")).click();
	  
	  while(true)
	  {	
	
		  String s1 = driver.findElement(By.xpath("//div[contains(@class,'monthYearHolidayWrap')]")).getText();
		  System.out.println(s1);
		  String currMonth = s1.split(" ")[0];
		  String currYear = s1.split(" ")[1];
		  
		  if(currMonth.contains(expMonth)&& currYear.contains(expYear)) {
			   break;
		     } 
			else {
			
			 driver.findElement(By.xpath("//i[contains(@class,'right')]")).click();
				
			}  
		  
	  }


   List<WebElement> allDates = driver.findElements(By.xpath("//ul//li//div[contains(@class,'dateWrap')]"));
		  
		  for(WebElement i:allDates) {
			  
			  if(i.getText().contains(expDate)) {
				  
				  i.click();
				  break;
			       }
		     }
	  
	
	
    }
  }  

	  
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
