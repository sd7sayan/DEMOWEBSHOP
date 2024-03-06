package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{

	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}
	

}
