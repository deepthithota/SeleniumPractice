import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dynamicwebbrowser {
	//String browser = "firefox";
	@Test(dataProvider="get")
	public void launch(String browser)
	{
		WebDriver wd=null;
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");

		if (browser.equals("firefox"))
		{
			//ProfilesIni allprof = new ProfilesIni();
			//FirefoxProfile fp = allprof.getProfile("test");
			
			wd = new FirefoxDriver();
		}
			
		else 
			wd = new ChromeDriver();
		
		wd.get("http://gmail.com");
		wd.quit();
		
	}
	@DataProvider
	public Object[][] get()
	{
		
		return (new Object[][]{{"firefox"},{"else"}});
		
	}
	
	}

