package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "gender-male")
	private WebElement gender;
	
	@FindBy(id = "FirstName")
	private WebElement firstname;
	
	@FindBy(id = "LastName")
	private WebElement lastname;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}

	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confpassword;
	
	@FindBy(id = "register-button")
	private WebElement registerbutton;

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfpassword() {
		return confpassword;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}

}
