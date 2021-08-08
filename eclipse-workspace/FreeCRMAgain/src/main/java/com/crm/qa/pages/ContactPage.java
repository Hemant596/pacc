package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;


public class ContactPage extends TestBase {

	@FindBy(css = ".ui.header.item.mb5.light-black")
	WebElement contactlabel;

	@FindBy(css = ".ui.fitted.checkbox>input")
	WebElement checkbox;

	@FindBy(css = "input[placeholder='Search']")
	WebElement Search;

	@FindBy(css = "input[name='first_name']")
	WebElement firstname;

	@FindBy(css = "input[name='last_name']")
	WebElement lastname;

	@FindBy(css = ".ui.linkedin.button>i[class='save icon']")
	WebElement savebutton;

	@FindBy(css = "#dashboard-toolbar")
	WebElement dashboard;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyContactPage() {
		Search.click();
		return contactlabel.isDisplayed();
	}

	public void selectcontactbox() {
		Search.click();
		checkbox.click();
	}

	public void createnewcontact(String Fname, String Lname) throws InterruptedException {
//		Select se= new Select(driver.findElement(By.cssSelector(".ui.field>div[name='country']>div+i")));
//		se.selectByVisibleText(country);
		Actions action = new Actions(driver);
		action.moveToElement(dashboard);
		Thread.sleep(3000);
		firstname.sendKeys(Fname);
		lastname.sendKeys(Lname);
		Thread.sleep(3000);
		savebutton.click();
	}

}
