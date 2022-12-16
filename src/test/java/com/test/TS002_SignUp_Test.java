package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pom.LoginPage;
import com.pom.SignUpPage;
import com.utility.BaseClass;

public class TS002_SignUp_Test extends BaseClass {
	
	@Test
	public void TC001 ()
	{
		driver.get(config.enterStageUrl());
		SignUpPage signup=PageFactory.initElements(driver, SignUpPage.class);
		signup.enterMobileNumber("8888888801");
		signup.selectCountry();
		signup.selectCountryIndia();
		signup.clickOnRequestOtp();
		signup.EnterOtp("1234");
		signup.clickOnVerifyBtn();
		signup.selectDoctor();
		signup.enterFirstName("ajay");
		signup.enterMiddleName("x");
		signup.enterLastName("jadhav");
		signup.enterEmail("ajayjadhav1234@gmail.com");
		signup.clickNextBtn();
		signup.enterMrnNumber("8888888801");
		signup.clickNextBtn();
		signup.selectGeneralPractitioner();
		
		signup.selectFamilyMedicine();
		
	}

	
//	@Test
//	public void TC002 ()
//	{
//		driver.get(config.enterStageUrl());
//		SignUpPage signup=PageFactory.initElements(driver, SignUpPage.class);
//		signup.enterMobileNumber("8888888802");
//		signup.selectCountry();
//		signup.selectCountryIndia();
//		signup.clickOnRequestOtp();
//		signup.EnterOtp("1234");
//		signup.clickOnVerifyBtn();
//		signup.selectDentist();
//		signup.enterFirstName("vijay");
//		signup.enterMiddleName("y");
//		signup.enterLastName("gire");
//		signup.enterEmail("vijaygire1234@gmail.com");
//		signup.clickNextBtn();
//		signup.enterMrnNumber("8888888802");
//		signup.clickNextBtn();
//		signup.selectGeneralDentistry();
//		
//		signup.selectDentalRadiology();
//
//	}
//	
//	@Test
//	public void TC003 ()
//	{
//		driver.get(config.enterStageUrl());
//		SignUpPage signup=PageFactory.initElements(driver, SignUpPage.class);
//		signup.enterMobileNumber("8888888803");
//		signup.selectCountry();
//		signup.selectCountryIndia();
//		signup.clickOnRequestOtp();
//		signup.EnterOtp("1234");
//		signup.clickOnVerifyBtn();
//		signup.selectStudent();
//		signup.selectMedicalStudent();
//		signup.enterFirstName("sonu");
//		signup.enterMiddleName("z");
//		signup.enterLastName("singh");
//		signup.enterEmail("sonusingh1234@gmail.com");
//		signup.clickNextBtn();
//		signup.enterMrnNumber("8888888803");
//		signup.clickNextBtn();
//
//	}
	
	
	@Test
	public void TC004 ()
	{
		driver.get(config.enterStageUrl());
		SignUpPage signup=PageFactory.initElements(driver, SignUpPage.class);
		signup.enterMobileNumber("8888888804");
		signup.selectCountry();
		signup.selectCountryIndia();
		signup.clickOnRequestOtp();
		signup.EnterOtp("1234");
		signup.clickOnVerifyBtn();
		signup.selectDoctor();
		signup.enterFirstName("monu");
		signup.enterMiddleName("r");
		signup.enterLastName("singh");
		signup.enterEmail("monusingh@gmail.com");
		signup.clickNextBtn();
		signup.enterMrnNumber("8888888804");
		signup.clickNextBtn();
		signup.selectGeneralPractitioner();
		signup.ClickOnContinueBtn();
		signup.selectFamilyMedicine();
		signup.clickOnHomeMenu();
		
	}
	


}
