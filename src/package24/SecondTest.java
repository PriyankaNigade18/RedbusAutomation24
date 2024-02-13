package package24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.google.com");
		d1.navigate().to("https://www.redbus.in");
		String title1=d1.getTitle();
		System.out.println(title1);
		Thread.sleep(2000);
		d1.navigate().back();
		String title2=d1.getTitle();
		System.out.println(title2);
		Thread.sleep(2000);
		d1.navigate().forward();
		Thread.sleep(2000);
		d1.navigate().refresh();
	}

}
