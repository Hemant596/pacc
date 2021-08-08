package Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstConstructor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
