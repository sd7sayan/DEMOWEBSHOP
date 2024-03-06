package GenericUtility;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Sayan
 *
 */
public class WebdriverUtility {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select select;
	public static Actions action;
	public static JavascriptExecutor js;
	public static Properties p;
	
	/**
	 * this method is used to navigate to any website
	 * @param url
	 */
	public static void getUrl(String url) {
		driver.get(url);
	}
	/**
	 * this method is used to fetch the current webpage url
	 * @return String
	 */
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	/**
	 * this method is used to get the source code of the webpage
	 * @return String
	 */
	public static String pageSource() {
		return driver.getPageSource();
	}
	/**
	 * this method is used to get the title of webpage
	 * @return String
	 */
	public static String getTitle() {
		return driver.getTitle();
	}
	
	/**
	 * this method is used to get current window id of the webpage
	 * @return String
	 */
	public static String currentWindow() {
		return driver.getWindowHandle();
	}
	
	/**
	 * this method is used to get all window ids of the webpages that are opened by the selenium
	 * @return Set<String>
	 */
	public static Set<String> AllWindow() {
		return driver.getWindowHandles();
	}
	
	/**
	 * this method is used to maximize the window
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	/**
	 * this method is used to go forward to the next page
	 */
	public static void forward() {
		driver.navigate().forward();
	}
	
	/**
	 * this method is used to go back to the previous page
	 */
	public static void back() {
		driver.navigate().back();
	}
	
	/**
	 * this method is used to navigate to any webpage by navigation method
	 * it will not wait for all the elements to be load,it will start working immediately to do next step
	 * @param url
	 */
	public static void toUrl(String url) {
		driver.navigate().to(url);
	}
	
	/**
	 * this method is used to close the window
	 */
	public static void windowClose() {
		driver.close();
	}
	
	/**
	 * this method is used to close all the windows that are opened by the selenium
	 */
	public static void windowQuit() {
		driver.quit();
	}
	
	public static void explicitWait(WebElement element) {
		wait= new WebDriverWait(driver, Duration.ofSeconds(IpathConstant.explicitWaitTime));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void dropdown(int i, WebElement element) {
		select = new Select(element);
		select.selectByIndex(i);
	}
	
	public static void dropdown(String value, WebElement element) {
		select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void dropdown(WebElement element,String visiableText) {
		select = new Select(element);
		select.selectByVisibleText(visiableText);
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IpathConstant.implicitWaitTime));
	}
	public static void switchTo(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void switchTo(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	public static void click(WebElement element) { 
	action = new Actions(driver);
	action.click(element).perform();
	}
	
	public static void click() { 
		action = new Actions(driver);
		action.click().perform();
		}
	
	public static void doubleClick(WebElement element) {
		action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	public static void moveToElement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public static void moveToElement(WebElement element, int x,int y) {
		action = new Actions(driver);
		action.moveToElement(element, x, y).perform();
	}
	public static void moveByOffset(int x, int y) {
		action = new Actions(driver);
		action.moveByOffset(x, y).perform();
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) {
		action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	
	public static void dragAndDrop(WebElement source, int x, int y) {
		action = new Actions(driver);
		action.dragAndDropBy(source, x, y).perform();
	}
	public static void clickAndHold(WebElement element) {
		action = new Actions(driver);
		action.clickAndHold(element).perform();
	}
	
	public static void release(WebElement element) {
		action = new Actions(driver);
		action.release(element).perform();
	}
	
}
