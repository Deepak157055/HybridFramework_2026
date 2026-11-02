package com.WebTesting_MouseOperations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S47_DoubleClickAction {
  @Test
  public void testDoubleClick() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement ele = driver.findElement(By.tagName("button"));
	  
	  Actions act = new Actions(driver);
	  
	  act.doubleClick(ele).perform();
	  
	  Alert alt = driver.switchTo().alert();
	  
	  Thread.sleep(1000);
	  
	  System.out.println(alt.getText());
	  
	  alt.accept();
	  
	  
	  
  }
}
