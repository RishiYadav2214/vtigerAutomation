package com.evs.vtiger.login;

import com.aventstack.extentreports.ExtentTest;
import com.evs.vtiger.login.or.OrLoginPage;
import com.evs.vtiger.webUtil.GenericMethod;

public class LoginPage extends OrLoginPage {

	public LoginPage(GenericMethod gm) {
		super(gm);
	}

	public LoginPage validLogin(ExtentTest extTestLogin) {
		String url=gm.getPropObj().getProperty("Url");
		gm.getDriver().get(url);
		String userName=gm.getPropObj().getProperty("username");
		String userPassword=gm.getPropObj().getProperty("password");
		String logTheme=gm.getPropObj().getProperty("loginTheme");
		String logLanguage=gm.getPropObj().getProperty("language");
		System.out.println(uName_ED);
		gm.inputData(uName_ED, userName,extTestLogin,"Value inputed Successfully");
		gm.inputData(uPassword_ED, userPassword,extTestLogin,"Value inputed Successfully");
		gm.selectByVisibleText(colorTheme_DD, logTheme,"VisibleText is selected successfully");
		gm.selectByValue(language_DD, logLanguage,"Value is selected successfully");
		gm.click(save_BTN,extTestLogin,"Element Clicked Successfully");
	return this;
	}
	
	
	

}
