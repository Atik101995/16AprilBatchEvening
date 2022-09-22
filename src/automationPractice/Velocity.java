package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Velocity 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("URL is opened");
		
		Thread.sleep(3000);
		
		//hidebutton
		
		WebElement hidebutton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hidebutton.click();
		
		Thread.sleep(3000);
		//showbutton
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		
		Boolean result = textbox.isDisplayed();
		System.out.println("after clicking hide button- "+result);
		
		textbox.click();
		
		Thread.sleep(3000);
		
		WebElement showbutton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		showbutton.click();
		
		Thread.sleep(3000);
		
		Boolean result1 = textbox.isDisplayed();
		System.out.println("after clicking show button- "+result);
		
		if(result1 == true)
		{
			textbox.sendKeys("INDIA");
		}
		else
		{
			showbutton.click();
			textbox.sendKeys("INDIA");
		}
	}
 
}
