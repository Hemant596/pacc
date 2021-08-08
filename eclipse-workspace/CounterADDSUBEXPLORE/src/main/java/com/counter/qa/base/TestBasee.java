package com.counter.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.counter.qa.utils.TestUtils;


public class TestBasee {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBasee() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\sharma.hemant\\eclipse-workspace\\CounterADDSUBEXPLORE\\src\\main\\java\\com\\counter\\qa\\config\\config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String browsername  =prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if( browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\unzipped\\geckodriver-v0.29.1-win32\\geckodriver.exe ");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	

}
