package com.WebAppTesting_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_CssSelector_1 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationplayground.com/crm/");
		
		// tagname with id
		driver.findElement(By.cssSelector("a#SignIn")).click();
		
		// tagname with attribute
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("test@gmail.com");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test123");
		
		// tagname with id
		driver.findElement(By.cssSelector("input#remember")).click();
		
		// tagname with className
		
		// driver.findElement(By.cssSelector("button.btn.btn-default.btn-primary")).click();
		
		// tagname with id, className, attribute
		
		driver.findElement(By.cssSelector("button#submit-id.btn-primary[type='submit']")).click();
			

	}

}
