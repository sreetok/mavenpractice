package com.automation.ecommerce.pageui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.automation.ecommerce.BasePage;

public class Customerregistration  extends BasePage
{
	@FindBy(linkText="Sign in")public WebElement signIn;
	@FindBy(id="email_create") WebElement mailid;
	@FindBy(id="SubmitCreate") WebElement submit;
	@FindBy(xpath="//h1[text()='Create an account']") WebElement verify;
	@FindBy(id="id_gender2") WebElement mrs;
	@FindBy(id="customer_firstname") WebElement firstname;
	@FindBy(id="customer_lastname") WebElement lastname;
	@FindBy(id="passwd") WebElement password;
	@FindBy(id="days")WebElement date;
	@FindBy(id="months") WebElement month;
	@FindBy(id="years") WebElement year;
	@FindBy(id="address1") WebElement address;
	@FindBy(id="city")WebElement city;
	@FindBy(id="id_state") WebElement state;
	@FindBy( id="postcode") WebElement pincode;
	@FindBy(id="id_country")WebElement country;
	@FindBy(id="phone_mobile") WebElement mobile;
	@FindBy(id="submitAccount") WebElement register;
	@FindBy(xpath="//h1[text()='My account']") WebElement myaccount;
	
  public Customerregistration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



	public  void CustermerRegistration()
	{
		try {
			signIn.click();
			mailid.sendKeys(getData("firstname")+getData("lastname")+randomNumber()+getData("domainname"));
			submit.click();
			Thread.sleep(5000);
			//Assert.assertTrue(verify.getText().equalsIgnoreCase("Create an account"));
			mrs.click();
			firstname.sendKeys("sree");
			lastname.sendKeys("lakshmi");
			password.sendKeys("sree@2010");
			selectOption(date,3);
			selectOption(month, 3);
			selectOption(year,2);
			address.sendKeys("chintal");
			city.sendKeys("Hyderabab");
			state.sendKeys("telangana");
			pincode.sendKeys("55055");
			country.sendKeys("india");
			mobile.sendKeys("9030011656");
			register.click();
			//Assert.assertTrue(myaccount.getText().equalsIgnoreCase("My account"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

	