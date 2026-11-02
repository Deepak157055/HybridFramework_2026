package com.WebTesting_TestNG.ByLocatorPOM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
  @Test(priority=3)
  public void validateLogin() throws InterruptedException {
	  
	  // LoginPage lp = new LoginPage(driver);
	  
	  lp.doLogin("deepak.bng2011@gmail.com", "cocktail7");
	  
	  Thread.sleep(2000);
	  
	  String actTitle = lp.getAppTitle();
	  
	  String expTitle = "My Account";
	  
	  Assert.assertTrue(actTitle.contains(expTitle),"Test Fail..Unsuccessful Login");
	  
	  System.out.println("Test Pass...Successful Login");
	  	  
  }
  
   @Test(priority=1)
   public void validateURL() {
	  
	  String s1 = lp.getAppUrl();
	  
	  System.out.println(s1);
	   
   }
   
   
   @Test(priority=2)
   public void validateTitle() {
	 
	   String s2 = lp.getAppTitle();
	   
	   System.out.println(s2);
	   
   }
   
}
