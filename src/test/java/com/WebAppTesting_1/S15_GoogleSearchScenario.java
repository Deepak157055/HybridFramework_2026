package com.WebAppTesting_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S15_GoogleSearchScenario {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		// driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Cypress");
		
		List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		Thread.sleep(2000);
		
		System.out.println(allOptions.size());
		
		for(WebElement i:allOptions) {
			
			System.out.println(i.getText());
		}
		
		
        
	}

}
