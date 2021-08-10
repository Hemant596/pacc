package ConfigReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropReader {
	
	private Properties prop;
	private FileInputStream ip;
	
	public Properties initLangProp(String language) {
		
		//String languag = System.getProperty("lang");
		
		System.out.println("lang is : "+language);
		
	
	prop =new Properties();
	
	switch (language.toLowerCase()) {
	case "english" :
		try {
			ip = new FileInputStream("./src/main/resources/lang.eng.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
		
	case "french" :
		try {
			ip = new FileInputStream("./src/main/resources/lang.french.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
		
	case "russian" :
		try {
			ip = new FileInputStream("./src/main/resources/lang.russian.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;

	default:
		System.out.println("lang not found : "+language);
		break;
	}
	
	try {
		prop.load(ip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return prop;
	}
	

}
