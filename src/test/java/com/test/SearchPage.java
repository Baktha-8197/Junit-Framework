package com.test;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.test.BaseClass;

public class SearchPage extends BaseClass{

	public SearchPage() {
PageFactory.initElements(driver,this);	
}
	
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnRoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
}
