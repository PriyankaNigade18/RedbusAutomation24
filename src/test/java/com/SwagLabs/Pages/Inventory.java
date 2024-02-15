package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inventory
{
	private WebDriver driver;
	
	public Inventory(WebDriver driver)
	{
		this.driver=driver;
	}

	
	//locators
	private By plist=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name ']");
	private By abtn=By.xpath("//button[text()='Add to cart']");
	
	//methods
	public int getProductCount()
	{
	return driver.findElements(plist).size();
	}
	
	public void getProductDetails()
	{
		List<WebElement> list=driver.findElements(plist);
		
		System.out.println("Products details are:");
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
	}
	
	public void addProductToCart(String pname)
	{
		List<WebElement> list=driver.findElements(plist);
		
		
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		//add product
		driver.findElement(abtn).click();
		System.out.println("Product will ad to the cart");
	}
	
	
	
	
	
}
