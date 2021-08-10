package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfigReader.ConfigPropReader;
import DriverFactory.DriverFactory;
import Pages.HomePage;

public class HomePageTest {
	
	DriverFactory df;
	ConfigPropReader cp;
	Properties prop;
	WebDriver driver;
	HomePage homepage;
	
	@BeforeTest
	public void setUp() {
		cp =new ConfigPropReader();
		prop =cp.initLangProp("english");
		df =new DriverFactory();
		driver =df.initDriver("chrome", prop);
		homepage = new HomePage(driver);
		                
	}
	                
	@Test
	public void headerTest() {
		Assert.assertTrue(homepage.getHeaderExist(prop.getProperty("header")));
	}
	
	@Test
	public void contactFooterTest() {
		Assert.assertTrue(homepage.getContactExist(prop.getProperty("contact")));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
