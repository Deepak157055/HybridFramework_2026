package com.WebAppTesting_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_NaukriScenario {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/it-jobs?src=gnbjobs_homepage_srch");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		String expLink = "https://www.naukri.com/jobs-in-bangalore";
		
		for(WebElement link:allLinks) {
			
			System.out.println(link.getText());
			
			System.out.println(link.getDomAttribute("href"));
			
			try {
			if(link.getDomAttribute("href").contains(expLink)) {
				
				System.out.println("Link Found:Test Pass");
				
				break;
			  }
		    } catch(NullPointerException a)
			{
			
			System.out.println("href is null");
		     }

	      }

  }
	
}
