package seleniumRevision1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		//username
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("atikpatel1095@gmail.com");
		
		Thread.sleep(3000);
		
		//password
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Atik2401");
		
		Thread.sleep(3000);
		
		//login button
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
	}

}
