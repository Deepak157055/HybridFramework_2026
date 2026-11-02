package com.WebAppTesting_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_Locator_Id_Name_ClassName {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.name("email-name")).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("test123");
		
		driver.findElement(By.id("remember")).click();
		
		driver.findElement(By.className("btn-default")).click();
		

	}

}
