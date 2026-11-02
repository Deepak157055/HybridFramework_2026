package WaitsInSelenium;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class S59_ExplicitWaitUsingWebDriverWaitClass {
  @Test
  public void testWebDriverWait() {
	  
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  By emailId = By.id("input-email");
	  
	  By pwd = By.name("password");
	  
	  By btn = By.xpath("//input[@value='Login']");
	  
	  
	  /*
	   * Explicit wait applicable for one single WebElement only
	   * We can apply wait based on certain condition
	   */
	  
	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	  
	  // wait.ignoring(Exception.class);
	  
	  Boolean value1 = wait.until(ExpectedConditions.urlContains("demo"));
	  
	  if(value1) {
		  
		  System.out.println(driver.getCurrentUrl());
		  
	  }
	  
	  // Boolean value2 = wait.until(ExpectedConditions.titleContains("Login"));
	  
	  try { wait.until(ExpectedConditions.titleContains("Login"));
	      Boolean value2 = wait.until(ExpectedConditions.titleContains("Login"));
		  if(value2) {
			  System.out.println(driver.getTitle());
			  }
	  }
       catch (Exception e) {
    	   System.out.println(e.getClass().getSimpleName());
       }
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("test24@gmail.com");
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(pwd)).sendKeys("test123");
	  
	  wait.until(ExpectedConditions.elementToBeClickable(btn)).click();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
