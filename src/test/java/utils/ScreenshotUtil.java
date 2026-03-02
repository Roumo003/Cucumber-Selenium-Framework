package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {
	
	   public static String captureScreenshot(WebDriver driver, String name) {

	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);

	        String path = "reports/screenshots/" + name + ".png";
	        File dest = new File(path);

	        try {
	            FileUtils.copyFile(src, dest);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return path;
	    }

}
