package Talix.Automation.Tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.common.BaseTest;

import Talix.Automation.Pages.LoginPage;
import Talix.Automation.Pages.WorklistPage;


public class VerifyUserCanLogin extends BaseTest {
	
LoginPage loginPage;
WorklistPage workListPage;
	
	@BeforeClass
	public void LoginPage(){
		parent = report.startTest("Login Page","Login Page Test");
	}
	
	@Test
	public void verifyUserCanLogin() throws InterruptedException{
		
		//loginPage = new LoginPage(eventDriver, handler);
		
		workListPage = new WorklistPage(eventDriver, handler);		
		
		
		loginPage.login();
		
		Thread.sleep(3000);
		
		//workListPage.ChooseWorklistDropDown.click();
		
		//Thread.sleep(3000);
		
		workListPage.selectOptionFromDropDown(workListPage.ChooseWorklistDropDown, 5);
		
		
		workListPage.ShowMoreFiltersButton.click();		
		workListPage.MaleRadioButton.click();		
		workListPage.HideFilterButton.click();
			
		
	}
}
