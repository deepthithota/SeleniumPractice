package baseTests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicOperations {
	
	public WebDriver wd=null;
	public Properties prop = null;
	public void itialize()
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
	}
	
	public void navigate(String url)
	{
		wd.navigate().to(url);
	}
	
	
	public void CloseBrowser()
	{
		wd.quit();
	}
	

	public void click(String Locatortype)
	{
		FindElement(Locatortype).click();
	}
	
	public void typekeys(String Locatortype,String keys)
	{
		FindElement(Locatortype).sendKeys(keys);
	}
	
	public WebElement FindElement(String Locatortype)
	{
		WebElement wb = null;
		if(Locatortype.endsWith("_id"))
			wb=wd.findElement(By.id(System.getProperty(Locatortype)));
		else if(Locatortype.endsWith("_name"))
			wb=wd.findElement(By.name(System.getProperty(Locatortype)));
		else if(Locatortype.endsWith("_xpath"))
			wb=wd.findElement(By.xpath(System.getProperty(Locatortype)));
		else
			System.out.println("invalid property name");
		return wb;
	}
	
	public void ReportPass()
	{
		
	}
	public void ReportFail(String Message)
	{
		
	
	}
	public void TakeScreenShot()
	{
		
	}
	
}
