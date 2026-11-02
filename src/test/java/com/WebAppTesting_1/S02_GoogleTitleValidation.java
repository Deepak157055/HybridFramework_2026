package com.WebAppTesting_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S02_GoogleTitleValidation {

	public static void main(String[] args) {

      
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String actTitle = driver.getTitle();
		
		String expTitle = "Google";
		
		if(actTitle.equals(expTitle))
			
		{
			System.out.println("Test pass");
		}
		else {
			
			System.out.println("Test Fail");
		}

	}

}
