package seleniumRevision1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://orangehrm.qedgetech.com/");
		
		Thread.sleep(3000);
		
		//username
		//xpath by contains
		
		WebElement userName = driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]"));
		userName.sendKeys("Admin");
		
		Thread.sleep(3000);
		
		//password
		WebElement password = driver.findElement(By.xpath("//input[contains(@id, 'txtPassword')]"));
	    password.sendKeys("admin123");
	    
	    Thread.sleep(3000);
	    
	    //loginButton
	    
	    WebElement loginButton = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	    loginButton.click();
	    
	    Thread.sleep(3000);
	    
	    driver.close();
	    
	    System.out.println("end of program");
		
		
	}

}
