package automationPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//multiple element
		
		List<WebElement> columnsHeaders = driver.findElements(By.xpath("//table//tbody//tr//th"));
		
		//headers column
		System.out.println("colums size- "+columnsHeaders.size() );
		
		for(int i = 0;i<columnsHeaders.size();i++)
		{
			String result = columnsHeaders.get(i).getText();
			System.out.println(result);
			
			//row
			
			List<WebElement> allCellData =driver.findElements(By.xpath("//table/tbody//tr//td"));
			System.out.println("totalcells- "+ allCellData.size());
			for(int p=1; p<allCellData.size();p++)
			{
				System.out.println(allCellData.get(p).getTagName());
			}
			
			
			
			
		}
		
		
		
	}

}
