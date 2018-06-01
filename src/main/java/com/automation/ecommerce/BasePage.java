package com.automation.ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage
{
	public static WebDriver driver;
	public static final String path="./Configre.properties";
	
	
	public static String getData(String key) throws Exception
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	public static void browserLaunch(String browser,String url)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
		    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");	
		    driver=new ChromeDriver();
		
		}
		else
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.geckodriver.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//Driver//IEDriverServer.exe");
		    driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();

    
	}


public int randomNumber()
{
	Random r =new Random();
	int random=r.nextInt(9999);
	return random;
}

public void elementVisible(int time,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,time);
	wait.until(ExpectedConditions.visibilityOf(element));
}

public void selectOption(WebElement element, int option)
{
	Select sel=new Select(element);
	sel.selectByIndex(option);
}
}