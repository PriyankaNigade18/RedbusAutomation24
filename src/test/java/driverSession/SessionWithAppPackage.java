package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SessionWithAppPackage {
  @Test
  public void sessionWithApp() throws MalformedURLException 
  {
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("appium:deviceName","pixel_5");
	  cap.setCapability("appium:udid","emulator-5554");
	  
	  cap.setCapability("appium:appPackage", "io.appium.android.apis");
	  cap.setCapability("appium:appActivity","io.appium.android.apis.ApiDemos");
	  
	  
	  //server connectivity
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //driver session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
  }
}
