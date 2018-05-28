package com.pagelibrary.KeximBank;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Helper.Datahelper;
import Modules.branchesbuttonclick;
import Modules.newbranchclick;
import cucumber.api.java.en.Then;
import pageObject.branchesButton;
import pageObject.newbranch;

public class branchStep_definitionData {
	
	public newbranchStep_definitionDataData data1 = new newbranchStep_definitionDataData();

	public branchStep_definitionData() {
		
		data1.map=Datahelper.data("C:\\Users\\Sudheer Martha\\Desktop\\branch1.xls", "Sheet1");
		
		data1.driver=Hooks.driver;
	}
	
	
	@Then("^click on branches button$")
	public void click_on_branches_button() throws Throwable {
	    
		PageFactory.initElements(data1.driver, branchesButton.class);
		
		branchesbuttonclick.executeBranchButton(data1.driver);
	}

	
	
	
	
}