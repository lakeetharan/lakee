package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass{
	public CancelBookingPage() {
		
		PageFactory.initElements(driver, this);

		
	}
	
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement lnkBookingIter;
	
	
	@FindBy(xpath="//input[contains(@id,'btn_id_')]")
	private WebElement orderId;

	
	

	@FindBy(id="order_id_text")
	private WebElement txtSerach;

	
	@FindBy(id="search_hotel_id")
	private WebElement btnSearch;

	
	public WebElement getTxtSerach() {
		return txtSerach;
	}



	public WebElement getBtnSearch() {
		return btnSearch;
	}



	public WebElement getLnkBookingIter() {
		return lnkBookingIter;
	}

	

	public WebElement getOrderId() {
		return orderId;
	}

	
		
	public void cancel(String order) throws InterruptedException {
		
	elementclick(getLnkBookingIter());
	elementSendKeys(getTxtSerach(), order);
	elementclick(getBtnSearch());
	elementclick(getOrderId());
	Thread.sleep(5000);
	acceptAlert();
		
	}
}
