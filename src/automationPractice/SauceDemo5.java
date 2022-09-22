package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://www.saucedemo.com");
		System.out.println("URL is opened");
		
		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//form//div[1]//input"));
		userName.clear();
		userName.sendKeys("standard_user");
		System.out.println("userName is enterd");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//form//div[2]//input"));
		password.clear();
		password.sendKeys("secret_sauce");
		System.out.println("password is enterd");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
		login.clear();
		login.click();
		System.out.println("clicked on login button");
		Thread.sleep(3000);
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		driver.close();
		System.out.println("Browser is closed");
	}

}
