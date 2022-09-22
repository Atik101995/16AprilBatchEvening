package seleniumRevision2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		Thread.sleep(3000);
		
		//dropdown element 
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropdown.click();
		
		//selenium select class
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(1);
		
		//or
		
//		s.selectByValue(option2);
		
		//or
		
//		s.selectByVisibleText(null);
		
		
		
	}

}
