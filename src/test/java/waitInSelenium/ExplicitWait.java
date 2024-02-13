package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import helper.Utility;

public class ExplicitWait {
  @Test
  public void loginTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  By emailid=By.name("email");
	  By btn=By.xpath("//input[@type='submit']");
	  
	  /*
	   * TimeoutException: Expected condition failed: 
	   * waiting for presence of element located by: By.name: 
	   * email#### (tried for 5 second(s) with 500 milliseconds interval)
	   * 500ms  o.5 sec 
	   * interval time=Polling time
	   */
//	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//	  WebElement ele1=wait.until(ExpectedConditions.presenceOfElementLocated(emailid));
//	  
	  Utility.waitForPresenceOfElement(driver,emailid).sendKeys("test123@gmail.com");
	  //ele1.sendKeys("test@gmail.com");
	  
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait2.until(ExpectedConditions.elementToBeClickable(btn)).click();
	  
	  
	  
	  
	  
	  
	  
  }
  
  
}
