package org.pageobject;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search extends BaseClass {
	 public Search() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement loc;
	@FindAll({@FindBy(id="hotels"),@FindBy(name="hotels")})
	private WebElement hotel;
	@FindAll({@FindBy(id="room_type"),@FindBy(xpath="//select[@class='search_combobox']")})
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement noOfRoom;
	@FindAll({@FindBy(className="date_pick"),@FindBy(id="datepick_in")})
	private WebElement CheckInDate;
	@FindAll({@FindBy(name="datepick_out"),@FindBy(className="date_pick")})
	private WebElement checkOutDate;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultsPerRoom;
	@FindAll({@FindBy(id="child_room"),@FindBy(name="child_room")})
	private WebElement childPerRoom;
	@FindBy(id="Submit")
	private WebElement submit;
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNoOfRoom() {
		return noOfRoom;
	}
	public WebElement getCheckInDate() {
		return CheckInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	


}
