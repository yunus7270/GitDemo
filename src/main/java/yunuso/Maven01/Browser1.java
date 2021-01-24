package yunuso.Maven01;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Browser1 {
	
	public WebDriver driver;
	public Browser1(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By logIn = By.cssSelector("a[href*='Login']");
	By userName = By.cssSelector("input[name*='UserName']");
	By password = By.cssSelector("input[name*='Password']");
	By clicking = By.cssSelector("input[type='submit']");
	By text = By.cssSelector("a[href*='Summary']");
	
	
	public WebElement logInID () {
		return driver.findElement(logIn);
	}
	
	public WebElement userNameID () {
		return driver.findElement(userName);
	}
	
	public WebElement passwordID () {
		return driver.findElement(password);
	}
	
	public WebElement clickingID () {
		return driver.findElement(clicking);
	}
	
	public WebElement textID () {
		return driver.findElement(text);
	}

}
