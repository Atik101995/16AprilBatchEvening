package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice5 
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1 login");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 logout");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	 

}
