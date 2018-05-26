package com.CRMTest.pageElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

	public WebDriver driver;
	WebDriverWait wait;
	WebElement elem;
	@CacheLookup
	@FindBy(how=How.XPATH, using="//img[contains(@alt,'free crm logo')]") WebElement logo;
	@CacheLookup
	@FindBy(how=How.XPATH, using = "//small[contains(.,'Forgot Password?')]") WebElement forgotP;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using = "Features") WebElement features;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using = "Sign Up") WebElement signUp;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using = "Pricing") WebElement pricing;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using = "Customers") WebElement customers;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using = "Contact") WebElement Contact;
	@CacheLookup
	@FindBy(how=How.NAME, using = "username") WebElement userN;
	@CacheLookup
	@FindBy(how=How.NAME, using = "password") WebElement passW;
	@CacheLookup
	@FindBy(how=How.XPATH, using = "//input[@value='Login']") WebElement logIn;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,20);
	}

	public void checkTitle() {
		String actualTitle = driver.getTitle();
		String expectTitle = "Free CRM software in the cloud powers sales and customer service";
		Assert.assertEquals(actualTitle, expectTitle);
	}

	public void checkLogo() {
		boolean logoTemp = logo.isDisplayed();
		Assert.assertTrue(logoTemp);
	}

	public void checkLinkText() {
		Assert.assertEquals(forgotP.getText(), "Forgot Password?");
		Assert.assertEquals(features.getText(), "Features");
		Assert.assertEquals(signUp.getText(), "Sign Up");
		Assert.assertEquals(pricing.getText(), "Pricing");
		Assert.assertEquals(customers.getText(), "Customers");
		Assert.assertEquals(Contact.getText(), "Contact");
	}
	
	public void checkForgotPassword() throws Exception {
		forgotP.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "CRMPRO Log In Screen");
		driver.navigate().back();
		
	}
	
	public void checkFeatures() throws Exception {
		features.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Free CRM Best Features and CRM Value Best ROI Web Hosted CRM Software");
	}
	
	public void checkSignUp() throws Exception {
		signUp.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "CRMPRO - CRM Pro for customer relationship management, sales, and support");
	}
	
	public void checkPricing() throws Exception {
		pricing.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Free CRM PRICING");
	}
	
	public void checkCustomers() throws Exception {
		customers.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Free CRM Professional CRM Customers using our Cloud CRM");
	}
	
	public void checkContact() throws Exception {
		Contact.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "FreeCRM Contact Free CRM Anytime");
	}
	
	public void checkfooter() {
		boolean temp = driver.findElement(By.xpath("//section[@id='footer']")).isDisplayed();
		Assert.assertTrue(temp);
	}
	
	public void checkLogIn(String user, String pass){
		userN.sendKeys(user);
		passW.sendKeys(pass);		
	}
	
	public void checkLogInButton() {
		logIn.click();
	}
}
