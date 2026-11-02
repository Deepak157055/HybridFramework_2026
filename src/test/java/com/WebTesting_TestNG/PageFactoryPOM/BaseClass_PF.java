package com.WebTesting_TestNG.PageFactoryPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass_PF {
	
	
	public WebDriver driver;
	
	public LoginPage_PF lp;
	
  
	
	@BeforeClass
	public void setupPF() {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		lp = new LoginPage_PF(driver);
		
		
	}

	
	
	
}
