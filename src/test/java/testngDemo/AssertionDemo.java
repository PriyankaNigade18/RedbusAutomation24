package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test(priority=1)
  public void hardAssertTest() 
  {
	  String act="Selenium WebDriver is Webui automation library";
	  String exp="Selenium WebDriver is Webui automation tool";
	  
	 // Assert.assertEquals(act, exp,"Test Fail: Strings are not equal");
	  Assert.assertTrue(act.contains("testng"),"Test Fail: Strings are not equal");
	  System.out.println("Test Pass: Strings are  equal");
	  System.out.println("Hard Assertion is completed!");
  }
  
  @Test(priority=2)
  public void softAssertionTest()
  {
	  
	  SoftAssert sf=new SoftAssert();
	  String act="Selenium WebDriver is Webui automation library";
	  String exp="Selenium WebDriver is Webui automation library";
	  
	  sf.assertTrue(act.contains("testng"),"Test Fail");
	  System.out.println("Test Pass");
	  System.out.println("Soft Assert completed!");
	  
	  sf.assertAll();
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
