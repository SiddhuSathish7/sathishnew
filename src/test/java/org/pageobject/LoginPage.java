package org.pageobject;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUserNam;
	@FindBy(name="password")
	private WebElement txtPass;
	@FindBy(xpath="//input[@id='login']")
	private WebElement btnLogin;
	public WebElement getTxtUserNam() {
		return txtUserNam;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	

}
