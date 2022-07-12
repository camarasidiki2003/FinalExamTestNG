package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver init() {
		System.setProperty("webdriver.edge.driver", "drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
