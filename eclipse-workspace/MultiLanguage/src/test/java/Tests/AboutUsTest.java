package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfigReader.ConfigPropReader;
import DriverFactory.DriverFactory;
import Pages.AboutUs;

public class AboutUsTest {

	WebDriver driver;
	DriverFactory df;
	Properties prop;
	AboutUs as;
	ConfigPropReader cd;

	@BeforeTest
	public void setUp() {
		cd = new ConfigPropReader();
		prop =cd.initLangProp("english");
		df= new DriverFactory();
		driver =df.initDriver("chrome", prop);
		as=new AboutUs(driver);


	}

	@Test
	public void test1() {
		as.goToAboutUs();
	}

	@Test
	public void test2() {
		as.goToAboutUs();
		as.getTitle();
	}

	@Test
	public void test3() {
		as.headerexists(prop.getProperty("abtheader"));
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
