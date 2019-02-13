package com.bdd.applicationUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import com.bdd.utility.*;

public class Login  extends CoreUtils {

	public By edt_UserName = By.id("username");
	public By edt_Password = By.id("password");
	public By ele_Login = By.id("login");
	public By ele_WelcomeText = By.xpath("/html/body/table[2]/tbody/tr[1]/td[1]");
	public By ele_LogOut = By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]");
	
	public void lauchApplication(String url)
			throws InterruptedException {
		 	ManagerDriver.getInstance().getWebDriver().manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		 	ManagerDriver.getInstance().getWebDriver().get(url);
		 	Thread.sleep(1000);
	}

	public void login(String userName, String password) throws Exception {

		SafeAction(edt_UserName, userName,"edt_UserName");
		SafeAction(edt_Password, password,"edt_Password");
	}

	public void clickOnSignIn() throws Exception {

		SafeAction(ele_Login, "","ele_Login");
	}

	public void validateHomePage() {

		Assert.assertEquals(ManagerDriver.getInstance().getWebDriver().findElement(ele_WelcomeText).getText(), "Welcome to AdactIn Group of Hotels");
	}
	
	public void LogOut() throws Exception {
		
		SafeAction(ele_LogOut, "","ele_LogOut");
	}

}