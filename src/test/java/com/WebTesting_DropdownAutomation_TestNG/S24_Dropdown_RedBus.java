package com.WebTesting_DropdownAutomation_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S24_Dropdown_RedBus {
  @Test
  public void testDropdown() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.redbus.in/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement e1 = driver.findElement(By.xpath("(//div[@class='srcDestWrapper___e85828 '])[1]"));
	  
	  e1.click();
	  
      driver.findElement(By.xpath("//div/input[@id='srcinput']")).sendKeys("Belur");
      
      Thread.sleep(10000);
	  
	  By dd = By.xpath("//div[contains(@class,'listHeader___19289f')]");
	  
	  List<WebElement> allOptions = driver.findElements(dd);
	  
	  System.out.println(allOptions.size());
	  
	  Actions actions = new Actions(driver);
	  
	  for(WebElement i:allOptions) {
		  
		  System.out.println(i.getText());
		  
		  if(i.getText().contains("Central Bus Stand Cbt, Belagavi")) {
			 
			  actions.moveToElement(i).perform();
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
  }
}
