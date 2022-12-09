package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configue_data_provider {
	
	Properties pro ;
	
	public Configue_data_provider () throws IOException
	{
		String path = "C:\\Users\\Hp\\eclipse-workspace\\C_project1\\Configue\\configue_Login_TC001";
		FileInputStream fis = new FileInputStream (path);
		pro= new Properties ();
		pro.load(fis);
		
	}
	
	public String getStageUrl ()
	{
		return pro.getProperty("StageUrl");
	}



}
