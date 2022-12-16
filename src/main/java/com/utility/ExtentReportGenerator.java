package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports extent;
	
	public static ExtentReports getReports () {
		
		String path="C:\\Users\\Hp\\eclipse-workspace\\C_docquity\\Reports";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter (path);
		
		reporter.config().setDocumentTitle("C_docquity");
		reporter.config().setReportName("Login Module");
		reporter.config().setTheme(Theme.DARK);
		
		
		extent = new ExtentReports ();
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("System", "Docquity Web");
		extent.setSystemInfo("QA", "Yogesh Shinde");
		extent.setSystemInfo("O.S", "Windows");
		
		return extent ;
		
	}
	
	

}
