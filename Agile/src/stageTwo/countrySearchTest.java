package stageTwo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import stageOne.CycleTest;

public class countrySearchTest extends baseTestroot {
	// Declare the objects that will be used in this class.

	CycleTest ct;

	int i;

	// We will use the Dataproviders annotation to implement DDT.
	@DataProvider(name = "Countries")
	public static Object[][] credentials() {
		return new Object[][] { { "Austrailia" }, { "Sweeden" }, { "Kenya" } };
	}

	// For this one test we are using POM and capturing elements from the
	// "yahooElements" class.
	@Test(dataProvider = "Countries")
	public void testMethod1(String var) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			ct.ySearch(var);
			Thread.sleep(500);

		}
	}

	@Test
	public void Failure() throws InterruptedException {
		CycleTest ct = new CycleTest(driver);
		ct.ySearch("red");
	}

}
