package package24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		//tagname with id
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("test@gmail.com");
		//tagname with attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test123");
		
		//button tagname with class
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		//tagname with classname and attribute
	      driver.findElement(By.cssSelector("input.btn[type='submit']")).click();
	
		
		
		
		
		
	}

}
