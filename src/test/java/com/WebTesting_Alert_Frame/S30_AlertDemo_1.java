package com.WebTesting_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S30_AlertDemo_1 {
  @Test
  public void testAlert() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  driver.findElement(By.id("login1")).sendKeys("Deepak");
	  
	  driver.findElement(By.name("proceed")).click();
	  
	  Alert alt = driver.switchTo().alert();
	  
	  System.out.println(alt.getText());
	  
	  Thread.sleep(2000);
	  
	  alt.accept();
	  
	  driver.findElement(By.id("password")).sendKeys("Test123");
	  
  }
}
