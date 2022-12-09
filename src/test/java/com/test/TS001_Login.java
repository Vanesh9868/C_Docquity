package com.test;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pom.Pom_Login_TC001;
import com.utility.BaseClass;
import com.utility.Library;

public class TS001_Login extends BaseClass {
	
	
	@Test
	public void TC001() throws IOException
	{
		Pom_Login_TC001 login=PageFactory.initElements(driver, Pom_Login_TC001.class);
		Library.Custom_sendKeys(login.getUsername(), "manish");
		Library.Custom_sendKeys(login.getPassword(), "4545452");
		Library.Custom_click(login.getLoginbtn());
		String ErrorMessege=login.getError().getText();

		try 
		{
			Assert.assertEquals(ErrorMessege, "The password that you've entered is incorrect. Forgotten password?");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
	@Test
	public void TC002() throws IOException
	{
		Pom_Login_TC001 login=PageFactory.initElements(driver, Pom_Login_TC001.class);
		login.getUsername().sendKeys("");
		login.getPassword().sendKeys("");
		login.getLoginbtn().click();
		String ErrorMessege=login.getError2().getText();

		try 
		{
			Assert.assertEquals(ErrorMessege, "The email address or mobile number you entered isn't connected to an account. Find your account and log in.");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	@Test
	public void TC003() throws IOException
	{
		Pom_Login_TC001 login=PageFactory.initElements(driver, Pom_Login_TC001.class);
		login.getUsername().sendKeys("9767068593");
		login.getPassword().sendKeys("Khiladi@9868");
		login.getLoginbtn().click();
		
		String homepage=driver.getTitle();
		System.out.println(homepage);
			
	
	}

	
	
	
	
}
