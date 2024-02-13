package webElementHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHAndling 
{
  @Test(priority=1)
  public void rediffmailTest() throws InterruptedException
    {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  driver.findElement(By.name("proceed")).click();
	  
	  //alert 
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  Thread.sleep(2000);
	  
	  alt1.accept();
	  
	  driver.findElement(By.id("login1")).sendKeys("Priyanka");
  }
  
  @Test(priority=2)
  public void alertDemo() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //second alert
	  driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	  
	  //alert open
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt2.getText());
	  Thread.sleep(2000);
	  
	  alt2.dismiss();
	  String result=driver.findElement(By.id("result")).getText();
	  System.out.println("Result is: "+result);
	  
	  
	  
	  
	  
  }
}
