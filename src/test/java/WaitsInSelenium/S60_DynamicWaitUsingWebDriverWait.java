package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class S60_DynamicWaitUsingWebDriverWait {
  @Test
  public void testDynamicWaitUsingWebDriverWait() {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading");
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Example 2')]")).click();
	  
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  
	  // By ele = By.id("finish");
	  
	  By ele = By.xpath("(//h4)[2]");
	  
	  String s1 = wait.until(ExpectedConditions.visibilityOfElementLocated(ele)).getText();
	  
	  System.out.println(s1);
	  
	  
	  
  }
}
