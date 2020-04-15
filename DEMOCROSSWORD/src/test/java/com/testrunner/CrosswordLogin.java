package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
features ="C:\\Users\\Lenovo\\eclipse-workspace\\DEMOCROSSWORD\\src\\test\\resources\\features\\sample.feature",
glue = {"com.stepdefnition"},
plugin = {"pretty","html:reports/cucumber-html-report",
		"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
//tags = {"@TC_01_Crossword"},
dryRun=false,
monochrome=true
)
public class CrosswordLogin {

}
