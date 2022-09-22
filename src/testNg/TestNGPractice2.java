package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice2 
{
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	
	@Test
	public void method1()
	{
		System.out.println("method1");
	}
	

}
