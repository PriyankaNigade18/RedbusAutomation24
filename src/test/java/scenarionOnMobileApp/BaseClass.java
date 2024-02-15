package scenarionOnMobileApp;

import org.testng.annotations.BeforeClass;

import driverSession.CreateSession;
import io.appium.java_client.AppiumDriver;

public class BaseClass 
{
	public	AppiumDriver driver;
	
	@BeforeClass
	public void setup()
	{
	 driver=CreateSession.intializeDriver();
	}

}
