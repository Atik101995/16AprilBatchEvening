package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlOpenProgram 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//URL
//		String actualURL = driver.getCurrentUrl();
//		String expectedURL = "https://www.facebook.com/";
//		
//		if(actualURL.equals(expectedURL))
//		{
//			System.out.println("test case is passed");
//		}
//		else
//		{
//			System.out.println("test case is failed");
//		}
		
		//Title
		
		String actualTitle = driver.getTitle();
		String givenTilte = "log in or sign up";
		
		if(actualTitle.equals(givenTilte))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		
		 
	}

}
