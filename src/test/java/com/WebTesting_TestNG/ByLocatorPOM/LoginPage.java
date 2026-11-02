package com.WebTesting_TestNG.ByLocatorPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	/*
	 * PageObject=Encapsulation=private data + public method
	 * 
	 * constructor: to initialize driver
	 * Locator: By class
	 * Action: Methods
	 */
	
	private WebDriver driver;
	
	// Constructor
	
	 public LoginPage(WebDriver driver) //driver from base class we can pass
	 {
		 
		 this.driver = driver;
	 }
	
	// Locators
	
	private By emailEle = By.name("email");
	
	private By pwdEle = By.id("input-password");
	
	private By loginBtn = By.xpath("//input[@type='submit']");
	
	
	// Action(method)
	
	public void doLogin(String un,String pwd) {
		
		driver.findElement(emailEle).sendKeys(un);
		driver.findElement(pwdEle).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}
	
	public String getAppUrl() {
		
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle() {
		
	   return driver.getTitle();
	}
	
}
