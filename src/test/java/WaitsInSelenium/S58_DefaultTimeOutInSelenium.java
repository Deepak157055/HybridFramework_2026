package WaitsInSelenium;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S58_DefaultTimeOutInSelenium {
  @Test
  public void testDefaultTimeOut() {
  
	  ChromeDriver driver = new ChromeDriver();
	  
	 // Default timeouts={implicit=0 pageLoad=300000(5min) script=30000(30)}. We can customize these timeout for implicit, pageLoad, Script.
	  
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
	  
	  driver.get("https://www.freshworks.com/demo/");
	  
	  // Capabilities is interface in Selenium
  
      Capabilities cap = driver.getCapabilities();
      
      Map<String,Object>  allCap =  cap.asMap();
      
      String s1 = allCap.toString();
      
      String[] s2 = s1.split(",");
      
      for(String i:s2) {
    	  
    	  System.out.println(i);
    	  
      }
  
//      {acceptInsecureCerts=false
//    		  browserName=chrome
//    		  browserVersion=150.0.7871.182
//    		  chrome={chromedriverVersion=150.0.7871.124 (9261fd0a595ac4964ea84e6bd4a025c1173a2ffa-refs/branch-heads/7871@{#3359})
//    		  userDataDir=C:\WINDOWS\SystemTemp\scoped_dir23496_171589788}
//    		  fedcm:accounts=true
//    		  goog:chromeOptions={debuggerAddress=localhost:50459}
//    		  goog:processID=21168
//    		  networkConnectionEnabled=false
//    		  pageLoadStrategy=normal
//    		  platformName=windows
//    		  proxy=Proxy()
//    		  se:cdp=ws://localhost:50459/devtools/browser/48b6a5c5-c1c1-4a61-a915-da30afe9060d
//    		  se:cdpVersion=150.0.7871.182
//    		  setWindowRect=true
//    		  strictFileInteractability=false
//    		  timeouts={implicit=0
//    		  pageLoad=300000
//    		  script=30000}
//    		  unhandledPromptBehavior=dismiss and notify
//    		  webauthn:extension:credBlob=true
//    		  webauthn:extension:largeBlob=true
//    		  webauthn:extension:minPinLength=true
//    		  webauthn:extension:prf=true
//    		  webauthn:virtualAuthenticators=true}
  
  
	  
	  
	  
	  
	  
   }
}
