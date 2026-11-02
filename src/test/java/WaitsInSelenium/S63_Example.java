package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

public class S63_Example {
  @Test
  public void testExample() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	  
	  driver.get("https://www.qaxel.in/test-playground/dynamic");
	  
	  // driver.manage().window().maximize();
	  
	  FluentWait<WebDriver> wait = new FluentWait<>(driver)
			                       .withTimeout(Duration.ofSeconds(3))
			                       .pollingEvery(Duration.ofMillis(500))
			                       .ignoring(ElementNotInteractableException.class);
	  
	  
	  // By ele1 = By.xpath("//div[@id='visible-after-delay']");
	  
	  // By ele2 = By.xpath("//button[@id='enable-after-delay']");
	  
	  WebElement ele2 = driver.findElement(By.xpath("//h3[text()='Random Appearance']"));
	  
	  WebElement ele3 = driver.findElement(By.xpath("//div[@class='space-y-2']//div"));
	  
	  Utility.scrollUpToElement(driver, ele2);
	  
	  Thread.sleep(3000);
	  
//	  String s1 = wait.until(ExpectedConditions.visibilityOfElementLocated(ele1)).getText();
//	  
//	  System.out.println(s1);
//	  
//	  wait.until(ExpectedConditions.elementToBeClickable(ele2)).click();
//	  
//	  Alert alt = driver.switchTo().alert();
//	  
//	  System.out.println(alt.getText());
//	  
//	  alt.accept();
	  
	  String s2 = wait.until(ExpectedConditions.visibilityOf(ele3)).getText();
	  
	  System.out.println(s2);
	  
	  
  }
}
