package ElementHandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGesture {
  @Test
  public void dragTest() 
  {
	  
	  
	  AppiumDriver driver=CreateSession.intializeDriver();
	//views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //dot
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  
	   driver.executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "endX", 754,
			    "endY",1095
			));
	  
	   
	   String result=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	   System.out.println("Result is: "+result);
	  
	   
	   
	   
	  
	  
	  
	  
	  
	  
  }
  
}
