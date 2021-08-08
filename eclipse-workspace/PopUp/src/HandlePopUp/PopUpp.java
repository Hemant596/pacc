package HandlePopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Thread.sleep(3000);
		/*Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct message");
		}else {
			System.out.println("in correct message");
		}
		Thread.sleep(2000);
		alert.accept();// click on Ok button
		//alert.dismiss();// for click on cancel button*/
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}}