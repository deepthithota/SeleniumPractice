import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class qtpselenium {

	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("http://qtpselenium.com");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		fd.findElement(By.xpath("html/body/main/div[1]/div/div/div[4]/div/button[3]")).click();
		fd.findElement(By.id("exampleInputEmail3")).sendKeys("Deepthi");
		Select dropbox=new Select(fd.findElement(By.xpath("html/body/main/div[2]/div/div[1]/div[1]/div/form/div[2]/div[2]/select")));
		dropbox.selectByVisibleText("India");
		
	}
}
