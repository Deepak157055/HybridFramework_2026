package com.Swag2.UITest.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.Swag2.UITest.Base.Baseclass_3;
import com.Swag2.UITest.Utilities.ExcelUtil;

public class Tc4_CheckOutTest extends Baseclass_3 {
	
   // prerequisite
	  @BeforeClass
	  public void pageSetup() {
		
		ip = lp.doLogin(ExcelUtil.getData("UserData", 0, 1),ExcelUtil.getData("UserData", 1, 1));
		addWait();
		ip = ip.addProductToCart(ExcelUtil.getData("UserData", 6, 1));
		addWait();
		ip = ip.backToProducts();
		ip = ip.addProductToCart(ExcelUtil.getData("UserData", 4, 1));
		addWait();
		cp = ip.launchCartPage();
		addWait();
	    cp = cp.getProductDetailsAddedToCart();
	    addWait();
	    cp = cp.removeProduct(ExcelUtil.getData("UserData", 4, 1));
	    addWait();
	    ip = cp.continueShopping();
	    addWait();
	    ip = ip.addProductToCart(ExcelUtil.getData("UserData", 5, 1));
	    addWait();
		cp = ip.launchCartPage();
		addWait();
		System.out.println("...................................");
	    cp = cp.getProductDetailsAddedToCart();
	    addWait();
	    chkp = cp.checkOut();
		  
	  }
	
  @Test(priority=1)
  public void validateCheckOut() {
	  
     chkp.doContinueCheckOut("Deepak", "Kumar", "560066");
     System.out.println("..........fname,lname,pincode added................");
	  
  }
}
