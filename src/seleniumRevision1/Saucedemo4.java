package seleniumRevision1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
		//absolute xpath
		//username
		
//		WebElement userName = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
//		userName.sendKeys("standard_user");
//		
//		//password
//		
//		WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
//		password.sendKeys("secret_sauce");
//		
//		//loginbutton
//		
//		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
//		loginButton.click();
		
		//relative x path
		//username
		
		WebElement userName = driver.findElement(By.xpath("//form//div[1]//input"));
		userName.sendKeys("standard_user");
		
		//password
		
		WebElement password = driver.findElement(By.xpath("//form//div[2]//input"));
		password.sendKeys("secret_sauce");
		
		//loginbutton
		
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
		loginButton.click();
		
		
	}

}
