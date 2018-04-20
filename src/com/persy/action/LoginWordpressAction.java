package com.persy.action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.persy.page.LoginWordPressPage;
import com.persy.utility.ExcelConfig;
import com.persy.utility.SuitBaseWordPress;

public class LoginWordpressAction extends SuitBaseWordPress {
	
	
	@Test(dataProvider = "WordpressData")
	public void LoginAction(String UserName, String Pwd)
	{
		driver.findElement(LoginWordPressPage.UserIDTest).sendKeys(UserName);
		driver.findElement(LoginWordPressPage.UserPwd).sendKeys(Pwd);
		driver.findElement(LoginWordPressPage.LoginButton).click();
	}
	

	@DataProvider
	public Object[][] WordpressData()
	   {
		   Object[][] exceldata = null;
		  
		   for(int i=0;i<5;i++)
		   {
			   for(int j=0;j<3;j++)
			   {
				   exceldata[i][j] = ExcelConfig.ReadExcel();
				
			   }
		   }
		
		   return exceldata;
	   }


 
}
