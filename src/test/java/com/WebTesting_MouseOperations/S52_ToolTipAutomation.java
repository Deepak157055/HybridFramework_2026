package com.WebTesting_MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S52_ToolTipAutomation {
  @Test
  public void testToolTip() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://jqueryui.com/tooltip/");
	  
	  driver.switchTo().frame(0);
	  
	  WebElement ele = driver.findElement(By.id("age")); 
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(ele).perform();
	  
	  Thread.sleep(2000);
	  
	  String toolTipText = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
	  
	  System.out.println(toolTipText);
	  
	  
	  
	  
	  
	    
	  
	  
  }
}
