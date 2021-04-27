package org.integration;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IntegrationFacebook extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		BaseClass bc = new BaseClass();
		bc.getDriver();
		bc.launchUrl("https://www.facebook.com/");
		bc.enterText(driver.findElement(By.id("email")), "sathish");
		bc.enterText(driver.findElement(By.id("pass")), "sathish");
		bc.buttonClick(driver.findElement(By.name("login")));
		bc.navigateBack();
		driver.navigate().back();
		bc.buttonClick(driver.findElement(By.xpath("(//a[@role='button'])[2]")));
		Thread.sleep(3000);
		bc.enterText(driver.findElement(By.name("firstname")), "Sathish");
		bc.getAttribute(driver.findElement(By.name("firstname")), "Sathish");
		System.out.println();
		bc.enterText(driver.findElement(By.name("lastname")), "kumar");
		bc.enterText(driver.findElement(By.name("reg_email__")), "9876543210");
		bc.enterText(driver.findElement(By.name("reg_passwd__")), "sathish");
		Thread.sleep(2000);
		bc.selectValueByIndex(driver.findElement(By.id("day")), 24);
		bc.selectValueByValue(driver.findElement(By.id("month")), "11");
		bc.getText(driver.findElement(By.id("month")));
		bc.selectValueByVisibleText(driver.findElement(By.id("year")), "1993");
		bc.buttonClick(driver.findElement(By.xpath("//label[text()='Male']")));
		Thread.sleep(3000);
		bc.buttonClick(driver.findElement(By.name("websubmit")));
	}

}
