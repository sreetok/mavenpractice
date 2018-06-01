package com.automation.ecommerce.Ecommerce;

import org.testng.annotations.Test;

import com.automation.ecommerce.BasePage;
import com.automation.ecommerce.pageui.Customerregistration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TC001_login extends BasePage{
	Customerregistration register;
  
  @BeforeMethod
  @Parameters("browser")
  public void startprocess(String browser) throws Exception
  {
	browserLaunch(browser,getData("ecommerce")); 
  }
  @Test
  public void login() 
  {
	register=new Customerregistration(driver); 
	register.CustermerRegistration();
	  
  }

  @AfterMethod
  public void endprocess() {
  }

}
