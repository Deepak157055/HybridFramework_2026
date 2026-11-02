package SpecialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S54_SVGElementAutomation {
  @Test
  public void testSVGElement() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  List<WebElement> allSvgEle = driver.findElements(By.xpath("//*[name()='svg']"));
	  
	  int count=0;
	  
	  for(WebElement i:allSvgEle) {
		  
		 count++;
		 
		 if(count==3) {
			
			 i.click();
			 break;
			 
		 }
		  
	  }
	  
	  
  }
}
