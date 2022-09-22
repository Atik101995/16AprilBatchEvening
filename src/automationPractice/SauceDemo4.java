package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.SauceDemo.com");
		
		Thread.sleep(3000);
		
		//absolute xpath
		
		//username
		
//		WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
//		username.sendKeys("standard_user");
//		
//		Thread.sleep(3000);
//		
//		//password
//		
//		WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
//		password.sendKeys("secret_sauce");
//		
//		Thread.sleep(3000);
//		
//	
//		//login
//		
//		WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
//		login.click();
		
		
        //relative xpath
		//username
		
//		WebDriver username = driver.findElement(By.xpath(""));
		
	}

}
