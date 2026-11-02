package com.Swag2.UITest.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Swag2.UITest.Base.Baseclass_3;
import com.Swag2.UITest.Utilities.ExcelUtil;
import com.aventstack.chaintest.plugins.ChainTestListener;

public class Tc1_LoginTest extends Baseclass_3{
  @Test(priority=1)
  public void verifyUrl() {
	
	 ChainTestListener.log("Verify the url of the application");
	 String actUrl = lp.getAppUrl();
	 String expUrl = prop.getData("homePageUrl");
	 Assert.assertTrue(actUrl.contains(expUrl),"Url not matched");
	 System.out.println("Url matched");
  }
  
  @Test(priority=2)
  public void verifyTitle() {
	 
	 ChainTestListener.log("Verify the title of the application");
	 String actTitle = lp.getAppTitle();
	 String expTitle = prop.getData("homePageTitle");
	 Assert.assertEquals(actTitle, expTitle,"Title not matched");
	 System.out.println("Title matched");
	  
  }
  
  @Test(priority=3)
  public void validateLogin() {
	  lp.doLogin(ExcelUtil.getData("UserData", 0, 1),ExcelUtil.getData("UserData", 1, 1));
	  addWait();
	  Assert.assertTrue(lp.getAppUrl().contains("inventory"),"Login Failure");
	  System.out.println("Login success");
	  ChainTestListener.log("Login is completed");
	  
  }
  
}
