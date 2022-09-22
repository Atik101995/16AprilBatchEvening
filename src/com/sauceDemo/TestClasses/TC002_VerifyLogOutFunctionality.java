package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;
import com.sauceDemo.UtilityClasses.ScreenshotClass;

public class TC002_VerifyLogOutFunctionality extends TestBaseClass
{
	
		//logout activity
		
	    @Test
		public void logoutFunctionality()
		{
		
		HomePOMClass hc = new HomePOMClass(driver);
		hc.clickOnSettingButton();
		System.out.println("click on setting button");
		
		hc.clickOnLogoutButton();
		System.out.println("click on logout button");
		
		//loginpage
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
