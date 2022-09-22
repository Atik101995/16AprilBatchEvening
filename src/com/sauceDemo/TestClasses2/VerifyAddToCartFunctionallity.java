package com.sauceDemo.TestClasses2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses2.HomePagePomClass;
import com.sauceDemo.POMClasses2.LoginPomPage;

public class VerifyAddToCartFunctionallity extends TestBaseClass
{
	@Test
	public void validation()
	{
		
		//homepage
		HomePagePomClass hp = new HomePagePomClass(driver);
		hp.clickOnBagButton();
		
		String actualCount = hp.getTextFromAddTOCart();
		String expectedCount = "1";
		
	}

}
