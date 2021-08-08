package Loca;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Highlight {
	

	public static void main(String[] args)  {
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www-review-cert-tc1.thinkcentral.com/content/hsp/math/hspmath/na/common/itools_int_9780547584997_/html/counters/counters.html");
		 WebElement btn = driver.findElement(By.cssSelector(".no-outline"));
		 flash(btn, driver);
      
	}
	
	public static void flash(WebElement element , WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor =element.getCssValue("backgroundColor");
		for( int i=0; i<1110;i++) {
			changeColor("rgb(0,1200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
		
	}
	public static void changeColor(String color, WebElement element , WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
	}
	}
	
