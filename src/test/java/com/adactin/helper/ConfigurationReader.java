package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
public static Properties p;

	public ConfigurationReader() throws IOException {
	File f= new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
	FileInputStream Fis = new FileInputStream(f);//to get the file
	p =new Properties();// object for properties
	p.load(Fis);//will load the file in p
	}		   
//will create object for url and browsername 
	public static String getBrowserName() {
		String browser = p.getProperty("browsername");
		return browser;
	}
	
	public static String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	

	


	
}