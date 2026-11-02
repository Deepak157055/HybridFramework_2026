package WaitsInSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S62_AmazonMouseOverScenario {
  @Test
  public void testMouseOver() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
//	  driver.get("https://www.myntra.com/");
//	  
//	  WebElement ele = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Men']"));
//	  
//	  Actions act = new Actions(driver);
//	  
//	  act.moveToElement(ele).perform();
//	  
//	  Thread.sleep(2000);
//	  
//	  List<WebElement> allEle = driver.findElements(By.xpath("(//div[@class='desktop-categoryContainer'])[1]//li//ul//li//a"));
//	  
//	  System.out.println(allEle.size());
//	  
//	  for(WebElement i:allEle) {
//	  
//	  if(i.getText().contains("Rings & Wristwear")) {
//		  
//		  i.click();
//		  break;
//	  }
//	  
//  }
	  
	  
	  
	  driver.get("https://www.amazon.in");
	  
	  driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	  
	  driver.manage().window().maximize();
	  
	  WebElement ele = driver.findElement(By.xpath("(//span[normalize-space()='Mobiles & Accessories'])[2]"));
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(ele).perform();
	  
	  Thread.sleep(2000);
	  
	  List<WebElement> allEle = driver.findElements(By.xpath("//div[contains(@id,'subnav-sl-megamenu-1:0')]//ul[@class='mm-category-list']/li/a"));
	  
	  System.out.println(allEle.size());
	  
	  for(WebElement i:allEle) {
		  
		  if(i.getText().contains("Intex")) {
			  
			  i.click();
			  break;
		  }
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
