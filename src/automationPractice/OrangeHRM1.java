package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM1 
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
		
		//xpath by attribute
		
//		WebElement Username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//		Username.sendKeys("Admin");
//		
//		Thread.sleep(3000);
//		
//		//password
//		
//		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//		password.sendKeys("admin123");
//		
//		Thread.sleep(3000);
//		
//		//login
//		
//		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//		loginbutton.click();
//------------------------------------------------------------------------------
		
		
		//xpath by contains
		
		//username
		
//		WebElement username = driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]"));
//		username.sendKeys("Admin");
//		
//		Thread.sleep(3000);
//		
//		//password
//		
//		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'txtPassword')]"));
//		password.sendKeys("admin123");
//		
//		Thread.sleep(3000);
//		
//		//login
//		WebElement login = driver.findElement(By.xpath("//input[contains(@id,'btnLogin')]"));
//		login.click();
//--------------------------------------------------------------------------
		
		//forgot password by contain by text
		
		WebElement Forgotpassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
		Forgotpassword.click();
		
	}

}
