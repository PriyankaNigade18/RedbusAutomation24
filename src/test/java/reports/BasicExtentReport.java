package reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicExtentReport {
  @Test
  public void report()
  {
	  ExtentReports extent=new ExtentReports();
	  
	  //path
	  ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//AutomationSpark.html");
	  
	  //config()
	  spark.config().setDocumentTitle("AutomationReport");
	  spark.config().setTheme(Theme.DARK);

	  //attach the report
	  extent.attachReporter(spark);
	  
	  ExtentTest test=extent.createTest("MobileAppTest");
	  
	  test.log(Status.PASS, "Test is pass");
	  test.log(Status.FAIL,"Test is Fail");
	  test.log(Status.INFO, "This is info");
	
	
	  //flush()
	  extent.flush();
	  
	  
	  
	  
	  
	  
	  
  }
}
