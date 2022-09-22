package seleniumRevision1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		driver.quit();
		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().forward();
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().refresh();
//		
	}

}
