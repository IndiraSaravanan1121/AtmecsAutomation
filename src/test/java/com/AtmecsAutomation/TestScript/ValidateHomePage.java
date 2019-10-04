package com.AtmecsAutomation.TestScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AtmecsAutomation.BrowserSetup.BrowserSetup;
import com.AtmecsAutomation.Constants.Constants;
import com.AtmecsAutomation.Helper.ClickOperation;
import com.AtmecsAutomation.Pages.CheckBreadCrumb;
import com.AtmecsAutomation.Pages.PageLoadedOrNot;
import com.AtmecsAutomation.Properties.ReadProperties;
import com.AtmecsAutomation.Utils.ExcelUtils;

/**
 * Click Explore Now Validate whether user landed successfully into new page.
 * Validate Breadcrumb of all pages.
 * 
 * @author indira.saravanan
 */

public class ValidateHomePage extends BrowserSetup {

	// To click explore now
	@Test(priority = 0)
	public void clickExploreNow() throws Exception {
		test = extent.createTest("clickExploreNow");
		ClickOperation.click(ReadProperties.properties("loc_ExploreNow_btn", Constants.pathProperties_file), "XPath");
		log.logReport("Explore Now Clicked...");
		driver.navigate().back();
		log.logReport("Back To Home Page...");
	}

	// It read value from excel sheet.
	@DataProvider
	public Object[][] moreInfoLink() {
		Object data[][] = ExcelUtils.ReadWriteExcel("Sheet1");
		return data;
	}

	@Test(dataProvider = "moreInfoLink", priority = 1)
	public void validatePageLoadedOrNotAndBreadCrumb(String moreInfo, String BreadCrumb) throws Exception {
		test = extent.createTest("validatePageLoadedOrNotAndBreadCrumb");
		ClickOperation.click(moreInfo, "XPath");
		PageLoadedOrNot.waitForPageLoad();// validate page load or not
		CheckBreadCrumb.checkBreadCrumb(BreadCrumb);// validate breadCrumb
		driver.navigate().back();
	}
}
