package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {
	
	
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	public void loginCommonSteps(String username,String password) {
		
		elementSendKeys(getTxtUsername(), username);
		elementSendKeys(getTxtPassword(), password);
				
	}
	public void login(String username,String password) {
		loginCommonSteps(username, password);
		elementclick(getBtnLogin());
	}
public void loginWithEnter(String username,String password) throws AWTException {
		
		loginCommonSteps(username, password);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	



}
	
	
	
	
	
}
