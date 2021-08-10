package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtils;

public class AboutUs {
	private WebDriver driver;
	private static ElementUtils elementUtil;

	public AboutUs(WebDriver driver) {
		this.driver=driver;
		elementUtil=new ElementUtils(driver);
	}

	public  void goToAboutUs() {

		WebElement clickonAboutUs = elementUtil.getElement("css", ".menu-23298.top-level>a");
		clickonAboutUs.click();

	}

	public  void getTitle() {
		String title = driver.getTitle();
		if(title.equalsIgnoreCase(title)) {
			System.out.println(title);
		}
	}

	private WebElement getHeaderElement(String  headerValue) {
		String header = ".col-md-6.col-sm-12.topmargin.bottommargin>p:nth-of-type(1)";
		return elementUtil.getElement("css", header);
	}

	public boolean headerexists(String headerValue) {
		String head =getHeaderElement(headerValue).getText();
		System.out.println(head);
		return getHeaderElement(headerValue).isDisplayed();
	}

}
