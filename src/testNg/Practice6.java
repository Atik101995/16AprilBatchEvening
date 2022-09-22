package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice6 
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	public void test3()
	{
		System.out.println("test3");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	
}
