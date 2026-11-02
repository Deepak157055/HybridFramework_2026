package com.WebTesting_Capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class S66_IncognitoAndMaximizeCapability {
  @Test
  public void testIncognitoAndMaximize() {
	  
	  ChromeOptions options = new ChromeOptions();
	  
	  options.addArguments("--incognito");
	  
	  options.addArguments("start-maximized");
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.get("https://www.google.com/");
	  
	  
	  
  }
}
