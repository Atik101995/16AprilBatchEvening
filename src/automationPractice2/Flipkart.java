package automationPractice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//username
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='q']"));
		userName.sendKeys("7798083686");
		
		//password
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("atik102401");
		
		//loginButton
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='password']"));
		loginButton.click();
		
		//add to cart
		
		
		
		
	}

}
