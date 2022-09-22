import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//vctc wesite
		
//		String mainPageAdress = driver.getWindowHandle();
//		System.out.println("main page addrss is- "+mainPageAdress);
		
		//child browser popup
		 
		
		WebElement StartSeleniumPractice = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		StartSeleniumPractice.click();
		
		//two webpage adress
//		Set<String> allPageAddress = driver.getWindowHandles();
//		System.out.println(allPageAddress);
		
		//list
	
		
		List<String> allPageAddress = new ArrayList(driver.getWindowHandles());
		System.out.println(allPageAddress);
		
		//next page switch
		
		driver.switchTo().window(allPageAddress.get(1));
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		textBox.sendKeys("INDIA");
		
		
		
		
		
		
		
	}

}
