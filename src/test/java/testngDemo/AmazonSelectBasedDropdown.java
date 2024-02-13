package testngDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import helper.Utility;

public class AmazonSelectBasedDropdown {
  @Test
  public void amazonTest() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  //dropdown ele
	  WebElement ele=driver.findElement(By.id("searchDropdownBox"));
	  Utility.selectBasedDropdown(ele,"Baby");
	  
	  
	  /*
	  //select class Object
	  Select sc=new Select(ele);
	  System.out.println("Is drop down support multiple selection: "+sc.isMultiple());
	  
	  //single select
	  sc.selectByIndex(3);
	  
	  Thread.sleep(2000);
	  
	  sc.selectByValue("search-alias=stripbooks");
	  
	  Thread.sleep(2000);
	  
	  sc.selectByVisibleText("Gift Cards");
	  
	  //All options from dropdown
	  
	  List<WebElement> allOptions=sc.getOptions();
	  System.out.println("Total Options are: "+allOptions.size());
	  String exp="Toys & Games";
	  
	  for(WebElement i: allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains(exp))
		  {
			  i.click();
			  System.out.println("Expected option got selected!");
			  break;
		  }
	  }
	  */
	  
  }
  
  
  
  @Test
  public void facebookTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.facebook.com/");
	  
	  //click on create an account
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //day
	  WebElement dayele=driver.findElement(By.id("day"));
	  Utility.selectBasedDropdown(dayele, "29");
	  
	  //month
	  WebElement monthele=driver.findElement(By.id("month"));
	  Utility.selectBasedDropdown(monthele,"Oct");
	  
	  
	  
	  
	  
	  
	  
//	  Select sc=new Select(dayele);
//	  System.out.println("Is dropdown support multiple selction: "+sc.isMultiple());
//	  
//	  List<WebElement> allOptions=sc.getOptions();
//	  System.out.println("Total options are: "+allOptions.size());
//	  
//	  for(WebElement i:allOptions)
//	  {
//		  if(i.getText().contains("29"))
//		  {
//			  i.click();
//			  break;
//		  }
//	  }
	  
  }
  
  
}
