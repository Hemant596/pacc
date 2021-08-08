package com.counter.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.counter.qa.base.TestBasee;
import com.counter.qa.pages.Hamburger;

public class HamburgerTest extends TestBasee{
	
	Hamburger ham ;
	
	public HamburgerTest() {
		super();
	}
	
@BeforeMethod
public void setUp() {
	initialization();
	ham = new Hamburger();
	
}

@Test
public void verifyClickOnAnyActivity() {
	ham.chooseAnyActivity("Subtract");
}

@Test
public void verifyClickOnCrossButton() throws InterruptedException {
	ham.clickonCrossButton();
}
@Test
public void verifyClickOnHamburgerIcon() throws InterruptedException {
	Thread.sleep(3000);
	ham.verifyClickOnHamburger();
}

@AfterMethod
public void tearDown() {
	driver.quit();
}

	
	
	

}
