package com.WebTesting_TestNG.TestListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentTest;


public class MyListeners implements ITestListener {
	
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		
		  Date date = new Date();
		  SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd.HH.mm.ss");
		  String timeStamp = sdf.format(date);		
		  // add configuration
		  spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//TestReport//AutomationReport"+timeStamp+".html");
		  spark.config().setDocumentTitle("ExtentReport");
		  spark.config().setReportName("CRM Project");
		  spark.config().setTheme(Theme.DARK);
		  //attach the report
		  extent=new ExtentReports();
		  extent.attachReporter(spark);
		}
	
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName());		
		test.log(Status.PASS,result.getName()+"  got successfully executed");
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());		
		test.log(Status.FAIL,result.getName()+"  got failed");
		test.log(Status.INFO,result.getThrowable().getMessage());
		}
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());		
		test.log(Status.SKIP,result.getName()+"  got skipped");
		test.log(Status.INFO,result.getThrowable().getMessage());

     } 
	
	public  void onFinish(ITestContext context) {
		extent.flush();
	    
	  }
	
}
