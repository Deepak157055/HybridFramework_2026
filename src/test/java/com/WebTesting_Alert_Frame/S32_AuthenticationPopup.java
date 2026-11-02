package com.WebTesting_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S32_AuthenticationPopup {
  @Test
  public void testPopup() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  WebElement ele = driver.findElement(By.xpath("//p"));
	  
	  System.out.println(ele.getText());
	  
	  	  
	  
  }
}
