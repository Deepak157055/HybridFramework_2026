package com.WebAppTesting_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S19_Xpath_Axies_1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/customers.html?email-name=sdasdsd%40gmail.com&password-name=zdfasd&submit-name=");
		
		System.out.println("Scenario1: get Parent tag name for John element");
		
		String pname = driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		
		System.out.println(pname);
        
		
		System.out.println("Scenario2: get grand parent tag name for John element");
		
		String Gname = driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		
		System.out.println(Gname);
		
		
		System.out.println("Scenario3: get number of childs for row 2");
		
		int childs = driver.findElements(By.xpath("//tbody//tr[2]//td")).size();
		
		System.out.println(childs);
		
		
		System.out.println("Scenario4: after John all remaining rows:following");
		
		int rr = driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		
		System.out.println(rr);
		
		
		System.out.println("Scenario5: after Ashley get all remaining data count");
		
		int rdc = driver.findElements(By.xpath("//td[text()='Ashley']//following::td")).size();
		
		System.out.println(rdc);
		
		
		System.out.println("Scenario6: after Ashley get all siblings");
		
		int a1 = driver.findElements(By.xpath("//td[text()='Ashley']//following-sibling::td")).size();
		
		System.out.println(a1);
		
		
		System.out.println("Scenario7: Before Ashley get all siblings");
		
		int b2 = driver.findElements(By.xpath("//td[text()='Ashley']//preceding-sibling::td")).size();
		
		System.out.println(b2);
		
		
		System.out.println("Scenario8: Before Ashley get all rows count");
		
		int c3 = driver.findElements(By.xpath("//td[text()='Ashley']//preceding::tr")).size();
		
		System.out.println(c3);
		
		
		System.out.println("Scenario8: Before Ashley get all data count");
		
		int d4 = driver.findElements(By.xpath("//td[text()='Ashley']//preceding::td")).size();
		
		System.out.println(d4);
		
	}

}
