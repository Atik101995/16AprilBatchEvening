package testNg;

import org.testng.annotations.Test;

public class Practice10 
{
	@Test
	public void testA()
	{
		System.out.println("Test A");
	}
	
	@Test(enabled=false)
	public void testB()
	{
		System.out.println("Test B");
	}
	
	@Test
	public void testC()
	{
		System.out.println("Test C");
	}
	
	@Test
	public void testD()
	{
		System.out.println("Test D");
	}
	
	
	


}
