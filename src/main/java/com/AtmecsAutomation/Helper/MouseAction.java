package com.AtmecsAutomation.Helper;

import org.openqa.selenium.JavascriptExecutor;

import com.AtmecsAutomation.BrowserSetup.BrowserSetup;

public class MouseAction extends BrowserSetup {
	static JavascriptExecutor js = (JavascriptExecutor) driver;

	public static void scrollDown() {
		js.executeScript("window.scrollBy(0,50)");
	}

	public static void scrollUp() {
		js.executeScript("window.scrollBy(0,-50)");
	}

	public static void scrollleft() {
		js.executeScript("window.scrollBy(50,0)");
	}

	public static void scrollright() {
		js.executeScript("window.scrollBy(-50,0)");
	}

}
