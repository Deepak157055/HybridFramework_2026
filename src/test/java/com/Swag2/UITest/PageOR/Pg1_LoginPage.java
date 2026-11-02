package com.Swag2.UITest.PageOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pg1_LoginPage {
	
	// Encapsulation = private data + public methods
	
	private WebDriver driver;
	
	// Constructor
	
	public Pg1_LoginPage(WebDriver driver)   // this driver is coming from BaseClass
	{
		
		this.driver=driver;
		// to intialize elements identified by @FindBy
		PageFactory.initElements(driver,this);
		
	}
	
	// Locators
	
	@FindBy(id="user-name") private WebElement unEle;
	@FindBy(id="password") private WebElement pwdEle;
	@FindBy(id="login-button") private WebElement loginBtn;
	
	
	// Actions/Methods
	
	public String getAppUrl() {
		
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle() {
		
		return driver.getTitle();
	}
	
	public Pg2_InventoryPage doLogin(String un,String pwd) {
		
		unEle.sendKeys(un);
		pwdEle.sendKeys(pwd);
		loginBtn.click();
		// When page navigates to next page then return next page object
		return new Pg2_InventoryPage(driver);
	}
	

}
