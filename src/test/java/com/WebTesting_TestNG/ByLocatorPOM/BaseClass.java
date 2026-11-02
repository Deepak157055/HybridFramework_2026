package com.WebTesting_TestNG.ByLocatorPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
    public WebDriver driver;
    
    public LoginPage lp;
    
    @BeforeClass
	
	public void pageSetUp() {
		
	  driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  lp = new LoginPage(driver);
		
	}
	

}
