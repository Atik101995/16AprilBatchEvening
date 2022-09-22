package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodChaining 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(3000);
		
//		driver.manage().window().maximize();
		
		Options o = driver.manage();
		
		Window w = o.window();
		
		w.maximize();
		
		
		
		driver.close();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String webTitle = driver.getTitle();
		System.out.println(webTitle);
		
	}

}
