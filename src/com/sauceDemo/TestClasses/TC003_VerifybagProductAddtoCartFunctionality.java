package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;

public class TC003_VerifybagProductAddtoCartFunctionality extends TestBaseClass
{
	
		//homepage
		
		@Test
		public void addToCartFunctionality()
		{
		
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickOnBagButton();
		
		String actualCount = hp.getTextFromCartButton();
		
		String expectedCount = "1";
		
		//Assertion
		
		Assert.assertEquals(actualCount, expectedCount);
		
//		if(expectedCount.equals(actualCount))
//		{
//			System.out.println("TC is passed");
//		}
//		else
//		{
//			System.out.println("TC is failed");
//		}
		}
		
		
		
	

}
