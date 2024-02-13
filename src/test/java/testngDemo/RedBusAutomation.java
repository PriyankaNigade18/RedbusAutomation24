package testngDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import helper.Utility;

public class RedBusAutomation {
  @Test
  public void dropdownTest()
  {
	  
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in");
	  
	  //from
	 WebElement ele= driver.findElement(By.id("src"));
	 ele.click();
	 //ele.sendKeys("pune",Keys.ENTER);
	 ele.sendKeys("pune");
	 
	 By loc1=By.xpath("//ul[contains(@class,'sc-dnqmqq')]//li//text[@class='placeHolderMainText']");
	 
	 Utility.dynamicDropdown(driver, loc1, "Wakad");
	 
//	 List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//li//text[@class='placeHolderMainText']"));
//	  
//	 for(WebElement i:list)
//	 {
//		 System.out.println(i.getText());
//		 if(i.getText().contains("Wakad"))
//		 {
//			 i.click();
//			 break;
//		 }
//	 }
  
	 
	 //To drop down
	 
	 WebElement ele2=driver.findElement(By.id("dest"));	 
	 ele2.click();
	 ele2.sendKeys("Bangalore");
	 By loc=By.xpath("//ul[contains(@class,'sc-dnqmqq')]//li//text[@class='placeHolderMainText']");
	 
	 Utility.dynamicDropdown(driver, loc, "Majestic");
	 
	 
	 //date 
	 
	 driver.findElement(By.xpath("(//span[contains(text(),16)])[1]")).click();
	 
	 
	 //search
	 driver.findElement(By.id("search_button")).click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 List<WebElement> list2=driver.findElements(By.xpath("//ul[contains(@class,'sc-dnqmqq')]//li//text[@class='placeHolderMainText']"));
//
//	 for(WebElement i:list2)
//	 {
//		 if(i.getText().contains("Majestic"))
//		 {
//			 i.click();
//			 break;
//		 }
//	 }
	 
	 
	 //date selection
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
  }
}
