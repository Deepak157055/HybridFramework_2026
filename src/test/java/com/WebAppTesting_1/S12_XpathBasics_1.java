package com.WebAppTesting_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S12_XpathBasics_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("dayanand.bng2023@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("cocktail7");
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		String expUrl = "account/account";
		
        Thread.sleep(2000);
		
		if(driver.getCurrentUrl().contains(expUrl)) {
			
			System.out.println("Correct Page...Test Pass");
		}
		else {
			
			System.out.println("Wrong Page....Test Fail");
		}
		

	}

}
