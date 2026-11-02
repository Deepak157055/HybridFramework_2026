package com.Swag2.UITest.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.*;

import com.Swag2.UITest.Base.Baseclass_3;
import com.Swag2.UITest.Utilities.ExcelUtil;

public class Tc5_OverviewTest extends Baseclass_3{
	
	
  @BeforeClass
  public void pageSetup() {
	  
	  ip=lp.doLogin(ExcelUtil.getData("UserData", 0, 1),ExcelUtil.getData("UserData", 1, 1));
	  addWait();
	  ip= ip.addProductToCart(prop.getData("pname7"));
	  addWait();
	  cp=ip.launchCartPage();
	  addWait();
	  chkp = cp.checkOut();
	  addWait();
	  op = chkp.doContinueCheckOut(prop.getData("fname"),prop.getData("lname"),prop.getData("pincode"));
	  
  }
	
  @Test(priority=1)
  public void validatePaymentDetails() {
	  
	  op.getPaymentDetails();
	  addWait();
	}
  
  @Test(priority=2)
  public void validateResult() {
	String actMsg = op.doFinishCheckOut();
	String expMsg = "your order";
	Assert.assertTrue(actMsg.contains(expMsg),"Process not Completed");
	System.out.println("Process Completed");
	
     }
  
  
}
