package com.Generic_1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Utility {
	
	public static void getFullPageScreenshot(WebDriver driver,String filename) {
		
		  Date date = new Date();
		  SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd.HH.mm.ss");
		  String timeStamp = sdf.format(date);
		  
		  // full page
		  Screenshot shot = new AShot()
		  .shootingStrategy(ShootingStrategies.viewportPasting(100))
		  .takeScreenshot(driver);
		  
		  // path of folder
		  File dest = new File(System.getProperty("user.dir")+"//Screenshots//"+filename+timeStamp+".png");
		  
		  try {
			ImageIO.write(shot.getImage(), "PNG", dest);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	
	public static void getScreenshot(WebDriver driver,String filename) {
		
	       Date date = new Date();
	       SimpleDateFormat sm = new SimpleDateFormat("YYYY.MM.dd.HH.mm.ss");
	       String timeStamp = sm.format(date);
	       
	       TakesScreenshot ts = (TakesScreenshot) driver;
	       File temp = ts.getScreenshotAs(OutputType.FILE);
	       String destFilePath = System.getProperty("user.dir")+"//Screenshots//"+filename+timeStamp+".png";
	       File dest = new File(destFilePath);
	       
	       try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
	        e.printStackTrace();
		}
		
	}
	
	
	public static void scrollDown(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void scrollUp(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			
	}
	
	public static void scrollUpToElement(WebDriver driver,WebElement ele) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	
     public static boolean switchToRightWindow(WebDriver driver,List<String> allLwh,String expTitle ) {
    	 
   	  for(String i:allLwh) {
   		  
   		  String actTitle = driver.switchTo().window(i).getTitle();
   		  
   		  if(actTitle.contains(expTitle)) {
   			  System.out.println("Found right Window : "+expTitle);
   			  return true;
   			 
   		  }
   	    }
   	 return false; 
     }
     
     public static WebDriver switchToParentWindow(WebDriver driver,String parentId) {
    	 
    	 driver.switchTo().window(parentId);
    	 
    	 return driver;
    	 
      }
     
     public static void closeAllWindows(WebDriver driver,List<String> allLwh,String parentId) {
    	 
	  for(String i:allLwh) {
		  
		  if(!parentId.equals(i)) {
			  
			  driver.switchTo().window(i).close();
			  
		  }
	    }
     }

     public static void selectBasedDropdown(WebElement ele,String value) {
    	 
   	  Select dd = new Select(ele);
	  
   	  System.out.println(dd.isMultiple());
   	  
   	  List<WebElement> allOptions = dd.getOptions();
   	  
   	  System.out.println(allOptions.size());
   	  
   	  for(WebElement i:allOptions) {
   		  
   		  System.out.println(i.getText());
   		  
   		  if(i.getText().contains(value)) {
   			  i.click();
   			  break;
   		  }
   	  }
    	   	 
    }
    
     public static void bootStrapBasedDropdown(WebDriver driver,By dd,String val) throws InterruptedException {
    	 
	  List<WebElement> allOptions = driver.findElements(dd);
      
      System.out.println(allOptions.size());
      
      Thread.sleep(2000);
      
      for(WebElement i:allOptions) {
    	  
    	 System.out.println(i.getText());
    	 
    	 if(i.getText().contains(val))
    	 {
    		 i.click();
    		 
    		 break;
    	 }
      }
    	 
    	 
    	 
     }
}
