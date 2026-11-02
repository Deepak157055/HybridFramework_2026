package SpecialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

public class S55_SVGElement_2 {
  @Test
  public void testSvg() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele = driver.findElement(By.xpath("//h2[text()='SVG Elements']"));
	  
	  Utility.scrollUpToElement(driver, ele);
	  
	  Thread.sleep(2000);
	  
	  List<WebElement> allColors = driver.findElements(By.xpath("//*[name()='svg']"));
	  
	  int count = 0;
	  
	  for(WebElement i:allColors) {
		  
		  count++;
		  
		  if(count==2) {
			  
			 String s1 = i.getAttribute("innerHTML");
			 System.out.println(s1);
			  break;
		  }
		  
		  
	  }
	  
	  
	  
	  
  }
}
