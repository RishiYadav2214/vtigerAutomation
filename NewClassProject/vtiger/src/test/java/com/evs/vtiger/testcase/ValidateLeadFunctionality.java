package com.evs.vtiger.testcase;

import org.testng.annotations.Test;

import com.evs.vtiger.home.HomePage;
import com.evs.vtiger.marketing.campaign.CampaignCreatePage;
import com.evs.vtiger.marketing.campaign.CampaignLandingPage;
public class ValidateLeadFunctionality extends BasePage {
	@Test(groups= {"smoke"})
	public void validateCreateAccount() {
		HomePage hPage = new HomePage(gm);
		hPage.gotoSalesAccount();
		gm.snapshot();
	
	}

	@Test(groups= {"retesting"})
	public void validateCreateCampaign() {
		HomePage hPage = new HomePage(gm);
		hPage.gotoCampaigns();
		CampaignLandingPage campLandPage = new CampaignLandingPage(gm);
		campLandPage.createcampaignButton();
		CampaignCreatePage campCreatePage = new CampaignCreatePage(gm);
		campCreatePage.campaignTotalInfo();
		campCreatePage.saveBtn();

	}
}
