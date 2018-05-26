package com.CRMTest.pageElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Companies {

	WebDriver driver;
	Dashboard board;

	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="New Company") WebElement newC;
	By company = By.id("company_name");
	By industry = By.name("industry");
	By annualR = By.id("annual_revenue");
	By employees = By.id("num_of_employees");
	By status = By.name("status");
	By category = By.name("category");
	By priority = By.name("priority");
	By source = By.name("source");
	By identifier = By.name("identifier");
	By taxNum = By.id("vat_number");
	
	By addressT = By.name("address_title");
	By type = By.name("type");
	By defaultAdd = By.name("address");
	By city = By.name("city");
	By state = By.name("state");
	By zip = By.name("postcode");
	By country = By.name("country");
	
	public Companies(WebDriver driver) {
		this.driver = driver;
		board = PageFactory.initElements(this.driver, Dashboard.class);
	}
	
	public void clickNewComp() {
		Actions act = new Actions(this.driver);
		act.moveToElement(board.companiesBtn).build().perform();
		newC.click();
	}
	
	public void setCompany(String str) {
		driver.findElement(company).sendKeys(str);
	}
	
	public String getCompany() {
		return driver.findElement(company).getAttribute("value");
	}
	
	public void setIndustry(String str) {
		driver.findElement(industry).sendKeys(str);
	}
	
	public String getIndustry() {
		return driver.findElement(industry).getAttribute("value");
	}
	
	public void setAnnualRevenue(String str) {
		driver.findElement(annualR).sendKeys(str);
	}
	
	public String getAnnualRevenue() {
		return driver.findElement(annualR).getAttribute("value");
	}
	
	public void setEmployees(String str) {
		driver.findElement(employees).sendKeys(str);
	}
	
	public String getEmployees() {
		return driver.findElement(employees).getAttribute("value");
	}
	
	public void setStatus(String str) {
		WebElement elem = driver.findElement(status);
		Select dropdown = new Select(elem);
		dropdown.selectByValue(str);
	}
	
	public String getStatus() {
		return driver.findElement(status).getAttribute("value");
	}
	
	public void setCategory(String str) {
		WebElement elem = driver.findElement(category);
		Select dropdown = new Select(elem);
		dropdown.selectByValue(str);
	}
	
	public String getCategory() {
		return driver.findElement(category).getAttribute("value");
	}
	
	public void setPriority(String str) {
		WebElement elem = driver.findElement(priority);
		Select dropdown = new Select(elem);
		dropdown.selectByValue(str);
	}
	
	public String getPriority() {
		return driver.findElement(priority).getAttribute("value");
	}
	
	public void setSource(String str) {
		WebElement elem = driver.findElement(source);
		Select dropdown = new Select(elem);
		dropdown.selectByValue(str);
	}
	
	public String getSource() {
		return driver.findElement(source).getAttribute("value");
	}
	
	public void setIdentifier(String str) {
		driver.findElement(identifier).sendKeys(str);
	}
	
	public String getIdentifier() {
		return driver.findElement(identifier).getAttribute("value");
	}
	
	public void setTaxNum(String str) {
		driver.findElement(taxNum).sendKeys(str);
	}
	
	public String getTaxNum() {
		return driver.findElement(taxNum).getAttribute("value");
	}
	
	public void setAddressTitle(String str) {
		driver.findElement(addressT).sendKeys(str);
	}
	
	public String getAddressTitle() {
		return driver.findElement(addressT).getAttribute("value");
	}
	
	public void setType(String str) {
		WebElement elem = driver.findElement(type);
		Select dropdown = new Select(elem);
		dropdown.selectByValue(str);
	}
	
	public String getType() {
		return driver.findElement(type).getAttribute("value");
	}
	
	public void setDefaultAddress(String str) {
		driver.findElement(defaultAdd).sendKeys(str);
	}
	
	public String getDefaultAddress() {
		return driver.findElement(defaultAdd).getAttribute("value");
	}
	
	public void setCity(String str) {
		driver.findElement(city).sendKeys(str);
	}
	
	public String getCity() {
		return driver.findElement(city).getAttribute("value");
	}
	
	public void setState(String str) {
		driver.findElement(state).sendKeys(str);
	}
	
	public String getState() {
		return driver.findElement(state).getAttribute("value");
	}
	
	public void setZip(String str) {
		driver.findElement(zip).sendKeys(str);
	}
	
	public String getZip() {
		return driver.findElement(zip).getAttribute("value");
	}
	
	public void setCountry(String str) {
		driver.findElement(country).sendKeys(str);
	}
	
	public String getCountry() {
		return driver.findElement(country).getAttribute("value");
	}
	
}
