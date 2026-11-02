package com.WebTesting_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S34_SimpleFrameDemo {
  @Test
  public void testFrame() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.testmuai.com/selenium-playground/iframe-demo/");
	  
	  driver.manage().window().maximize();
	  
	  // Switch to frame by index
	  driver.switchTo().frame(0);
	  
	  WebElement ele = driver.findElement(By.className("rsw-ce"));
	  
	  ele.clear();
	  
	  ele.sendKeys("Deepak");
	  
	  driver.switchTo().defaultContent();
	  
	// Switch to frame by id or name
	   
	// driver.switchTo().frame("iFrame2");
	  
	// Switch to frame by WebElement
	  
	  WebElement frameEle = driver.findElement(By.id("iFrame2"));
	  
	  driver.switchTo().frame(frameEle);
	  
	  driver.findElement(By.xpath("(//button[contains(@class,'DocSearch-Button')])[1]")).click();
	  
	  driver.findElement(By.id("docsearch-input")).sendKeys("Document search");
	  
	  driver.findElement(By.id("embeddedMessagingConversationButton")).click();
	  
      driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(0);
	  
	  ele.clear();
	  
	  ele.sendKeys("B M");
	  
  }
}
