package Modules;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class alert {

	
	public static Alert switchAlert(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		String al=alert.getText();
		System.out.println(al);
		alert.accept();
		return alert;
		}
}
