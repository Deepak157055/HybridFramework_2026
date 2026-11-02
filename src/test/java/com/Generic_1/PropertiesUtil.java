package com.Generic_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	
	Properties p1;
	
	public PropertiesUtil(String filename){
		
		  // path
		  File f1 = new File(System.getProperty("user.dir")+"//ConfigData//"+filename+".properties");
		  
          try {
           
    		  // Read the file in the Stream
    		  FileInputStream fs = new FileInputStream(f1);
    		  
    		  // Create object of Properties class
    		   p1 = new Properties();
    		  
    		  // load the file
    		  p1.load(fs);  
        	
        	  
          } catch(FileNotFoundException e)
          {
        	  
        	System.out.println("File path is wrong ");  
        	  
          } catch (IOException e) {
			
        	  System.out.println("Properties file not loaded");
		}
		
	}
	// to read the data
	public String obtainData(String key) {
		
		return p1.getProperty(key);
		
	}

}
