package automationPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//single click
		
//		WebElement ClickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
//		 //mouse action
//		
//		Actions act = new Actions(driver);
//		act.click(ClickMeButton).perform();
//		
//		WebElement textmessage = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
//		String expectedResult = "You have done a dynamic click";
//		
//		String actualResult = textmessage.getText();
//		if(expectedResult.equals(actualResult))
//		{
//			System.out.println("test case passed");
//		}
//		else
//		{
//			System.out.println("test case failed");
//		}
		
		
		//right click
		
//		WebElement RightClickMeButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		
//		Actions act = new Actions(driver);
//		
//		act.contextClick(RightClickMeButton).perform();
//		
//		WebElement textmessage = driver.findElement(By.xpath("//p[text()='You have done a right click']"));
//		String expectedResult = "You have done a right click";
//		String actualResult = textmessage.getText();
//		if(expectedResult.equals(actualResult))
//		{
//			System.out.println("test case is passed");
//		}
//		else
//		{
//			System.out.println("test case is failed");
//		}
//		
		
		//double click
		
		WebElement DoubleClickMeButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		Actions act = new Actions(driver);
		act.doubleClick(DoubleClickMeButton).perform();
	}

}
