package stageOne;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTest {

	@Test
	public void Reporting() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(
				"C:\\Users\\marwa\\eclipse-workspace\\Agile\\ExtentReports\\Results.html");
		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		ExtentTest logger = extent.createTest("countrySearchTest");

		logger.log(com.aventstack.extentreports.Status.INFO, "login to yahoo");
		logger.log(com.aventstack.extentreports.Status.PASS, "Passed Test");

		extent.flush();

		System.out.println("PASSED");

	}

	@Test
	public void Reportipg() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(
				"C:\\Users\\marwa\\eclipse-workspace\\Agile\\ExtentReports\\Results.html");
		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		ExtentTest logger = extent.createTest("countrySoarchTest");

		logger.log(com.aventstack.extentreports.Status.INFO, "login to yahoo");
		logger.log(com.aventstack.extentreports.Status.PASS, "Passed Test");

		extent.flush();

		System.out.println("PASSED");

	}
}
