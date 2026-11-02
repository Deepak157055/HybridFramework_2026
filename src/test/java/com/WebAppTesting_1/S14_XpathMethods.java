package com.WebAppTesting_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S14_XpathMethods {

	public static void main(String[] args) throws InterruptedException {
	   
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//Electronics:xpath with text()
		driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
		
		//click on Cart: xpath with normalize-space()
		driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
		
		String d1 = driver.findElement(By.xpath("//div[contains(@class,'a-span8')]//h3")).getText();
		
		System.out.println(d1);
		
		//search box:Watch: xpath with contains()
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("Watches",Keys.ENTER);
		
		String d2 = driver.findElement(By.xpath("//div[contains(@class,'s-breadcrumb-header')]")).getText();
		
		System.out.println(d2);
		
		// starts-with
        WebElement searchEle = driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		
		searchEle.clear();
		
		searchEle.sendKeys("Bags",Keys.ENTER);
		
		Thread.sleep(2000);
		
		String d3 = driver.findElement(By.xpath("//div[contains(@class,'s-breadcrumb-header')]")).getText();
		
		System.out.println(d3);
	}

}
