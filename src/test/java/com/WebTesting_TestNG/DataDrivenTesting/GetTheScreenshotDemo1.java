package com.WebTesting_TestNG.DataDrivenTesting;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

public class GetTheScreenshotDemo1 {
  @Test
  public void testPageScreenshot() {
  
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       Utility.getScreenshot(driver, "Ninja");
       
//       Date date = new Date();
//       SimpleDateFormat sm = new SimpleDateFormat("YYYY.MM.dd.HH.mm.ss");
//       String timeStamp = sm.format(date);
//       
//       TakesScreenshot ts = (TakesScreenshot) driver;
//       File temp = ts.getScreenshotAs(OutputType.FILE);
//       File dest = new File(System.getProperty("user.dir")+"//Screenshots//t1"+timeStamp+".png");
//       
//       try {
//		FileHandler.copy(temp, dest);
//	} catch (IOException e) {
//		
//        e.printStackTrace();
//	}
  
  
  
  }
}
