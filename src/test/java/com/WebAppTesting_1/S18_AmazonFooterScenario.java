package com.WebAppTesting_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S18_AmazonFooterScenario {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("(//div[contains(@class,'navFooterLinkCol')])[3]//li//a"));
		
		System.out.println(allLinks.size());
		
		for(WebElement i:allLinks) {
			
			System.out.println(i.getText());
			
			if(i.getText().contains("Advertise Your Products")) {
				i.click();
				break;
			}
			
		}

	}

}
