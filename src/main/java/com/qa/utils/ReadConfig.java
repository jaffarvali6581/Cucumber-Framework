package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	private Properties prop;
	
	public Properties initial_prop() {
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\CucumberPom2\\src\\test\\resources\\Config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
