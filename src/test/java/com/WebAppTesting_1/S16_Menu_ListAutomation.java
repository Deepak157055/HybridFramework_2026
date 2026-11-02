package com.WebAppTesting_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S16_Menu_ListAutomation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		List<WebElement> allOptions =  driver.findElements(By.xpath("//div[@class='list-group']//a"));
		
		System.out.println(allOptions.size());
		
		for(WebElement i:allOptions) {
			
			System.out.println(i.getText());
		}
		

	}

}
