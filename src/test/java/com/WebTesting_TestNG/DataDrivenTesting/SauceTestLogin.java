package com.WebTesting_TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

public class SauceTestLogin {
  
  // @Test(dataProvider="mydata",dataProviderClass=CustomData.class)
  @Test(dataProvider="exceldata",dataProviderClass=CustomData.class)
  public void testLogin(String un,String pwd) throws InterruptedException, Exception {
	  
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<>();
	  prefs.put("profile.password_manager_leak_detection", false);
	  prefs.put("credentials_enable_service", false);
	  options.setExperimentalOption("prefs", prefs);
	  
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.saucedemo.com/");
	  
	  driver.findElement(By.id("user-name")).sendKeys(un);
	  
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  
	  Utility.getScreenshot(driver, "Swag");
	  
	  driver.findElement(By.id("login-button")).click();
	  
	  Thread.sleep(2000);
	  
	  boolean condition = driver.getCurrentUrl().contains("inventory");
	  
	  String status = "";
	  
	  if(condition){
        status = "Pass";
      }else {
    	status = "Fail";
      }
	  
	  // System.out.println(status);
	  
	  File f1 = new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  FileInputStream fs = new FileInputStream(f1);
	  XSSFWorkbook wb = new  XSSFWorkbook(fs);
	  XSSFSheet sh = wb.getSheet("Sauce");
	  
	  
	  switch(un)
	  {
	  
	  case "standard_user":
	  sh.getRow(1).createCell(2).setCellValue(status);
	  break;
	  case "Arun":
	  sh.getRow(2).createCell(2).setCellValue(status);
	  break;
	  case "visual_user":
	  sh.getRow(3).createCell(2).setCellValue(status);
	  break;
	  case "problem_user":
	  sh.getRow(4).createCell(2).setCellValue(status);
	  break;
	  default:
	  break;
	  
	  }
	  
	  fs.close();
      FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"//TestData//Data.xlsx");
      wb.write(fos);
      fos.close();
      wb.close();
      
      if(status.contains("Fail")) {
    	  driver.quit();
         }else {
       	  driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
    	  driver.findElement(By.linkText("Logout")).click();
    	  driver.quit();
        	 
         }


	  
     }
  
  
}
