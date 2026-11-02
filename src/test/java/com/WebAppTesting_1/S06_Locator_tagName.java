package com.WebAppTesting_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_Locator_tagName {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement inputField = driver.findElement(By.name("username"));
		
		System.out.println(inputField.getDomAttribute("placeholder"));
		
		// driver.findElement(By.name("password")).sendKeys("admin123");
		
		// driver.findElement(By.className("orangehrm-login-button")).click();
		
		List<WebElement> allInputs = driver.findElements(By.tagName("input"));
		
		System.out.println(allInputs.size());
		
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		
		System.out.println(allImages.size());
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		String expLink = "https://orangehrm.com/";
		
		for(WebElement i:allLinks)
			
		{
			
			System.out.println(i.getText());
			
			System.out.println(i.getDomAttribute("href"));
	        
			if(i.getDomAttribute("href").contains(expLink)) {
				
				i.click();
				
				break;
			}
			
		}
		
		

	}

}
