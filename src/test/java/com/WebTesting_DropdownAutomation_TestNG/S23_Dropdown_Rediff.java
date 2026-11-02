package com.WebTesting_DropdownAutomation_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

public class S23_Dropdown_Rediff {
  @Test
  public void testDropdown() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
	  // driver.findElement(By.id("div_city")).click();
	  
	  WebElement ele1 = driver.findElement(By.xpath("(//div[@class='form-group'])[5]/select[1]"));
	  
	  Utility.selectBasedDropdown(ele1,"11");
	  
	  WebElement ele2 = driver.findElement(By.xpath("(//div[@class='form-group'])[5]/select[2]"));
	  
	  Utility.selectBasedDropdown(ele2,"APR");
	  
	  WebElement ele3 = driver.findElement(By.xpath("(//div[@class='form-group'])[5]/select[3]"));
	  
	  Utility.selectBasedDropdown(ele3,"1993");
	  
	  driver.findElement(By.xpath("//input[@value='f']")).click();
	  
	  WebElement ele4 = driver.findElement(By.xpath("(//div[@class='form-group'])[7]/select"));
	  
	  Utility.selectBasedDropdown(ele4,"Australia");
	  
	  List<WebElement> allCc = driver.findElements(By.xpath("//div[@id='country_id']/ul/li"));
	  
	  System.out.println(allCc.size());
	  
	  Thread.sleep(2000);
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  for(WebElement i:allCc) {
		  
		  System.out.println(i.getAttribute("innerText"));
		  
		  if(i.getAttribute("innerText").contains("Australia (+61)")) {
			  
			  js.executeScript("arguments[0].click()",i);
			  
			  break;
		  }
		  
	  }
	  
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  
	  Thread.sleep(2000);
	  
	  WebElement ab = driver.findElement(By.xpath("//*[@id='div_hintQS']/div[1]/select"));
	  
	  Select opt = new Select(ab);
	  
	  System.out.println(opt.isMultiple());
	  
	  List<WebElement> allOpt = opt.getOptions();
	  
	  System.out.println(allOpt.size());
	  
	  for(WebElement i:allOpt ) {
		  
		  System.out.println(i.getText());
		  
		  if(i.getText().contains("What is your favourite food?")) {
			  
			  i.click();
			  
			  break;
		  }
	  }
	  
//	  Select dd1 = new Select(ele1);
//	  
//	  System.out.println(dd1.isMultiple());
//	  
//	  List<WebElement> allOptions = dd1.getOptions();
//	  
//	  System.out.println(allOptions.size());
//	  
//	  for(WebElement i:allOptions) {
//		  
//		  System.out.println(i.getText());
//		  
//		  if(i.getText().contains("19")) {
//			  i.click();
//			  break;
//		  }
//	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
