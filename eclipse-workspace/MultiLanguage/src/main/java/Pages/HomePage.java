package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtils;

public class HomePage {
	private WebDriver driver;
	private ElementUtils elementUtil;
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
		elementUtil = new ElementUtils(driver);
	}
	
	private  WebElement getHeaderElement(String headerValue) {
		String headerxpathValue = "//a[contains(text(),'"+headerValue+"')]";
		return elementUtil.getElement("xpath", headerxpathValue);
		
	}
	
	public boolean getHeaderExist(String headerValue) {
		
		String header = getHeaderElement(headerValue).getText();
		System.out.println(header);
		
			return getHeaderElement(headerValue).isDisplayed();
		
		
	}
	
	private  WebElement getContactElement(String contactValue) {
		String contactxpathValue = "//a[contains(text(),'"+contactValue+"')]";
		return elementUtil.getElement("xpath", contactxpathValue);
		
	}
	
	public boolean getContactExist(String contactValue) {
		
		String header = getContactElement(contactValue).getText();
		System.out.println(header);
		
			return getContactElement(contactValue).isDisplayed();
		
		
	}

}
