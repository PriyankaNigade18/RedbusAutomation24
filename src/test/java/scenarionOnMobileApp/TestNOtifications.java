package scenarionOnMobileApp;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestNOtifications {
  @Test
  public void getNotifications()
  {
	  AppiumDriver driver=CreateSession.intializeDriver();
	  
	  ((AndroidDriver)driver).openNotifications();
	  
	  System.out.println("*****Notifications Titiles are:*********");

	  //To get title of notifications 
	  List<WebElement> title=driver.findElements(AppiumBy.id("android:id/title"));
	  for(WebElement i:title)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("*******Notifications text are:*******");
	  
	  //to get text of notifications
	  List<WebElement> text=driver.findElements(AppiumBy.id("android:id/text"));
	  
	  for(WebElement i:text)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
  }
}
