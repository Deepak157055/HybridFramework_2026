package com.WebTesting_Capabilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class S65_HeadLessBrowserTest {
  @Test
  public void testHeadLessBrowser() throws InterruptedException {
	  
	  ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--headless");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  System.out.println("Driver session is created...");
	  
	  driver.get("https://www.google.com/");
	  
	  System.out.println("Application open...");
	  
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Playwright");
	  
	  Thread.sleep(2000);
	  
	  List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id='Alh6id']//ul[@class='G43f7e']//li//div[contains(@class,'wM6W7d')]//span"));
	  
	  for(WebElement i:allOptions) {
		  
		  System.out.println(i.getText());
		  
		  if(i.getText().contains("playwright tutorial")) {
			  i.click();
			  System.out.println("Element got Clicked...");
			  break;
		  }
		  
	  }
	  
	  
	  
	  
	  
	  
	  
  }
}
