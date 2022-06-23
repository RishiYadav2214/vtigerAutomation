package com.evs.vtiger.marketing;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import com.evs.vtiger.loginPage.LoginPage;

public class Marketing {
	public WebDriver driver;

	public void vtVerifyLead(ExtentTest extTestObj) {
		LoginPage lPage = new LoginPage();
		lPage.loginPage(extTestObj);
		lPage.gm.getMouseOver(lPage.driver, "//a[text()='Marketing']", " Mouse Over on Marketing is successfully",
				extTestObj);
		lPage.gm.click(lPage.driver, "//div[@id='Marketing_sub']//a[text()='Leads']", "Click on leads successfully",
				extTestObj);
		lPage.gm.getText(lPage.driver, "//a[@class='hdrLink']", "Leads",
				"Print the inner text leads printed successfully", extTestObj);
//		String actualSearchHeaderText = lPage.driver.findElement(By.xpath("//form[@name='basicSearch']")).getText();
//		System.out.println(actualSearchHeaderText);
//		String expectedSearchHeaderText = "Search";
//		if (actualSearchHeaderText.equalsIgnoreCase(expectedSearchHeaderText)) {
//			extTestObj.log(Status.PASS, "Search Area Header Text Validation is passed. Where actualText-"
//					+ actualSearchHeaderText + " & expectedText-" + expectedSearchHeaderText);
//		} else {
//			extTestObj.log(Status.FAIL, "Search Area Header Text Validation is failed. Where actualText-"
//					+ actualSearchHeaderText + " & expectedText-" + expectedSearchHeaderText);
//
//		}
		lPage.gm.getText(lPage.driver, "//a[text()='Sales']", "Sales",
				"Print the inner text of sales printed successfully", extTestObj);
		lPage.gm.click(lPage.driver, "//img[@alt='Create Lead...']", "Element is clickable susseccfully", extTestObj);
		lPage.gm.selectByIndex(lPage.driver, "//select[contains(@name,'salutationtype')]", 4,
				"In dropdown Value is selected successfully", extTestObj);
		lPage.gm.sendKeys(lPage.driver, "//input[contains(@name,'firstname')]", "Rishi",
				"Firstname value is inputed successfully", extTestObj);
		lPage.gm.sendKeys(lPage.driver, "//input[contains(@name,'lastname')]", "Yadav",
				"Lastname value is inputed successfully", extTestObj);
		lPage.gm.sendKeys(lPage.driver, "//input[contains(@name,'company')]", "JS Apartment",
				"Company name is inputed successfully", extTestObj);
		lPage.gm.sendKeys(lPage.driver, "//input[contains(@id,'designation')]", "It is belong from Chakgosai",
				"Designation is inputed successfully", extTestObj);
		lPage.gm.selectByIndex(lPage.driver, "//select[contains(@name,'leadsource')]", 3,
			"Lead Source is inputed successfully", extTestObj);
		lPage.gm.selectByIndex(lPage.driver, "//select[contains(@name,'leadstatus')]", 5,
				"Lead Status is inputed successfully", extTestObj);
		lPage.gm.click(lPage.driver, "(//input[@title='Save [Alt+S]'])[2]", "Click on save button successfully",
				extTestObj);
		lPage.gm.getText(lPage.driver, "//a[text()='About Us']", "About Us",
				"Print the inner text of About Us printed successfully", extTestObj);
		lPage.gm.click(lPage.driver, "//a[text()='About Us']", "Click on About Us successfully", extTestObj);
		lPage.gm.windowHandles(lPage.driver, "vtiger CRM 5 - Free, Commercial grade Open Source CRM");
		lPage.gm.click(lPage.driver, "//a[text()='Contact Us']", "Clicked successfully", extTestObj);
		lPage.gm.windowHandles(lPage.driver,  "Contact Us | Vtiger 11CRM ");
//		lPage.gm.
	}

}
