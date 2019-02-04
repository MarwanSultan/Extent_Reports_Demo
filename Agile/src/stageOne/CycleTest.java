package stageOne;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CycleTest {

	WebDriver driver;
	// We are going to implement the POM Design Pattern.

	// Define your elements
	@FindBy(id = "uh-search-box")
	WebElement textbox;

	public Object ySearch;

	//// INITIALIZE YOUR ELEMENTS//////////
	public CycleTest

	(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//////////////////////////////////////

	// Write your code and use the methods (WebElements) above.
	public void ySearch(String var) throws InterruptedException {

		for (int i = 0; i < 10; i++) {

			// In the Yahoo search Engine, we will enter the variables from the
			// countrySearchTest.
			textbox.sendKeys(var);
			textbox.sendKeys(Keys.ENTER);

		}

	}
}