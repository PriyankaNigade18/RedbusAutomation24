package testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod 


{
	
	
 WebDriver driver;
  @Test(priority=1)
  public void login()
    {
	  System.out.println("Login Test");
	  
	 driver=new ChromeDriver();
	  driver.get("https://automationplayground.com/crm/login.html");
	  
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  //Assert.assertEquals(100, 200);
	  Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login Fail");
	  System.out.println("Login Completed!");
  }
  
  
  @Test(priority=2,dependsOnMethods="login",alwaysRun = true)
  public void logout() 
  {
	  System.out.println("Logout Test");

	  driver.findElement(By.xpath("//a[@class='nav-link']")).click();
	  
  }
  
  
  

//  @Test(priority=2)
//	public void addToCart()
//	{
//		System.out.println("Add to cart");
//	}
  
  
}
