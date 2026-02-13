package utils;

import com.aventstack.extentreports.Status;

public class ExtentLogger {

    public static void pass(String message) {
        ExtentTestManager.getTest().log(Status.PASS, message);
    }

    public static void fail(String message) {
        ExtentTestManager.getTest().log(Status.FAIL, message);
    }

    public static void info(String message) {
        ExtentTestManager.getTest().log(Status.INFO, message);
    }

    public static void skip(String message) {
        ExtentTestManager.getTest().log(Status.SKIP, message);
    }

	public static void passed(String message) {
		// TODO Auto-generated method stub
		 ExtentTestManager.getTest().log(Status.FAIL, message);
		
	}

	

		
}

