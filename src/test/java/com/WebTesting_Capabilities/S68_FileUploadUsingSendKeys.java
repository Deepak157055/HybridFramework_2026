package com.WebTesting_Capabilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S68_FileUploadUsingSendKeys {
  @Test
  public void testFileUpload() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose file: element have argument type="file"
	  
	  String path = "C:\\Users\\deepa\\Downloads\\Dummy456.txt";
	  
	  driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(path);
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("file-submit")).click();
	  
	  Thread.sleep(1000);
	  
	  String s1 = driver.findElement(By.tagName("h3")).getText();
	  
	  System.out.println(s1);
	  
	  
	  
	  
  }
}
