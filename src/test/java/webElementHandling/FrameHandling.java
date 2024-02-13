package webElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
  @Test(enabled=false)
  public void SimpleFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  
	  //handle frame with index
	  //driver.switchTo().frame(0);
	  
	  //frame with id
	  //driver.switchTo().frame("mce_0_ifr");
	  
	  //frame with webElement
	  WebElement frameele=driver.findElement(By.id("mce_0_ifr"));
	  driver.switchTo().frame(frameele);
	    
	  //script
	  WebElement ele=driver.findElement(By.xpath("//p[contains(text(),'Your cont')]"));
	  ele.clear();
	  ele.sendKeys("Hello Everyone!");
  }
  
  
  
  @Test
  public void nestedFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  //top-left
	  driver.switchTo().frame(0).switchTo().frame("frame-left");
	  System.out.println(driver.getPageSource());
	  
	  //come to main frame
	  driver.switchTo().defaultContent();
	  
	  //middle
	  driver.switchTo().frame(0).switchTo().frame("frame-middle");
	  System.out.println(driver.getPageSource());
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
