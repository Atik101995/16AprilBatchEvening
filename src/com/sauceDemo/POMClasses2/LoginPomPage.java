package com.sauceDemo.POMClasses2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage 
{
	//webelement maintan
	//webelement action
	//cant run this
	
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userName;
	
	//lets perform action
	public void sendUsername()
	{
		userName.sendKeys("standard_user");
	}
	
	//password
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	//login button
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginButton;
	
	public void loginButton()
	{
//		loginButton.click();
		//mouse action
		act.click(loginButton).perform();
	}
	
	//constructor
	public LoginPomPage(WebDriver driver)
	{
		this.driver = driver;
	
	//selenium class
	PageFactory.initElements(driver, this);
	
	Actions act = new Actions(driver);
	}
	
	
	
	

}
