package testNg2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 
{
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermethod");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforemethod");
	}
	
	@Test
	public void method1()
	{
		System.out.println("method1");
	}

}
