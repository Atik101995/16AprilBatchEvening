package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	//WebDriver declared
	private WebDriver driver;
	private Actions act;
	
//  we are not going to used this	
//	WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
//	userName.sendKeys("standard_user");
	
//	Element inspect username
//	@FindBy --> @ --> annotation --> methodfunction
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement userName;
	
	//lets perform action on WebElement
	
	public void sendUsername()
	{
		userName.sendKeys("standard_user");
	}
	
	//element inspect password
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	//lets action performed
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	//element inspect login
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginButton;
	
	//lets action performed
	
//	public void LoginButton()
//	{
//		loginButton.click();
//	}
	
	//mouse action click method
	public void clickOnLoginButton()  
	{
		act.click(loginButton).perform();
	}
	
	//constructor declared
	
	public LoginPOMClass(WebDriver driver)
	{
		   //global   //local
		this.driver = driver;
		
		//selenium class
		PageFactory.initElements(driver, this);	
		
		act = new Actions(driver);
	}
	
	//POM class
		//1.WebDriver declared globally
		//2.FindBy - element inspect
		//3.method - element action 
		//4.constructor - global and local driver


}
