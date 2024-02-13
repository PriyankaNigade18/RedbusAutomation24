package testngDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RedBusCaledar {
  @Test
  public void calendar() 
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in");
	  
	  //open caledar
	  driver.findElement(By.xpath("//span[text()='Date']")).click();
	  
	  //Expection
	  String date="2";
	  String month="Apr";
	  String year="2024";
	  
	  //Month
	  while(true)
	  {
	  String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
	  String cmonth=text.split(" ")[0];
	  String cyear=text.split(" ")[1];
	  
	  if(cmonth.contains(month) && cyear.contains(year))
	  {
		  break;
	  }
	  else
	  {
		  //click on arraow
		  driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
	  }
	  }
	  
	  
	  //date
	  
	  List<WebElement> dates=driver.findElements(By.xpath("//div[contains(@class,'DayTilesWrapper_')]//span[contains(@class,'DayTiles__Calendar')]"));
	  
	  for(WebElement i: dates)
	  {
		  if(i.getText().contains(date))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //date
	  ////div[contains(@class,'DayTilesWrapper_')]//span[contains(@class,'DayTiles__Calendar')]
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
