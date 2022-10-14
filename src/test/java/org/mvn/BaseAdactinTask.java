package org.mvn;

import java.io.IOException;

import javax.swing.text.Element;

import org.openqa.selenium.WebElement;

public class BaseAdactinTask {
	public static void main(String[] args) throws IOException, Exception {
		BaseAdactinTask baseAdactinTask = new BaseAdactinTask();
		baseAdactinTask.Booking();
	}

	public static void Booking() throws IOException, InterruptedException {
		BaseClass baseclass= new BaseClass();
		baseclass.opendriver();
		baseclass.enterurl("https://adactinhotelapp.com/BookHotel.php");
		baseclass.Maximizewindow();
		WebElement textusrname = baseclass.locatorbyid("username");
	    String name = baseclass.readfromexcel("adactindata", 1, 0);
		baseclass.sendkeys(textusrname, name);	
		
		WebElement pass = baseclass.locatorbyid("password");
		String txt  = baseclass.readfromexcel("adactindata", 1, 1);
		baseclass.sendkeys(pass, txt);
		
		
		WebElement locatorbyid = baseclass.locatorbyid("login");
		baseclass.clickbtn(locatorbyid);
		
		
		WebElement locatorbyid2 = baseclass.locatorbyid("location");
		String location = baseclass.readfromexcel("adactindata", 1, 2);
		
		baseclass.selectByText(locatorbyid2, location);
	
		WebElement locatorbyid3 = baseclass.locatorbyid("hotels");
		String hotels = baseclass.readfromexcel("adactindata", 1, 3);
		
		baseclass.selectByText(locatorbyid3, hotels);
		
		WebElement locatorbyid4 = baseclass.locatorbyid("room_type");
		String room = baseclass.readfromexcel("adactindata", 1, 4);
		
		baseclass.selectByText(locatorbyid4, room);
		
		WebElement locatorbyid5 = baseclass.locatorbyid("room_nos");
		String roomtype = baseclass.readfromexcel("adactindata", 1, 5);
		
		baseclass.selectByText(locatorbyid5, roomtype);
		
		WebElement locatorbyid6 = baseclass.locatorbyid("datepick_in");
		String bookfrom = baseclass.readfromexcel("adactindata", 1, 6);
		baseclass.sendkeys(locatorbyid6, bookfrom);
		
		WebElement locatorbyid7 = baseclass.locatorbyid("datepick_out");
		String booktill = baseclass.readfromexcel("adactindata", 1, 7);
		baseclass.sendkeys(locatorbyid7, booktill);
		

		WebElement locatorbyid8 = baseclass.locatorbyid("adult_room");
		String person = baseclass.readfromexcel("adactindata", 1, 8);
		
		baseclass.selectByText(locatorbyid8, person);
		
		
		WebElement locatorbyid9 = baseclass.locatorbyid("child_room");
		String person1 = baseclass.readfromexcel("adactindata", 1, 9);
		
		baseclass.selectByText(locatorbyid9, person1);
		
		WebElement clk = baseclass.locatorbyid("Submit");
		baseclass.clickbtn(clk);
		
		
		WebElement c = baseclass.locatorbyid("radiobutton_0");
		baseclass.clickbtn(c);
		
		WebElement srcbtn = baseclass.locatorbyid("continue");
		baseclass.clickbtn(srcbtn);
		
		WebElement locatorbyid10 = baseclass.locatorbyid("first_name");
		String frstnm = baseclass.readfromexcel("adactindata", 1, 10);
		baseclass.sendkeys(locatorbyid10, frstnm);
		
		
		WebElement locatorbyid11 = baseclass.locatorbyid("last_name");
		String lasttnm = baseclass.readfromexcel("adactindata", 1, 11);
		baseclass.sendkeys(locatorbyid11, lasttnm);
		
		

		WebElement locatorbyid12 = baseclass.locatorbyid("address");
		String adress = baseclass.readfromexcel("adactindata", 1, 12);
		baseclass.sendkeys(locatorbyid12, adress);
		
		
		WebElement locatorbyid13 = baseclass.locatorbyid("cc_num");
		String creditcard = baseclass.readfromexcel("adactindata", 1, 13);
		baseclass.sendkeys(locatorbyid13, creditcard);
		
		WebElement locatorbyid14 = baseclass.locatorbyid("cc_type");
		String cardtype = baseclass.readfromexcel("adactindata", 1, 14);
		baseclass.sendkeys(locatorbyid14, cardtype);
		
		
		WebElement locatorbyid15 = baseclass.locatorbyid("cc_exp_month");
		String expirymnth = baseclass.readfromexcel("adactindata", 1, 15);
		baseclass.selectByText(locatorbyid15, expirymnth);
		
		WebElement locatorbyid16 = baseclass.locatorbyid("cc_exp_year");
		String expiryyear = baseclass.readfromexcel("adactindata", 1, 16);
		baseclass.selectByText(locatorbyid16, expiryyear);
		
		WebElement locatorbyid17 = baseclass.locatorbyid("cc_cvv");
		String cvvnum = baseclass.readfromexcel("adactindata", 1, 17);
		baseclass.sendkeys(locatorbyid17, cvvnum);
		
		
		WebElement booknw = baseclass.locatorbyid("book_now");
		baseclass.clickbtn(booknw);
		
		Thread.sleep(7000);
		WebElement orderId = baseclass.locatorbyid("order_no");
		String text = baseclass.TextInsert(orderId);
		baseclass.createexcel("adactindata", 1, 18, text);
		
	}}	
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	


