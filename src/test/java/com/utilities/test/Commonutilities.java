package com.utilities.test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.reporters.XMLConstants;

public class Commonutilities {
	public 	 String getApplicationproperties(String key) {
		Properties properties = new Properties();
		String filepath=constants.APPLICATION_PROPERTIES_PATH;
		FileInputStream inputFile=null;
		try{
			inputFile=new FileInputStream(filepath);
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
			
		}
		String value=null;
		try {
		properties.load(inputFile);}
		catch(IOException e) {
			e.printStackTrace();
		}
		value=properties.getProperty(key);
		try {
			inputFile.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return value;}
		
	
	
	
	}


