package com.pagelibrary.KeximBank;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Helper.Datahelper;
import Modules.newbranchclick;
import cucumber.api.java.en.Then;
import pageObject.newbranch;

public class newbranchStep_definitionDataData {
	public WebDriver driver;
	public List<Map<String, String>> map;

	public newbranchStep_definitionDataData() {
		
		 driver= Hooks.driver;
		 
		map= Datahelper.data("C:\\Users\\Sudheer Martha\\Desktop\\branch1.xls", "Sheet1");
	}
	
	@Then("^click on newbranch and create the branch \"([^\"]*)\" details$")
	public void click_on_newbranch_and_create_the_branch_details(String arg1) throws Throwable {
		
		int index=Integer.parseInt(arg1)-1;
		PageFactory.initElements(driver, newbranch.class);
		
		newbranchclick.executenewBranchButton(driver, map, index);
	    
	}
}