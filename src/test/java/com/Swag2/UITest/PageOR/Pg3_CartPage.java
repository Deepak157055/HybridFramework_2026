package com.Swag2.UITest.PageOR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pg3_CartPage {
	
	private WebDriver driver;
	
	// Encapsulation = private data + public methods
	
	public Pg3_CartPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	//Locators
	
	@FindBy(xpath="//div[@class='cart_item_label']//a") private List<WebElement> allProducts;
	@FindBy(xpath="//button[text()='Checkout']") private WebElement checkoutBtn;
	@FindBy(xpath="//button[@id='continue-shopping']") private WebElement continueShoppingBtn;
	
	
	//Actions or Methods
    public Pg3_CartPage getProductDetailsAddedToCart() {
    	for(WebElement i:allProducts) {
    		
    		System.out.println(i.getText());
    		}
         
    	return this;
    }
    
	
    public Pg3_CartPage removeProduct(String pname) {
    	int k=0;
    	for(WebElement i:allProducts) {
    		k++;
    		if(i.getText().contains(pname)) {
    			driver.findElement(By.xpath("(//button[text()='Remove'])["+k+"]")).click();
    			 break;

    			}
    		}
        return this;
    
    }
    
    public Pg2_InventoryPage continueShopping() {
    	
    	continueShoppingBtn.click();
    	return new Pg2_InventoryPage(driver);
    	
    }
    
    
    public Pg4_CheckOutPage checkOut() {
    	
    	checkoutBtn.click();
    	return new Pg4_CheckOutPage(driver);
    	
    }
	
	
	
}
