package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class S61_WaitUsingFluentWaitClass {
  @Test
  public void testWaitUsingFluentWait() {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading");
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Example 2')]")).click();
	  
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  
	  FluentWait<WebDriver> wait = new FluentWait<>(driver)
			                       .withTimeout(Duration.ofSeconds(5))
			                       .pollingEvery(Duration.ofMillis(500))
			                       .ignoring(ElementNotInteractableException.class);
	  
	  By ele = By.xpath("(//h4)[2]");
	  
	  String s1 = wait.until(ExpectedConditions.visibilityOfElementLocated(ele)).getText();
	  
	  System.out.println(s1);
	  
	  
	  
	  
	  
	  
  }
}
