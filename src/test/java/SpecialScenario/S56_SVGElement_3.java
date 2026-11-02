package SpecialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S56_SVGElement_3 {
  @Test
  public void testSVGEle() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://bstackdemo.com/");
	  
	  driver.findElement(By.xpath("//span[@id='signin']")).click();
	  
	  driver.findElement(By.id("username")).click();
	  
	  List<WebElement> allOp = driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option-0')]"));
	  
	  for(WebElement i:allOp) {
		  
		  if(i.getText().contains("fav_user")) {
			  
			  i.click();
			  break;
			  }
	  }
	  
	  driver.findElement(By.id("password")).click();
	  
	  driver.findElement(By.xpath("//div[contains(@id,'react-select-3-option-0')]")).click();
	  
	  driver.findElement(By.id("login-btn")).click();
	  
	  
  }
}
