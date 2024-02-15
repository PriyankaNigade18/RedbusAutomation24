package scenarionOnMobileApp;

import java.time.Duration;

import org.testng.annotations.Test;

import driverSession.CreateSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;

public class WorkingWithApp {
  @Test
  public void appStatus() throws InterruptedException 
  {
	  
	  AppiumDriver driver=CreateSession.intializeDriver();
	  
	  System.out.println("Application Current state is:" +((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  //terminate the app
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  System.out.println("After terminating app: status");
	  System.out.println("Application Current state is:" +((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  //uninstall app- removeApp()
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  System.out.println("Application uninstalled!");
	  System.out.println("Application Current state is:" +((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  
	  //install app with updates 
//	  ((AndroidDriver)driver).installApp(path,new AndroidInstallApplicationOptions().withReplaceEnabled());
//	  System.out.println("Application Current state is:" +((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  ((AndroidDriver)driver).installApp(path);
	  System.out.println("Application Current state is:" +((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  System.out.println("Application Installed!");
	  
	  //Is App installed
	  System.out.println("Is App installed?: "+((AndroidDriver)driver).isAppInstalled("io.appium.android.apis"));
	  
	  
	  //Activate
		((AndroidDriver)driver).activateApp("io.appium.android.apis");
		  System.out.println("Application Current state is:" +((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
		  Thread.sleep(2000);
		  
	  //Keep application with runAppInBackground
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(5));
	  System.out.println("Application is running in Background!");
	  System.out.println("Application Current state is:" +((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  
  }
}










