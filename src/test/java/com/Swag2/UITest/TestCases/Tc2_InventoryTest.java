package com.Swag2.UITest.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Swag2.UITest.Base.Baseclass_3;
import com.Swag2.UITest.Utilities.ExcelUtil;


public class Tc2_InventoryTest extends Baseclass_3{
	
  // prerequisite
  @BeforeClass
  public void pageSetup() {
	
	ip = lp.doLogin(ExcelUtil.getData("UserData", 0, 1),ExcelUtil.getData("UserData", 1, 1));
		  
   }
	
	
  @Test(priority=1)
  public void verifyProductCount() {
	  
	int s1 = ip.getProductCount();
	System.out.println(s1);
    }
  
  @Test(priority=2)
  public void verifyProductDetails() {
	  
	  ip.getProductDetails();
  }
  
  
  @Test(priority=3)
  public void verifyAddProduct() {
	  
	  ip.addProductToCart(ExcelUtil.getData("UserData", 2, 1));
	  
   }
  
  @Test(priority=4)
  public void verifyCartPage() {
	  
	  ip.launchCartPage();
	  addWait();
	  String expUrl = "cart";
	  Assert.assertTrue(driver.getCurrentUrl().contains(expUrl),"Cart page is not displayed");
	  System.out.println("Cart page is displayed");
	  
    }




}



