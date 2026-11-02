package com.WebTesting_MouseOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S48_MouseOverAction {
  @Test
  public void testMouseOver() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.naukri.com/");
	  
	  WebElement ele = driver.findElement(By.xpath("//span[text()='Jobs']"));
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(ele).perform();
	  
	  Thread.sleep(2000);
	  
	  List<WebElement> allEle = driver.findElements(By.xpath("//div[contains(@class,'nI-gNb-Jobs')]/ul/li"));
	  
	  for(WebElement i:allEle) {
		  
		  System.out.println(i.getText());
		  
		  if(i.getText().contains("Jobs in Bangalore")) {
			  i.click();
			  break;
		  }
	  }
	  
	  
  }
}
