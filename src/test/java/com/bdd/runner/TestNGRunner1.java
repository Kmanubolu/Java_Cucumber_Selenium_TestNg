package com.bdd.runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import com.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="resources/Features/login.feature",
		plugin={
				"pretty"
				, "html:target/cucumber/cucumber-html-report"
				, "json:target/cucumber/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:"
				},
		glue={""},
		tags={"@SmokeTest"}
		)
		
public class TestNGRunner1 extends AbstractTestNGCucumberTests {
	
		static Date date = new Date();
		static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm a");
		static String formattedDate = sdf.format(date).replace(" ", "_").replace(":", "-").replace("/","_");
		public static String str = formattedDate;
		
		@BeforeClass
		public static void setup() {
			
			/*File dir = new File("./target/Results/Results_"+formattedDate);
			dir.mkdir();*/
		    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		    String path = "Results/TestResults"+formattedDate+"/myreport.html";
		    extentProperties.setReportPath(path);
		}	
@AfterClass
public static void extReport(){
	//Reporter.loadXMLConfig("src/test/resource/extent-config.xml");
	/*Reporter.setSystemInfo("user", System.getProperty("user.name"));
	Reporter.setSystemInfo("Time", TimeStamp.reportPathWithTimeStamp);
    Reporter.setSystemInfo("os", "Windows");
    Reporter.setTestRunnerOutput("Sample test runner output message");*/	
  
}	
@AfterTest
private void test(){
	
	//copyCustomReports();
}

}