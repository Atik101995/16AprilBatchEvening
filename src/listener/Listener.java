package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("sanity test is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("TC is success");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Screenshot is taken");
	}

}
