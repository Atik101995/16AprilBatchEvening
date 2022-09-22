package pomPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyLoginFunctionality 
{ 
	WebDriver driver;
	
		@Test
		public void loginFunctionality()
		{
		//validation
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
		
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			System.out.println("browser closed");
		}

		
		
		
	}


