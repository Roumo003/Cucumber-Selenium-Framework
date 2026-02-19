package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface launch_browser {
	public static WebDriver driver = null;

    public static void initDriver() throws InterruptedException {
    	WebDriver driver = null;
        driver = new ChromeDriver();
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\baner\\eclipse-workspace\\Cucumber_Framework\\ModuleDrivers");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    public static void quitDriver() {
        driver.quit();
    }

}
