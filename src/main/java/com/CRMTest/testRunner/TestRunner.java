package com.CRMTest.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="E:\\Project\\com.CRMTest\\src\\main\\java\\com\\CRMTest\\features",
				glue = "E:\\Project\\com.CRMTest\\src\\main\\java\\com\\CRMTest\\pageTest\\HomePageTest.java",
				dryRun = false,
				strict = true, //if the steps are not defined it will fail
				monochrome = true //display the console output in a readable format
				)
public class TestRunner {

}
