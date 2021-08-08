package com.crm.qa.util;

import java.sql.Driver;

import org.openqa.selenium.By;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT= 20;
	public static long IMPLICIT_WAIT=10;
	
	public void switchframe() {
	driver.switchTo().frame(driver.findElement(By.id("onesignal-bell-container")));
	}

}
