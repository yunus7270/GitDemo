package yunuso.Maven01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {

	public WebDriver driver;

	
	
	public WebDriver baseLanding () throws IOException {
		
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream("C:\\Users\\ogurlu\\eclipse-workspace\\Maven01\\src\\main\\java\\yunuso\\Maven01\\baseFile");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ogurlu\\javafx-sdk-11.0.2/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		return driver;
	}

}
