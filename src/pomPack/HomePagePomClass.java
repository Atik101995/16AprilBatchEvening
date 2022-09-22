package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePomClass 
{
	//POM class
		//1.WebDriver declared globally
		//2.FindBy - element inspect
		//3.method - element action 
		//4.constructor - global and local driver

	WebDriver driver;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	WebElement bagProduct;
	
	public void clickOnBagProduct()
	{
		bagProduct.click();
	}
	
	//find other element
	
	//constructor
	
	public HomePagePomClass(WebDriver driver)
	{
		this.driver = driver;
	
	
	//selenium class
	PageFactory.initElements(driver, this);
	}

 }
