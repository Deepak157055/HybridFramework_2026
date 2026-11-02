package com.WebTesting_TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Testcase2_Description_Invocation {
  @Test(priority=1,description="Smoke Test")
  public void registerTest() {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2,description="Smoke Test",invocationCount=3)
  public void loginTest() {
	  System.out.println("This is login test");
	  
  }
  @Test(priority=3,description="Functional Test")
  public void searchTest() {
	  
	  System.out.println("This is search test");
  }
  @Test(priority=4,description="Regression Test")
  public void addtocartTest() {
	  
	  System.out.println("This is add to cart test");
	  
  }
  @Test(priority=5,description="Smoke Test")
  public void logoutTest() {
	  
	  System.out.println("This is logout test");
  }
  
}
