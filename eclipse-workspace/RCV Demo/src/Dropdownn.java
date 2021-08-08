import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.google.com/");
		/*driver.findElement(By.xpath("//input[@name='q']")).sendKeys("apple");
		driver.findElement(By.xpath("//input[@name='btnK']")).submit();
		Thread.sleep(2000);
		driver.navigate().to("https://www.apple.com/in/iphone/");
		//driver.navigate().to("https://www.apple.com/in/shop/goto/buy_iphone/iphone_12");
		driver.findElement(By.className("button")).click();
		//driver.navigate().to("https://www.apple.com/in/shop/buy-iphone/iphone-12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='form-label as-tradeupinline-selection-label' and @for='tradeIn']")).click();
		driver.findElement(By.xpath("//label[@for='fs-tradeUpInline.brandCheck.moduleData-ad-1']")).click();
		driver.findElement(By.id("tradeUpInline.verify.moduleData.verification.sno")).sendKeys("11009478451");
		driver.findElement(By.xpath("//button[@class='button button-block as-tradeupinline-button']")).click();*/
		
		
		driver.get("https://www.amazon.com/Revlon-One-Step-Dryer-Volumizer-Brush/dp/B01LSUQSB0/?_encoding=UTF8&pd_rd_w=YWZvF&pf_rd_p=b6363b44-58dd-4354-979f-1446a1c45f7a&pf_rd_r=08R3E57HY9YA8TY9GHR0&pd_rd_r=d9351bf7-0376-42f4-9471-3e98c7ee7bd7&pd_rd_wg=z72zG&ref_=pd_gw_unk");
		List<WebElement> link = driver.findElements(By.cssSelector(".a-popover.a-dropdown.a-dropdown-common.a-declarative>div>div>ul>li>a"));
		System.out.println("links :"+link.size());
//		for(int i=0;i<link.size();i++) {
//			System.out.println(link.get(i).getText());
//			if ( link.get(i).getText().contains("12")) {
//				link.get(i).click();
//				break;
//			}
//		}
		
		
		
		
		

	}
}
