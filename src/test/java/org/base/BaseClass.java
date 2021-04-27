package org.base;

import java.util.List;
import java.util.Set;

import javax.swing.text.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void launchUrl(String data) {
	driver.get(data);
	}
	public void getTitle() {
	driver.getTitle();
	}
	public void getUrl() {
	driver.getCurrentUrl();
	}
	public void enterText(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void buttonClick(WebElement element) {
		element.click();
	}
	public void getText(WebElement element) {
		element.getText();
	}
	public void getAttribute(WebElement element,String data) {
		element.getAttribute(data);
	}
	public void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public void dragAndDrop(WebElement Src, WebElement des) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(Src, des).perform();
	}
	public void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}
	public void rightClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
	}
	public void selectValueByIndex(WebElement element,int number) {
		Select s = new Select(element);
		s.selectByIndex(number);
	}
	public void selectValueByValue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public void selectValueByVisibleText(WebElement element,String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}
	public void getOptionsBySelect(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
	}
	public void getAllOptionsBySelect(WebElement element) {
		Select s = new Select(element);
		s.getAllSelectedOptions();
	}
	public void checkMultiple(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();
	}
	public void getFirstOption(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}
	public void deSelectByIndex(WebElement element,int number) {
		Select s = new Select(element);
		s.deselectByIndex(number);
	}
	public void deSelectByValue(String Value, WebElement element) {
		Select s = new Select(element);
		s.deselectByValue(Value);
	}
	public void deSelectByVisibleText(String data, WebElement element) {
		Select s = new Select(element);
		s.deselectByVisibleText(data);
	}
	public void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}
	public void enterTextByJs(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" +data+ "')", element);
	}
	public void btnClickByJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].Click()", element);
	}
	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	public void switchFrame(String data) {
		driver.switchTo().frame(data);
	}
	public void switchFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchFrame(Integer number) {
		driver.switchTo().frame(number);
	}
	public void frameCount(WebElement element) {
		element.getSize();
	}
	public void takeScreenShot(WebElement element) {
		element.getScreenshotAs(OutputType.FILE);
	}
	public void windowHandle(WebDriver driver) {
		driver.getWindowHandle();
	}
	public void windowHandles(WebDriver driver) {
		driver.getWindowHandles();
	}
	public void switchToWindow(String data) {
		driver.switchTo().window(data);
	}
	public void naviagteUrl(String data) {
		driver.navigate().to(data);
	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	public void keyDown(WebElement element) {
		Actions ac = new Actions(driver);
		ac.keyDown(element,Keys.SHIFT).perform();
	}
	public void keyUp(WebElement element) {
		Actions ac = new Actions(driver);
		ac.keyUp(element, Keys.SHIFT).perform();
	}
	public void simpleAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	public WebElement findElementById(String data) {
		WebElement findElement = driver.findElement(By.id(data));
		return findElement;
	}
	
}
