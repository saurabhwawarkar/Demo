package Talix.Automation.Pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import automation.common.AutoLogger;
import automation.common.BasePage;

public class WorklistPage extends BasePage{

	public WorklistPage(WebDriver driver, AutoLogger handler)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}

	@FindBy(id = "worklistSelect")
	public	WebElement ChooseWorklistDropDown;
	
	@FindBy(xpath = "//*[@id='patientTable']/form/div[3]/button[1]")
	public WebElement ShowMoreFiltersButton;	
	
	@FindBy(xpath = "//*[@id='patientTable']/ng-include/div/div[2]/form/ul/li[3]/span/span/span/label[2]/input")
	public WebElement MaleRadioButton;	
	
	@FindBy(xpath = "//*[@id=\'patientTable\']/form/div[3]/button[1]/span")
	public WebElement HideFilterButton;
	
	
	public void selectOptionFromDropDown(WebElement element, int index)
	{
		actions.selectDropdownByIndex(element, index);
	}
}
