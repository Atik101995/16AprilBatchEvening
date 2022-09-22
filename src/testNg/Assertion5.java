package testNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion5 
{
	@Test
	public void loginTest()
	{
		//title
		String expectedTitle = " Labs";
		String actualTitle = "Swag Labs";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		
		//URL
		String expectedURL = "https://www.saucedemo.com";
		String actualURL = "https://www.saucedemo.com";
		soft.assertEquals(actualURL, expectedURL);
		
		soft.assertAll();
	}
	
		@Test
		public void logOutTest()
		{
			
		}
		
			
	
	
		
	
	

	
}
