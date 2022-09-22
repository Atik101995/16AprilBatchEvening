package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 
{
	@Test
	public void verifyLoginFunctionality()
	{
		String expectedTitle = "Labs";
		String actualTitle = "Swag Labs";
		
		//Assertions
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("TC is passed");
//		}
//		else
//		{
//			System.out.println("TC is failed");
//		}
				
	}

}
