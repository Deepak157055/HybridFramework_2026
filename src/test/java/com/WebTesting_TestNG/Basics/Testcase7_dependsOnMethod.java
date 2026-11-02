package com.WebTesting_TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase7_dependsOnMethod {
  @Test(priority=1)
  public void testRegister() {
	  
	  System.out.println("This is register test");  
  }

  @Test(priority=2,dependsOnMethods="testRegister")
  public void testLogin() {
	  
	 System.out.println("This is login test");
	 Assert.assertEquals(true,false, "Fail as true not equal to false");
	  
  }

  @Test(priority=3,dependsOnMethods="testLogin")
  public void testLogout() {
	  
	  System.out.println("This is logout test");
	  
  }



}



