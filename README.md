Extent Reports Demo
Project Description
The Extent Reports Demo project showcases the integration of Extent Reports into a test automation framework. Extent Reports is a flexible and easy-to-use reporting library for automated tests, enabling the generation of interactive and detailed reports that enhance the visibility of test executions.

Features
Emailable Reports: Generate comprehensive reports that can be emailed to stakeholders.

Full Page Screenshots: Attach full-page screenshots in base64 format to reports for better visualization.

Custom Logging: Integrate JUL-based info logs into reports for detailed test execution insights.

Technologies & Tools Used
Programming Language: Java

Build Tool: Maven

Testing Framework: TestNG

WebDriver Manager: WebDriverManager

Reporting Library: ExtentReports

Project Structure
bash
Copy
Edit
├── src
│   ├── main
│   │   ├── java
│   │   │   └── test
│   │   │       └── TestClass.java      # Sample test class demonstrating Extent Reports usage
│   └── resources
│       ├── extent.properties            # Configuration file for Extent Reports
│       └── testng.xml                  # TestNG configuration file
├── pom.xml                             # Maven build configuration
├── README.md                           # Project documentation
Installation & Setup
Prerequisites
Java: Ensure Java is installed on your system.

Maven: Install Maven for project build and dependency management.

Steps to Set Up the Project
Clone the Repository:

bash
Copy
Edit
git clone https://github.com/MarwanSultan/Extent_Reports_Demo.git
Navigate to the Project Directory:

bash
Copy
Edit
cd Extent_Reports_Demo
Install Dependencies and Build the Project:

bash
Copy
Edit
mvn clean install
Run the Tests:

Execute the tests using Maven:

bash
Copy
Edit
mvn test
This command will run the tests as per the configuration in testng.xml.

Usage Guide
Configuring Extent Reports
Create extent.properties:

In the src/test/resources directory, create an extent.properties file with the following content:

ini
Copy
Edit
# Spark Reporter Configuration
extent.reporter.spark.start=true
extent.reporter.spark.out=target/extent-reports/Index.html

# System Information
systeminfo.Author=Your Name
This configuration sets up the Spark reporter to generate reports in the specified location and includes author information.

Configure TestNG Listener:

In your testng.xml, add the Extent Reports listener:

xml
Copy
Edit
<listeners>
    <listener class-name="com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter" />
</listeners>
This ensures that Extent Reports captures the test execution details during the TestNG run.

Implement Test Class:

Create your test classes in the src/test/java/test directory. Here's an example of a test class utilizing Extent Reports:

java
Copy
Edit
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestClass {

    private WebDriver driver;
    private By usernameTextBox = By.id("txtUsername");
    private By passwordTextBox = By.id("txtPassword");
    private By logInButton = By.id("btnLogin");

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void testLogin() {
        driver.findElement(usernameTextBox).sendKeys("Admin");
        driver.findElement(passwordTextBox).sendKeys("admin123");
        driver.findElement(logInButton).click();
        assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
Replace "path/to/chromedriver" with the actual path to your ChromeDriver executable.

Contributing
Contributions are welcome! To contribute:

Fork the repository.

Create a new feature branch (feature-branch-name).

Implement your changes and commit them.

Push your changes to your fork.

Submit a pull request detailing your changes.

License
This project is licensed under the MIT License.

Author
Marwan Sultan

LinkedIn

Email: marwan.sultan@gmail.com

