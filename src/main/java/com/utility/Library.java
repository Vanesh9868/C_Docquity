package com.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	public static ExtentTest test;
	static WebDriver driver ;
	
	public static void Custom_sendKeys(WebElement element, String value) 
    {

			try {
				if (element.isEnabled() == true) 
				{
					element.sendKeys(value);
					System.out.println("value successfully send");
				}
	
			    } 
			catch (Exception e) 
			{
				System.out.println("unable to send value" + e);
			}

	}
	
	public static void Custom_click(WebElement element) {
	
			try {
				if (element.isDisplayed() && element.isEnabled()) 
				{
					element.click();
					System.out.println("click successfully");
				}
			}
	
			catch (Exception e) 
			{
				System.out.println("unable to click" + e);
			}
	
		}

}
