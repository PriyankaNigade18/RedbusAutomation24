package dataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.PropertiesUtil;

public class HRMProperties {
  @Test
  public void f()
  {
	  PropertiesUtil p1=new PropertiesUtil("Config");
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p1.getData("url"));

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(p1.getData("un"));
		
		driver.findElement(By.name("password")).sendKeys(p1.getData("psw"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//validation
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		System.out.println("Login Pass");
  }
}
