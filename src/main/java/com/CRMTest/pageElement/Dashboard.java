package com.CRMTest.pageElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Dashboard {

	WebDriver driver;
	By sideMenuBar = By.id("leftMenuContainer");
//	@CacheLookup
//	@FindBy(how=How.ID, using="leftMenuContainer") WebElement sideMenuBar;
	By topMenuBar = By.id("navmenu");
//	@CacheLookup
//	@FindBy(how=How.ID, using="navmenu") WebElement topMenuBar;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Home") WebElement homeBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Calendar") WebElement calendarBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Companies") WebElement companiesBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Contacts") WebElement contactsBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Deals") WebElement dealsBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Tasks") WebElement tasksBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Cases") WebElement casesBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Call") WebElement callBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Email") WebElement emailBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Text/SMS") WebElement textBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Print") WebElement printBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Campaigns") WebElement campaignsBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Docs") WebElement docsBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Forms") WebElement formsBtn;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Reports") WebElement reportsBtn;
	
	

	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}

	
	public void testSideMenu() {
		boolean temp = driver.findElement(sideMenuBar).isDisplayed();
		Assert.assertTrue(temp);
	}
	
	public void testTopMenu() {
		boolean temp = driver.findElement(topMenuBar).isDisplayed();
		Assert.assertTrue(temp);		
	}
	
	public void testHomeBtn() {
		homeBtn.click();
	}
	
	public void testCalendarBtn() {
		calendarBtn.click();
	}
	
	public void testCompaniesBtn() {
		companiesBtn.click();
	}
	
	public void testContactsBtn() {
		contactsBtn.click();
	}
	
	public void testDealsBtn() {
		dealsBtn.click();
	}
	public void testTasksBtn() {
		tasksBtn.click();
	}
	public void testCasesBtn() {
		casesBtn.click();
	}
	public void testCallBtn() {
		callBtn.click();
	}
	public void testEmailBtn() {
		emailBtn.click();
	}
	public void testTextBtn() {
		textBtn.click();
	}
	
	public void testPrintBtn() {
		printBtn.click();
	}
	
	public void testCampaignsBtn() {
		campaignsBtn.click();
	}
	
	public void testDocsBtn() {
		docsBtn.click();
	}
	
	public void testFormsBtn() {
		formsBtn.click();
	}
	
	public void testReportsBtn() {
		reportsBtn.click();
	}
	
}
