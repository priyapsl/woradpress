package com.persy.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SuitBaseWordPress {
	
public static WebDriver driver = null;	
public static Actions act = null;
@BeforeTest
@Parameters ({"BrowseType"})
public void selectBrowser(String BrowseType)
{
	switch(BrowseType)
	{
	case "ff":
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 act = new Actions(driver);
		 System.out.println("My driver is" +BrowseType);
		 Reporter.log("My driver is" +BrowseType);
		break;
		
	case "chrome":
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 act = new Actions(driver);
	 System.out.println("My driver is" +BrowseType);
	 Reporter.log("My driver is" +BrowseType);
	break;
	
	case "ie":
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\iexplore.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 act = new Actions(driver);
		 System.out.println("My driver is" +BrowseType);
		 Reporter.log("My driver is" +BrowseType);
		break;
		
	
	
	
	
	}



}
 
@AfterMethod
public void testmethod()
{
	

}


}
