package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;



public class HomePage extends TestBase {
	
	@FindBy(xpath = "//span[contains(text(),'Hemant Sharma')]")
	@CacheLookup
    WebElement namelabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")   
	WebElement contacts;
	
	@FindBy(css=".ui.left.fixed.vertical.icon.menu.sidebar-dark.left-to-right")   
	WebElement contactsss;
	
	@FindBy(css="a[href='/contacts']+button>i")
	WebElement newcontactlink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement deals;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasks;
	
	
	
	//initializing the page object
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public boolean correctusername() {
			return namelabel.isDisplayed();
		}
		
		public String verifyhomepagetitle() {
			return driver.getTitle();
		}
		
		public ContactPage clickoncontactlinks() {
			contacts.click();
			return new ContactPage();
		}
		
		public DealsPage clickondeallinks() {
			deals.click();
			return new DealsPage();
		}
		
		public TasksPage clickonTaskslinks() {
			tasks.click();
			return new TasksPage();
		}
		
		public void clickonNewContactLink() throws InterruptedException {
			Actions action = new Actions(driver);
			action.moveToElement(contactsss).build().perform();
			Thread.sleep(5000);
			newcontactlink.click();
			Thread.sleep(5000);
			
			
		}
}
    

