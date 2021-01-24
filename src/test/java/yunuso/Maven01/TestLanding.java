package yunuso.Maven01;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestLanding extends LandingPage{
	
	public static Logger log = (Logger) LogManager.getLogger(LandingPage.class.getName());
	
	
	@BeforeTest
	public void beforeTest () throws IOException {
		driver = baseLanding ();
		log.info("Driver is successfully initialized");
		driver.get("https://www.fafsaweb.state.mn.us/Reports/Summary?year=2022");
	}
	
	@Test (dataProvider = "getData")
	public void testBase (String userName, String password) throws IOException {
		

		
		Browser1 brow = new Browser1 (driver);
		brow.logInID().click();
		log.info("Success click");
		brow.userNameID().sendKeys(userName);
		log.info("Success userName");
		brow.passwordID().sendKeys(password);
		log.info("Success password");
		brow.clickingID().click();
		String text = brow.textID().getText();
		
		System.out.println("Text = " + text);
		
		Assert.assertEquals(text, "FAFSA Completion");
		Assert.assertTrue(true);
	}
	@DataProvider
	public Object [][] getData () {
		Object [][] dt = new Object [1][2];
		
		dt [0][0] = "Elif Burcum";
		dt [0][1] = "12345";
		
		return dt;
	}
	
	@AfterTest
	public void afterTest () {
		driver.close();
	}
}
