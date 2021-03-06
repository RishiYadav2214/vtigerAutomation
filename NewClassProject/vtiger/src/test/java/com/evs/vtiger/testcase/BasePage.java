package com.evs.vtiger.testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.evs.vtiger.home.HomePage;
import com.evs.vtiger.login.LoginPage;
import com.evs.vtiger.webUtil.GenericMethod;

@Listeners
public class BasePage {
	protected GenericMethod gm = new GenericMethod();

	private ExtentTest extTest;
	
	@Parameters("browserName")
	@BeforeTest(alwaysRun = true)
	public void lounchBrowserBeforeClass(String browserName ) {
//		gm.extentReports();
		gm.LaunchBrowsers(browserName, extTest, "Browser launched Successfully");
		System.out.println("BeforeTest");
	}

	
	

	@BeforeMethod(alwaysRun = true)
	public void beforeTestcaseMethod() {

		LoginPage lPage = new LoginPage(gm);
		lPage.validLogin(extTest);
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void afterTestCase() throws IOException {
		
		HomePage hPage = new HomePage(gm);
		hPage.logOut();
		System.out.println("AfterMethod");
	}

	@BeforeTest(alwaysRun = true)
	public void connectDB() {
		System.out.println("connect to db");
		System.out.println("BeforeTest");
	}

	@AfterTest(alwaysRun = true)
	public void disconnectDB() {
		System.out.println("disconnect to db");
//		gm.close();
//		gm.flush();
		System.out.println("AfterTest");
	}

}
