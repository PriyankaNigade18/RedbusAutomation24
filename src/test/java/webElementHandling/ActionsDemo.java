package webElementHandling;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {
  @Test(enabled=false)
  public void rightClick() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	  
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  Actions act=new Actions(driver);
	  act.contextClick(ele).perform();
	  
	  //list
	  List<WebElement> list1=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  for(WebElement i:list1)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Delete"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  Thread.sleep(1500);
	  
	  //Alert
	 Alert alt= driver.switchTo().alert();
	 System.out.println("Alert text: "+alt.getText());
	 alt.accept();
	 
	 
  }
  
  @Test(enabled=false)
  public void doubleCLick()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	  
	  //ele
	  WebElement ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  
	  Actions act=new Actions(driver);
	  act.doubleClick(ele).perform();
	  
	  //alert 
	  String text=driver.switchTo().alert().getText();
	  System.out.println("Alert text: "+text);
	  driver.switchTo().alert().accept();
	  
	  
	  
	  
  }
  
  
  @Test(enabled=false)
  public void mouseOver()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/tooltip");
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //ele
	  WebElement ele=driver.findElement(By.id("age"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  //tooltip
	  
	  String text=driver.findElement(By.className("ui-tooltip-content")).getText();
	  System.out.println(text);
	  
	  
	  
  }
  
  @Test(enabled=false)
  public void dragAndDrop()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  
	  driver.switchTo().frame(0);
	  //element
	  WebElement src=driver.findElement(By.id("draggable"));
	  
	  WebElement dest=driver.findElement(By.id("droppable"));
	  
	  Actions act=new Actions(driver);
	  act.dragAndDrop(src, dest).perform();
	  
  }
  
  
  @Test
  public void slider()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/");
	  
	  driver.switchTo().frame(0);
	  //ele
	  WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	  
	  Actions act=new Actions(driver);
	  act.clickAndHold(ele).moveToElement(ele, 200, 0).build().perform();
	  
	  
	  
  }
}
