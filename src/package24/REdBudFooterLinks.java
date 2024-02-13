package package24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class REdBudFooterLinks {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in");
		
		List<WebElement> list1=driver.findElements(By.xpath("//li[@id='about_redbus_title_footer']"));
	for(WebElement i: list1)
	{
		System.out.println(i.getText());
	}
	}

}
