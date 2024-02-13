package package24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithIndex {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("test@gmail.com");
		
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("testttttt");
		
		
	}

}
