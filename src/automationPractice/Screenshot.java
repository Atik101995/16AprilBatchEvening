package automationPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String[]args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.get("https://www.google.com");
		System.out.println("URL is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.navigate().to("https://www.saucedemo.com");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\velocity\\Screenshot\\soucedemoUrl.jpg");
		FileHandler.copy(SourceFile, destFile);
		
		//username
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.clear();
		username.sendKeys("standard_user");
		
		//password
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("secret_sauce");
		
		//login
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		//screenshot of home page
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("D:\\velocity\\Screenshot\\soucedemohomepage.jpg");
		FileHandler.copy(sourceFile, destFile1);
		System.out.println("home page screenshot taken");
		
		
	}

}
