package com.evs.vtiger.marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://localhost:8888");
WebElement uName=driver.findElement(By.xpath("//input[@name='user_name']"));
	uName.sendKeys("admin");
	Actions act=new Actions(driver);
	act.contextClick().build().perform();
	}

}
