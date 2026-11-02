package com.WebTesting_TestNG.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_1.PropertiesUtil;

public class TestDataUsingPropertiesFile {
  @Test
  public void testLoginWithoutUtility() throws Exception {
	  
	  // path
	  File f1 = new File(System.getProperty("user.dir")+"//ConfigData//config.properties");
	  
	  // Read the file in the Stream
	  
	  FileInputStream fs = new FileInputStream(f1);
	  
	  // Create object of Properties class
	  
	  Properties p1 = new Properties();
	  
	  // load the file
	  
	  p1.load(fs);
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get(p1.getProperty("url"));
	  
	  driver.findElement(By.name(p1.getProperty("unloc"))).sendKeys(p1.getProperty("un"));
	  
	  driver.findElement(By.id(p1.getProperty("pwdloc"))).sendKeys(p1.getProperty("pwd"));
	  
	  driver.findElement(By.id(p1.getProperty("loginBtn"))).click();
	  
    }

    @Test
    public void testLoginWithUtility() {
    	
      PropertiesUtil prop = new PropertiesUtil("config");
    	
  	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get(prop.obtainData("url"));
	  
	  driver.findElement(By.id(prop.obtainData("unloc"))).sendKeys(prop.obtainData("un"));
	  driver.findElement(By.name(prop.obtainData("pwdloc"))).sendKeys(prop.obtainData("pwd"));
	  driver.findElement(By.id(prop.obtainData("loginBtn"))).click();
	   	
      
    }





}
