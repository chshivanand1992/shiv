package com.pagelibrary.KeximBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
	
	public static WebDriver driver;
	
	@Before
	public void callbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\java1\\chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
	}
	@After
	public void screenshort(Scenario s)
	{
		try {
			if(s.isFailed())
			{
				System.out.println("get currenturl:-"+driver.getCurrentUrl());
				
				TakesScreenshot screen=(TakesScreenshot)driver;
				
				byte[] br=screen.getScreenshotAs(OutputType.BYTES);
				
				s.embed(br, "image/png");
				
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
