 package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDropDownFunctionality 
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
		
		
		
	}

}
