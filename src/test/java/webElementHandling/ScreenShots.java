package webElementHandling;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShots {
  @Test
  public void capture()
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.redbus.in");
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots/Redbus_"+timeStamp()+System.currentTimeMillis()+".png");
	  
	  try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
 }
  
  //simpleDateFormat
  
  public String timeStamp()
  {
	  return new SimpleDateFormat("yyyyMMdd").format(new Date());
  }
  
  
  
  
  
  
}
