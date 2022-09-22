package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.sauceDemo.POMClasses.LoginPOMClass;

public class TestBaseClass 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setupMethod(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
		}
		else if(browserName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\admin\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("throw the error");
		}
		
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
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("browser closed");
	}

	
}
