package Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObject.newbranch;

public class Generic {
	
	
	public static Select dp(WebDriver driver,By prop,String exp)
	{
		Select s=new Select(driver.findElement(prop));
		
		List<WebElement> list=s.getOptions();
		
		for(WebElement op:list)
		{
			String acttext=op.getText();
			
			System.out.println(acttext);
			if(acttext.contains(exp))
			{
				s.selectByVisibleText(exp);
				break;
			}
			
		}
		return s;
	}

}
