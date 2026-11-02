package com.Swag2.UITest.PageOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pg4_CheckOutPage {
	
	private WebDriver driver;
	
	// Encapsulation = private data + public methods
	
	
	// constructor
	public Pg4_CheckOutPage(WebDriver driver)  // driver is coming from Baseclass
	{
		this.driver=driver;
		// to intialize elements identified by @FindBy annotation
		PageFactory.initElements(driver,this);
		
	}
	
	//Locator
	@FindBy(id="first-name") private WebElement fnEle;
	@FindBy(id="last-name") private WebElement lnEle;
	@FindBy(id="postal-code") private WebElement pcEle;
	@FindBy(id="continue") private WebElement ctnBtn;
	
	// Actions or Methods
	public Pg5_OverviewPage doContinueCheckOut(String fname,String lname,String pcode) {
		
		fnEle.sendKeys(fname);
		lnEle.sendKeys(lname);
		pcEle.sendKeys(pcode);
		ctnBtn.click();
		return new Pg5_OverviewPage(driver);
	}

}
