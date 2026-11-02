package com.WebTesting_Capabilities;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S64_GetAppCapabilitiesforBrowser {
  @Test
  public void testCapab() {
	  
	  ChromeDriver driver = new ChromeDriver();
	  
	  Capabilities capab = driver.getCapabilities();
	  
	  Map<String,Object> allcapab = capab.asMap();
	  
	  // System.out.println(allcapab);
	  
	  String s1 = allcapab.toString();
	  
	  String[] arr = s1.split(",");
	  
	  for(String i:arr) {
		  
		  System.out.println(i);
	  }
	  
	  
  }
}
