package org.pom;

import java.io.File;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement numberOfRooms;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkInDate;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOutDate;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultsPerRoom;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childrenPerRoom;
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement searchButton;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public void searchPageData() {
		selectByIndexMethod(getLocation(), 7);
		selectByIndexMethod(getHotel(), 1);
		selectByIndexMethod(getRoomType(), 4);
		selectByIndexMethod(getNumberOfRooms(), 1);
		clearMethod(getCheckInDate());
		sendKeysMethod(getCheckInDate(), "25/12/2022");
		clearMethod(getCheckOutDate());
		sendKeysMethod(getCheckOutDate(), "27/12/2022");
		selectByIndexMethod(getAdultsPerRoom(), 1);
		selectByIndexMethod(getChildrenPerRoom(), 0);
		clickMethod(getSearchButton());

	}
	
	public void selectHotelPageVerification() throws IOException {
		File screenShot = getScreenshotAsAndOutputMethod("SelectHotelPageVerification");

	}
}
