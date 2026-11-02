package com.WebTesting_TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Testcase3_disableTest {
  
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("This is login test");
  }
  
  //disable test using argument
  @Test(priority=3,enabled=false)
  public void searchTest() 
  {
	  System.out.println("This is search test");
  }
  
  //disable test using xml file
  @Test(priority=4)
  public void addTocartTest() 
  {
	  System.out.println("This is add to cart test");
  }
  
  @Test(priority=5)
  public void logoutTest() 
  {
	  System.out.println("This is logout test");
  }
}
