package com.Swag2.UITest.PageOR;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pg2_InventoryPage {
	
	private WebDriver driver;
	
	// Encapsulation = private data + public methods
	
	
	// constructor
	
	public Pg2_InventoryPage(WebDriver driver)  // this driver is coming from Baseclass
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
    // Locators
	
	@FindBy(xpath="//div[@class='inventory_item']//div[@class='inventory_item_label']//a") 
	private List<WebElement> products;
	
	@FindBy(id="add-to-cart") private WebElement addTocartBtn;
	
	@FindBy(id="back-to-products") private WebElement backBtn;
	
	@FindBy(xpath="//div[@id='shopping_cart_container']//a") private WebElement cartOption;
	
	// Actions or Methods
	
	public int getProductCount() {
		
		return products.size();
		
	}
	
	public Pg2_InventoryPage getProductDetails() {
		
		for(WebElement i:products) {
			
			System.out.println(i.getText());
			}
		return this;
	}
	
	public Pg2_InventoryPage addProductToCart(String pname) {
		// int k=0;
		for(WebElement i:products) {
			// k++;
			if(i.getText().contains(pname)) {
				i.click();
				break;
		      }
		}
	  // System.out.println("Product number : "+k);
	  addTocartBtn.click();
	  return this;	
	}
	
	public Pg2_InventoryPage backToProducts() {
		
		backBtn.click();
		
		return this;
	}
	
	public Pg3_CartPage launchCartPage() {
		
		cartOption.click();
		
		return new Pg3_CartPage(driver);
		
	}
	
}
