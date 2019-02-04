package stageTwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTestroot {

	WebDriver driver;

	@BeforeMethod()

	public void initialize() throws InterruptedException {
		/// We will use chromedriver for our browser.
		driver = new ChromeDriver();

		// Navigate to yahoo.com.
		driver.get("https://www.yahoo.com");

		// Maximize the browser.
		driver.manage().window().fullscreen();

	}

	@AfterMethod

	public void afterMethod() {
		// Print a message of a passed test if the test passes.
		System.out.println("PASSED TEST");

		// Close the browser.
		driver.close();

	}

}
