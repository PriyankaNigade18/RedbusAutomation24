package ElementHandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGestureTest
{
	public static void swipeLeft(AppiumDriver driver,WebElement ele)
	{
		 driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
				 "elementId",((RemoteWebElement)ele).getId(),  
				    "direction","left",
				    "percent", 0.75
				));
		  
	}
	
	public static void swipeRight(AppiumDriver driver,WebElement ele)
	{
		 driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
				 "elementId",((RemoteWebElement)ele).getId(),  
				    "direction","right",
				    "percent", 0.75
				));
		  
	}
	
	
  @Test
  public void swipeTest() throws InterruptedException 
  {
	  AppiumDriver driver=CreateSession.intializeDriver();
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  //resourceid
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  swipeLeft(driver,ele);
	  
	  Thread.sleep(2000);
	  
	  swipeRight(driver,ele);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*
	  //left
	 driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
			 "elementId",((RemoteWebElement)ele).getId(),  
			    "direction","left",
			    "percent", 0.75
			));
	  
	  
	  
	 Thread.sleep(2000);
	 
	 //right
	 driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
			 "elementId",((RemoteWebElement)ele).getId(),  
			    "direction","right",
			    "percent", 0.75
			));
	  
	  */
	  
	  
  }
}
