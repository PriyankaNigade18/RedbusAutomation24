package scenarionOnMobileApp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateSession;
import helper.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ToggleWifi_Airplanemode extends BaseClass
{
  @Test(priority=1)
  public void testToggleWifi()
  {
	  
	  /*
	   * toggleAirplaneMode
	   * toggleWifi
	   * toggleData
	   */
	  
	  Utility.getScreenShot(driver);
	  
	  System.out.println("Initial status  Wifi is on!");
	  		//off
	  		((AndroidDriver )driver).toggleWifi();
	  
	  	  System.out.println("Current status  Wifi is off!");

	 	 Utility.getScreenShot(driver);
	  	  //on
	  	  
	  	((AndroidDriver )driver).toggleWifi();
	  	
	  	  System.out.println("Current status  Wifi is on!");
	  	  
	  	  
  }
  @Test(priority=2)
  public void testToggleAirplaneMode() throws InterruptedException
  {
	  
	  /*
	   * toggleAirplaneMode
	   * toggleWifi
	   * toggleData
	   */
	  Thread.sleep(1000);
	  //not working!-swipe
	  WebElement ele=driver.findElement(AppiumBy.id("com.android.systemui:id/quick_settings_panel"));
	   driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement)ele),
			    "direction", "right",
			    "percent", 0.75
			));
	  
	  	System.out.println("Initial status  AirplaneMode off!");
	  		//On
	  		((AndroidDriver )driver).toggleAirplaneMode();
	  
	  		 Utility.getScreenShot(driver);
	  	  System.out.println("Current status AirplaneMode is On!");

	  	  //off
	  	  
	  	((AndroidDriver )driver).toggleAirplaneMode();
	  	
	  	  System.out.println("Current status  AirplaneMode is off");
	  	  
	 	 Utility.getScreenShot(driver);	  	  

	  
	  
	  
  }
  
  
  
  @Test(priority=3)
  public void testToggleData()
  {
	  
	  /*
	   * toggleAirplaneMode
	   * toggleWifi
	   * toggleData
	   */
	  
	 
	  
	  	System.out.println("Initial status  MobileData on!");
	  		//off
	  		((AndroidDriver)driver).toggleData();
	  
	  	  System.out.println("Current status MobileData is off!");

	  	  //on
	  	  
	  	((AndroidDriver )driver).toggleData();
	  	
	  	  System.out.println("Current status MobileData is On");
	  	  
	  	  

	  
	  
	  
  }
}
