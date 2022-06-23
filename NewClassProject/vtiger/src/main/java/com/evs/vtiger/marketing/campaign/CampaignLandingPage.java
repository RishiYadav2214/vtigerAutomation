package com.evs.vtiger.marketing.campaign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.evs.vtiger.webUtil.GenericMethod;

public class CampaignLandingPage {
	private GenericMethod gm;
	private ExtentTest extTest;
	public CampaignLandingPage(GenericMethod gm) {
		this.gm=gm;
		PageFactory.initElements(gm.getDriver(), this);
		
	}
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement createCampaign_BT;
	
	
	public void createcampaignButton() {
		gm.click(createCampaign_BT,extTest,"Element clicked Successfully");
	}
		
	
}
