package com.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pom.LoginPage;
import com.utility.BaseClass;
import com.utility.Library;

public class TS001_Login extends BaseClass {
	
	
	@Test
	public void TC001 ()
	{
		driver.get(config.enterStageUrl());
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		login.enterMobileNumber("8830405060");
		login.selectCountry();
		login.selectCountryIndia();
		login.clickOnRequestOtp();
		login.EnterOtp("1234");
		login.clickOnVerifyBtn();
		String Home=login.getHome().getText();
		
		try
		{
			Assert.assertEquals(Home, "Home");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
}
