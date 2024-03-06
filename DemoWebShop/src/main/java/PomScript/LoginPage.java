package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Log in']")
	private WebElement loginbutton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return pass;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void loginFunction() {
	
		email.sendKeys("sayan7.sd@gmail.com");
		pass.sendKeys("Sd@13011997");
		loginbutton.click();
	}

}
