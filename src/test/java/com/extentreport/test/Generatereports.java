package com.extentreport.test;
import static com.aventstack.extentreports.markuputils.ExtentColor.GREEN;
import static com.aventstack.extentreports.markuputils.ExtentColor.RED;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Generatereports {
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	private static Generatereports ob;
	private Generatereports() {
		
	}
	public static Generatereports getInstance() {
		if(ob==null) {
			ob=new Generatereports();
			}
		return ob;
	}
	public void startExtentReport() {
		htmlReporter = new ExtentHtmlReporter("./extentReport.html");
		extent = new ExtentReports();
		htmlReporter.config().setDocumentTitle("Test Execution Report");
		htmlReporter.config().setReportName("Salesforce Tests");
		htmlReporter.config().setTheme(Theme.STANDARD);
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Environment", "Automation Testing");
		extent.setSystemInfo("User Name", "Sasi Rekha");
	}
	public void startSingleTestReport(String testname) {
		logger=extent.createTest(testname);
	}
	
	public void setSystemInfo(String hostName) {
		extent.setSystemInfo("HostName", hostName);
	}
	public void logTestInfo(String message) {
		logger.log(Status.INFO, message);
	}
	public void logTestPassed(String testcasename) {
		logger.log(Status.PASS,MarkupHelper.createLabel(testcasename+ " has Passed.",GREEN ));
		
	}
	public void logTestFailed(String testcasename) {
		logger.log(Status.FAIL,MarkupHelper.createLabel(testcasename+ " has Failed.",RED ));
	}
	public void endReport() {
		extent.flush();
	}
}
