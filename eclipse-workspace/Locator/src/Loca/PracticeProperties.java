package Loca;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeProperties {


	public static void main(String[] args) throws IOException, InterruptedException  {
	
     Properties prop = new Properties();
     FileInputStream ip = new FileInputStream("C:\\Users\\sharma.hemant\\eclipse-workspace\\Locator\\Practice.properties");
     prop.load(ip);
     String browsername = prop.getProperty("browser");
     if(browsername.equals("chrome")) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.get(prop.getProperty("url"));
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }else if(browsername.equals("FF")){
    	 System.setProperty("webdriver.firefox.driver", "C:\\unzipped\\geckodriver-v0.29.1-win32\\firefoxdriver.exe");
         FirefoxDriver driver = new FirefoxDriver();
         driver.get(prop.getProperty("url"));
     }else if(browsername.equals("edge")) {
    	 System.setProperty("webdriver.edge.driver", "C:\\unzipped\\edgedriver_win32\\edgedriver.exe");
    	 EdgeDriver driver = new EdgeDriver();
    	 driver.get(prop.getProperty("url"));
     }
//     System.setProperty("webdriver.chrome.driver", "C:\\\\unzipped\\\\chromedriver_win32\\\\chromedriver.exe");
//     ChromeDriver driver = new ChromeDriver();
//     driver.get("https://ui.cogmento.com/");
//     driver.manage().window().maximize();
//     driver.manage().deleteAllCookies();
//     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//     Thread.sleep(2000);
//     driver.findElement(By.xpath(prop.getProperty("xpathemail"))).sendKeys(prop.getProperty("username"));
//     driver.findElement(By.xpath(prop.getProperty("xpathpassword"))).sendKeys("password");
//     Thread.sleep(3000);
//     driver.findElement(By.cssSelector(prop.getProperty("csssubmit"))).click();
//		
	
		
	}
	}
	
