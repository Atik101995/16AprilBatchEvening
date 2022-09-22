package listener;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.Listener.class)
public class SampleTestClass 
{
	@Test
	public void testA()
	{
		System.out.println("Test A");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testB()
	{
		System.out.println("Test B");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testC()
	{
		System.out.println("Test c");
		Assert.assertTrue(false);
	}

}
