package com.CRMTest.pageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.CRMTest.pageElement.HomePage;
import com.CRMTest.utility.DriverInitialize;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTest extends DriverInitialize{
	HomePage page;
	
	@Given("^I open a brower$")
	public void i_open_a_brower(){
		driver = initialize(prop.getProperty("Browser"));
		page = PageFactory.initElements(driver, HomePage.class);
	}

	@When("^I go to CRM web site$")
	public void i_go_to_CRM_web_site(){
	   driver.get(prop.getProperty("URL"));

	}

	@And("^I see CRM logo$")
	public void i_see_CRM_logo() throws InterruptedException{
		page.checkTitle();
		page.checkLogo();
		Thread.sleep(2000);
	}
	@When("^I see forgot password link$")
	public void i_see_forgot_password_link() throws Exception{
		page.checkForgotPassword();
		Thread.sleep(2000);
	}

	@When("^I see features link$")
	public void i_see_features_link() throws Exception{
		page.checkFeatures();
	}

	@When("^I see Signup link$")
	public void i_see_Signup_link() throws Exception{
		page.checkSignUp();
	}

	@When("^I see Pricing link$")
	public void i_see_Pricing_link() throws Exception{
		page.checkPricing();
	}

	@When("^I see Customers link$")
	public void i_see_Customers_link() throws Exception{
		page.checkCustomers();
	}

	@When("^I see Contact link$")
	public void i_see_Contact_link() throws Exception{
		page.checkContact();
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password(){
		String userN = prop.getProperty("Username");
		String passW = prop.getProperty("Password");
		page.checkLogIn(userN, passW);
	}

	@When("^I click Login button$")
	public void i_click_Login_button(){
		page.checkLogInButton();
	}

	@Then("^I should see login page title$")
	public void i_should_see_login_page_title(){
		Assert.assertEquals(driver.getTitle(), "CRMPRO");
	}
	
	@Then("^I close the brower$")
	public void i_close_the_brower(){
		close();
	}
}
