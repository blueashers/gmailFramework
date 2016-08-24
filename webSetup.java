package framework.setup;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webSetup {
	
	//Initialize the webdriver to be used in the tests
	static WebDriver driver;
		
	public static WebDriver setDriver(String browser, String url) {
		//This will accept either "chrome" or "firefox" and setup the appropriate browser
		switch (browser) {
		case "chrome":
			System.out.println("Setting up Chrome");
			System.setProperty("webdriver.chrome.driver", "C:/Users/hicksa/Documents/Selenium/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:/Users/hicksa/Documents/Selenium/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Unrecognized browser, defaulting to Chrome.");
			System.setProperty("webdriver.chrome.driver", "C:/Users/hicksa/Documents/Selenium/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Get the url passed from the test
		driver.get(url);
		return driver;
	}
	
	public static WebDriver returnDriver() {
		//This returns the driver for other classes needing it
		return driver;
	}
	
	public static void cleanup() {
		//Close the open window(s)
		System.out.println("Cleaning up.");
		driver.quit();	
	}
	

}