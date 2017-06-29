import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class americangolf {
	@Test
	public void mousetest()
	{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("http://www.americangolf.co.uk");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions act=new Actions(fd);
		WebElement Golfclubs=fd.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
		act.moveToElement(Golfclubs).build().perform();
		
		WebDriverWait wait = new WebDriverWait(fd, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a/span[1]")));
		fd.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a/span[1]")).click();
			
		WebElement PriceRange=fd.findElement(By.xpath("//*[@id='secondary']/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div"));
		//WebElement target=fd.findElement(By.xpath("//*[@id='secondary']/div[1]/div[1]/div/div/div[1]/div/div/div[3]/div"));
		//act.dragAndDrop(PriceRange, target);
		
		//failed
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.dragAndDropBy(PriceRange,20,0).build().perform();
		
		
		
		
	}

}
