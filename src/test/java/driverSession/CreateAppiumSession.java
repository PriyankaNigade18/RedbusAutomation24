package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateAppiumSession
{
  @Test
  public void createSession() throws MalformedURLException 
  {
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("appium:deviceName","pixel_5");
	  cap.setCapability("appium:udid","emulator-5554");
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  cap.setCapability("app",path);
	  
	  //server connectivity
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //driver session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
