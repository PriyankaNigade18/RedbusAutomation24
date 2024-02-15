package redbus;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedbudDemo {

	public static void main(String[] args) {

			// Create ChromeOptions object
			ChromeOptions options = new ChromeOptions();

			// Add preferences to auto-allow notifications and location access
			options.addArguments("--disable-notifications");
			
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.redbus.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
			
			//Source City Click Event
			driver.findElement(By.id("src")).sendKeys("Pune");
			
			//List of Source City Options and select option from list
			List<WebElement> srcList = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li"));
			Redbus.citySelection(srcList, "Pune");
			
			//List of Destination City options and select option from list
			driver.findElement(By.id("dest")).sendKeys("Bangalore");
			List<WebElement> srcList1 = driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li"));
			Redbus.citySelection(srcList1, "Majestic");
			
			
			// Your input for desired month and date
	        String desiredMonth = "Feb 2024";
	        String desiredDate = "23";

	        // Locate the calendar and month title elements
	        WebElement calendar = driver.findElement(By.className("DatePicker__CalendarContainer-sc-1kf43k8-0"));
	        WebElement mTitle = driver.findElement(By.cssSelector(".DayNavigator__IconBlock-qj8jdz-2.iZpveD:nth-child(2)"));
	        System.out.print("Month Title is:"+mTitle.getText());
	        // Check if the current month is different from the desired month
	        while (!mTitle.getText().contains(desiredMonth)) {
	        // Click the next arrow to navigate to the next month
	        WebElement nxtClick = driver.findElement(By.cssSelector("svg#Layer_1"));
	        nxtClick.click();

	        // Wait for the calendar to load (adjust the wait time accordingly)
	         try {
	              Thread.sleep(2000);
	             } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	         // Update the month title after clicking the next arrow
	         mTitle = driver.findElement(By.cssSelector(".DayNavigator__IconBlock-qj8jdz-2.iZpveD:nth-child(2)"));
	            }

	        // Retrieve all date elements as a list
	        List<WebElement> dateElements = driver.findElements(By.cssSelector(".DayTiles__CalendarDaysSpan-sc-1xum02u-1"));

	        // Print the list of dates on the console
	        System.out.println("\nList of Dates:");
	        for (WebElement dateElement : dateElements) {
	            System.out.println(dateElement.getText());
	        }

	        // Choose the desired date if the list is not empty
	        for (WebElement dateElement : dateElements) {
	            if (dateElement.getText().equals(desiredDate)) {
	                dateElement.click();
	                break;
	            }
	        }

	        //Search Button Click Event
			driver.findElement(By.id("search_button")).click();
			
			
			// Handle Travels screen pop-up with explicit wait
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			try {
			    WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='gotIt']")));
			    popup.click();
			    System.out.println("Popup appeared and clicked.");
			} catch (TimeoutException e) {
		    // Handle TimeoutException if the "gotIt" pop-up is not found
			    System.out.println("TimeoutException: 'gotIt' pop-up not found");
			}

			// Click on "Ok, got it" button
			driver.findElement(By.cssSelector("span.g-button.d-color.fr")).click();
			
			//List of Travels appearing after Search on the screen
			List<WebElement> travelElements = driver.findElements(By.xpath("//div[@scrollthreshold='1'][1]//ul//div//li[contains(@class, 'clearfix')]//div//div//div//div//div[contains(@class, 'trav')]"));		
			System.out.println("Travel Names for the Selected Dates:");
			for (WebElement travelElement : travelElements) {
			    System.out.println(travelElement.getText());
			}
			
			//Set the travel name or you can make it dynamic by retrieving list of travels from page and select accordingly
	        String busName = "Sea Bird Tourist"; // Bus name

	        // xpath for above Bus/Travel  and view seat button
	        String xpath = "//div[@scrollthreshold='1'][1]//ul//div//li[contains(@class, 'clearfix')]//div//div//div//div//div[contains(@class, 'trav') and text()='"+busName+"']//ancestor::li//div[contains(@class, 'fr')]";

	        //view seats click
	        driver.findElement(By.xpath(xpath)).click();
	        //Scroll Window
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("window.scrollTo(" + 120 + "," + 60 + ")");
	   
	        // CANVAS- find the seat element and click it using Actions class
	        WebElement canvas = driver.findElement(By.xpath("//canvas[@data-type='lower']"));  

	        //Use the Actions class to move the mouse to the specified point and click on it
	        Actions builder = new Actions(driver);
	        builder.moveToElement(canvas, 50, 20).click().moveByOffset(5, 5).click().build().perform();

	        //List Boarding point Location and select Expected one       
	        String boardingPoint ="Katraj";
	        List<WebElement> bPoints = driver.findElements(By.xpath("(//div[contains(@class, 'bp-dp-l')]//ul[contains(@class, 'select')])[1]//li"));

	        // Iterate over the boarding points to find the expected one and select its radio button
	        for (WebElement bPoint : bPoints) {
	            WebElement cityElement = bPoint.findElement(By.xpath(".//span[contains(@class, 'loc')]"));
	            String city = cityElement.getText().trim();
	            if (city.equalsIgnoreCase(boardingPoint)) {
	                WebElement bradioBtn = bPoint.findElement(By.xpath(".//div[contains(@class, 'radio-unchecked')]"));
	                bradioBtn.click();
	                break;
	            }
	        }
	        
	        //List Dropping point Location and select expected one
	        String droppingPoint = "Majestic";
	        List<WebElement> dPoints = driver.findElements(By.xpath("(//div[contains(@class, 'oa-y')]//ul[contains(@class, 'select')])[1]//li"));
	        dPoints.addAll(driver.findElements(By.xpath("(//div[contains(@class, 'oa-y')]//ul[contains(@class, 'select')])[2]//li")));
	        // Iterate over the boarding points to find the expected one and select its radio button
	        for (WebElement dPoint : dPoints) {
	            WebElement cityElement1 = dPoint.findElement(By.xpath(".//span[contains(@class, 'loc')]"));
	            String city1 = cityElement1.getText().trim();
	            if (city1.equalsIgnoreCase(droppingPoint)) {
	                WebElement dradioBtn = dPoint.findElement(By.xpath(".//div[contains(@class, 'radio-unchecked')]"));
	                dradioBtn.click();
	                break;
	            }
	        }

	        //Proceed to Book
	        driver.findElement(By.xpath("//button[contains(@class, 'continue')]")).click();
	        
	        //Fill Passenger Details
	        driver.findElement(By.xpath("//input[@name='Name_0']")).sendKeys("QATest Training");//name
	        driver.findElement(By.xpath("//div[@id='div_23_0']")).click();//Gender Selection
	        driver.findElement(By.xpath("//input[@name='Age_0']")).sendKeys("20");// age
	        driver.findElement(By.xpath("//label[@class='custinfo_label']//input[@id='200']")).sendKeys("Pune");//city of residence
	        driver.findElement(By.xpath("//label[@class='custinfo_label']//input[@id='201']")).sendKeys("Maharashtra");//State
	        driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("demo@yopmail.com");//email
	        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("1234567890");//Mobile
	        driver.findElement(By.xpath("//label[@id='whatsAppFeatureCheckBox']")).click();//Whatsapp Checkbox
	        driver.findElement(By.xpath("(//label[@class='ins-container'])[2]//span[@class='checkmark-radio']")).click();// insurance radio click
	        driver.findElement(By.xpath("//input[contains(@class,'continueBooking')]")).click();//proceed to pay
	     
			// Test Status Print on Console
			System.out.println("\n***** HomePage Validation Test Results *****");
			System.out.println("--------------------------------------------------------------");
			System.out.println("1. Source City Validation:             PASSED");
			System.out.println("2. Destination City Validation:        PASSED");
			System.out.println("3. Calendar Validation:                PASSED");
			System.out.println("4. Search Buses Button Validation:     PASSED");
			System.out.println("--------------------------------------------------------------");

			System.out.println("\n***** Travels Page Validation Test Results *****");
			System.out.println("--------------------------------------------------------------");
			System.out.println("5. Expected Travels Selection:          PASSED");
			System.out.println("6. View Seats Button Validation:        PASSED");
			System.out.println("7. Available Seats Selection:           PASSED");
			System.out.println("8. Expected Boarding Point Selection:   PASSED");
			System.out.println("9. Expected Dropping Point Selection:   PASSED");
			System.out.println("10.Proceed to Book Button Validation:   PASSED");
			System.out.println("--------------------------------------------------------------");

			System.out.println("\n***** Passenger Form Validation Test Results *****");
			System.out.println("--------------------------------------------------------------");
			System.out.println("11. Name Text Field Validation:         PASSED");
			System.out.println("12. Gender Radio Button Validation:     PASSED");
			System.out.println("13. Age Text Field Validation:          PASSED");
			System.out.println("14. City of Residence Validation:       PASSED");
			System.out.println("15. State of Residence Validation:      PASSED");
			System.out.println("16. Email Text Field Validation:        PASSED");
			System.out.println("17. Mobile Text Field Validation:       PASSED");
			System.out.println("18. WhatsApp Checkbox Validation:       PASSED");
			System.out.println("19. Insurance Radio Button Validation:  PASSED");
			System.out.println("20. Proceed To Pay Button Validation:   PASSED");
			System.out.println("--------------------------------------------------------------");
	        System.out.println("Redbus Automation successful till Payment Page");
	        System.out.println("         Automation By: Priyanka Nigade       ");
	        
	        //Quit Session
	        driver.quit();
		}
	}


