package com.WebTesting_TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Testcase8_groups {
	
	  @Test(priority=1,groups = "Smoke")
	  public void testCase1()
	  {
		  System.out.println("This is test1");
	  }
	  
	  
	  @Test(priority=2,groups = "Smoke")
	  public void testCase2()
	  {
		  System.out.println("This is test2");
	  }
	  
	  
	  
	  @Test(priority=3,groups = "Functional")
	  public void testCase3()
	  {
		  System.out.println("This is test3");
	  }
	  
	  
	  @Test(priority=4,groups = "Functional")
	  public void testCase4()
	  {
		  System.out.println("This is test4");
	  }
	  
	  
	  @Test(priority=5,groups="Integration")
	  public void testCase5()
	  {
		  System.out.println("This is test5");
	  }
	  
	  
	  @Test(priority=6,groups = "Regression")
	  public void testCase6()
	  {
		  System.out.println("This is test6");
	  }
	  
	  
	  @Test(priority=7,groups = "Regression")
	  public void testCase7()
	  {
		  System.out.println("This is test7");
	  }

}
