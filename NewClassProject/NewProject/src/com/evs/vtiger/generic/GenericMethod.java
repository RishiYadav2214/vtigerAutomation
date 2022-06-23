package com.evs.vtiger.generic;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;

public class GenericMethod {
	private WebElement webEle;
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");

	}

	public void getMouseOver(WebDriver driver, String xpath, String Msg, ExtentTest extTest) {
		try {
			webEle = driver.findElement(By.xpath(xpath));

		} catch (NoSuchElementException e) {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			webEle = driver.findElement(By.xpath(xpath));

		}
		try {
			Actions act = new Actions(driver);
			act.moveToElement(webEle).build().perform();
			;
		} catch (StaleElementReferenceException e) {
			webEle = driver.findElement(By.xpath(xpath));
		} catch (ElementNotInteractableException e) {
		}
		extTest.log(Status.INFO, Msg);
	}

	public void click(WebDriver driver, String xpath, String Msg, ExtentTest extTest) {

		try {
			webEle = driver.findElement(By.xpath(xpath));

		} catch (NoSuchElementException e) {

			webEle = driver.findElement(By.xpath(xpath));

		}
		try {
			webEle.click();
		} catch (StaleElementReferenceException e) {
			webEle = driver.findElement(By.xpath(xpath));
		} catch (ElementNotInteractableException e) {
		}
		extTest.log(Status.INFO, Msg);
	}

	public void getText(WebDriver driver, String xpath, String expText, String Msg, ExtentTest extTest) {

		try {
			String actualLeadText = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(actualLeadText);
			String expectedLeadText = expText;
			if (actualLeadText.equalsIgnoreCase(expectedLeadText)) {
				extTest.log(Status.PASS, "Lead Page Header Text Validation is passed. Where actualText-"
						+ actualLeadText + " & expectedText-" + expectedLeadText);

			} else {
				extTest.log(Status.FAIL, "Lead Page Header Text Validation is failed. Where actualText-"
						+ actualLeadText + " & expectedText-" + expectedLeadText);

			}
		} catch (StaleElementReferenceException e) {
			webEle = driver.findElement(By.xpath(xpath));
		} catch (ElementNotInteractableException e) {
		}
		extTest.log(Status.INFO, Msg);
	}

	public void sendKeys(WebDriver driver, String xpath, String inputValue, String Msg, ExtentTest extTest) {
		try {
			webEle = driver.findElement(By.xpath(xpath));

		} catch (NoSuchElementException e) {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			webEle = driver.findElement(By.xpath(xpath));

		}
		try {
			webEle.clear();
			webEle.sendKeys(inputValue);
		} catch (StaleElementReferenceException e) {
			webEle = driver.findElement(By.xpath(xpath));
		} catch (ElementNotInteractableException e) {
		}
		extTest.log(Status.INFO, Msg);
	}

	public void selectByIndex(WebDriver driver, String xpath, int num, String Msg, ExtentTest extTest) {
		try {
			webEle = driver.findElement(By.xpath(xpath));

		} catch (NoSuchElementException e) {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			webEle = driver.findElement(By.xpath(xpath));

		}
		try {
			Select sel = new Select(webEle);
			sel.selectByIndex(num);
			;
		} catch (StaleElementReferenceException e) {
			webEle = driver.findElement(By.xpath(xpath));
		} catch (ElementNotInteractableException e) {
		}
		extTest.log(Status.INFO, Msg);
	}

	public void selectByValue(WebDriver driver, String xpath, String value, String Msg, ExtentTest extTest) {
		try {
			webEle = driver.findElement(By.xpath(xpath));

		} catch (NoSuchElementException e) {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			webEle = driver.findElement(By.xpath(xpath));

		}
		try {
			Select sel = new Select(webEle);
			sel.selectByValue(value);
			;
		} catch (StaleElementReferenceException e) {
			webEle = driver.findElement(By.xpath(xpath));
		} catch (ElementNotInteractableException e) {
		}
		extTest.log(Status.INFO, Msg);
	}

	public void selectByVisibleText(WebDriver driver, String xpath, String visibleText, String Msg,
			ExtentTest extTest) {
		try {
			webEle = driver.findElement(By.xpath(xpath));

		} catch (NoSuchElementException e) {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			webEle = driver.findElement(By.xpath(xpath));

		}
		try {
			Select sel = new Select(webEle);
			sel.selectByVisibleText(visibleText);
			;
		} catch (StaleElementReferenceException e) {
			webEle = driver.findElement(By.xpath(xpath));
		} catch (ElementNotInteractableException e) {
		}
		extTest.log(Status.INFO, Msg);
	}

	public void acceptPopup() {
		driver.switchTo().alert().accept();
	}

	public void dismissPopup() {
		driver.switchTo().alert().dismiss();
	}

	public void sendkeysByUsingActions(WebDriver driver, String xpath, String InputValue, String Msg,
			ExtentTest extTest) {
		try {
			webEle = driver.findElement(By.xpath(xpath));

		} catch (NoSuchElementException e) {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			webEle = driver.findElement(By.xpath(xpath));

		}
		try {
			Actions act = new Actions(driver);
			act.sendKeys(InputValue).build().perform();
			;
		} catch (StaleElementReferenceException e) {
			webEle = driver.findElement(By.xpath(xpath));
		} catch (ElementNotInteractableException e) {
		}
		extTest.log(Status.INFO, Msg);
	}

	public void dragAndDrop(WebElement webEle1) {
		Actions act = new Actions(driver);
		act.dragAndDrop(webEle, webEle1);
	}

	public void windowHandles(WebDriver driver, String expTitle) {
		Set<String> str=driver.getWindowHandles();
		System.out.println(str);
		for (String handleVal : str) {
			driver.switchTo().window(handleVal);
			String title=driver.getTitle();
			System.out.println(title);
			if (title.equalsIgnoreCase(expTitle)) {
				break;
			}
		}
		
	}
	public void snapshot() {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File tempFile = tss.getScreenshotAs(OutputType.FILE);
		File srcFile = new File("rishi.png");
		try {
			Files.copy(tempFile, srcFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
