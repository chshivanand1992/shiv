package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class newbranch {

	@FindBy(how=How.ID,using="BtnNewBR")
	public static WebElement newbranchesbutton1;   
     @FindBy(how=How.ID,using="txtbName")
	public static WebElement newBranchName;
	@FindBy(how=How.ID,using="txtAdd1")
	public static WebElement address1;
	@FindBy(how=How.ID,using="Txtadd2")
	public static WebElement address2;
	@FindBy(how=How.ID,using="txtadd3")
	public static WebElement address3;
	@FindBy(how=How.ID,using="txtArea")
	public static WebElement area;
	@FindBy(how=How.ID,using="txtZip")
	public static WebElement zipcode;
	@FindBy(how=How.ID,using="lst_counrtyU")
	public static WebElement country;
	@FindBy(how=How.ID,using="lst_stateI")
	public static WebElement state;
	@FindBy(how=How.ID,using="lst_cityI")
	public static WebElement city;
	@FindBy(how=How.ID,using="btn_insert")
	public static WebElement submit;
	@FindBy(how=How.ID,using="Btn_Reset")
	public static WebElement reset;
	@FindBy(how=How.ID,using="Btn_cancel")
	public static WebElement cancel;
	}
