import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class webtable {
	@Test
	public void rediffwebtable()
	{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		FirefoxDriver fd=new FirefoxDriver();
		fd.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> CompanyNames=fd.findElements(By.cssSelector("table[class='dataTable'] tbody tr td:nth-child(1)"));
		List<WebElement> Currentprice=fd.findElements(By.cssSelector("table[class='dataTable'] tbody tr td:nth-child(4)"));
		for(int i=0;i<CompanyNames.size();i++)
			if(CompanyNames.get(i).getText().equals("Piramal Enterprises"))
				System.out.println(Currentprice.get(i).getText());
		
	}
}
