package com.framework.org.CucumberFramework;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base1 {

	public static WebDriver driver;

	// public static WebElement element;
	// browserlaunch
	public static WebDriver browserLaunch(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\gecko.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\driver\\IEDriver.exe");
		} else {
			System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static void close() {
		driver.close();
	}

	public static void quit(WebElement element) {
		driver.quit();
	}

	public static void Navigateto(WebElement element, String S) {
		driver.navigate().to("");
	}

	public static void Navigateback(WebElement element, String S) {
		driver.navigate().back();
	}

	public static void Navigateforward(WebElement element, String S) {
		driver.navigate().forward();
	}

	public static void Navigaterefresh(WebElement element, String S) {
		driver.navigate().refresh();
	}

	public static void get(String S) {
		driver.getCurrentUrl();
	}

	public static void geturl(String input) {
		driver.get(input);
	}

	public static void simplealert(WebElement alert, String opt) {
		Alert refName = driver.switchTo().alert();
		refName.accept();
	}

	public static void confirmalert(WebElement alert, String opt) {
		if (opt.equalsIgnoreCase("accept")) {
			Alert refName = driver.switchTo().alert();
			refName.accept();
		} else if (opt.equalsIgnoreCase("Cancel")) {
			Alert refName = driver.switchTo().alert();
			refName.dismiss();
		}

	}

	public static void PromptAlert(String input1) {
		Alert input11 = driver.switchTo().alert();
		input11.sendKeys(input1);
		input11.accept();
	}

	public static void actions(WebElement element, String opt) {
		Actions ac = new Actions(driver);
		if (opt.equalsIgnoreCase("Contextclick")) {
			ac.contextClick().build().perform();

		}

	}

	public static void Frames(String option, String value, String element) {
		if (option.equalsIgnoreCase("byindex")) {
			int parseInt = Integer.parseInt(value);
			driver.switchTo().frame(parseInt);
		} else if (option.equalsIgnoreCase("bywebelement")) {
			driver.switchTo().frame(element);
		} else if (option.equalsIgnoreCase("bystring")) {
			driver.switchTo().frame(value);
		} else {
			System.out.println("invalid");
		}

	}

	public static void robots() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
	}

	public static void dropdown(WebElement element, String option, String text) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("by index")) {
			s.selectByIndex(Integer.parseInt(text));
		} else if (option.equalsIgnoreCase("byvalue")) {
			s.selectByValue(text);
		} else if (option.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(text);
		} else {
			System.out.println("invalid");
		}

	}

	public static void checkBox() {

	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		System.out.println("Multiple or not=" + s.isMultiple());
	}

	public static void getOptions(WebElement element1) {
		Select s = new Select(element1);
		List<WebElement> options = s.getOptions();
		for (WebElement li : options) {
			System.out.println(li.getText());
		}

	}

	public static void firstSelectedOption(WebElement element) {
		Select s = new Select(element);
		System.out.println("First Selected Option is = " + s.getFirstSelectedOption());

	}

	public static void allSelected(WebElement element) {
		Select s = new Select(element);
		List<WebElement> list = s.getAllSelectedOptions();
		for (WebElement li : list) {

		}
	}

	public static void ScrollUpDown(WebElement element, String opt) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (opt.equalsIgnoreCase("scrollup")) {
			js.executeScript("arguments[0].scrollIntoview(false)", element);
		} else if (opt.equalsIgnoreCase("scrolldown")) {
			js.executeScript("arguments[0].scrollIntoview(True)", element);
		} else {
			System.out.println("Enter in order of element name,option(scrollup or scrolldown)");

		}

	}

	public static void Screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr_file = ts.getScreenshotAs(OutputType.FILE);
		File dst_file = new File(
				filename);
		FileUtils.copyFile(scr_file, dst_file);

	}

	public static void sendkeyz(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void click2(WebElement element) {
		element.click();
	}

	public static void Clear(WebElement element) {
		element.clear();
	}

}
