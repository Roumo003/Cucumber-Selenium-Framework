package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Xpath.Saucedeom_xpath;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdefinitions.Saucedemo_steps;
import utils.ExtentLogger;


public class Saucedemo  {
	public static WebDriver driver = null;
	
	public static void initDriver() throws InterruptedException {
        driver = new ChromeDriver();
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\baner\\eclipse-workspace\\Cucumber_Framework\\ModuleDrivers");
        driver.manage().window().maximize();
        Thread.sleep(2000);
	}
	 public static void quitDriver() {
	        driver.quit();
	    }
	public void i_am_on_the_sauce_demo_website() throws InterruptedException {
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		String title = driver.findElement(By.xpath(Saucedeom_xpath.Swaglabs_header)).getText();
		
		if (title.equals("Swag Labs")) {
			ExtentLogger.pass("Title matched: " + title);
		} else {
			ExtentLogger.fail("Title did not match. Actual: " + title);
		}
	}

	public void i_enter_the_username(String string) {
		driver.findElement(By.xpath(Saucedeom_xpath.Usernasme_Input_field)).sendKeys("standard_user");
	}
	public void i_enter_the_password(String string)
	{
		driver.findElement(By.xpath(Saucedeom_xpath.Password_Input_field)).sendKeys("secret_sauce");
	}
	public void i_click_on_the_login_button() {	
	driver.findElement(By.xpath(Saucedeom_xpath.Login_button)).click();
	}
	public void i_should_be_logged_in_successfully() {
		String title = driver.findElement(By.xpath(Saucedeom_xpath.Products_header)).getText();
		if (title.equals("Products")) {
			ExtentLogger.pass("Succesfully loggedin to Saucedemo website" + title);
		} else {
			ExtentLogger.fail("Unable to login to Saucedemo website" + title);
		}
	}
	
	
	

	

}
