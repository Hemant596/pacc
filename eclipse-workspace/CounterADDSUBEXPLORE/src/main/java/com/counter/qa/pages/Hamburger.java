package com.counter.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.counter.qa.base.TestBasee;

public class Hamburger extends TestBasee{
	
@FindBy(css = ".activity-top-container>div>button[class='menu sprite sprite--menu']")
WebElement showmenu;

@FindBy(css= ".menu-popup-container>div+ul>li")
WebElement menuoptions;

@FindBy(css = ".popup-container.popup-menu.popup-show>div>button>span")
WebElement crossbutton;



public Hamburger(){
	PageFactory.initElements(driver, this);
}

public void verifyClickOnHamburger() {
		showmenu.click();
	}

public void chooseAnyActivity(String Activity) {
	showmenu.click();
	List<WebElement> links = driver.findElements(By.cssSelector(".menu-popup-container>div+ul>li"));
	for(int i = 0; i<links.size();i++) {
		if(links.get(i).getText().contains(Activity)) {
			links.get(i).click();
			break;
			
		}
	}
}

public void clickonCrossButton() throws InterruptedException {
	showmenu.click();
	Thread.sleep(3000);
	crossbutton.click();
}
	
}
