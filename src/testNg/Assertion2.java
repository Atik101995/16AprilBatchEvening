package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 
{
	@Test
	public void loginTest()
	{
		String expectedTitle = "Swag Labs";
		
		String actualTitle = "Swag Labs";
		
		//hard assertion
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
