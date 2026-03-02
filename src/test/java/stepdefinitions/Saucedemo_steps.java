package stepdefinitions;

import Base.Launch_crome;
import Base.Saucedemo;
import io.cucumber.java.en.*;
import utils.ExtentLogger;

import org.testng.Assert;

public class Saucedemo_steps extends Saucedemo {
	
	Saucedemo sd = new Saucedemo();
	Launch_crome obj = new Launch_crome();
	
	@Given("I am on the SauceDemo website")
	public void i_am_on_the_sauce_demo_website() throws InterruptedException {
		sd.initDriver();
		sd.i_am_on_the_sauce_demo_website();
	}
	@When("I enter the username {string}")
	public void i_enter_the_username(String string) {
		sd.i_enter_the_username(string);
	}
	@And("I enter the password {string}")
	public void i_enter_the_password(String string) {
	    sd.i_enter_the_password(string);
	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    sd.i_click_on_the_login_button();
	}
	
	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	   sd.i_should_be_logged_in_successfully();
	   sd.quitDriver();
	}

}
