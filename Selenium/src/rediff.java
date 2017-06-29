import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.annotations.Test;




public class rediff {
	@Test
	public void multiwindow()
	{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("http://www.rediff.com");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//WebElement mens=fd.findElement(By.xpath("//*[@id='topcat1']"));
		//Actions act=new Actions(fd);
		//act.contextClick(mens).build().perform();
		//.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		fd.findElement(By.xpath("//*[@id='div_ad_top']/a/img")).click();
		Set<String> s=fd.getWindowHandles();
		
		Iterator<String> i = s.iterator();
		String main=i.next();
		String second=i.next();
		
		
		fd.switchTo().window(second);
		System.out.println(main+"  "+second+"    "+fd.getWindowHandle());
		fd.close();
		fd.switchTo().window(main);
		System.out.println(main+"  "+second+"    "+fd.getWindowHandle());
		
		
		
	}

}
