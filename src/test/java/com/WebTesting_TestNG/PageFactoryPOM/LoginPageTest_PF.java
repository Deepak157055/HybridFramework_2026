package com.WebTesting_TestNG.PageFactoryPOM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest_PF extends BaseClass_PF{
	
  @Test(priority=3)
  public void testLogin() {
	  
	 // LoginPage_PF lp = new LoginPage_PF(driver);
	  lp.doLoginPF("Admin", "admin123");
	  
	  String actTitle = lp.getTitlePF();
	  String expTitle = "OrangeHRM";
	  Assert.assertEquals(actTitle,expTitle, "Test Fail");
	  System.out.println("Test pass");
     }
   
   @Test(priority=1)
   public void validateURL() {
	   
	 String x1 =  lp.getUrlPF();
	 System.out.println(x1);
	  }
  
   @Test(priority=2)
   public void validateTitle() {
	   
	   String x2 = lp.getTitlePF();
	   System.out.println(x2);
	   
	   }
   @Test(priority=4)
   public void testLinks() {
	   
	   lp.orangeLinks();
   }
   
   
}
