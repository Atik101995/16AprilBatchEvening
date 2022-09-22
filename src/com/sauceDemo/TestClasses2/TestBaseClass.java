package com.sauceDemo.TestClasses2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sauceDemo.POMClasses2.LoginPomPage;

public class TestBaseClass 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		System.out.println("browser opened");
		
		driver.manage().window().maximize();
		System.out.println("broswer maximize");
		
		driver.get("https://www.SauceDemo.com");
		System.out.println("URL opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPomPage lp = new LoginPomPage(driver);
		lp.sendUsername();
		lp.sendPassword();
		lp.loginButton();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	

}
