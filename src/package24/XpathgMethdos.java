package package24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathgMethdos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		
		String text=driver.findElement(By.xpath("//h2[contains(text(),'Bestsellers')]")).getText();
		
		System.out.println(text);
		
		//normalize-space()
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		String cartText=driver.findElement(By.tagName("h2")).getText();
		System.out.println(cartText);
		
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("bags");
		
		driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]")).clear();
		
		driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]")).sendKeys("Watch");
		
		
		
		
		
	}
	
	
	
	
	
	

}
