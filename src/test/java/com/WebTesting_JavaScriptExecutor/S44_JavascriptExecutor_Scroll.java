package com.WebTesting_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

public class S44_JavascriptExecutor_Scroll {
  @Test
  public void testScroll() throws InterruptedException {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.freshworks.com/");
	  
	  // JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  // scrollDown
	  
	  // js.executeScript("window.scrollTo(0,5000)");
	  
	  // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Utility.scrollDown(driver);
	  
	  Thread.sleep(2000);
	  
	  // scrollUp
	  
	  // js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  Utility.scrollUp(driver);
	  
	  // scrollUp to the element
	  
	  WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'bfuA-Dn bEfqHm')]//h2/span"));
	  
	  // js.executeScript("arguments[0].scrollIntoView(true);", ele);
	  
	  Utility.scrollUpToElement(driver,ele);
	  
	  
	  
	  
	  
	  
	  
  }
}
