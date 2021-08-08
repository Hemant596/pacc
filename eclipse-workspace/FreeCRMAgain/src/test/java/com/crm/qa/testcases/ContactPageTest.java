package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	ContactPage contactpage;
	TestUtil util;
	
	public ContactPageTest() {
		super();
	}
	
	
	@BeforeMethod	
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		contactpage = new ContactPage();
		util = new TestUtil();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	
		//contactpage=homepage.clickoncontactlinks();
	}
	
	@Test
	public void verifyContactPageTest() {
		Assert.assertTrue(contactpage.verifyContactPage()," contact page is not matching");
	}
	
	@Test
	public void selectcontactboxTest() {
		contactpage.selectcontactbox();
	}
	
	@Test
	public void validatecreatecontact() throws InterruptedException  {
		//util.switchframe();
		homepage.clickonNewContactLink();
		contactpage.createnewcontact("hemant", "shah");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
