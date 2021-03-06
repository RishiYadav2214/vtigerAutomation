package com.evs.vtiger.webUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

public class GenericMethod {
	private WebDriver driver;
	private Properties prop;
	public ExtentHtmlReporter extHtmlReporter;
	public ExtentTest extTest;
	public ExtentReports extReport;

	public GenericMethod() {
		try {
			prop = new Properties();
			InputStream fis = new FileInputStream("config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void extentReports() {

		extHtmlReporter = new ExtentHtmlReporter("report\\result.html");
		extReport = new ExtentReports();
		extReport.attachReporter(extHtmlReporter);
		extReport.setSystemInfo("OS", "Windows");
		extReport.setSystemInfo("AUT", "QA");
 
		extTest = extReport.createTest("verify campaign page");
		extHtmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

//		ExtentHtmlReporter extHtmlReporter = new ExtentHtmlReporter("reports/result.html");
//		ExtentReports extentRepo = new ExtentReports();
//		extentRepo.attachReporter(extHtmlReporter);
//		extTest = extentRepo.createTest("verify campaign page");

	}

	public ExtentReports flush() {
		extReport.flush();
		return extReport;
	}

	public Properties getPropObj() {

		return prop;
	}

	public void close() {
		driver.close();
		driver.quit();
		
	}

	public WebDriver LaunchBrowsers(String browserName, ExtentTest extTestObj, String Msg) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {

		}
		extTest.log(Status.INFO, Msg);
	
		return driver;

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void inputData(WebElement we, String value, ExtentTest extTestObj, String Msg) {
//		boolean dis=we.isDisplayed();
//		if (dis==true) {
//			we.clear();
//			we.sendKeys(value);
//			System.out.println("Value inputed successfully ");
//		} else {
//			System.out.println("Value is not inputed successfully");
//
//		}
//		extTest.log(Status.INFO, Msg);
		try { 
			we.clear();
			we.sendKeys(value);
		} catch (NullPointerException e) {

		}
		extTest.log(Status.INFO, Msg);
	}

	public void click(WebElement we, ExtentTest extTestObj, String Msg) {
		try {
			we.isDisplayed();
			we.isEnabled();
			we.click();

		} catch (Exception e) {

		}
		extTest.log(Status.INFO, Msg);
	}

	
	public void getUrl(String url) {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(url);
		System.out.println(url);

	}

	public String getInnerText(WebElement we, ExtentTest extTestObj, String Msg) {
		String text = null;
		if (we.isDisplayed()) {
			// extTest.log(Status.INFO, Msg);
			if (we.isEnabled()) {
				we.getText();
				// extTest.log(Status.INFO, Msg);
			} else {
				// extTest.log(Status.INFO, Msg);
			}
		} else {
			System.out.println("Element is not present of this webpage");
		}
		return text;
	}

	public String getAttribute(WebElement we, String attributeName, String Msg) {
		String attribute = null;
		if (we.isDisplayed()) {
			if (we.isEnabled()) {
				attribute = we.getAttribute(attributeName);
			} else {
			}
		} else {
		}
		extTest.log(Status.INFO, Msg);
		return attribute;
	}

	public void selectByIndex(WebElement we, int num, String Msg) {
		Select sel = new Select(we);
		if (we.isDisplayed()) {
			if (we.isEnabled()) {
				sel.selectByIndex(num);
			}
		}
		extTest.log(Status.INFO, Msg);

	}

	public void selectByValue(WebElement we, String value, String Msg) {
		Select sel = new Select(we);
		if (we.isDisplayed()) {
			if (we.isEnabled()) {
				sel.selectByValue(value);
			}
		}
		extTest.log(Status.INFO, Msg);

	}

	public void selectByVisibleText(WebElement we, String text, String Msg) {
		Select sel = new Select(we);
		if (we.isDisplayed()) {
			if (we.isEnabled()) {
				sel.selectByVisibleText(text);
			}
		}
		extTest.log(Status.INFO, Msg);

	}

	public void mouseOverByUsingAction(WebElement we, ExtentTest extTestObj, String Msg) {
		Actions act = new Actions(driver);
		if (we.isDisplayed()) {
			we.isEnabled();
			act.moveToElement(we).build().perform();

		}
		extTest.log(Status.INFO, Msg);

	}

	public void snapshot() {
//		Date d = new Date();
////		String str=d.toString();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy__hh:mm:ss aa");
//		String str = sdf.format(d);
//		System.out.println(str);
		TakesScreenshot tss = (TakesScreenshot) driver;
		File tempFile = tss.getScreenshotAs(OutputType.FILE);
		File srcFile = new File("ScreenShot\\rishi.png");
		try {
			Files.copy(tempFile, srcFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
