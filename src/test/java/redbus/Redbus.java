package redbus;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Redbus
{//Source City and Destination city Generic code
	public static void citySelection(List<WebElement> ele, String value) {
		//List of Source City Options
		List<WebElement> srcList = ele;
			
		for(WebElement i: srcList)
		 {
			
			if(i.getText().contains(value))
				{
					i.click();
					break;
				}
			}
		
	}
	/*//Calendar Generic code old code for 2023 last year QA training class
	public static void dateSelection(WebDriver driver, WebElement calendarEle, WebElement monthEle, List<WebElement> dateEle, WebElement nxtArw, String monthTitle, String date) {
	    calendarEle.click();
	    while (true) {
	        try {
	            for (WebElement i : dateEle) {
	                if (monthTitle.equals(monthEle.getText()) && date.equals(i.getText())) {
	                    i.click();
	                    return;
	                }
	            }
	            nxtArw.click();
	        } catch (StaleElementReferenceException e) {
	            // Re-locate the elements
	            monthEle = driver.findElement(By.cssSelector("div.DayNavigator__IconBlock-qj8jdz-2.iZpveD:nth-child(2) > text()"));
	            dateEle = driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1']/text()"));
	            nxtArw = driver.findElement(By.cssSelector("svg#Layer_1"));
	            continue;
	        }
	    }
	}*/
	

}
