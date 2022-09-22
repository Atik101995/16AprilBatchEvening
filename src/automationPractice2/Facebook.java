package automationPractice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		//username
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.clear();
		username.sendKeys("atikpatel1095@gmail.com");
		
		Thread.sleep(3000);
		
		//password
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.clear();
		password.sendKeys("Atik240110");
		
		Thread.sleep(3000);
		
		//login
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		
		//forgot password
		
//		WebElement forgotpassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		forgotpassword.click();

		//create account
		
//		WebElement createaccount = driver.findElement(By.xpath("//button[@name='login']"));
//		createaccount.click(); 		
	}
}
