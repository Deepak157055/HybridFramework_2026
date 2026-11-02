package com.Swag2.UITest.PageOR;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Swag2.UITest.Base.Baseclass_3;

public class Pg5_OverviewPage {
	
	// Encapsulation = private data + public methods
	
	private WebDriver driver;
	
	// constructor
	public Pg5_OverviewPage(WebDriver driver)  // driver is coming from Baseclass
	{
		this.driver=driver;
		// to intialize elements identified by @FindBy annotation
		PageFactory.initElements(driver,this);
	}
	
	//Locator
	@FindBy(xpath="//div[@class='summary_info']//div[contains(@class,'summary')]") private List<WebElement> paymentDetails;
	@FindBy(id="finish") private WebElement finishBtn;
	@FindBy(xpath="//h2") private WebElement resultMsg;
	
	
	// Actions or Methods
	public Pg5_OverviewPage getPaymentDetails() {
		for(WebElement i:paymentDetails) {
			System.out.println(i.getText());
			
		}
	   return this;
	}
	
    public String doFinishCheckOut() {
    	finishBtn.click();
      return resultMsg.getText();
    }
	
	
	
}
