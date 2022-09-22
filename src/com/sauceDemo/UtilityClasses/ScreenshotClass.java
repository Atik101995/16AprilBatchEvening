package com.sauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		//date & time format code
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("D:\\velocity\\Screenshot\\soucedemoUrl.jpg");
		FileHandler.copy(SourceFile, destFile);
	}

}
