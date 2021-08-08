package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32");
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.selenium.dev/");
     
	}

}
