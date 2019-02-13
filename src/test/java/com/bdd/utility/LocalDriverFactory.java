package com.bdd.utility;

/**
 * @ClassPurpose This Class is to run the test in the local machine
 * @Scriptor Banu Pradeep
 * @ReviewedBy
 * @ModifiedBy 
 * @LastDateModified 3/17/2017
 */

import java.util.Collections;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocalDriverFactory {

	private static LocalDriverFactory instance = new LocalDriverFactory();

	public static LocalDriverFactory getInstance() {
		System.out.println("gng to return:::");
		System.out.println("instance is:::");
		return instance;
	}

	public WebDriver createNewDriver() {
		WebDriver driver = null;
		String browser = "CH";
			String driverPath = "C:\\Selenium\\Drivers";
			if (browser.toUpperCase().contains("CH")) {
				System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("useAutomationExtension", false);
				options.addArguments("no-sandbox");
				options.addArguments("start-maximized");
				options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
				driver = new ChromeDriver(options);
			}
			if (browser.toUpperCase().contains("FF")) {
				driver = new FirefoxDriver();
			}
			if (browser.toUpperCase().contains("IE")) {
				System.setProperty("webdriver.ie.driver", driverPath + "\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

		return driver;
	}


}