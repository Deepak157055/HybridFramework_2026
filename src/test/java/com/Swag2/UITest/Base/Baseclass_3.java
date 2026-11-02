package com.Swag2.UITest.Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.Swag2.UITest.PageOR.Pg1_LoginPage;
import com.Swag2.UITest.PageOR.Pg2_InventoryPage;
import com.Swag2.UITest.PageOR.Pg3_CartPage;
import com.Swag2.UITest.PageOR.Pg4_CheckOutPage;
import com.Swag2.UITest.PageOR.Pg5_OverviewPage;
import com.Swag2.UITest.Utilities.PropertiesUtil;
import com.aventstack.chaintest.plugins.ChainTestListener;

public class Baseclass_3 {
	
	// public variables + Annotations + page class objects
	
	public WebDriver driver;
	public Pg1_LoginPage lp;
	public Pg2_InventoryPage ip;
	public Pg3_CartPage cp;
	public Pg4_CheckOutPage chkp;
	public Pg5_OverviewPage op;
	public PropertiesUtil prop;
	
	@Parameters({"bname"})
	@BeforeClass
	public void setUp(String bname) {
		
		
		prop = new PropertiesUtil("Config3");
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		prefs.put("credentials_enable_service", false);
		options.setExperimentalOption("prefs", prefs);
		// driver = new ChromeDriver(options);
		
		  if(bname.equals("chrome")) {
			  driver = new ChromeDriver(options);
			  }
			  else if(bname.equals("edge")) {
				  driver = new EdgeDriver();
			  }
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.manage().window().maximize();
		driver.get(prop.getData("url"));
		lp = new Pg1_LoginPage(driver);
		ip = new Pg2_InventoryPage(driver);
		cp = new Pg3_CartPage(driver);
		chkp = new Pg4_CheckOutPage(driver);
		op = new Pg5_OverviewPage(driver);
		
	}
	
	public static void addWait() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void getScreenshot(ITestResult result) 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//in report
		byte arr[]=ts.getScreenshotAs(OutputType.BYTES);
		ChainTestListener.embed(arr,"image/png");
		
		//byte format screenshot in local
	File src=ts.getScreenshotAs(OutputType.FILE);
	File path=new File(System.getProperty("user.dir")+"//Screenshots//"+result.getName()+".png");
		
	try {
		FileHandler.copy(src,path);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	@AfterClass
	public void tearDown() {
		
		System.out.println("..........Test Complete..........................");
		driver.quit();
	}
	
	
	

}
