package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_VerifyLoginFunctionality extends TestBaseClass
{
	
	@Test
	public void loginFunctionality()
	{
	//validation
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	
	//Assertion
	
	Assert.assertEquals(actualTitle, expectedTitle);
	
	
	
	
	
//	if(expectedTitle.equals(actualTitle))
//	{
//		System.out.println("TC is passed");
//	}
//	else
//	{
//		System.out.println("TC is failed");
//	}
//	
	}

}
