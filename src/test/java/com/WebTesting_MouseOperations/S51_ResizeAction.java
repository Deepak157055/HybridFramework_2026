package com.WebTesting_MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S51_ResizeAction {
  @Test
  public void testResize() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://jqueryui.com/resizable/");
	  
	  driver.switchTo().frame(0);
	  
	  WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'ui-icon')]"));
	  
	  Thread.sleep(2000);
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(ele).dragAndDropBy(ele, 150, 0).build().perform();
	  
	  
	  
	  
	  
	  
  }
}
