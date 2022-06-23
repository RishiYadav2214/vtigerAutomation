package com.evs.vtiger.sales.account;

import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.evs.vtiger.sales.accountOr.AccountCommonOr;
import com.evs.vtiger.webUtil.GenericMethod;

public class AccountCreatePage extends AccountCommonOr {
public GenericMethod gm;
public ExtentTest extTestObj;
public AccountCreatePage(GenericMethod gm) {
	this.gm=gm;
	PageFactory.initElements(gm.getDriver(), this);
}






}
