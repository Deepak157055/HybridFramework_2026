package SpecialScenario;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S53_BrokenLinkAutomation {
  @Test
  public void testBrokenLink() {
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	  
	  System.out.println(allLinks.size());
	  
	  int brokenLinkCount = 0;
	  
	  int validLinkCount = 0;
	  
	  for(WebElement i:allLinks) {
		  
		  String hrefVal = i.getDomAttribute("href");
		  
		  if(hrefVal==null || hrefVal.isEmpty()) {
			 
			  System.out.println("Empty or Null Link we cannot automate");
			  continue;
			  
			  }
		  
		   try {
		   // Send request to the server
		    URL url = new URI(hrefVal).toURL();
		  
		  // Establish connection to server : Open server connection
		    HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
		    
		    // Connect to the server
		    httpurl.connect();
		    
		    // Get Status Code
		   int statusCode = httpurl.getResponseCode();
		   // System.out.println(statusCode);
		   if(statusCode>=400) {
			   brokenLinkCount++;
			   System.out.println("===========Broken Link=================");
			     }
		    else {
		    	validLinkCount++;
		    	System.out.println("================Valid Link================");
		    	
		         }
		   
		    }catch(Exception e) {
			   
			   
		  }
		  

	   }
	  
		System.out.println("number of Broken links are  :"+brokenLinkCount);
		
		System.out.println("number of Valid links are  :"+validLinkCount);
	  
	  
	  
	  
  }
}
