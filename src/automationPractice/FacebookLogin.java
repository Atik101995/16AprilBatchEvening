package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		//username text box
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("userName");
		
		Thread.sleep(3000);
		
		//password
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("password");
		
		Thread.sleep(3000);
		
		//login
		
		WebElement LoginButton = driver.findElement(By.id("u_0_5_Ld"));
		LoginButton.click();
				
		
		
		
		
	}

}
