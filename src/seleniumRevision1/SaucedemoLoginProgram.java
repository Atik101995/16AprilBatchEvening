package seleniumRevision1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoLoginProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		//login
		//username
		//password
		//login button
		
		//username
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		//password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		//login button
		WebElement loginButton = driver.findElement(By.id("login-button"));	
		loginButton.click();
		
		
	}

}
