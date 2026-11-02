package com.WebTesting_WindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S28_NewWindowMethodInSelenium {
  @Test
  public void newWindow() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
	  
	  newTab.get("https://www.amazon.in/");
	  
	  WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
	  
	  newWindow.get("https://www.facebook.com");
	  
	  
	  
  }
}
