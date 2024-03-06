package TestScript;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;
import PomScript.RegisterPage;
import PomScript.WelcomePage;

public class RegistrationTest extends BaseClass{

	@Test(dataProvider = "credentials")
	public void testcase(String ft, String ln, String em, String pass,String conpass) {
		WelcomePage w = new WelcomePage(driver);
		w.getRegisterlink().click();
		
		RegisterPage r = new RegisterPage(driver);
		r.getGender().click();
		r.getFirstname().sendKeys(ft);
		r.getLastname().sendKeys(ln);
		r.getEmail().sendKeys(em);
		r.getPassword().sendKeys(pass);
		r.getConfpassword().sendKeys(conpass);		
	    r.getRegisterbutton().click();
		
	}
	
	@DataProvider(name = "credentials")
	public Object[][] data() throws Throwable{
		return ReadExcelUtility.fetchAllData("Sheet2");
	}
}
