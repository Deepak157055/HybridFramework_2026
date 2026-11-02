package com.WebAppTesting_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S11_cssSelectorSymbols {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		
		// tagname with ^(startswith)
		driver.findElement(By.cssSelector("input[id^='twotab']")).sendKeys("Mobiles",Keys.ENTER);
		
		Thread.sleep(2000);
		
		// searchbox:tagname with $(endswith)
		WebElement searchEle = driver.findElement(By.cssSelector("input[id$='textbox']"));
		
		searchEle.clear();
		
		Thread.sleep(2000);
		
		searchEle.sendKeys("Watches",Keys.ENTER);
		
		// tagname with *(contains partial match)
		
		WebElement ele2= driver.findElement(By.cssSelector("input[id*='absearch']"));
		
		ele2.clear();
		
		Thread.sleep(2000);
		
		ele2.sendKeys("Laptops",Keys.ENTER);
		
	}
	
	

}
