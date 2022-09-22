 package automationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframConcept
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//iframe
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		//main frame page switch
		driver.switchTo().frame(frame2);
		
		//dropdown
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
		dropdown.click();
		Select s = new Select(dropdown);
		s.selectByVisibleText("Baby Cat");
		
	}

}
