package com.WebTesting_TestNG.PageFactoryPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	
	/*
	 * PageObject=Encapsulation=private data + public method
	 * 
	 * constructor: to initialize driver
	 * Locator: By class
	 * Action: Methods
	 */
	
	
	private WebDriver driver;
	
	// Constructor
	public LoginPage_PF(WebDriver driver) // this driver coming from Base class
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	// Locators
	
	@FindBy(name="username") WebElement emailEle;
	@FindBy(xpath="//input[contains(@class,'oxd-input--active')]") WebElement pwdEle;
	@FindBy(xpath="//button[contains(@class,'orangehrm-login-button')]") WebElement loginBtn;
	@FindBy(tagName="a") List<WebElement> Links;
	
	
	// Actions(methods)
	public void doLoginPF(String un,String pwd) {
		
		emailEle.sendKeys(un);
		pwdEle.sendKeys(pwd);
		loginBtn.click();
	}
	
	public String getUrlPF() {
		
		return driver.getCurrentUrl();
	}
	
    public String getTitlePF() {
    	
    	return driver.getTitle();
    }
	
    public void orangeLinks() {
    	
    	System.out.println(Links.size());
    	
    	for(WebElement i:Links) {
    		
    		if(i.getText().contains("OrangeHRM, Inc")) {
    			i.click();
    			break;
    		}
    		
    	}
    }



}
