package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class branchesButton {
	@FindBy(how=How.XPATH,using="//img[@src='images/Branches_but.jpg']")
	public static WebElement branchesbutton1;
}
