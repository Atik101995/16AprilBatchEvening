package seleniumRevision1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicProgram2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\admin\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		
		if(actualURL.equals(expectedURL))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println("test case is failed");
		}
		
		
		
	}

}
