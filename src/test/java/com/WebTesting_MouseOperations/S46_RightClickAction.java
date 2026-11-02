package com.WebTesting_MouseOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S46_RightClickAction {
  @Test
  public void testRightClick() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  Actions act = new Actions(driver);
	  
	  act.contextClick(ele).perform();
	  
	  Thread.sleep(1000);
	  
	  List<WebElement> allEle = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li/span"));
	  
	  for(WebElement i:allEle) {
		  
		  if(i.getText().contains("Copy")) {
			  i.click();
			  break;
		  }
	  }
	  
	  Alert alt = driver.switchTo().alert();
	  
	  Thread.sleep(1000);
	  
	  System.out.println(alt.getText());
	  
	  alt.accept();
	  
	  
  }
}
