package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	ContactPage contactpage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	loginPage = new LoginPage();
	contactpage = new ContactPage();
	homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomepagetitletest() {
		String homepagetitle = homepage.verifyhomepagetitle();
		Assert.assertEquals(homepagetitle, "Cogmento CRM", " home page title not match");
		
	}
	
	@Test(priority=2)
	public void verifyusernametest() {
		Assert.assertTrue(homepage.correctusername());
	}
	
	
	@Test(priority=3)
	public void verifyContactsTest() {
		contactpage = homepage.clickoncontactlinks();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
