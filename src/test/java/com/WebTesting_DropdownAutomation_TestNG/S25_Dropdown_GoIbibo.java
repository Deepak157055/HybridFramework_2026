package com.WebTesting_DropdownAutomation_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class S25_Dropdown_GoIbibo {
  @Test
  public void testDropdown() throws InterruptedException {
	  
	  ChromeOptions options = new ChromeOptions();
		
	  options.addArguments("--disable-notifications");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.get("https://www.goibibo.com/flights/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("fromCity")).click();
	  
	  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
	  
	  Thread.sleep(10000);
	  
      List<WebElement> dd1 = driver.findElements(By.xpath("//div[contains(@class,'react-autosuggest')]/ul/li/div/div[2]/div"));
	  
	  // List<WebElement> dd1 = driver.findElements(By.xpath("//div[contains(@class,'react-autosuggest')]/ul/li/div/div[2]/p"));
	  
	  System.out.println(dd1.size());
	  
	  for(WebElement i:dd1) {
		  
		  System.out.println(i.getText());
		  
		  if(i.getText().contains("Bathinda, India")) {
			  i.click();
			  break;
		  }
		  
	  }
		  
//	  List<WebElement> dd2 = driver.findElements(By.xpath("//div[contains(@class,'react-autosuggest')]/ul/li/div/div[2]/div/p"));
//	  
//	  System.out.println(dd2.size());
//	  
//	  for(WebElement i:dd2) {
//		  
//		  System.out.println(i.getText());
//		  
//		  if(i.getText().contains("Kozhikode, India")) {
//			  i.click();
//			  break;
//		  }
//		  
//	  }
	  
  }
}
