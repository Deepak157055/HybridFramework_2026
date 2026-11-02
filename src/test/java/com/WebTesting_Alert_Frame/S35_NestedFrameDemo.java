package com.WebTesting_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S35_NestedFrameDemo {
  @Test
  public void testFrame() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  driver.switchTo().frame(0);
	  
	  driver.findElement(By.name("mytext1")).sendKeys("Deepak B M");
	  
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(1);
	  
	  driver.findElement(By.name("mytext2")).sendKeys("Bangalore");
	  
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(2);
	  
	  WebElement input3 = driver.findElement(By.name("mytext3"));
	  
	  input3.sendKeys("Belur");
	  
	  Thread.sleep(2000);
	  
	  //parent --->child(iframe)
	  
	  WebElement frameElement = driver.findElement(By.tagName("iframe"));
	  
	  driver.switchTo().frame(frameElement);
	  
	  driver.findElement(By.id("i9")).click();
	  
	  //child ---->parent -->clear text-->add next text
	  //parentFrame():Change focus to the parent context
	  
	  driver.switchTo().parentFrame();
	  
	  input3.clear();
	  
	  input3.sendKeys("Hello Everyone");
	  
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(3);
	  
	  driver.findElement(By.name("mytext4")).sendKeys("karnataka");
	  
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(4);
	  
	  driver.findElement(By.name("mytext5")).sendKeys("India");
	  
  }
}
