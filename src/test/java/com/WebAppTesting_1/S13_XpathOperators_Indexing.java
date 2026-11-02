package com.WebAppTesting_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S13_XpathOperators_Indexing {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//first name: xpath with "and" operator
		driver.findElement(By.xpath("//input[@class='form-control' and @name='firstname']")).sendKeys("dynd3");
		
		//last name : xpath with "or" operator
		driver.findElement(By.xpath("//input[@name='lastname' or @class='form']")).sendKeys("kmr3");
		
		//email: xpath with index
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("dynd3.kmr3@gmail.com");
		
		//telephone: xpath with positon()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=4]")).sendKeys("9902612345");
		
		//password: xpath with position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("cocktail7");
		
		//confirm password: xpath with index
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("cocktail7");
		
		WebElement radioBtn = driver.findElement(By.xpath("(//input[@name='newsletter'])[1]"));
		
		if(!radioBtn.isSelected())
		{
			
			radioBtn.click();
		}else {
			
			System.out.println("It's already selected");
		}
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Thread.sleep(2000);
		
		String actualMsg = driver.findElement(By.xpath("(//h1)[2]")).getText();
		
		String expMsg = "Your Account Has Been Created!";
		
		if(actualMsg.contains(expMsg)) {
			
			System.out.println("Account successfully created");
		}
		
		else {
			Thread.sleep(2000);
			String errMsg = driver.findElement(By.cssSelector("div.alert-danger")).getText();
			System.out.println(errMsg);
			System.out.println(actualMsg);
		}
		
		
		
	}

}
