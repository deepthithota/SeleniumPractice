import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;


public class bymethodtoidentify {
	
	@Test
	public void identify()
	{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32\\chromedriver.exe");

	//ChromeDriver fd= new ChromeDriver();
	FirefoxDriver fd = new FirefoxDriver();
	fd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	fd.get("http://google.com");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	fd.findElement(By.cssSelector("input.gsfi")).sendKeys("hi");
	//WebElement email=fd.findElement(By.id("lst-ib"));
	//email.sendKeys("turmeric");
	
	//WebElement next=fd.findElement(By.id("_fZl"));
	fd.findElement(By.cssSelector("#_fZl")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//fd.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[2]/div/div/h3/a")).click();
	//fd.findElement(By.cssSelector("*[id='rso'] > div > div > div:nth-of-type(2) > div > div > h3 > a")).click();
	//fd.findElement(By.partialLinkText("Images")).click();
	String s=fd.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[2]/div/div/h3/a")).getAttribute("href");
	System.out.println("s is "+s);
	fd.findElement(By.xpath("//*[text()='Videos']")).click();
			
	List<WebElement> alllinks=fd.findElements(By.tagName("a"));
	for(int i=0;i<alllinks.size();i++)
		System.out.println(alllinks.get(i).getAttribute("href"));
	
	//next.click();
	//fd.close();
	
	
	
	}
}
