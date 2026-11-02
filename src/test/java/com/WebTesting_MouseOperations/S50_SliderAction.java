package com.WebTesting_MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S50_SliderAction {
  @Test
  public void testSlider() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://jqueryui.com/slider");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.switchTo().frame(0);
	  
	  WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	  
	  Thread.sleep(2000);
	  
	  Actions act = new Actions(driver);
	  
	  act.clickAndHold(slider).moveToElement(slider, 200, 0).build().perform();
	  
	   //  act.clickAndHold(slider).dragAndDropBy(slider, 250, 0); -> will not work
	  
	  
	  
	  
	  
  }
}
