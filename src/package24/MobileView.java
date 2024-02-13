package package24;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MobileView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Galaxy S5");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation",mobileEmulation);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://redbus.in");
		
		//driver.quit();
	}

}
