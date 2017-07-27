package baseTests;

import org.testng.Assert;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasicOperations {
	
	public WebDriver wd=null;
	public Properties prop = null;
	public ExtentReports Rep=null;
	public ExtentTest test;
	public void initializePropertyFile()
	{
		if (prop==null)
		{
			prop =new Properties();
			try {
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//config.properties");
				prop.load(fis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
			}
		}
		
	}
	public void InitExtent()
	{
		if (Rep==null)
		{
			String FilePath = System.getProperty("user.dir")+"\\ExtentReports\\"+new Date().toString().replace(" ","_").replace(":", "_");
			//System.out.println(FilePath);
			Rep = new ExtentReports(FilePath, true, DisplayOrder.NEWEST_FIRST);
			Rep.loadConfig(new File(System.getProperty("user.dir")+"\\src\\ExtentReportsConfig.xml"));
		}
						
	}
	public void OpenBrowser(String browser)
	{
		System.setProperty("webdriver.gecko.driver",prop.getProperty("Firefox_Driver_Path"));
		System.setProperty("webdriver.chrome.driver",prop.getProperty("Chrome_Driver_Path"));

		if (wd==null)
		{
		if(browser.equals("chrome")) 
			wd=new ChromeDriver();
		else if(browser.equals("firefox")) 
			wd = new FirefoxDriver();
		else if(browser.equals("IE"))
			wd=new InternetExplorerDriver();
		else
			System.out.println("Invalid browser name");
		}
		try {
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wd.manage().window().maximize();
	}
	
	public void navigate(String url)
	{
		wd.navigate().to(url);
	}
	
	
	public void CloseBrowser()
	{
		wd.quit();
		Rep.flush();
		
	}
	

	public void click(String Locatortype)
	{
		if (IsElementPresent(Locatortype))
		FindElement(Locatortype).click();
		else ReportFail("Element not present");
	}
	
	public void typekeys(String Locatortype,String keys)
	{
		if (IsElementPresent(Locatortype))
		FindElement(Locatortype).sendKeys(keys);
		else ReportFail("Element not present");
	}
	
	public WebElement FindElement(String Locatortype)
	{
		WebElement wb = null;
		try
		{
		if(Locatortype.endsWith("_id"))
			wb=wd.findElement(By.id(prop.getProperty(Locatortype)));
		else if(Locatortype.endsWith("_name"))
			wb=wd.findElement(By.name(prop.getProperty(Locatortype)));
		else if(Locatortype.endsWith("_xpath"))
			wb=wd.findElement(By.xpath(prop.getProperty(Locatortype)));
		else
			System.out.println("invalid property name");
		}
		catch(Exception ex)
		{
			ReportFail(ex.getMessage());
		}
		return wb;
	}
	
	public void ReportPass()
	{
		test.log(LogStatus.PASS, "passed");
				
	}
	public void ReportFail(String Message)
	{
		TakeScreenShot();
		test.log(LogStatus.FAIL, Message);
		Assert.fail(Message);
	}
	public void TakeScreenShot()
	{
		String FileName = new Date().toString().replace(" ","_").replace(":", "_");
		File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\screenshots\\"+FileName));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
			
		test.log(LogStatus.INFO, test.addScreenCapture(System.getProperty("user.dir")+"\\screenshots\\"+FileName));
	}
	public Boolean IsElementPresent(String Locatortype)
	{
		List<WebElement> wb=null;
		try
		{
		if(Locatortype.endsWith("_id"))
			wb=wd.findElements(By.id(prop.getProperty(Locatortype)));
		else if(Locatortype.endsWith("_name"))
			wb=wd.findElements(By.name(prop.getProperty(Locatortype)));
		else if(Locatortype.endsWith("_xpath"))
			wb=wd.findElements(By.xpath(prop.getProperty(Locatortype)));
		else
			System.out.println("invalid property name");
		}
		catch(Exception ex)
		{
			ReportFail(ex.getMessage());
		}
		if(wb==null) return false;
		return true;
	}
	public void NavigateBack()
	{
		wd.navigate().back();
	}
	}

