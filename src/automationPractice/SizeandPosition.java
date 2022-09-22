package automationPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeandPosition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		//get method
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		//dimension of browser
		Dimension d = new Dimension(300,500);
		driver.manage().window().setSize(d);
		
		//position of browser
		Point p = new Point(600,600);
		driver.manage().window().setPosition(p);
		
	}

}
