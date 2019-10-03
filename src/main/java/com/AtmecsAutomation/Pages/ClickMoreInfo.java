package com.AtmecsAutomation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.AtmecsAutomation.BrowserSetup.BrowserSetup;

/**
 * Click More Info link
 * 
 * @author indira.saravanan
 *
 */

public class ClickMoreInfo extends BrowserSetup {

	public static void scrollToMoreInfo(String moreInfo) throws Exception {
		WebElement element = driver.findElement(By.xpath(moreInfo));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView()", element);
	}
}
