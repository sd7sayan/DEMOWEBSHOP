package GenericUtility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass extends WebdriverUtility {
	
	@BeforeSuite
	public void connectToTheServer() {
		Reporter.log("connecting to the server", true);
	}

	@BeforeTest
	public void connectToTheDatabase() {
		Reporter.log("connecting to the database", true);
	}

	@BeforeClass
	public void opneningTheBrowser() throws Throwable {
		Reporter.log("brower is opening", true);
		driver= new ChromeDriver();
		maximize();
		implicitWait();
		String URL = PropertyFileUtility.fetchData("url");
		getUrl(URL);
		
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("login to application",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("connecting to the server", true);
		
	}

	@AfterClass
	public void closingTheBrowser() {
		Reporter.log("browser is closing", true);
		
	}

	@AfterTest
	public void disconnectToTheDatabase() {
		Reporter.log("disconnecting from the data base", true);
	}

	@AfterSuite
	public void disconnectToTheServer() {
		Reporter.log("disconnecting to the server", true);
	}

}
