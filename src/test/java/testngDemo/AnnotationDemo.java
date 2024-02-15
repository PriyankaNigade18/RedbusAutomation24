package testngDemo;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationDemo 
{
	
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is the Register test");
  }
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("This is the Login test");
  }
  
  @Test(priority=3)
  public void logoutTest() 
  {
	  System.out.println("This is the Logout test");
  }
  
  //Annotations
  
  @BeforeMethod
  public void bmethod()
  {
	System.out.println("Before Method will execute before every test case");  
  }
  
  @AfterMethod
  public void amethod()
  {
	System.out.println("After Method will execute after every test case");  
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("Before class executes before first test case");
	  
  }
  
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("After class executes after last test case");
	  
  }
  
  
  @BeforeTest
  public void btest()
  {
	System.out.println("Before test executes before class");
  }
  
  
  @AfterTest
  public void atest()
  {
	System.out.println("After test executes after class");
  }
  
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("Before suite  will executes before test");
  }
  
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("After suite  will executes after test");
  }
  
  
}
