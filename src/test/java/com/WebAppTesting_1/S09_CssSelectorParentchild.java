package com.WebAppTesting_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S09_CssSelectorParentchild {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> footerLinks = driver.findElements(By.cssSelector("ul.emjdaE>li>a>span"));
		
		System.out.println(footerLinks.size());
		
		
		for(WebElement i:footerLinks) {
			
			System.out.println(i.getText());
			
		}
		
		
		
		
	}

}
