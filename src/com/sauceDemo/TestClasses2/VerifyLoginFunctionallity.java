package com.sauceDemo.TestClasses2;

import org.testng.annotations.Test;

public class VerifyLoginFunctionallity extends TestBaseClass
{

    @Test
	public void validationMethod()
	{
	//validation
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	
	if(expectedTitle.equals(actualTitle))
	{
		System.out.println("TC is passed");
	}
	else
	{
		System.out.println("TC is failed");
	}
	}
    


}
