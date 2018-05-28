package Modules;

import org.openqa.selenium.WebDriver;

import pageObject.branchesButton;
import pageObject.branchesbuttonEnabled;


public class branchesbuttondisplay {

public static void executeDisplay(WebDriver driver)
{
	if(branchesbuttonEnabled.branchesbuttonEnabled.isDisplayed()) {
		
		System.out.println("Test passed");
		
	}
	else
	{
		System.out.println("Test is failed");
	}
	
}
}