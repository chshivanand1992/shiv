package com.pagelibrary.KeximBank;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Modules.Login;

import Modules.branchesbuttonclick;
import Modules.branchesbuttondisplay;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LoginPage;
import pageObject.branchesbuttonEnabled;

public class Step_definition {

public branchStep_definitionData data = new branchStep_definitionData();
	public Step_definition() {
		data.data1.driver=Hooks.driver;
	}
	@Given("^launch the site$")
public void launch_the_site() throws Throwable {
	   data.data1.driver.get("http://srssprojects.in/home.aspx");
		}
	@When("^Enter the login fields$")
public void Enter_the_login_fields() {
PageFactory.initElements(data.data1.driver, LoginPage.class);
Login.executelogin(data.data1.driver);
}
@Then("^Branches button should be displayed$")
	public void Branches_button_should_be_displayed() throws Throwable {
	PageFactory.initElements(data.data1.driver, branchesbuttonEnabled.class);
		branchesbuttondisplay.executeDisplay(data.data1.driver);
}
@Then("^close site$")
	public void close_site() throws Throwable {
	  	data.data1.driver.close();
	}}
