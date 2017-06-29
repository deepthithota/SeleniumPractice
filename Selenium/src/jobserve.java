import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class jobserve {
	@Test
	public void testsite()
	{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("http://www.jobserve.com");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		fd.findElement(By.xpath("html/body/form/div[4]/div[1]/div[7]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/span/span")).click();
		
		
		//WebElement industry = fd.findElement(By.xpath("html/body/form/div[4]/div[1]/div[7]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/div"));
		List<WebElement> checkboxes=fd.findElements(By.xpath("html/body/form/div[4]/div[1]/div[7]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/div/div/label"));
		//System.out.println(checkboxes.size());
		//System.out.println(checkboxes.get(1).getText());
		checkboxes.get(0).click();
		for(int i=0;i<checkboxes.size();i++)
		{
			if ((checkboxes.get(i).getText()).equals("Education"))
				checkboxes.get(i).click();
		}
	}

}
