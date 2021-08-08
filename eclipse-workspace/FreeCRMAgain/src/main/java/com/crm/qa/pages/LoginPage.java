package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css = ".ui.fluid.large.blue.submit.button")
	WebElement login;
	
	@FindBy(xpath ="//a[contains(text(),'Sign Up')]")
	WebElement SignUp;
	
	@FindBy(css = ".onesignal-bell-svg")
	WebElement bellicon;
	
	//initializing the page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validatelogoImage() {
		return bellicon.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}

}
