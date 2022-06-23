package com.evs.vtiger.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.evs.vtiger.homePage.or.OrHomePage;

public class HomePage extends OrHomePage {
	private com.evs.vtiger.webUtil.GenericMethod gm;
	private ExtentTest extTest;
	
	public HomePage(com.evs.vtiger.webUtil.GenericMethod gm) {
		this.gm=gm;
		
		PageFactory.initElements(gm.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='Marketing']")
	private WebElement weMarketingMouseOver;
	@FindBy(xpath = "//a[text()='Sales']")
	private WebElement weSalesMouseOver;
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Campaigns']")
	private WebElement campaign_BT;
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Leads']")
	private WebElement leads_BT;
	@FindBy(xpath="//div[@id='Sales_sub']//a[text()='Accounts']")
	private WebElement account_BT;
	
	
	public void gotoSalesAccount() {
		mouseOverOnSales();
		gm.click(account_BT, extTest, "Element Clickable Successfully");
	}
	
	public void gotoMarketingLeads() {
		mouseOverOnMarketing();
		gm.click(leads_BT,extTest,"Element Clickable Successfully"); 
	}
	public void gotoCampaigns() {
		mouseOverOnMarketing();
		gm.click(campaign_BT,extTest,"Element Clickable Successfully");
	}
	public void mouseOverOnMarketing(){
		gm.mouseOverByUsingAction(weMarketingMouseOver,extTest,"MouseOver  working successfully on Element");
	}
	public void mouseOverOnSales(){
		gm.mouseOverByUsingAction(weSalesMouseOver,extTest,"MouseOver  working successfully on Element");
	}
	
	public void logOut() {
		gm.click(logOut_BT,extTest,"Element Clickable Successfully");
	}
	
	
}
