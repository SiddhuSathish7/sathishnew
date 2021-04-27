package org.pageobject;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObjectModel extends BaseClass{
	public static void main(String[] args) {
		BaseClass bc=new BaseClass();
		bc.getDriver();
		bc.launchUrl("https://adactinhotelapp.com/");
		LoginPage l = new LoginPage();
		WebElement txtUserNam = l.getTxtUserNam();
		bc.enterText(txtUserNam, "sathish");
		WebElement txtPass = l.getTxtPass();
		bc.enterText(txtPass, "sathish");
		WebElement btnLogin = l.getBtnLogin();
		bc.buttonClick(btnLogin);
		driver.navigate().refresh();
		bc.enterText(txtUserNam, "karthi007");
		bc.enterText(txtPass, "Karthi@1989");
		bc.buttonClick(btnLogin);
		Search s = new Search();
		WebElement loc = s.getLoc();
		bc.selectValueByIndex(loc, 1);
		WebElement hotel = s.getHotel();
		bc.selectValueByValue(hotel, "Hotel Sunshine");
		WebElement room = s.getRoom();
		bc.selectValueByValue(room, "Super Deluxe");
		WebElement noOfRoom = s.getNoOfRoom();
		bc.selectValueByIndex(noOfRoom, 2);
		WebElement checkInDate = s.getCheckInDate();
		bc.enterText(checkInDate, "24/04/2021");
		WebElement checkOutDate = s.getCheckOutDate();
		bc.enterText(checkOutDate, "25/04/2021");
		WebElement adultsPerRoom = s.getAdultsPerRoom();
		bc.selectValueByIndex(adultsPerRoom, 2);
		WebElement childPerRoom = s.getChildPerRoom();
		bc.selectValueByIndex(childPerRoom, 1);
		WebElement submit = s.getSubmit();
		bc.buttonClick(submit);
		org.pageobject.Select se = new org.pageobject.Select();
		WebElement radioButton = se.getRadioButton();
		bc.buttonClick(radioButton);
		WebElement cont = se.getCont();
		bc.buttonClick(cont);
		Book bk = new Book();
		WebElement firstName = bk.getFirstName();
		bc.enterText(firstName, "Sathish");
		WebElement lastName = bk.getLastName();
		bc.enterText(lastName, "kumar");
		WebElement address = bk.getAddress();
		bc.enterText(address, "Chennai,India");
		WebElement creditCardNo = bk.getCreditCardNo();
		bc.enterText(creditCardNo, "9876543211234567");
		WebElement creditType = bk.getCreditType();
		bc.selectValueByIndex(creditType, 3);
		WebElement expiryDate = bk.getExpiryDate();
		bc.selectValueByIndex(expiryDate, 11);
		WebElement expiryYear = bk.getExpiryYear();
		bc.selectValueByValue(expiryYear, "2022");
		WebElement cvvNumber = bk.getCvvNumber();
		bc.enterText(cvvNumber, "999");
		WebElement bookNow = bk.getBookNow();
		bc.buttonClick(bookNow);
		
		
		}

}
