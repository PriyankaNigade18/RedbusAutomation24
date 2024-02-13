package package24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTest
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d1.get("https://www.google.com");
		WebElement ele = d1.findElement(By.id("APjFqb"));
		ele.sendKeys("Orangehrm Demo",Keys.ENTER);
		d1.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d1.findElement(By.name("username")).sendKeys("Admin");
		d1.findElement(By.name("password")).sendKeys("admin123");
		d1.findElement(By.className("oxd-button")).click();
		Thread.sleep(4000);
		d1.findElement(By.className("oxd-userdropdown-icon")).click();
		d1.findElement(By.linkText("Logout")).click();
		
		List <WebElement> links= d1.findElements(By.tagName("a"));
		System.out.println("Total links:"+links.size());
		List <WebElement> images= d1.findElements(By.tagName("img"));
		System.out.println("Total images:"+images.size());
		List <WebElement> inputs= d1.findElements(By.tagName("input"));
		System.out.println("Total input boxes:"+inputs.size());	
		
		for(WebElement i:links)
		{
			System.out.println(i.getText());
		}
	}
}
