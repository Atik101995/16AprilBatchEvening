package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com");
		
		Thread.sleep(3000);
		
		//login
		
//		username value pass
//		password value pass
//		login button click
		
		//username element
		WebElement userNameTextBox = driver.findElement(By.id("user-name"));
		
		//x.method();
		userNameTextBox.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		//password element
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		
		passwordTextBox.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		//login button
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
		loginButton.click();
		
		
		
		
	}

}
