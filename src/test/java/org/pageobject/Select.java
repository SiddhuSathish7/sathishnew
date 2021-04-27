package org.pageobject;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Select extends BaseClass {
	public Select() {
		PageFactory.initElements(driver, this);
	}
	@FindBys({@FindBy(id="radiobutton_0"),@FindBy(xpath="//input[@type='radio']")})
	private WebElement radioButton;
	@FindAll({@FindBy(id="continue"),@FindBy(name="continue")})
	private WebElement cont;
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getCont() {
		return cont;
	}

}
