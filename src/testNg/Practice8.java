package testNg;

import org.testng.annotations.Test;

public class Practice8 
{
	@Test
	public void testA()
	{
		System.out.println("Test A");
	}
	
	@Test(priority=3)
	public void testB()
	{
		System.out.println("Test B");
	}
	
	@Test(priority=3)
	public void testC()
	{
		System.out.println("Test C");
	}
	
	@Test(priority=-2)
	public void testD()
	{
		System.out.println("Test D");
	}
	
	@Test(priority=1)
	public void testE()
	{
		System.out.println("Test E");
	}

}
