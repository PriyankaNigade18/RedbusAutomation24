package dataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMDataDrivenTEst
{
  @Test(dataProvider = "Mydata",dataProviderClass = CustomData.class)
  public void loginTest(String un,String psw)
  {
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		
		driver.findElement(By.name("password")).sendKeys(psw);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//validation
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		System.out.println("Login Pass");
  }
}
