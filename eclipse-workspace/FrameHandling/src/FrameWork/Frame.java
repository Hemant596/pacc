package FrameWork;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\unzipped\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hemant.hs828@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("2@Discus2@");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.ui.fluid.large.blue.submit.button")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[contains(text(),'Calendar')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("i.plus.inverted.icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("DemoProject");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='calendarField react-datepicker-ignore-onclickoutside']/parent::*")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[class$='003']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'15:30')]")).click();
		Thread.sleep(2000);
		//driver.close();
		
		
	}

}
