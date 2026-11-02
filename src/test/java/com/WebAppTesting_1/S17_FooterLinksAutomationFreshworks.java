package com.WebAppTesting_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class S17_FooterLinksAutomationFreshworks {

	public static void main(String[] args) throws InterruptedException  {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> allFooters = driver.findElements(By.xpath("(//ul[contains(@class,'emjdaE')])[2]//li//a"));
		
		System.out.println(allFooters.size());
		
		Thread.sleep(10000);
		
		for(WebElement i:allFooters) {
			
			System.out.println(i.getText());
			
			if(i.getText().contains("Training & Certification")) {
				i.click();
				break;
			}
		}
        
		List<WebElement> allList = driver.findElements(By.xpath("(//div[contains(@class,'fTLQUd')])[1]//li//a"));
		
		System.out.println(allList.size());
		
		for(WebElement i:allList) {
			
			System.out.println(i.getText());
		}
	}

}
