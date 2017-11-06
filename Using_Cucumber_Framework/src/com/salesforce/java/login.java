package com.salesforce.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	WebDriver wb;
	Properties prop;
	
	public void Open_Browser(String browser) throws FileNotFoundException, IOException, InterruptedException
	{
		prop =new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\salesforce\\util\\config.properties"));
		System.setProperty("webdriver.gecko.driver",prop.getProperty("firefox_driver_path"));
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chrome_driver_path"));

		if(prop.getProperty(browser).equals("mozilla"))
			wb=new FirefoxDriver();
		else if (prop.getProperty(browser).equals("Chrome"))
			wb=new ChromeDriver();
		wb.manage().window().maximize();
		//wb.manage().timeouts().wait(1);
		
	}
	public void Navigate(String URL)
	{
		wb.get(prop.getProperty(URL));
	}
	
public void Enter_Values(String field, String value)
{
	if (IsElementPresent(field))
	wb.findElement(By.xpath(prop.getProperty(field))).sendKeys(prop.getProperty(value));
}
public void Click_button(String buttontype)
{
	if (IsElementPresent(buttontype))
	wb.findElement(By.xpath(prop.getProperty(buttontype))).click();
	
}
public Boolean IsElementPresent(String Element)
{
	List<WebElement> w= wb.findElements(By.xpath(prop.getProperty(Element)));
	if(w.isEmpty()) return false;
	return true;
}

}
