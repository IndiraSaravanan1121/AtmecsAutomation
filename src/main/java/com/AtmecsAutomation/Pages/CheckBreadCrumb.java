package com.AtmecsAutomation.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.AtmecsAutomation.BrowserSetup.BrowserSetup;
import com.AtmecsAutomation.Constants.Constants;
import com.AtmecsAutomation.Properties.ReadProperties;

/**
 * Validate BreadCrumb
 * 
 * @author indira.saravanan
 *
 */

public class CheckBreadCrumb extends BrowserSetup {

	public static void checkBreadCrumb(String expected) throws Exception {
		String actual = driver
				.findElement(By.xpath(ReadProperties.properties("loc_BreadCrumb_txt", Constants.pathProperties_file)))
				.getText();
		log.logReport(actual);
		Assert.assertEquals(actual, expected, "BreadCrumb Matched...");

	}
}
