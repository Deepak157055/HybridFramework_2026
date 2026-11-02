package com.WebTesting_WebTableHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S40_PaginationWebTableAutomation {
	
  
  public static int getPositionPaginationTable(List<WebElement> allHeadings,String reqHeading) {
	  int pos = 0;
	  for(WebElement i:allHeadings) {
		 pos++;
		 if(i.getText().contains(reqHeading)) {
			 break;
		 }
	 }
	return pos; 
  }
  
	
	
  @Test
  public void testPagination() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele = driver.findElement(By.xpath("//table[@id='productTable']"));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  // System.out.println("*************Total rows & Total Columns as per pages*******************");
	  
	  List<WebElement> allPages = driver.findElements(By.xpath("//ul[@id='pagination']/li"));
//	  
//	  int totalRows = 0;
//	  int totalColumns = 0;
//	  
//	  for(WebElement i:allPages) {
//		  i.click();
//		  Thread.sleep(2000);
//		  int RcntPerPage = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr")).size();
//		  totalRows = totalRows + RcntPerPage;
//		  int CcntPerPage = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr[1]/td")).size();
//		  totalColumns = totalColumns + CcntPerPage;
//		}
//	  
//	  System.out.println(totalRows);
//	  System.out.println(totalColumns);
	  
	  System.out.println("*************Get the product name for every page***********");
	  
	  String reqHeading1 = "Name";
	  String reqHeading2 = "Select";
	  List<WebElement> allHeadings = driver.findElements(By.xpath("//table[@id='productTable']//tr//th"));
//	  int pos = 0;
//	  for(WebElement i:allHeadings) {
//		 pos++;
//		 if(i.getText().contains(reqHeading)) {
//			 break;
//		 }
//	 }
//	  System.out.println(pos);
	  
	  int x = getPositionPaginationTable(allHeadings,reqHeading1);
	  System.out.println(x);
	  
	  int pageno = 0;	  
	  for(WebElement i:allPages) {
		  i.click();
		  pageno++;
		  Thread.sleep(1000);
		  List<WebElement> pNames = driver.findElements(By.xpath("//table[@id='productTable']//tr//td["+x+"]"));
		  System.out.println("Current open Page is: "+pageno);
		  for(WebElement j:pNames) {
			 
			  System.out.println(j.getText());
		  }
		  
		  
	  }
	  
	  for(WebElement i:allPages) {
		  
		  if(i.getText().contains("4")) {
			  i.click();
			driver.findElement(By.xpath("//td[text()='Streaming Device']//following-sibling::td//input[@type='checkbox']")).click();
		   
		  }
		  
	  }
	  
	  // int y = getPositionPaginationTable(allHeadings,reqHeading2);
	  
	  for(WebElement i:allPages) {
		  
		  if(i.getText().contains("4")) {
            List<WebElement> allChkbxes = driver.findElements(By.xpath("//table[@id='productTable']//input[@type='checkbox']"));
            for(WebElement n:allChkbxes) {
            	Thread.sleep(1000);
            	n.click();
            }
		  }
	  }
	  
	  
	  
  }
}
