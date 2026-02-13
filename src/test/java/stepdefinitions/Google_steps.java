package stepdefinitions;

import Base.Launch_crome;
import io.cucumber.java.en.*;
import utils.ExtentLogger;

import org.testng.Assert;

public class Google_steps extends Launch_crome {
	
	Launch_crome obj = new Launch_crome();
	
	 @Given("User launches browser")
	    public void user_launches_browser() throws InterruptedException {
		 Launch_crome.initDriver();
		 System.out.println(driver);
	    }

	    @When("User opens Google")
	    public void user_opens_google() {
	        driver.get("https://www.google.com");
	    }

	    @Then("Title should contain Google")
	    public void title_should_contain_google() {
	    	System.out.println(driver.getTitle());
	        Assert.assertTrue(driver.getTitle().contains("Google"));
	        String title = driver.getTitle();
	        if (title.contains("Google")) {
	            ExtentLogger.pass("Title matched: " + title);
	        } else {
	            ExtentLogger.fail("Title did not match. Actual: " + title);
	        }
	        quitDriver();
	    }

}
