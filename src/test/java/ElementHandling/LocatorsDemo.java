package ElementHandling;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverSession.CreateSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorsDemo {
  @Test
  public void locators() throws InterruptedException 
  {
	 AppiumDriver driver= CreateSession.intializeDriver();
	 
	 //accessibilityId
	 WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	 String text1=ele1.getText();
	 System.out.println("Text is: "+text1);
	 
	 //action
	 ele1.click();
	 
	 Thread.sleep(2000);
	 
	 driver.navigate().back();
	 
	 //xpath
	 WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
	 System.out.println("Text is: "+ele2.getText());
	 ele2.click();
	 
	 driver.navigate().back();
	 
	 //resource-id
	WebElement ele3= driver.findElements(AppiumBy.id("android:id/text1")).get(2);
	 System.out.println("Text is: "+ele3.getText());
	 ele3.click();
	 
	 driver.navigate().back();
	 
	 
	 //className
	 WebElement ele4=driver.findElements(AppiumBy.className("android.widget.TextView")).get(4);
	  System.out.println("Text is: "+ele4);
	  ele4.click();
	  
	  driver.navigate().back();
	  
	  //androidUIAutomator
	  WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));
	  System.out.println("Text is: "+ele5.getText());
	  
	  ele5.click();

	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
