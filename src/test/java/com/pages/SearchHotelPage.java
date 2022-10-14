package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage extends BaseClass {
	
	
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnRoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckIn;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOut;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultRoom;
	
	@FindBy(id="adult_room")
	private WebElement dDnChildRoom;
	
	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}


	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	public WebElement getdDnHotels() {
		return dDnHotels;
	}
	
	public void searchHotel(String location,String hotel,String roomType,String roomNo,String checkIn,String checkout,String adultRoom,String childRoom ) {
		
		selectByText(getdDnLocation(), location);
		selectByText(getdDnHotels(), hotel);
		selectByText(getdDnRoomType(), roomType);
		selectByText(getdDnRoomNos(), roomNo);
		elementSendKeys(getTxtCheckIn(), checkIn);
		elementSendKeys(getTxtCheckOut(), checkout);
		selectByText(getdDnRoomNos(), adultRoom);
		elementclick(getBtnSubmit());	
	}
	
	
public void searchHotel(String location,String roomNo,String checkIn,String checkout,String adultRoom ) {
		
		selectByText(getdDnLocation(), location);
		selectByText(getdDnRoomNos(), roomNo);
		elementSendKeys(getTxtCheckIn(), checkIn);
		elementSendKeys(getTxtCheckOut(), checkout);
		selectByText(getdDnRoomNos(), adultRoom);
		elementclick(getBtnSubmit());	
	}
	
	
	
	
	
	
	
	
	
	
	

}
