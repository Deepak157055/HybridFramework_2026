package com.WebTesting_TestNG.Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeTest
	public void bTest() {
		
		System.out.println("Before Test will run before 1rst class in the Test");
	}
	
	@AfterTest
	public void aTest() {
		
		System.out.println("After Test will run after last class in the Test");
	}
	
    @BeforeSuite
    public void bSuite() {
    	
    	System.out.println("Before Suite will run before the first Test");
    }

    @AfterSuite
    public void aSuite() {
    	
    	System.out.println("After Suite will run after the last Test");
    }


}
