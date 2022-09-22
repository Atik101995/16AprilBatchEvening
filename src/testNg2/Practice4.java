package testNg2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice4 
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("login");
	}
	
	@Test
	public void test2()
	{
		System.out.println("logout");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}

}
