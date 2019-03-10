package exceptions;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
		
		try {
			//create a FileInputStream class object with path of the file
			FileInputStream fis = new FileInputStream(".\\config.properties");
			//creae an object of Properties class
			Properties prop = new Properties();
			//load the properties file object (fis) in to the Properties class object (prop)
			prop.load(fis);
			//get the properties from the properties file using getPropetry(String key)
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("server_ip"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
