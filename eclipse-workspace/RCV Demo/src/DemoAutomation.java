public class DemoAutomation {
	
	static int x;

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		js.executeScript("window.scrollBy(0,200)");*/
		
		
		//driver.get("https://www.facebook.com/r.php");
		char dem = 'M';
		char deo = 'B';
		char dea = 65;
		double marks =  150.9;
		double math = 67.7;
		//int x;
		
		System.out.println("My name is   : "+dem);
		System.out.println("My job is    : "+deo);
		System.out.println("My alpa is   : "+ dea);
		System.out.println("My marks are :"+marks);
		System.out.println("My maths are :"+math);
		System.out.println(x);
		
	}

}
