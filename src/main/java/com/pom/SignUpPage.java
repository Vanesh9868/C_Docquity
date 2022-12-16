package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {
	
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
	
	
	@FindBy(xpath="//span[contains(text(),'Doctor')]")
	private WebElement Doctor;
	
	@FindBy(xpath="//span[contains(text(),'Dentist')]")
	private WebElement Dentist;
	
	@FindBy(xpath="//span[contains(text(),'Student')]")
	private WebElement Student;
	
	@FindBy(xpath="//span[contains(text(),' Medical Student ')]")
	private WebElement MedicalStudent;
	
	@FindBy(xpath="//span[contains(text(),'Dental Student')]")
	private WebElement DentalStudent;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search College')]")
	private WebElement SearchCollege;
	
	@FindBy(xpath="//label[contains(text(),'Click to Upload Id ')]")
	private WebElement UploadCollegeId;
	
	@FindBy(xpath="//button[contains(text(),' Submit')]")
	private WebElement SubmitBtn;
	
	@FindBy(xpath="//p[text()='Cardiology']")
	private WebElement Cardiology;
	
	
	
	
	
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='Middle name']")
	private WebElement MiddleName;
	
	@FindBy(xpath="//input[@placeholder='Last name']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@placeholder='Email Id']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='registration_no']")
	private WebElement MrnNumber;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElement Next;
	
	@FindBy(xpath="//p[contains(text(),'General Practitioner')]")
	private WebElement GeneralPractitioner;
	
	@FindBy(xpath="//p[contains(text(),'Family Medicine')]")
	private WebElement FamilyMedicine;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	private WebElement ContinueBtn;
	
	@FindBy(xpath="//p[contains(text(),'General Dentistry')]")
	private WebElement GeneralDentistry;
	
	@FindBy(xpath="//p[contains(text(),'Dental Radiology')]")
	private WebElement DentalRadiology ;
	
	
	@FindBy(xpath="//span[text()='Home']")
	private WebElement HomeBtn;
	
	
	
	
	@FindBy(xpath="//div[contains(@class,'clearfix ng-tns-c403-4')]//img[contains(@class,'position-absolute ng')]")
	private WebElement Profile;
	
	@FindBy(xpath="//a[contains(text(),' View Profile')]")
	private WebElement ViewProfile;
	
	@FindBy(xpath="//div[contains(@class,'col-8 text-right ng-star-inserted')]//span[contains(@class,'cursor-pointer ng-star-inserted')]")
	private WebElement Setting;
	
	@FindBy(xpath="//p[contains(text(),' Delete Profile')]")
	private WebElement DeleteProfile;
	
	@FindBy(xpath="//button[contains(text(),' Continue to Account Deletion ')]")
	private WebElement ContinueToAccountDeletion;
	
	@FindBy(xpath="//button[contains(text(),'Delete Account')]")
	private WebElement DeleteAccount;
	
	@FindBy(xpath="//input[@id='reason1']")
	private WebElement reason1;
	
	
	
	
	
	
	
	
	
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
	
	public WebElement selectMedicalStudent ()
	{
		MedicalStudent.click();
		return MedicalStudent;
	}
	
	public WebElement selectDentalStudent ()
	{
		DentalStudent.click();
		return DentalStudent;
	}
	
	
	public WebElement enterCollegeName (String college)
	{
		SearchCollege.sendKeys(college);
		return SearchCollege;
	}
	
	public WebElement clickOnUploadCollegeId ()
	{
		UploadCollegeId.click();
		return UploadCollegeId;
	}	
	
	public WebElement clickOnSubmitBtn ()
	{
		SubmitBtn.click();
		return SubmitBtn;
	}	
	
	public WebElement selectCardiology ()
	{
		Cardiology.click();
		return Cardiology;
	}	
	
	
	
	public WebElement enterFirstName (String firstname)
	{
		FirstName.sendKeys(firstname);
		return FirstName;
	}
	
	public WebElement enterMiddleName (String middlename)
	{
		MiddleName.sendKeys(middlename);
		return MiddleName;
	}
	
	public WebElement enterLastName (String lastname)
	{
		LastName.sendKeys(lastname);
		return LastName;
	}
	
	public WebElement enterEmail (String email)
	{
		Email.sendKeys(email);
		return Email;
	}
	
	public WebElement enterMrnNumber (String mrnNumber)
	{
		MrnNumber.sendKeys(mrnNumber);
		return MrnNumber;
	}
	
	public WebElement clickNextBtn ()
	{
		Next.click();
		return Next;
	}
	
	public WebElement selectGeneralPractitioner ()
	{
		GeneralPractitioner.click();
		return GeneralPractitioner;
	}
	
	public WebElement selectFamilyMedicine ()
	{
		FamilyMedicine.click();
		return FamilyMedicine;
	}
	
	public WebElement ClickOnContinueBtn ()
	{
		ContinueBtn.click();
		return ContinueBtn;
	}
	
	public WebElement selectGeneralDentistry ()
	{
		GeneralDentistry.click();
		return GeneralDentistry;
	}
	
	public WebElement selectDentalRadiology ()
	{
		DentalRadiology.click();
		return DentalRadiology;
	}
	
	
	public WebElement clickOnHomeMenu() 
	{
		HomeBtn.click();
		return HomeBtn;
	}
	
	public WebElement clickOnProfileBtn() 
	{
		Profile.click();
		return Profile;
	}
	
	public WebElement clickOnViewProfileOption() 
	{
		ViewProfile.click();
		return ViewProfile;
	}
	
	public WebElement clickOnSettingTab() 
	{
		Setting.click();
		return Setting;
	}
	
	public WebElement clickOnDeleteProfileOption() 
	{
		DeleteProfile.click();
		return DeleteProfile;
	}
	
	public WebElement clickOnContinueToAccountDeletionBtn() 
	{
		ContinueToAccountDeletion.click();
		return ContinueToAccountDeletion;
	}
	
	public WebElement clickOnDeleteAccountBtn() 
	{
		DeleteAccount.click();
		return DeleteAccount;
	}
	
	public WebElement clickOnreason1option() 
	{
		DeleteAccount.click();
		return DeleteAccount;
	}
	
	
	
	
	
	

}











