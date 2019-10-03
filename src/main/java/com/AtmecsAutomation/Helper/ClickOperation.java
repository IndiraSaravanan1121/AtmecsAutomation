package com.AtmecsAutomation.Helper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AtmecsAutomation.BrowserSetup.BrowserSetup;

public class ClickOperation extends BrowserSetup {
	static WebDriverWait wait = new WebDriverWait(driver, 30);

	public static void click(String element, String locatorType) {
		switch (locatorType) {
		case "ClassName":
			wait.until(ExpectedConditions.elementToBeClickable(By.className(element)));
			driver.findElement(By.className(element)).click();
			break;
		case "CssSelector":
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(element)));
			driver.findElement(By.cssSelector(element)).click();
			break;
		case "Id":
			wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));
			driver.findElement(By.id(element)).click();
			break;
		case "LinkText":
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText(element)));
			driver.findElement(By.linkText(element)).click();
			break;
		case "Name":
			wait.until(ExpectedConditions.elementToBeClickable(By.name(element)));
			driver.findElement(By.name(element)).click();
			break;
		case "PartialLinkText":
			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(element)));
			driver.findElement(By.partialLinkText(element)).click();
			break;
		case "TagName":
			wait.until(ExpectedConditions.elementToBeClickable(By.tagName(element)));
			driver.findElement(By.tagName(element)).click();
			break;
		case "XPath":
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
			driver.findElement(By.xpath(element)).click();
			break;
		default:
			break;
		}
	}
}
