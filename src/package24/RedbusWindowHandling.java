package package24;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusWindowHandling {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		
		//home page
		
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
		driver.findElement(By.xpath("//span[text()='Help']")).click();
		
				Set<String> allWindows=driver.getWindowHandles();
				System.out.println(allWindows);
		
				for(String child:allWindows)
				{
					if(!parentId.equals(child)) {
						driver.switchTo().window(child);
						String text=driver.findElement(By.xpath("//div[text()='redBus Help']")).getText();
						System.out.println("Text is: "+text);
						//driver.quit();//close all open windows
						driver.close();
						
					}
				}
				
				//parent
				driver.switchTo().window(parentId);
				String text=driver.findElement(By.tagName("h1")).getText();
				System.out.println("Text from parent winodw: "+text);
				
		
//				
		
	}

}
