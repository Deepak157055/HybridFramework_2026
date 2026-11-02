package com.WebTesting_MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S49_DragandDropAction {
  @Test
  public void testDragandDrop() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://jqueryui.com/droppable/#default");
	  
	  driver.switchTo().frame(0);
	  
	  Thread.sleep(2000);
	  
	  WebElement srce = driver.findElement(By.id("draggable"));
	  
	  WebElement dest = driver.findElement(By.id("droppable"));
	  
	  Actions act = new Actions(driver);
	  
	  act.dragAndDrop(srce, dest).perform();
	  
	  
	  
	  
	  
  }
}
