package com.sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
	private WebDriver driver;
	Select s;
	
	//setting button
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingButton;
	
	public void clickOnSettingButton()
	{
		settingButton.click();
	}
	
	//logout button
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	public void clickOnLogoutButton()
	{
		logoutButton.click();
	}
	
	//bag element
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	WebElement bagButton;
	
	public void clickOnBagButton()
	{
		bagButton.click(); 
	}
	
	//add to cart button
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement addToCartButton;
	
	public String getTextFromCartButton()
	{
		String totalProduct = addToCartButton.getText();
		return totalProduct;
	}
	
	//multiple product element
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> multipleAddToCartButton;
	
	public void clickAllProduct()
	{
		for(int i = 0; i<multipleAddToCartButton.size();i++)
		{
			multipleAddToCartButton.get(i).click();
		}
			
	}
	
	//filter dropdown
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropDownFilter;
	
	public void clickOnDropDownFilter()
	{
		dropDownFilter.click();
		s.selectByVisibleText("Price(low to high)");
	}
	
	//constructor
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		Select s = new Select(dropDownFilter);
		
		
	}

}
