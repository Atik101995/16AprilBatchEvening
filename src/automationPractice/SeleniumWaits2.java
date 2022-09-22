package automationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits2 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://www.saucedemo.com");
		System.out.println("URL is opened");
		
		//explicit wait
		//only single element is giving the issue
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name= 'user-name']\""))));
	}

}
