package scenarionOnMobileApp;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverSession.CreateSession;
import helper.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEvents {
  @Test
  public void keyboardActions()
  {
	  AppiumDriver driver=CreateSession.intializeDriver();
	  
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //list
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  Utility.scrollUpToElement(driver,ele,3);
	  
	  //TextView
	  WebElement ele2=driver.findElement(AppiumBy.accessibilityId("TextFields"));
	  
	  ele2.click();
	  
	  //sendKeys
	  driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).sendKeys("Priyanka");

	  //With KeyEvent -pressKey(new KeyEvent().withKey(AndroidKey.ENTER))
	    
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.A));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.P));

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
