package com.WebAppTesting_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S10_CssSelectorWithIndexing {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		List<WebElement> allOptions = driver.findElements(By.cssSelector("div.list-group>a"));
		
		System.out.println(allOptions.size());
		
		for(WebElement i:allOptions) {
			
			System.out.println(i.getText());
		}
		
		//Out of 13 elements interact with 2nd link:Register click
		
		driver.findElement(By.cssSelector("div.list-group>a:nth-child(2)")).click();
		
		// get Text
		
		String s1 = driver.findElement(By.cssSelector("fieldset#account>legend")).getText();
		
		System.out.println(s1);
		

	}

}
