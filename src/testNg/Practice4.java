package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice4 
{
	@BeforeMethod
	public void setup()
	{
		System.out.println("browser open, Url open, login activity");
	}
	
	@Test
	public void loginFunctionlity()
	{
		System.out.println("login functionality - TC P/F");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("logout activity, browser close");
	}

}
