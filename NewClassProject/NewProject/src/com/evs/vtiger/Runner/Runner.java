package com.evs.vtiger.Runner;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.evs.vtiger.marketing.Marketing;

public class Runner {
	public static void main(String[] args) {
		
		ExtentHtmlReporter extentHtml = new ExtentHtmlReporter("reports/result.html");
		ExtentReports extentRepo = new ExtentReports();
		extentRepo.attachReporter(extentHtml);
		ExtentTest extentLoginAndMarketingTest = extentRepo.createTest("verify Marketing page");
		
		Marketing marketingPage = new Marketing();
		marketingPage.vtVerifyLead(extentLoginAndMarketingTest);
		extentRepo.flush();
		
		
	

	
	
	
	}

}
