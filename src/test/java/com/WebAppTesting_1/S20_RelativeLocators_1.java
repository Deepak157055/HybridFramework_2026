package com.WebAppTesting_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class S20_RelativeLocators_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// above()
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Enter email']")).above
				(By.xpath("(//input[contains(@class,'form-control')])[3]"))).sendKeys("test@gmail.com");
		
		
		// below()
		driver.findElement(RelativeLocator.with(By.xpath("(//input[contains(@class,'form-control')])[3]")).below
				(By.xpath("//input[@placeholder='Enter email']"))).sendKeys("test123");
		
		// near()
		driver.findElement(RelativeLocator.with(By.xpath("//input[@id='remember']")).near
				(By.xpath("//label[text()='Remember me']"))).click();
		
		// toLeftOf()
		driver.findElement(RelativeLocator.with(By.xpath("//input[contains(@class,'form-control-dark')]")).toRightOf
				(By.xpath("//a[text()='Customer Service']"))).sendKeys("Deepak123");
		
		Thread.sleep(2000);
		
		//toRightOf()
		driver.findElement(RelativeLocator.with(By.xpath("//input[contains(@class,'form-control-dark')]")).toLeftOf
				(By.xpath("//a[text()='Sign In']"))).clear();
		

	}

}
