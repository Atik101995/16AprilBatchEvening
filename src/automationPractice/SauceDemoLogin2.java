package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLogin2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.SauceDemo.com");
		
		Thread.sleep(3000);
		
		//username, password, login button
		
		// Xpath by attribute
		
		//username
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		
		userName.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		//password
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		password.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		//login button
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		loginButton.click();
		
		//constructor
		
		
		
	}

}
