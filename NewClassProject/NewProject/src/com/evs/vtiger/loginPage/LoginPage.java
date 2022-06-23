package com.evs.vtiger.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.evs.vtiger.generic.GenericMethod;
public class LoginPage {
	public WebDriver driver;
	public GenericMethod gm = new GenericMethod();
	public void loginPage(ExtentTest extTestLogin) {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		gm.sendKeys(driver, "//input[contains(@name,'user_name')]", "admin", "user name inputed successfully",extTestLogin);
		gm.sendKeys(driver, "//input[contains(@name,'user_password')]", "admin", "user password inputed successfully",extTestLogin);
		gm.click(driver, "//input[@alt='Login [Alt+L]']", "Element is clickable", extTestLogin);
	}
	

}
