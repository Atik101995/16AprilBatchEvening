package automationPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpProgram 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//alert button inspect
		
		WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton.click();
		
		Alert alt = driver.switchTo().alert();
		String textMessage = alt.getText();
		System.out.println(textMessage);
		alt.accept();
	
		
		WebElement alertButton2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alertButton2.click();
		
	}

}
