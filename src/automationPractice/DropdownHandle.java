package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is opened");
		
		Thread.sleep(3000);
		
		//dropdown
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropdown.click();
		
		//selenium select class
		//1st method
		
		Select s = new Select(dropdown);
		
//		s.selectByIndex(1);
		
		//2nd method
		
//		s.selectByValue("option2");
		
		//3rd method
		//pass the html text
		
		s.selectByVisibleText("Option3");
	}

}
