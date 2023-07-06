package org.xyz.automation.fb.utilitiesClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Readconfigfile 
{

	public static String readconfig(String key) throws Exception
	{
		
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);  //load the data which is prop file into temp memory
		
		return prop.get(key).toString();
		
	}
	
	public static String readelement(String key) throws Exception
	{
		
		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);  //load the data which is prop file into temp memory
		
		return prop.get(key).toString();
		
	}
	
}
