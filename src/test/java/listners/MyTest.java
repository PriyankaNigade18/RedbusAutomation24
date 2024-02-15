package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTest implements ITestListener
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Pass: "+result.getName());
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Fail: "+result.getName());
	}
	
}
