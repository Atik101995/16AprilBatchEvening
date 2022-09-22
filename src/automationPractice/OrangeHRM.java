package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		//username
		
		WebElement username = driver.findElement(By.xpath("//span[text()='Username']"));
		username.sendKeys("Admin");
		
		//password
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//span[text()='Password']"));
		password.sendKeys("admin123");
		
		//login button
		
		WebElement loginbutton = driver.findElement(By.xpath("//span[text()='Username']"));
		loginbutton.click();
		
		
		
	}

}
