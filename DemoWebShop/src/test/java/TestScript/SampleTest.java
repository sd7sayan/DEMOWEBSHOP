package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomScript.LoginPage;
import PomScript.WelcomePage;

public class SampleTest extends BaseClass {

	@Test(dataProvider = "credentials")
	public static void loginToDemoWeb() {
		WelcomePage w = new WelcomePage(driver);
		w.getLoginlink().click();

		LoginPage l = new LoginPage(driver);
		l.loginFunction();
		Reporter.log("successful", true);
	}
}
