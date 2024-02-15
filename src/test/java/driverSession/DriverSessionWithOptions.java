package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithOptions
{
	 
	
	
  @Test
  public void CreateSession() throws MalformedURLException 
  {
	  UiAutomator2Options options=new UiAutomator2Options();
	  options.setPlatformName("Android");
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  options.setCapability("app", path);
	  
	  //server connectivity
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //driver session
	  AppiumDriver driver=new AndroidDriver(url,options);
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
  }
}