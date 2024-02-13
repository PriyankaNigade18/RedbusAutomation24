package package24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxies {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=asdasdasd&submit-name=");
		
		//find the ancestor node
		String ancestor=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestornode for John is: "+ancestor);
		
		//find the all following node
		List<WebElement> list=driver.findElements(By.xpath("//td[text()='John']//following::td"));
		System.out.println("Total Following node: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
		//find preceding-sibling of John
		WebElement ele=driver.findElement(By.xpath("//td[text()='John']//preceding-sibling::td"));
		System.out.println("Preceding -sibling for John is: "+ele.getTagName()+","+ele.getText());
		
		//find parent of John
		
		String pnode=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		
		System.out.println("Parent node is: "+pnode);
		
		
		//find all child of row3
		List<WebElement> list2=driver.findElements(By.xpath("//tbody//tr[3]//child::td"));
		
		System.out.println("Total child nodes are: "+list2.size());
		
		for(WebElement i: list2)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
