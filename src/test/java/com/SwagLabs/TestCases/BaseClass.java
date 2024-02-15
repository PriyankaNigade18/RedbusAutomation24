package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.SwagLabs.Pages.*;

public class BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	public Inventory ip;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new LoginPage(driver);
		ip=new Inventory(driver);
		
	}
	
	@BeforeClass
	public void pageSetUp()
	{
		lp.doLogin("standard_user","secret_sauce");
	}

}
