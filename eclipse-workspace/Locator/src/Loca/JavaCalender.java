package Loca;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaCalender {
static WebElement driver ;
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.spicejet.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		 List<WebElement> list =  driver.findElements(By.cssSelector(".ui-datepicker-calendar>thead+tbody>tr>td"));
		 for(int i=0; i<list.size();i++) {
			 if(list.get(i).getText().contains("19")) {
				 list.get(i).click();
				 break;
			 }
		 }
//		 WebElement dt = driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1"));
//		 String datata = "19-06-2021";
//		 Selectcalender(driver, dt, datata);

	}
//public static void Selectcalender(WebDriver driver,WebElement element , String date) {
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
//	
//}
}
