package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryTEst extends BaseClass
{
  @Test(priority=1)
  public void verifyProductCount() 
  {
	  int count=ip.getProductCount();
	  Assert.assertEquals(count,6 ,"Count is not correct");
	  System.out.println("Count is valid");
	  
	  
  }
  
  @Test(priority=2)
  public void verifyProductDetails() 
  {
	  ip.getProductDetails();
  }
  
  
  @Test(priority=3)
  public void VerifyAddToCart() 
  {
	ip.addProductToCart("Sauce Labs Bike Light");  
  }
}
