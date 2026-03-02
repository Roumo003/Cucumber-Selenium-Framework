package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Launch_crome {
	
	public static WebDriver driver;

    public static void initDriver() throws InterruptedException {
        driver = new ChromeDriver();
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\baner\\eclipse-workspace\\Cucumber_Framework\\ModuleDrivers");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    public static void quitDriver() {
        driver.quit();
    }
}
