package com.evs.vtiger.login.or;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.webUtil.GenericMethod;

public class OrLoginPage {
	protected GenericMethod gm;
	public OrLoginPage(GenericMethod gm) {
		this.gm=gm;
		PageFactory.initElements(gm.getDriver(), this);
	}
	@FindBy(xpath = "//input[@name='user_name']")
	protected WebElement uName_ED;
	@FindBy(xpath = "//input[@name='user_password']")
	protected WebElement uPassword_ED;
	@FindBy(xpath = "//select[@name='login_theme']")
	protected WebElement colorTheme_DD;
	@FindBy(xpath = "//select[@name='login_language']")
	protected WebElement language_DD;
	@FindBy(xpath = "//input[@alt='Login [Alt+L]']")
	protected WebElement save_BTN;
	
	
	
}
