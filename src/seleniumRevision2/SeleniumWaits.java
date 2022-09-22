package seleniumRevision2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		//selenium waits
		//implicit waits\
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement userName = driver.findElement(By.xpath("//form//div[1]//input"));
		userName.sendKeys("standard_user");
		
		//explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		
		
		
	}

}
