package seleniumRevision2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.get("https://www.google.com");
		System.out.println("URL is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
		
		driver.navigate().to("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//alert pop-ups
		
		WebElement alert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alert.click();
		
		//alert button2
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		WebElement alert2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alert2.click();
		
		
		
	}

}
