package org.pageobject;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Book extends BaseClass {
	public Book() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="first_name"),@FindBy(name="first_name")})
	private WebElement firstName;
	@FindAll({@FindBy(id="last_name"),@FindBy(xpath="//input[@class='reg_input']")})
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindAll({@FindBy(id="cc_num"),@FindBy(xpath="//input[@type='text']")})
	private WebElement creditCardNo;
	@FindBy(id="cc_type")
	private WebElement creditType;
	@FindAll({@FindBy(name="cc_exp_month"),@FindBy(className="select_combobox2")})
	private WebElement expiryDate;
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	@FindAll({@FindBy(xpath="button"),@FindBy(xpath="//input[@value='Book Now']")})
	private WebElement bookNow;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getCreditType() {
		return creditType;
	}
	public WebElement getExpiryDate() {
		return expiryDate;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBookNow() {
		return bookNow;
	}


}
