package com.WebTesting_TestNG.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest1 {
  
	  @Test
	  public void testCase1() 
	  {
		  System.out.println("TestCase 1 is executing.....");
	  }
	  
	  @Test
	  public void testCase2() 
	  {
		  System.out.println("TestCase 2 is executing.....");
	  }
	  
	  
	  @Test
	  public void testCase3() 
	  {
		  System.out.println("TestCase 3 is executing.....");
	  }
	
	  @BeforeMethod
	  public void bMethod(){
		  System.out.println("Before Method runs before every test case");
	  }
	  
	  @AfterMethod
	  public void aMethod() {
		  System.out.println("After Method runs after every test case");
	  }
	  
	  @BeforeClass
	  public void bClass() {
		  System.out.println("Before class runs before first test case in the class");
	  }
	  
	  @AfterClass
	  public void aClass() {
		  System.out.println("After class runs after last test case in the class");
	  }
	  
}
