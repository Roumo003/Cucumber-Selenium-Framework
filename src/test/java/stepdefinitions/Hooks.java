package stepdefinitions;


import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.*;
import utils.ExtendReporter;
import utils.ExtentTestManager;
import utils.ScreenshotUtil;
import Base.Launch_crome;


public class Hooks {
	
	private static ExtentReports extent = ExtendReporter.getInstance();
	private WebDriver driver;
	public static ExtentTest test;

    @Before
    public void beforeScenario(Scenario scenario) {

        ExtentTest test = extent.createTest(scenario.getName());
        ExtentTestManager.setTest(test);
    }

    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            ExtentTestManager.getTest().fail("Scenario Failed");
        } else {
            ExtentTestManager.getTest().pass("Scenario Passed");
        }

        extent.flush();
    }
    
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            String screenshotPath = ScreenshotUtil.captureScreenshot(driver, scenario.getName());

            test.fail("Test Failed")
                .addScreenCaptureFromPath(screenshotPath);

        } else {

            String screenshotPath = ScreenshotUtil.captureScreenshot(driver, scenario.getName());

            test.pass("Test Passed")
                .addScreenCaptureFromPath(screenshotPath);
        }

        extent.flush();
        driver.quit();
    }

}
