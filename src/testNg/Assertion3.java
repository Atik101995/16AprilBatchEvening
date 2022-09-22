package testNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion3 
{
		@Test
		public void loginTest()
		{
			String expectedTitle = "Labs";
			
			String actualTitle = "Swag Labs";
			
			//soft assertion
			
			SoftAssert soft = new SoftAssert();
			
//			soft.assertEquals(actualTitle, expectedTitle);
			
			//or
			
			soft.assertEquals(actualTitle, expectedTitle, "Title are not matching");
			
			soft.assertAll();
			
		}
		
	
}
