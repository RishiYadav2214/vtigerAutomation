package com.evs.vtiger.marketing.campaign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.evs.vtiger.marketing.campaignOr.campaignCommonOr;
import com.evs.vtiger.webUtil.GenericMethod;

public class CampaignCreatePage extends campaignCommonOr {
	private GenericMethod gm;
	private ExtentTest extTestObj; 
	public CampaignCreatePage(GenericMethod gm) {
		this.gm = gm;
		PageFactory.initElements(gm.getDriver(), this);

	}

	@FindBy(xpath = "//input[@name='campaignname']")
	public WebElement campName_EB;
	@FindBy(xpath = "//select[@name='campaigntype']")
	public WebElement campType_ED;
	@FindBy(xpath = "//input[@id='targetaudience']")
	public WebElement tarAudience_ED;
	@FindBy(xpath="//input[@id='sponsor']")
	public WebElement sponcer_ED;
	@FindBy(xpath="//input[@id='numsent']")
	public WebElement numSent_ED;
	@FindBy(xpath="//select[@name='campaignstatus']")
	public WebElement campStatus_ED;
	@FindBy(xpath="//input[@id='targetsize']")
	public WebElement tarSize_ED;
	@FindBy(xpath="//input[@id='actualcost']")
	public WebElement actCost_ED;
	@FindBy(xpath="//input[@id='expectedrevenue']")
	public WebElement expRevenue_ED;
	@FindBy(xpath="//input[@id='actualsalescount']")
	public WebElement actSalesCount_ED;
	@FindBy(xpath="//input[@id='actualresponsecount']")
	public WebElement actRespoCount_ED;
	@FindBy(xpath="//input[@id='actualroi']")
	public WebElement actRoi_ED;
	@FindBy(xpath="//input[@id='budgetcost']")
	public WebElement budgetCost_ED;
	@FindBy(xpath="//select[@name='expectedresponse']")
	public WebElement expResponce_ED;
	@FindBy(xpath="//input[@id='expectedsalescount']")
	public WebElement expSalesCount_ED;
	@FindBy(xpath="//input[@id='expectedresponsecount']")
	public WebElement expRespoCount_ED;
	@FindBy(xpath="//input[@id='expectedroi']")
	public WebElement expRoi_ED;
	@FindBy(xpath="//textarea[@name='description']")
	public WebElement description_ED;	
	

	public void campaignTotalInfo() {
		gm.inputData(campName_EB, "Rishu",extTestObj,"Value inputed Successfully");
		gm.selectByIndex(campType_ED, 7,"Index value is selected successfully");
		gm.inputData(tarAudience_ED, "Virat Kohli",extTestObj,"Value inputed Successfully");
		gm.inputData(sponcer_ED, "Tata Birala group of industry",extTestObj,"Value inputed Successfully");
		gm.inputData(numSent_ED, "721602120000835",extTestObj,"Value inputed Successfully");
		gm.selectByIndex(campStatus_ED, 2,"Index value is selected successfully");
		gm.inputData(tarSize_ED, "5000",extTestObj,"Value inputed Successfully");
		gm.inputData(actCost_ED, "785489",extTestObj,"Value inputed Successfully");
		gm.inputData(expRevenue_ED, "2781856",extTestObj,"Value inputed Successfully");
		gm.inputData(actSalesCount_ED, "155875",extTestObj,"Value inputed Successfully");
		gm.inputData(actRespoCount_ED, "1005464",extTestObj,"Value inputed Successfully");
		gm.inputData(actRoi_ED, "10000000",extTestObj,"Value inputed Successfully");
		gm.inputData(budgetCost_ED, "450000",extTestObj,"Value inputed Successfully");
		gm.selectByIndex(expResponce_ED, 1,"Index value is selected successfully");
		gm.inputData(expSalesCount_ED, "25000",extTestObj,"Value inputed Successfully");
		gm.inputData(expRespoCount_ED, "24800",extTestObj,"Value inputed Successfully");
		gm.inputData(expRoi_ED, "34525",extTestObj,"Value inputed Successfully");
		gm.inputData(description_ED, "This form fillup by Rishi Yadav.",extTestObj,"Value inputed Successfully");
		

	}
	public void saveBtn() {
		gm.click(commonSaveBtn,extTestObj,"Element Clickable Successfully");
	}

}
