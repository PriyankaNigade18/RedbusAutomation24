package scenarionOnMobileApp;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import driverSession.CreateSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DeviceLock_Unlock_Rotate 
{
  @Test
  public void deviceTest() throws InterruptedException
  {
	  /*
	   * to lock the device
	   * lockDevice()
	   * 
	   * to unlock the device
	   * unlockDevice()
	   * 
	   * to rotate the device
	   * rotate(ScreenOrientation)
	   */
	  
	  AppiumDriver driver=CreateSession.intializeDriver();	  
	  
	  
	  //lock device
	  
	/*
	  ((AndroidDriver)driver).lockDevice();
	  
	  System.out.println("Device Locked!");
	  
	  Thread.sleep(2000);
	  
	  
	  ((AndroidDriver)driver).unlockDevice();
	  System.out.println("Device UnLocked!");

	  */
	  
	  //rotate
	  
//	  ((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
//	  System.out.println("Rotate in PORTRAIT mode");
//	  

	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  System.out.println("Rotate in LANDSCAPE mode");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
}
