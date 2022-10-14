package org.mvn;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactinDailyTask extends BaseClass {
	
	@BeforeClass
	public static void beforeclass() {
		
		opendriver();
		enterurl("https://adactinhotelapp.com/BookHotel.php");
		Maximizewindow();	
		
	}
	@Test
	public void login() throws IOException, InterruptedException {
		
		WebElement textusrname = locatorbyid("username");
	    String name = readfromexcel("adactindata", 1, 0);
		sendkeys(textusrname, name);	
		
		WebElement pass = locatorbyid("password");
		String txt  = readfromexcel("adactindata", 1, 1);
	    sendkeys(pass, txt);
		
		
		WebElement locatorbyid = locatorbyid("login");
		clickbtn(locatorbyid);
		
		
		WebElement locatorbyid2 = locatorbyid("location");
		String location = readfromexcel("adactindata", 1, 2);
		
		selectByText(locatorbyid2, location);
	
		WebElement locatorbyid3 = locatorbyid("hotels");
		String hotels = readfromexcel("adactindata", 1, 3);
		
		selectByText(locatorbyid3, hotels);
		
		WebElement locatorbyid4 = locatorbyid("room_type");
		String room = readfromexcel("adactindata", 1, 4);
		
		selectByText(locatorbyid4, room);
		
		WebElement locatorbyid5 = locatorbyid("room_nos");
		String roomtype = readfromexcel("adactindata", 1, 5);
		
		selectByText(locatorbyid5, roomtype);
		
		WebElement locatorbyid6 = locatorbyid("datepick_in");
		String bookfrom = readfromexcel("adactindata", 1, 6);
		sendkeys(locatorbyid6, bookfrom);
		
		WebElement locatorbyid7 = locatorbyid("datepick_in");
		String booktill = readfromexcel("adactindata", 1, 7);
		sendkeys(locatorbyid7, booktill);
		

		WebElement locatorbyid8 = locatorbyid("adult_room");
		String person = readfromexcel("adactindata", 1, 8);
		
		selectByText(locatorbyid8, person);
		
		
		WebElement locatorbyid9 = locatorbyid("child_room");
		String person1 = readfromexcel("adactindata", 1, 9);
		
		selectByText(locatorbyid9, person1);
		
		WebElement clk = locatorbyid("Submit");
		clickbtn(clk);
		
		
		WebElement c = locatorbyid("radiobutton_0");
		clickbtn(c);
		
		WebElement srcbtn = locatorbyid("continue");
		clickbtn(srcbtn);
		
		WebElement locatorbyid10 = locatorbyid("first_name");
		String frstnm = readfromexcel("adactindata", 1, 10);
		sendkeys(locatorbyid10, frstnm);
		
		
		WebElement locatorbyid11 = locatorbyid("last_name");
		String lasttnm = readfromexcel("adactindata", 1, 11);
		sendkeys(locatorbyid11, lasttnm);
		
		

		WebElement locatorbyid12 = locatorbyid("address");
		String adress = readfromexcel("adactindata", 1, 12);
		sendkeys(locatorbyid12, adress);
		
		
		WebElement locatorbyid13 = locatorbyid("cc_num");
		String creditcard = readfromexcel("adactindata", 1, 13);
		sendkeys(locatorbyid13, creditcard);
		
		WebElement locatorbyid14 = locatorbyid("cc_type");
		String cardtype = readfromexcel("adactindata", 1, 14);
		sendkeys(locatorbyid14, cardtype);
		
		
		WebElement locatorbyid15 = locatorbyid("cc_exp_month");
		String expirymnth = readfromexcel("adactindata", 1, 15);
		selectByText(locatorbyid15, expirymnth);
		
		WebElement locatorbyid16 = locatorbyid("cc_exp_year");
		String expiryyear = readfromexcel("adactindata", 1, 16);
		selectByText(locatorbyid16, expiryyear);
		
		WebElement locatorbyid17 = locatorbyid("cc_cvv");
		String cvvnum = readfromexcel("adactindata", 1, 17);
		sendkeys(locatorbyid17, cvvnum);
		
		
		WebElement booknw = locatorbyid("book_now");
		clickbtn(booknw);
		
		Thread.sleep(7000);
		WebElement orderId = locatorbyid("order_no");
		String text = TextInsert(orderId);
		System.out.println(text);
		createexcel("adactindata", 1, 18, text);
		System.out.println(text);
		System.out.println(text);

	
	
	
		
	}
	@Ignore
	@Test
public  void close() {
		closewindow();
		
	

}
	
}
