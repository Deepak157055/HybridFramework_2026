package com.WebTesting_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S43_JavaScriptExecutor_BasicFeatures {
  @Test
  public void testJavaScriptExecutor() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.freshworks.com/");
	  
	  //get the title
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  String title = js.executeScript("return document.title").toString();
	  
	  System.out.println(title);
	  
	  // to refresh the page
	  
	  // js.executeScript("window.history.go()");
	  
	   js.executeScript("location.reload()");
	   
	   // Element interaction
	   
	   WebElement ele = driver.findElement(By.xpath("//a[text()='Get a demo']"));
	   
	   js.executeScript("arguments[0].click()", ele);
	   
	   Thread.sleep(2000);
	   
	   WebElement fname = driver.findElement(By.name("FirstName"));
	   
	   js.executeScript("arguments[0].value='Deepak';", fname);
	   
	   
	   
	   
	  
	  
	  
	  
  }
}
