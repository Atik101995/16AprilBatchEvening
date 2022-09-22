package testNg;

import org.testng.annotations.Test;

public class Practice9 
{
	@Test(invocationCount=5)
	public void testA()
	{
		System.out.println("Test A");
	}
	
	@Test(priority=-1, invocationCount=2)
	public void testB()
	{
		System.out.println("Test B");
	}
	
	@Test
	public void testC()
	{
		System.out.println("Test C");
	}
	
	@Test(invocationCount=0)
	public void testD()
	{
		System.out.println("Test D");
	}
	
	@Test
	public void testE()
	{
		System.out.println("Test E");
	}


}
