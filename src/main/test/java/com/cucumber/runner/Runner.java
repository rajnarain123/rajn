package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.framework.org.CucumberFramework.base1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\cucumber\\feature",
				glue="com\\cucumber\\stepdefinition",
				monochrome = true,
				strict = true,
				dryRun = false)
public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver=base1.browserLaunch("chrome");
	}
	@AfterClass
	public static void tearDown() {
		base1.close();
	}
}
