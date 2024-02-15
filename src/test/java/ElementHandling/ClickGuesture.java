package ElementHandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGuesture {
  @Test
  public void clickElement()
  {
	  AppiumDriver driver=CreateSession.intializeDriver();
	  
	  //view
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  driver.executeScript("mobile:clickGesture", ImmutableMap.of
			  (
			  "elementId",((RemoteWebElement)ele).getId()));
	  
	  System.out.println("Click Gesture is Completed on View!");
	  
	  
  }
}
