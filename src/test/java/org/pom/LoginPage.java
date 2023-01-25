package org.pom;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Adactin Launches The Adactin Hotel App! ']")
	private WebElement verification;
	@FindBy(id = "username")
	private WebElement userName;

	public WebElement getVerification() {
		return verification;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(id = "password")
	private WebElement passWord;
	@FindBy(id = "login")
	private WebElement loginButton;
	@FindBy(xpath="//td[text()='Welcome to Adactin Group of Hotels']")
	private WebElement verification1;
	
	public WebElement getVerification1() {
		return verification1;
	}

	public void loginPageVerification() {
		String text = getTextMethod(getVerification());
		System.out.println(text);
		Assert.assertEquals("Login Page Appears", "Adactin Launches The Adactin Hotel App!", text);

	}

	public void loginPageData(String userName, String passWord) {
		//String userName = getData("Adactin1", 0, 0);
		sendKeysMethod(getUserName(), userName);
		//String passWord = getData("Adactin1", 1, 0);
		sendKeysMethod(getPassWord(), passWord);
		clickMethod(getLoginButton());

	}
	
	public void searchHotelPageVerification() {
		String text1 = getTextMethod(getVerification1());
		Assert.assertEquals("Search Hotel Page Appears", "Welcome to Adactin Group of Hotels", text1);

	}

}
