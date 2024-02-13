package package24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest 
{
	public static void main(String[] args)
	{
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.redbus.in/");
		String title = d1.getTitle();
		if(title.contains("Booking"))
		{
			System.out.println("Title matched: Test Pass");
		}
		else
		{
			System.out.println("Title not matched: Test Fail");
		}
		d1.quit();
	}
}