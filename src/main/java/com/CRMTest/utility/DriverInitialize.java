package com.CRMTest.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialize {
	public static WebDriver driver;
	public Properties prop;

	public DriverInitialize() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"E:\\Project\\com.CRMTest\\src\\main\\java\\com\\CRMTest\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}

	}

	public static WebDriver initialize(String str) {

		switch (str.toLowerCase()) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "E:\\exJar\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "E:\\exJar\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			driver = null;
		}
		
		return driver;
	}

	public void close() {
		driver.close();
	}
}
