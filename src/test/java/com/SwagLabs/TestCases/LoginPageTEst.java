package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTEst extends BaseClass
{
	 @Test(priority=1)
	  public void verifyTitle()
	 {
		 String actTitle=lp.getAppTitle();
		 Assert.assertTrue(actTitle.contains("Labs"),"Title Fail");
		 System.out.println("Title Matched!");
	  }
	
  @Test(priority=2)
  public void validateLogin()
  {
	  lp.doLogin("standard_user","secret_sauce");
	  Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Login Fail");
	  System.out.println("Login pass!");
  }
}
