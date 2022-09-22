package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.SauceDemo.com");
		
		//username
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		//password
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		//login
		
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
//		login.click();
		
		//mouse click action
		
		Actions act = new Actions(driver);
		act.click(login).perform();

		
		
		
		
	
		
	}

}
