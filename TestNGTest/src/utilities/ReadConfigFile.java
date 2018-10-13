package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	public static FileInputStream fs;
	
	public Properties readConfigFile() throws IOException{
		Properties  property = new Properties();
		 fs = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
		 property.load(fs);		 
		 System.out.println(property.getProperty("url"));
		 System.out.println(property.getProperty("ChromeDriver"));	 
		 System.out.println(property.getProperty("email"));
		 System.out.println(property.getProperty("password"));		 
		 return property;
		
	}	


}
