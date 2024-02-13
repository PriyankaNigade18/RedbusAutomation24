package helper;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility
{
	
	public static String timestamp()
	{
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}
	
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select sc=new Select(ele);
		  System.out.println("Is dropdown support multiple selction: "+sc.isMultiple());
		  
		  List<WebElement> allOptions=sc.getOptions();
		  System.out.println("Total options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
	}
	
	
	//dynamic dropdown
	public static  void dynamicDropdown(WebDriver driver,By loc,String value)
	{
		 List<WebElement> list2=driver.findElements(loc);

		 for(WebElement i:list2)
		 {
			 if(i.getText().contains(value))
			 {
				 i.click();
				 break;
			 }
		 }
	}
	
	
	//Scroll
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	
	public static void scrollToElement(WebDriver driver,WebElement ele)
	{
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	//WebDriverWait
	public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
	  {
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		  return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	  }

}
