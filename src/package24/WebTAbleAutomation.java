package package24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTAbleAutomation {

	public static void main(String[] args) 
	{
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=asdasdasd&submit-name=");

			System.out.println("*******Calculate and print all headings***********");
			List<WebElement> headings=driver.findElements(By.xpath("//thead//tr//th"));
			
			System.out.println("Total headigs are: "+headings.size());
			for(WebElement i:headings)
			{
				System.out.println(i.getText());
			}
			System.out.println("******Total rows are:***********");
			int rows=driver.findElements(By.xpath("//tbody//tr")).size();
			System.out.println("Total Rows are: "+rows);
			
			System.out.println("******Total columns are:***********");
			int cells=driver.findElements(By.xpath("//tbody//tr[1]//td")).size();
			System.out.println("Total columns are: "+cells);
			
			
			System.out.println("******Print all First name from table***********");
			List<WebElement> fname=driver.findElements(By.xpath("//tbody//tr//td[2]"));
			
			for(WebElement i: fname)
			{
				System.out.println(i.getText());
			}
			
			System.out.println("******Print all any row from table***********");

			
			System.out.println("******Print all data from table***********");

			
	}

}
