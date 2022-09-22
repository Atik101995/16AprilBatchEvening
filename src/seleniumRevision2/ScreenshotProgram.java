package seleniumRevision2;

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

public class ScreenshotProgram 
{
	static WebDriver driver;
	
	public static void screenshotMethod() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\velocity\\Screenshot\\Saucedemo.jpg");
		FileHandler.copy(sourceFile, destFile);
		System.out.println("login page screenshot taken ");
		
	}
	public static void main(String[]args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.get("https://www.google.com");
		System.out.println("URL is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
		
		driver.navigate().to("https://www.saucedemo.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//screenshot
		screenshotMethod();
		
		
		//username
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.clear();
		username.sendKeys("standard_user");
		System.out.println("username entered");
		
		//password
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("secret_sauce");
		System.out.println("password entered");
		
		//loginbutton
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		System.out.println("clicked  on login button");
		
		//screenshot of home page
		screenshotMethod();		
		
	}

}
