package com.WebTesting_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S36_NestedFrame_2 {
  @Test
  public void testFrame() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://admin:admin@the-internet.herokuapp.com/nested_frames");
	  
	  driver.switchTo().frame("frame-top").switchTo().frame("frame-left");
	  
	  System.out.println(driver.getPageSource());
	  
	  driver.switchTo().parentFrame().switchTo().frame("frame-middle");
	  
	  System.out.println(driver.getPageSource());
	  
	  driver.switchTo().parentFrame().switchTo().frame("frame-right");
	  
	  System.out.println(driver.getPageSource());
	  
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame("frame-bottom");
	  
	  System.out.println(driver.getPageSource());
	  
	  
	  
	  
  }
}
