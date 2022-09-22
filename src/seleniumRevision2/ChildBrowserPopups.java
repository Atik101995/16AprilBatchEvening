package seleniumRevision2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups 
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
		
		driver.navigate().to("https://vctcpune.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//child browser pop-ups
		
		WebElement startSeleniumPractice =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		startSeleniumPractice.click();
		
		//adress of webpage
		
//		Set<String> allPageAddress = driver.getWindowHandles();
//		System.out.println(allPageAddress);
//		
		
		//list concept
		//index follows
		
		List<String> allPageAddress= new ArrayList(driver.getWindowHandles());
		System.out.println(allPageAddress);
		
		//next page
		
		driver.switchTo().window(allPageAddress.get(1));
		
		//new browser will open
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		textBox.sendKeys("INDIA");
		
	}

}
