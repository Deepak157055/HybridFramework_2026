package com.WebTesting_WebTableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S39_ABC {
	
	
	 public static int getPosition(List<WebElement> allHeadings,String expHeading ) {
			 
		   int pos=0;
		  
		   for(WebElement i:allHeadings) {
			  pos++;
			  if(i.getText().contains(expHeading)) {
				  
				  break;
			  }
			}
		    return pos;
	 }
	
	
	
  @Test
  public void testABC() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele = driver.findElement(By.xpath("//table[@id='taskTable']"));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  
	  String expHeading = "Name";
	  
	  List<WebElement> allHeadings = driver.findElements(By.xpath("//table[@id='taskTable']//tr//th"));
	  
	  int i = getPosition(allHeadings,expHeading);
	  System.out.println(i);

	  String expData = "Chrome";
	  List<WebElement> allBnames = driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td["+i+"]"));
	  int j = getPosition(allBnames,expData);
	  System.out.println(j);
	  
	  String expHeading2 = "CPU (%)";
	  int k = getPosition(allHeadings,expHeading2);
	  System.out.println(k);
	  
	  String expCellData = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+j+"]//td["+k+"]")).getText();
	  System.out.println(expCellData);
	 
	  String actCellData = driver.findElement(By.xpath("(//div[@class='display-values']//p)[1]//strong")).getText();
	  System.out.println(actCellData);
	  
	  if(expCellData.equals(actCellData)) {
		  System.out.println("Test case pass");
	  }
	  
	  String expHeading3="Network (Mbps)";
	  int m = getPosition(allHeadings,expHeading3);
	  System.out.println(m);
	  
	  String expCellData2 = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+j+"]//td["+m+"]")).getText();
	  System.out.println(expCellData2);
	  
	  String actCellData2 = driver.findElement(By.xpath("(//div[@class='display-values']//p)[3]//strong")).getText();
	  System.out.println(actCellData2);
	  
	  if(expCellData2.equals(actCellData2)) {
		  System.out.println("Test case pass");
	  }
	  
  }
}
