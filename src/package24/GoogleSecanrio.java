package package24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSecanrio {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		
		List<WebElement> options=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("Total options are: "+options.size());
		
		
		for(WebElement i: options)
		{
			System.out.println(i.getText());
		}
		
		
		
	}

}
