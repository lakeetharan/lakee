package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCCNum;
	
	@FindBy(id="cc_type")
	private WebElement dDnCCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnCCExmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnCCExYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id="book_now")
	private WebElement btnBook;
	
	@FindBy(id="order_no")
	private WebElement attOrderId;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNum() {
		return txtCCNum;
	}

	public WebElement getdDnCCType() {
		return dDnCCType;
	}

	public WebElement getdDnCCExmonth() {
		return dDnCCExmonth;
	}

	public WebElement getdDnCCExYear() {
		return dDnCCExYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

	public WebElement getAttOrderId() {
		return attOrderId;
	}
	
	public String bookHotel(String firstName,String lastName,String address,String ccNum,String ccType,
			String ccMonth,String ccYear,String cvv) {
		
		elementSendKeys(getTxtFirstName(), firstName);
		elementSendKeys(getTxtLastName(), lastName);
		elementSendKeys(getTxtAddress(), address);
		elementSendKeys(getTxtCCNum(), ccNum);
		selectByText(getdDnCCType(), ccType);
		selectByText(getdDnCCExmonth(), ccMonth);
		selectByText(getdDnCCExYear(), ccYear);
		elementSendKeys(getTxtCvv(), cvv);
		elementclick(getBtnBook());
		implicityWait(10);
		String orderId = TextInsert(getAttOrderId());
		System.out.println(orderId);
		return orderId;
		
		
	}
	
	
	
	
}
