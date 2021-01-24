package baseMainTests;

import java.io.IOException;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import yunuso.Maven01.Browser1;
import yunuso.Maven01.LandingPage;

@RunWith(Cucumber.class)
public class MainTest extends LandingPage{
	
		@Given("Visiting the {string} first")
		public void visiting_the_first(String string) throws IOException {
		
			driver = baseLanding ();
			driver.get(string);
			
			
	    }

		 @When("^Logging in with credentials of (.+) and (.+)$")
		    public void logging_in_with_credentials_of_and(String username, String password) throws Throwable {
	    	
	    	
	    	Browser1 brow = new Browser1 (driver);
			brow.logInID().click();
	
			brow.userNameID().sendKeys(username);
		
			brow.passwordID().sendKeys(password);
			
			brow.clickingID().click();
//			String text = brow.textID().getText();
	    	
	    	
	    }
		 
	    @Then("^Verify the login$")
	    public void verify_the_login() throws Throwable {
	    	System.out.println("Success verification");
	    }

	    @And("^close all browsers$")
	    public void close_all_browsers() throws Throwable {
	    
	    	driver.close();
	    }
	

}