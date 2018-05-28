package Modules;

import org.openqa.selenium.WebDriver;

import pageObject.LoginPage;

public class Login {
	
	
	public static void executelogin(WebDriver driver)
	{
		LoginPage.username.sendKeys("Admin");
		LoginPage.pass.sendKeys("Admin");
		LoginPage.login.click();
	}

}
