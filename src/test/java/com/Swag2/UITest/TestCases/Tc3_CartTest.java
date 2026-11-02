package com.Swag2.UITest.TestCases;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Swag2.UITest.Base.Baseclass_3;
import com.Swag2.UITest.Utilities.ExcelUtil;


public class Tc3_CartTest extends Baseclass_3{
	
	
  // prerequisite
	@BeforeClass
	public void pageSetup() {
		
		ip = lp.doLogin(ExcelUtil.getData("UserData", 0, 1),ExcelUtil.getData("UserData", 1, 1));
		addWait();
		ip.addProductToCart(ExcelUtil.getData("UserData", 3, 1));
		addWait();
		ip.backToProducts();
		addWait();
		ip.addProductToCart(ExcelUtil.getData("UserData", 4, 1));
		addWait();
		ip.backToProducts();
		addWait();
		ip.addProductToCart(ExcelUtil.getData("UserData", 5, 1));
		addWait();
		cp = ip.launchCartPage();
	}
	
	
  @Test(priority=1)
  public void verifyTotalProductsInCart() {
	  
	  cp.getProductDetailsAddedToCart();
	  
    }
  
  @Test(priority=2)
  public void validateRemoveProduct() {
	  
	  cp.removeProduct(ExcelUtil.getData("UserData", 4, 1));
    }
  
  @Test(priority=3)
  public void validateContinueShopping() {
	  
	 ip = cp.continueShopping();
	 addWait();
	 ip.addProductToCart(ExcelUtil.getData("UserData", 6, 1));
	 addWait();
	 cp = ip.launchCartPage();
	 addWait();
	 System.out.println("..................................");
	 cp.getProductDetailsAddedToCart();
	 addWait();
    }
  
  @Test(priority=4)
  public void validateCheckout() {
	 
	  cp.checkOut();
	  System.out.println("...checkout button clicked");
	 
    }
  
}
