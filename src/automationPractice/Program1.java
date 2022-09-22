package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		//get method
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		//navigate().to()
		driver.navigate().to("https://www.facebook.com.");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//websiteURL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//website title
		String WebTitle = driver.getTitle();
		System.out.println(WebTitle);
		
//		driver.manage().window().minimize();
		
		Thread.sleep(3000);
		
//		driver.close();
		
		//quit
//		driver.quit();
		
		

		
		
	}

}
