package com.WebTesting_TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Testcase6_timeouts {
  @Test(timeOut=4000)
  public void testcase1() throws InterruptedException {
	  
	  System.out.println("This is test1");
	  Thread.sleep(3000);
	  
	}
  
  
  @Test(timeOut=7000)
  public void testcase2() throws InterruptedException {
	  
	  
	  System.out.println("This is test2");
	  Thread.sleep(6000);
	  
  }
}
