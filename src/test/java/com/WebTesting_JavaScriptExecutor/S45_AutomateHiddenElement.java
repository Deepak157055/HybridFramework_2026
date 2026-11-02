package com.WebTesting_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S45_AutomateHiddenElement {
  @Test
  public void testHidden() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.letskodeit.com/practice");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.id("hide-textbox")).click();
	  
	  // driver.findElement(By.id("displayed-text")).sendKeys("Deepak");
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  js.executeScript("document.getElementById('displayed-text').value='Deepak';");
	  
	  driver.findElement(By.id("show-textbox")).click();
	  
	  Thread.sleep(1000);
	  
	  js.executeScript("document.getElementById('name').value='Dayanand';");
	  
	  js.executeScript("document.getElementById('confirmbtn').click()");
	  
	  Alert alt1 = driver.switchTo().alert();
	  
	  System.out.println(alt1.getText());
	  
	  Thread.sleep(1000);
	  
	  alt1.dismiss();
	  
	  // check checkBox
	  
	  js.executeScript("document.getElementById('hondacheck').checked=true;");
	  
	  Thread.sleep(1000);
	  
	  // check radio button
	  
	  js.executeScript("document.getElementById('hondaradio').checked=true");
	  
	  Thread.sleep(1000);
	  
	  js.executeScript("alert('TestCase Pass')");
	  
	  Alert alt2 = driver.switchTo().alert();
	  
	  Thread.sleep(1000);
	  
	  System.out.println(alt2.getText());
	  
	  alt2.accept();
	  
	  
	  
	  
	  
	  
  }
}
