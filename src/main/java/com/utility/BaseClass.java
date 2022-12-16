package com.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends Library {
	
	public WebDriver driver ;
	public Configue_data_provider config ;
	public ExcelDataProvider excel ;
	
	@BeforeSuite
	public void BS () throws IOException
	{
		config = new Configue_data_provider ();
		excel=new ExcelDataProvider ();
	}
	
	@Parameters ("BrowserName")
	
	@BeforeMethod
	public void setup ( String BrowserName)
	{
		
		if (BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver ();
		}
		
		if (BrowserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver ();
		}
		
		if (BrowserName.equalsIgnoreCase("firefox"))
			
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver ();
		}
		
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
	}
	
	@AfterMethod
	public void teardown () throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	

}
