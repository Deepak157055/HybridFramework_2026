package com.WebAppTesting_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S04_Locator_Link {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.partialLinkText("mages")).click();
		
		
	}

}
