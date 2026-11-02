package com.Swag2.UITest.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	
    public Properties p1;

	public PropertiesUtil(String fileName) {
		
		
		p1 = new Properties();
		
		// path
		
		File f1 = new File(System.getProperty("user.dir")+"//ConfigFiles_3//"+fileName+".properties");
		
		// read the file
		
		FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			// load the file
			p1.load(fs);
		} catch (FileNotFoundException e) {

			System.out.println("File path is wrong");
			
		} catch (IOException e) {

			System.out.println("Properties file not loaded");
		}
        
	}
	  
	// reading the data
	   public String getData(String key) {
			
		  return p1.getProperty(key);
		   
		}
		
}		

