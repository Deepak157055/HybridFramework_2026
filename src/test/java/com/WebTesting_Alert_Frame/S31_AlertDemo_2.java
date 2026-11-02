package com.WebTesting_Alert_Frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S31_AlertDemo_2 {
  @Test
  public void testAlert() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  Alert alt1 = driver.switchTo().alert();
	  
	  System.out.println(alt1.getText());
	  
	  Thread.sleep(2000);
	  
	  alt1.accept();
	  
	  WebElement result = driver.findElement(By.id("result"));
	  
	  System.out.println(result.getText());
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  Alert alt2 = driver.switchTo().alert();
	  
	  System.out.println(alt2.getText());
	  
	  Thread.sleep(2000);
	  
	  alt2.dismiss();
	  
	  System.out.println(result.getText());
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  
	  Alert alt3 = driver.switchTo().alert();
	  
	  System.out.println(alt3.getText());
	  
	  Thread.sleep(2000);
	  
	  alt3.sendKeys("Hello Everyone");
	  
	  alt3.accept();
	  
	  System.out.println(result.getText());
	  
	  
  }
}
