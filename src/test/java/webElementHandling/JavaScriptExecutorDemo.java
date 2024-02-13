package webElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import helper.Utility;

public class JavaScriptExecutorDemo 
{
//	public static void scrollDown(WebDriver driver)
//	{
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		  
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	}
//	
//	
//	public static void scrollUp(WebDriver driver)
//	{
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		  
//		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
//	}
	
	
  @Test
  public void scrollTest() throws InterruptedException
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.redbus.in");
	  
	  //scroll to specific element
	  
	  WebElement ele=driver.findElement(By.xpath("//h2[contains(text(),'3500+ Private')]"));
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  
	  
	  
	  
	  //js.executeScript("window.scrollTo(0,600)");
	  
//	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	  
//	  Thread.sleep(2000);
//	  
//	  Utility.scrollUp(driver);
	  
	  
	  
	  
	  
  }
}
