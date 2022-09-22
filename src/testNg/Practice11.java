package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice11 
{
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("LoginTest");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"loginTest"}, priority=1)
	public void productAddToCart()
	{
		System.out.println("Product add to cart");
	}

}
