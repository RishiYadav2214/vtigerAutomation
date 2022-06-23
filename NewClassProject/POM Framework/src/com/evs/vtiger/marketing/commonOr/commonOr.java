package com.evs.vtiger.marketing.commonOr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class commonOr {

	@FindBy(xpath = "//input[@name='assigntype']/parent::td/parent::tr/following-sibling::tr//input[@title='Save [Alt+S]']")
	protected  WebElement 	commonSaveBtn;
}
