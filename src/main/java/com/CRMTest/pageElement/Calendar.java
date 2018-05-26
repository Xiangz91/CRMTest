package com.CRMTest.pageElement;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Calendar {
	

	WebDriver driver;
	Dashboard board;
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="New Event") WebElement newE;
	By title = By.id("title");
	By dateF = By.id("fieldId_start");
	By dateT = By.id("fieldId_end");
	By category = By.name("category");
	By confirmed = By.name("confirmed");
	By reminderM = By.name("reminder_minutes");
	By reminderT = By.name("reminder_type");
	By reminderN = By.name("reminder_note");
	By tags = By.id("tags");
	By location = By.name("location");
	By notes = By.id("notes");
	By minutes = By.id("meeting_notes");

	
	public Calendar(WebDriver driver) {
		this.driver = driver;
		board = PageFactory.initElements(this.driver, Dashboard.class);
	}
	
	public void clickNewEven() {
		Actions act = new Actions(this.driver);
		act.moveToElement(board.calendarBtn).build().perform();
		newE.click();
	}
	/**
	 * 
	 * @param str title information
	 */
	public void setTitle(String str) {
		driver.findElement(title).clear();
		driver.findElement(title).sendKeys(str);
	}
	
	/**
	 * 
	 * @return title text box info
	 */
	public String getTitle() {
		return driver.findElement(title).getAttribute("value");
	}
	
	public void setDate() {
		List<WebElement> clearBtn = driver.findElements(By.id("btnClear"));
		clearBtn.get(0).click();
		driver.findElement(By.id("f_trigger_c_start")).click();
		driver.findElement(By.xpath("//html//body//div[6]//table//tbody//tr[2]//td[2]")).click();
		clearBtn.get(1).click();
		driver.findElement(By.id("f_trigger_c_end")).click();
		driver.findElement(By.xpath("//html//body//div[7]//table//tbody//tr[3]//td[2]")).click();
	}
	
	public void setCategory(String str) {
		WebElement elems = driver.findElement(category);
		Select dropdown = new Select(elems);
		dropdown.selectByValue(str);	
	}
	
	public String getCategory() {
		return driver.findElement(category).getAttribute("value");
	}
	
	public void setConfirmed(String str) {
		List<WebElement> confBtn = driver.findElements(confirmed);
		if(str.equals("yes"))
			confBtn.get(0).click();
		else if(str.equals("no"))
			confBtn.get(1).click();
		else
			System.out.println("Please enter yes or no");
	}
	
	public String getConfirmed(String str) {
		List<WebElement> confBtn = driver.findElements(confirmed);
		if(str.equals("yes"))
			return confBtn.get(0).getAttribute("checked");
		else if(str.equals("no"))
			return confBtn.get(1).getAttribute("checked");
		else {
			System.out.println("Please enter yes or no");
			return null;
		}
		
	}
	
	public void setReminders(String time, String type, String note) {
		WebElement timeElem = driver.findElement(reminderM);
		Select dropdownTime = new Select(timeElem);
		WebElement typeElem = driver.findElement(reminderT);
		Select dropdownType = new Select(typeElem);
		dropdownTime.selectByValue(time);
		dropdownType.selectByValue(type);
		driver.findElement(reminderN).sendKeys(note);		
	}
	
	public String getReminderTime() {
		return driver.findElement(reminderM).getAttribute("value");
	}
	
	public String getReminderType() {
		return driver.findElement(reminderT).getAttribute("value");
	}
	
	public String getReminderNote() {
		return driver.findElement(reminderN).getAttribute("value");
	}

	public void setTags(String str) {
		driver.findElement(tags).sendKeys(str);
	}
	public String getTags() {
		return driver.findElement(tags).getAttribute("value");
	}
	
	public void setLocation(String str) {
		driver.findElement(location).sendKeys(str);
	}
	public String getLocation() {
		return driver.findElement(location).getAttribute("value");
	}
	
	public void setNotes(String str) {
		driver.findElement(notes).sendKeys(str);
	}
	public String getNotes() {
		return driver.findElement(notes).getAttribute("value");
	}
	
	public void setMinutes(String str) {
		driver.findElement(minutes).sendKeys(str);
	}
	public String getMinutes() {
		return driver.findElement(minutes).getAttribute("value");
	}
	

}
