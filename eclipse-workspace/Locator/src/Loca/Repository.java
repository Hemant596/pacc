package Loca;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Repository {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException  {
	
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\sharma.hemant\\eclipse-workspace\\Locator\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
	
		String  url= prop.getProperty("url");
		
		System.out.println(url);
		
		String browsername = prop.getProperty("browser");
		
		System.out.println(browsername);
		
		if(browsername.equals("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
      
	     } else if (browsername.equals("FF")) {
	    	 
	    	 System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\geckodriver-v0.29.1-win32\\firefoxdriver.exe");
			 driver = new FirefoxDriver(); 
	     }
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(prop.getProperty("css"))).click();
	}
	}
	
