package com.AtmecsAutomation.Pages;

import org.openqa.selenium.JavascriptExecutor;

import com.AtmecsAutomation.BrowserSetup.BrowserSetup;

/**
 * Validate New Page Load or not
 * 
 * @author indira.saravanan
 *
 */

public class PageLoadedOrNot extends BrowserSetup {

	static String pageLoadStatus = null;
	static JavascriptExecutor js;

	public static void waitForPageLoad() throws Exception {
		do {
			js = (JavascriptExecutor) driver;
			pageLoadStatus = (String) js.executeScript("return document.readyState");
		} while (!pageLoadStatus.equals("complete"));
		log.logReport("New Page Loaded...");
	}

}
