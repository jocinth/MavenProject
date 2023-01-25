package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BaseClass {

	public SelectPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radioButton;
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continueButton;
}
