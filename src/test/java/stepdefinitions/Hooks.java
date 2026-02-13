package stepdefinitions;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.*;
import utils.ExtendReporter;
import utils.ExtentTestManager;

public class Hooks {
	
	private static ExtentReports extent = ExtendReporter.getInstance();

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

}
