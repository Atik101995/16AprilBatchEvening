package automationPractice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.get("https://www.google.com");
		System.out.println("URL is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.navigate().to("https://kite.zerodha.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//username
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='userid']"));
		userName.sendKeys("XWU804");
		System.out.println("UserName is entered");
		
		//password
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("atik102401");
		System.out.println("password is enterd");
		
		//login button
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		System.out.println("click on login button");
		
		//pin
		
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys("102401");
		System.out.println("pin entered");
		
		//continueButton
		
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		continueButton.click();
		System.out.println("Click on continue");
		
		//icon
		
		WebElement icon = driver.findElement(By.xpath("//span[@class='icon icon-bookmark']"));
		icon.click();
		
		
		
	}

}
