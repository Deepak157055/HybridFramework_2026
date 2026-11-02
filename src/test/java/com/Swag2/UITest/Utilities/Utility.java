package com.Swag2.UITest.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Utility {

	
	public static void fullPageScreenshot(WebDriver driver,String fname)
	{
		//timestamp
		  String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		  
		  //full page
		  Screenshot shot=new AShot()
		  .shootingStrategy(ShootingStrategies.viewportPasting(100))
		  .takeScreenshot(driver);
		  
		  //path of folder
		  File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+fname+timestamp+".png");
		  
		  try {
			ImageIO.write(shot.getImage(),"PNG",dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
	
	public static void getScreenshot(WebDriver driver,String fileName)
	{
		 String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		  
		  TakesScreenshot ts=(TakesScreenshot) driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+fileName+timestamp+".png");
		  
		  try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String readPropertiesFile(String fileName,String key)
	{
		//create object of Properties class
		 Properties p1=new Properties();
		
		//read data from file we need path
		  File f1=new File(System.getProperty("user.dir")+"//ConfigData//"+fileName+".properties");
		  
		  //read a file in stream: FileInputStream
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			 //load the file
			  p1.load(fs);
		} catch (FileNotFoundException e) {

			System.out.println("File path is wrong!");
		} catch (IOException e) {

			System.out.println("Properties file not loaded!");
		}
		  	  
		return p1.getProperty(key);
	}
	
	public static void selectBasedDropDown(WebElement ele, String value) {
		
	    Select dd2 = new Select(ele);
	    
	    List<WebElement> allOp2 = dd2.getOptions();
	    
	    System.out.println(allOp2.size());
	    
	    for(WebElement i:allOp2) {
	    	
	    	System.out.println(i.getText());
	    	
	    	if(i.getText().equals(value)) {
	    		
	    		i.click();
	    		
	    		break;
	    	}
	    }
		
	}
	
    public static void BootstrapDropdown(WebDriver driver, List<WebElement> allOptions, String val) throws InterruptedException {
    	
    	 Thread.sleep(10000);
    	
		 System.out.println("Total options found: "+allOptions.size());
		 
		 Actions actions = new Actions(driver);
		 
		 for(WebElement i:allOptions) {
			 
			 System.out.println(i.getText());
			 
			 if(i.getText().contains(val)) {
				  
				 actions.moveToElement(i).perform();
				 
				 i.click();
				  
				  break;
			 }
		 }
    }
	
	public static WebDriver swithToParentWindow(WebDriver driver, String parentId) {
		
		driver.switchTo().window(parentId);
		
		return driver;
		
	}
	
	public static Boolean swithToExpectedWindow(List<String> lWhs,WebDriver driver,String windowTitle) {
		
		 for(String s:lWhs) {
			 
			 String title = driver.switchTo().window(s).getTitle();
			 
			 // System.out.println(title);
			 
			 if(title.contains(windowTitle)) {
                System.out.println("Found right Window");
                return true;
				 
			 }
		 }
	    return false;
	}
	
    public static void closeAllChildWindows(List<String> allWindowsIds, WebDriver driver, String parentId ) {
	  for(String childId:allWindowsIds) {
		  
		  if (!parentId.equals(childId)) {
			  
			  driver.switchTo().window(childId).close();
		  }
    	
    }

    }

	public static void closeAllWindows(List<String> allWindowsIds,WebDriver driver) throws InterruptedException {
		
		for(String i:allWindowsIds) {
			
			Thread.sleep(2000);
			driver.switchTo().window(i).close();
		}
		
		
	}
    
	public static void scrollUptoEelement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	public static void scrollDown(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollUp(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	public static void clickOnElement(WebDriver driver, WebElement ele){
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	}
	
	public static void enterValue(WebDriver driver, WebElement ele2) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value = 'Brown Dumbbells';",ele2);
	}
	
	public static int findHeading(List<WebElement> allHeadings,String hName ) {
		
		  int count=0;
		  
		  for(WebElement i:allHeadings) {
			  
			 count++;
			 if(i.getText().contains(hName )) {
				    break;
				
			        }
		      }
		return count;
		     
}
	 
	public static int findreqBrowser(List<WebElement> cellData, String bName) {
		
          int k = 0;
         
         for(WebElement j:cellData) {
        	 k++;
        	 if(j.getText().contains(bName)) {
        		 break;
        		 
        	 }
        	 
         }
        return k;
	}

	
}
