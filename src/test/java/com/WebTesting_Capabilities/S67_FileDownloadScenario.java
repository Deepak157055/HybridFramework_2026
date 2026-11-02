package com.WebTesting_Capabilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class S67_FileDownloadScenario {
  @Test
  public void testFileDownload() {
	  
	  String path = "C:\\Users\\deepa\\SeleniumJava\\SeleniumMaven_2";
	  
	  //download to required directory from default 
	  ChromeOptions options = new ChromeOptions();
	  Map<String,Object> prefs = new HashMap<String,Object>();
	  prefs.put("download.default_directory",path);
	  options.setExperimentalOption("prefs", prefs);
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/download");
	  
	  driver.findElement(By.linkText("ornek.txt")).click();
	  
	  
	  
	  
  }
}
