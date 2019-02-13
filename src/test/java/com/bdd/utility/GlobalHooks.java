package com.bdd.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.log4testng.Logger;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.bdd.utility.*;
import com.bdd.runner.TestNGRunner1;
import com.bdd.utility.ManagerDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GlobalHooks  extends CoreUtils {
	
	Logger L = Logger.getLogger(GlobalHooks.class);
	
	 public static Scenario scenario;
	 static String str = TestNGRunner1.str;

	@Before(order = 1)
	public void beforeScenario(Scenario scenario){
		System.out.println("*************************************************");
		System.out.println("*************Starting Test Execution*************");
		System.out.println("*************************************************");
		System.out.println("***************" + scenario + "******************");
		initializeWebDriver();                    
	}
			
	@After(order = 1)
	public void afterScenario1(Scenario scenario) {
		if (scenario.isFailed()) {
			File screenshot =((TakesScreenshot) ManagerDriver.getInstance().getWebDriver()).getScreenshotAs(OutputType.FILE);
			File screenfile = new File("Results/TestResults"+str+"/"+screenshot.getName());
			try {
                Files.copy(screenshot, screenfile);
                try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                Reporter.addScreenCaptureFromPath(screenfile.getName());
                System.out.println("Screenshot Done");
            } catch (IOException e) {
            
            } 
		}
		ManagerDriver.getInstance().getWebDriver().close();
		ManagerDriver.getInstance().getWebDriver().quit();
		System.out.println("Browser got closed");
	}
}