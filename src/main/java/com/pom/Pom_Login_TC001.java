package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pom_Login_TC001 {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement password;

	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement loginbtn;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'The passwor')]")
	private WebElement error;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'The email address')]")
	private WebElement error2;
	
	public WebElement getUsername ()
	{
		return username;	
	}
	
	public WebElement getPassword ()
	{
		return password;
	}
	
	public WebElement getLoginbtn ()
	{
		return loginbtn;
	}
	
	public WebElement getError ()
	{
		return error;
	}
	
	public WebElement getError2 ()
	{
		return error2;
	}
	
	
}
