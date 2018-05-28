package Modules;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObject.newbranch;

public class newbranchclick {
	public static void executenewBranchButton(WebDriver driver,List<Map<String, String>> map,int index)
	{
		newbranch.newbranchesbutton1.click();
		newbranch.newBranchName.sendKeys(map.get(index).get("BRANCHNAME"));
		newbranch.address1.sendKeys(map.get(index).get("ADDRESS1"));
		newbranch.address2.sendKeys(map.get(index).get("ADDRESS2"));
		newbranch.address3.sendKeys(map.get(index).get("ADDRESS3"));
		newbranch.area.sendKeys(map.get(index).get("AREA"));
		newbranch.zipcode.sendKeys(map.get(index).get("ZIPCODE"));
		Generic.dp(driver, By.id("lst_counrtyU"),map.get(index).get("COUNTRY"));
		Generic.dp(driver, By.id("lst_stateI"),map.get(index).get("STATE"));
		Generic.dp(driver, By.id("lst_cityI"),map.get(index).get("CITY"));
		newbranch.submit.click();	
		alert.switchAlert(driver);
	}
}
//map.get(0).get("branchname")