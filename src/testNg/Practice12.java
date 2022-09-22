package testNg;

import org.testng.annotations.Test;

public class Practice12 
{
	@Test
	public void testA()
	{
		System.out.println("Test A");
	}
	
	//assume test B taking almost 10 sec is to execute
	// i am expecting 2 sec
	@Test(timeOut=2000)
	public void testB() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println("Test B");
	}

}
