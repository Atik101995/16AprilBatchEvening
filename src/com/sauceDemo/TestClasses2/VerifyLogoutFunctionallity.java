package com.sauceDemo.TestClasses2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses2.HomePagePomClass;
import com.sauceDemo.POMClasses2.LoginPomPage;
import com.sauceDemo.UtilityClasses.ScreenshotClass;

public class VerifyLogoutFunctionallity extends TestBaseClass
{
	    
	    @Test
		public void validationMethod()
		{
		//login page
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
