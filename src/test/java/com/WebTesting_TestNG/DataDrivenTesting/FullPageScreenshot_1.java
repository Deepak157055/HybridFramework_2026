package com.WebTesting_TestNG.DataDrivenTesting;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenshot_1 {
  @Test
  public void testFullPage() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  Thread.sleep(2000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  Utility.getFullPageScreenshot(driver, "Amazon");
	  
//	  Date date = new Date();
//	  SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd.HH.mm.ss");
//	  String timeStamp = sdf.format(date);
//	  
//	  // full page
//	  Screenshot shot = new AShot()
//	  .shootingStrategy(ShootingStrategies.viewportPasting(100))
//	  .takeScreenshot(driver);
//	  
//	  // path of folder
//	  File dest = new File(System.getProperty("user.dir")+"//Screenshots//FullPage"+timeStamp+".png");
//	  
//	  try {
//		ImageIO.write(shot.getImage(), "PNG", dest);
//	} catch (IOException e) {
//		e.printStackTrace();
//	}  
	  
	  
  }
}
