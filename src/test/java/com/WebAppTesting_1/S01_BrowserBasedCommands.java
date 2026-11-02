package com.WebAppTesting_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S01_BrowserBasedCommands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		String s1 = driver.getTitle();
		
	    System.out.println(s1);
	    
	    String s2 = driver.getCurrentUrl();
	    
	    System.out.println(s2);
	    
	    System.out.println(driver.getPageSource());
	    
	    driver.quit();

	}

}
