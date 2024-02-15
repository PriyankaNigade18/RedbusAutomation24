package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	private WebDriver driver;
	
	//
	public LoginPage(WebDriver driver)//From BAse class
	{
		this.driver=driver;
	}
	//By locators
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By btn=By.id("login-button");
	
	//public method
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(btn).click();
		
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	

}
