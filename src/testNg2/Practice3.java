package testNg2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice3 
{
	@BeforeMethod
	public void setUp()
	{
		System.out.println("browserOpen, URLOpen, LoginActivity");
	}
	
	@Test
	public void verifyLoginFunctionality()
	{
		System.out.println("TC P/F");
	}
	
	@AfterMethod
	public void postActivity()
	{
		System.out.println("LogoutActivity, browserClosed");
	}

}
