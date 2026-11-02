package com.WebTesting_DropdownAutomation_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class S21_DropdownAutomation_Amazon {
  @Test
  public void testDropdown() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  // WebElement ddEle = driver.findElement(By.id("searchDropdownBox"));
	  
	  WebElement ddEle = driver.findElement(By.xpath("//*[@id='nav-search-dropdown-card']/div/select"));
	  
	  Select dd = new Select(ddEle);
	  
	  System.out.println(dd.isMultiple());
	  
	  dd.selectByIndex(4);
	  
	  Thread.sleep(2000);
	  
	  dd.selectByVisibleText("Subscribe & Save");
	  
	  Thread.sleep(2000);
	  
	  dd.selectByValue("search-alias=videogames");
	  
//	  List<WebElement> allOptions = dd.getOptions();
//	  
//	  System.out.println(allOptions.size());
//	  
//	  for(WebElement i:allOptions) {
//		  
//		  System.out.println(i.getText());
//		  
//		  if(i.getText().contains("Subscribe & Save")) {
//			  
//			  i.click();
//			  
//			  break;
//		  }
//		  
//	  }
	  
	  
	  
	  
	  
	  
  }
}
