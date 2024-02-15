package ElementHandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void scrollTest() throws InterruptedException
  {
	  AppiumDriver driver=CreateSession.intializeDriver();
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  WebElement list=driver.findElement(AppiumBy.id("android:id/list"));
	  
	 
	  driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement)list).getId(),
			    "direction", "down",
			    "percent",0.75
			));
	  
	
	  
	  
	  
  }
}
