package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.HomePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;

public class VerifyMultipleProductAddtoCartFunctionality 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.get("https://www.saucedemo.com");
		System.out.println("URL is opend");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//login activity
		
		LoginPOMClass lp = new LoginPOMClass(driver);
		lp.sendUsername();
		System.out.println("enterd the username");
				
		lp.sendPassword();
		System.out.println("enterd the password");
		
		lp.clickOnLoginButton();
		System.out.println("click on login button");
		
		//homepage
		
		HomePOMClass hm = new HomePOMClass(driver);
		hm.clickAllProduct();
		
		String actualCount = hm.getTextFromCartButton();
		String expectedCount = "6";
		
		if(expectedCount.equals(actualCount))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
		
		driver.close();
	}

}
