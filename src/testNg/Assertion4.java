package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion4 
{
	@Test
	public void loginTest()
	{
		String expectedTitle = " Labs";
		
		String actualTitle = "Swag Labs";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
        String expectedURL = "https://www.saucedemo.com";
		
		String actualURL = "https://www.saucedemo.com";
		
		Assert.assertEquals(actualURL, expectedURL);
		 
	}	
		public void logoutTest()
		{
			Assert.assertTrue(true);
		}
		
	

}
