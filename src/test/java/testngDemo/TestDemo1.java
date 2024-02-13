package testngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestDemo1
{
  @Test
  public void testCase1() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
  }
  
  
  @Test
  public void testCase2()
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.redbus.in");
	  System.out.println("Title is: "+driver.getTitle());
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
