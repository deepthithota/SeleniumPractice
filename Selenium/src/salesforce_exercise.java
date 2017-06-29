import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class salesforce_exercise {
static FirefoxDriver fd=null;
	@BeforeClass
	public void opensalesforce()
	{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		fd= new FirefoxDriver();
		fd.navigate().to("http://salesforce.com");
		fd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void login()
	{
		fd.findElement(By.xpath("html/body/header/div[2]/div/div[1]/div/div/nav/div[1]/div/div[2]/div[4]/div/div/a")).click();
		fd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		fd.findElement(By.id("username")).sendKeys("deepthithota@yahoo.com");
		fd.findElement(By.id("password")).sendKeys("pranav@13");
		fd.findElement(By.id("Login")).click();
		
		fd.findElement(By.id("save")).click();
		
		
		fd.findElement(By.cssSelector("#\\32 84\\:0\\;p > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1) > svg:nth-child(1)")).click();
		fd.findElement(By.linkText("New Lead"));
	}
	@Test(priority=2,dependsOnMethods={"login"})
	public void addnewlead()
	{
		
	}
	

}
