package com.cbt.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	static Properties configFiles;

	static {
		String path = "./src/test/resources/test_data/configuration.properties";
		try {
			FileInputStream input = new FileInputStream(path);
			configFiles = new Properties();
			configFiles.load(input);
			input.close();
		} 
		catch (Exception e) {
			System.out.println(path + " was not found");
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return configFiles.getProperty(key).trim();
	}

}
