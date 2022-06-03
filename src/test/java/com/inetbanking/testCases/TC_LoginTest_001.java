package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	 
	 @Test
     public void loginTest()
     {
		driver.get(baseURL);
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Enter username");
		
		lp.setPassword(password);
		logger.info("Enter password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Home Page"))
		{
		  Assert.assertTrue(true);
		  logger.info("Login test passed");
        }
		else
		{
		 Assert.assertTrue(false);
		 logger.info("Login test failed");
		}
			
    }
	
}	

