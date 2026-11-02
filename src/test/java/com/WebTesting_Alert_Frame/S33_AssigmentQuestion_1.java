package com.WebTesting_Alert_Frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S33_AssigmentQuestion_1 {
  @Test
  public void testAlert() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  WebElement result = driver.findElement(By.id("result"));
	  
	  //Thread.sleep(10000);
	  
	  List<WebElement> allLinks = driver.findElements(By.xpath("//ul/li/button"));
	  
	  System.out.println(allLinks.size());
	  
	  for(WebElement i:allLinks) {
		  
		  i.click();
		  Thread.sleep(2000);
		  Alert alt = driver.switchTo().alert();
          System.out.println(alt.getText());
          if(alt.getText().contains("I am a JS prompt")) {
        	  alt.sendKeys("I am Deepak BM");
          }
		  alt.accept();
		  System.out.println(result.getText());
		  
	 }
	  
	  
  }
}
