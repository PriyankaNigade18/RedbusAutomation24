package scenarionOnMobileApp;

import org.openqa.selenium.Alert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHandlingInMobileApp2
{
	public AppiumDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=CreateSession.intializeDriver();
		  
		  //click on app
		  driver.findElement(AppiumBy.accessibilityId("App")).click();
		  
		  //click on alerts
		  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		  
	}
  @Test(priority=1)
  public void alertWithOK()
  {
	  
	  //to open alert
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  /*
	   * Alert interface is available
	   * Alert alt=driver.switchTo().alert(); 
	   * Methods
	   * ---------
	   * 1.accept()--->ok
	   * 2.dismiss()--->cancel
	   * 3.sendKeys()--->promt
	   * 4.getText()--->to get the text
	   *  
	   */
	  //to handle alert-->switch to the alert
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Text of alert1 is: "+alt1.getText());
	  alt1.accept();
	  
	  System.out.println("Alert handled with Ok button!");
	  
	   
	  
  }
  @Test(priority=2)
  public void alertWithCancel()
  {
	  
	  
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
	  
	  Alert alt2=driver.switchTo().alert();
	  
	  System.out.println("TExt of alert2 is: "+alt2.getText());
	  
	  alt2.dismiss();
	  
	  System.out.println("Alert handles with Cancel button!");
	  
	  
	  
	  
	  
	  
	  
  }
}
