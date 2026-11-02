package com.WebTesting_Capabilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S69_FileUploadUsingRobotClass {
  @Test
  public void testRobot() throws AWTException, InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  WebElement ele = driver.findElement(By.xpath("//input[@id='file-upload']"));
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(ele).click().build().perform();
	  
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  js.executeScript("document.getElementById('file-upload').click()", ele);
	  
	  
	 //file explorer is windows feature: Robot class from Java
	  Robot rb = new Robot();
	  rb.delay(4000);
	  
	  String path = "C:\\Users\\deepa\\Downloads\\Python4.txt";
	  StringSelection sc = new StringSelection(path);
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
	  
	  //press key
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  //release key
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  //Enter
	  rb.keyPress(KeyEvent.VK_ENTER);
	  
	  Thread.sleep(2000);
	  
	  //upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  Thread.sleep(2000);
	  
	  WebElement ele1 = driver.findElement(By.tagName("h3"));
	  
	 // WebElement ele2 = driver.findElement(By.tagName("h1"));
	  
	  if(ele1.isDisplayed()) {
	  String s1 = ele1.getText();
	  System.out.println(s1);
	  }
	  
//	  driver.navigate().to("https://the-internet.herokuapp.com/download");
//	  
//	  Thread.sleep(2000);
//	  
//	  List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='example']//a"));
//	  
//	  for(WebElement i:allLinks) {
//		  
//		  if(i.getText().contains("Python4.txt")) {
//			  i.click();
//		  }
//		  
//	  }
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
