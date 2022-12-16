package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	@FindBy(how=How.XPATH,using="//input[@id='mobile_no']")
	private WebElement MobileNumber;
	
	@FindBy(how=How.XPATH,using="//span[@class='c-list']")
	private WebElement Country;
	
	@FindBy(how=How.XPATH,using="//span[text()='India']")
	private WebElement CountryIndia;
	
	@FindBy(how=How.XPATH,using="//button[@id='requestOtpClick']")
	private WebElement RequestOtp;
	
	@FindBy(xpath ="//input[@id='verifyOtp']")
	private WebElement EnterOtp;
	
	@FindBy(xpath ="//button[text()=' VERIFY']")
	private WebElement VerifyBtn;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'yogesh Prakash')]")
	private WebElement ProfileName;
	
	@FindBy(how=How.XPATH,using="//input[@id='useremail']")
	private WebElement UserEmail;
	
	@FindBy(how=How.XPATH,using="//span[text()='Home']")
	private WebElement HomeBtn;
	
// *************************************************************************************
	
	@FindBy(xpath="//span[contains(text(),'Doctor')]")
	private WebElement Doctor;
	
	@FindBy(xpath="//span[contains(text(),'Dentist')]")
	private WebElement Dentist;
	
	@FindBy(xpath="//span[contains(text(),'Student')]")
	private WebElement Student;
	

// *************************************************************************************
	
	public WebElement selectDoctor ()
	{
		Doctor.click();
		return Doctor;
	}
	
	public WebElement selectDentist ()
	{
		Dentist.click();
		return Dentist;
	}
	
	public WebElement selectStudent ()
	{
		Student.click();
		return Student;
	}
// *************************************************************************************

	public WebElement enterMobileNumber (String mobile)
	{
		MobileNumber.sendKeys(mobile); 
		return MobileNumber;
	}
	
	public WebElement selectCountry ()
	{
		Country.click();
		return Country;
	}
	
	public WebElement selectCountryIndia ()
	{
		CountryIndia.click();
		return CountryIndia;
	}
	
	
	public WebElement clickOnRequestOtp ()
	{
		RequestOtp.click();
		return RequestOtp;
	}
	
	public WebElement EnterOtp (String otp)
	{
		EnterOtp.sendKeys(otp);
		return EnterOtp;
	}
	
	public WebElement clickOnVerifyBtn ()
	{
		VerifyBtn.click();		
		return VerifyBtn;
	}
	
	public WebElement getProfileName ()
	{
		return ProfileName;
	}
	
	public WebElement getUserEmail ()
	{
		return UserEmail;
	}

	public WebElement getHome() 
	{
		return HomeBtn;
	}
	
	
	
	
	
	
	
	
}
