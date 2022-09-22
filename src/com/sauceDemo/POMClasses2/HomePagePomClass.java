package com.sauceDemo.POMClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePomClass 
{
	private WebDriver driver;
	
	//setting button
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement settingButton;
	
	//create method
	public void clickOnSettingButton()
	{
		settingButton.click();
	}
	
	//logout button
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutButton;
	
	public void clickOnLogoutButton()
	{
		logoutButton.click();
	}
	
	//bag element
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement bagButton;
	
	public void clickOnBagButton()
	{
		bagButton.click();
	}
	
	
	//add to cart button
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement addToCartButton;
	
	public String getTextFromAddTOCart()
	{
		String totalProduct = addToCartButton.getText();
		return totalProduct;
	}
	
	 	
	//constructor
	
	public HomePagePomClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//add to cart
//	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
//	WebElement bagProduct;
	
//	public void bagButton()
//	{
//		bagProduct.click();
//	}
	
	//constructor
	
//	public HomePagePomClass(WebDriver driver)
//	{
//		this.driver = driver;
		
		//selenium class
//		PageFactory.initElements(driver, this);
//	}

}
