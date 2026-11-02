package SpecialScenario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic_1.Utility;

public class S57_ShadowDomAutomation {
  @Test
  public void testShadowDom() throws InterruptedException, AWTException {
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele = driver.findElement(By.xpath("//h2[text()='ShadowDOM']"));
	  
	  Utility.scrollUpToElement(driver, ele);
	  
	  WebElement host1 = driver.findElement(By.cssSelector("#shadow_host"));
	  
	  SearchContext root1 = host1.getShadowRoot();
	  
	  String text1 = root1.findElement(By.cssSelector("#shadow_content")).getText();
	  
	  System.out.println(text1);
	  
	  Thread.sleep(1000);
	  
	 root1.findElement(By.cssSelector("input[type='text']")).sendKeys("Deepak");
	  
	  Thread.sleep(1000);
	  
	  root1.findElement(By.cssSelector("input[type='checkbox']")).click();
	  
	  Thread.sleep(2000);
	  
	  WebElement ele2 = root1.findElement(By.linkText("Blog"));
	  
	  Actions act = new Actions(driver);
	  
	  act.moveToElement(ele2).click().build().perform();
	  
	  Thread.sleep(1000);
	  
	  driver.navigate().back();
	  
	  Thread.sleep(1000);
	  
	  WebElement ele3 = root1.findElement(By.cssSelector("input[type='file']"));
	  
	  act.moveToElement(ele3).click().build().perform();
	  
	  Robot rb = new Robot();
	  
	  rb.delay(4000);
	  
	  StringSelection sc = new StringSelection("C:\\Users\\deepa\\Downloads\\Testxyz.txt");
	  
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  Thread.sleep(2000);

	  rb.keyPress(KeyEvent.VK_ENTER);
	  
	  System.out.println(ele3.getDomAttribute("type"));
	    
	  //nested element
	  /*
	   * root1--->root2
	   * 
	   * root1-->host2--->root2-->shadow element
	   */
	  
	  WebElement host2 = root1.findElement(By.cssSelector("#nested_shadow_host"));
	  
	  SearchContext root2 = host2.getShadowRoot();
	  
	  String text2 = root2.findElement(By.cssSelector("#nested_shadow_content")).getText();
	  
	  System.out.println(text2);
	  
	  driver.findElement(By.xpath("//a[text()='Youtube']")).click();
	  
	  
  }
}
