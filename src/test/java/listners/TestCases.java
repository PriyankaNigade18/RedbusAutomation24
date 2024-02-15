package listners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases
{
  @Test
  
  public void testCase1() 
  {
	  System.out.println("This is test case1");
	  Assert.assertEquals(false, true,"Fail");
	  System.out.println("Test pass!");
  }
  
  
  @Test
  
  public void testCase2() 
  {
	  System.out.println("This is test case2");
	
	  
  }
}
