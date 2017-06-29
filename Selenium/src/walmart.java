import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class walmart {
	

	@Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		FirefoxDriver fd= new FirefoxDriver();
		fd.navigate().to("http://walmart.com");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//fd.findElement(By.xpath("//*[@data-tl-id='header-GlobalLefthandNav-toggle']")).click();
		
		 WebElement box=fd.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/nav[2]/div/div[1]"));
		 List<WebElement> list =box.findElements(By.tagName("a"));
		 for(int i=0;i<list.size();i++)
		 {
			System.out.println(list.get(i).getText());
			//fd.findElement(By.cssSelector("#global-search-input")).sendKeys("aaaaaa......"+i);
			int response=0;
			try {
				String url=list.get(i).getAttribute("href");
				response = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(response);
			//list.get(i).click();
			//WebDriverWait w=new WebDriverWait(fd, 5);
			//System.out.println(fd.getTitle());
			//System.out.println(fd.findElement(By.cssSelector("#global-search-input")).getAttribute("value"));
			fd.navigate().back();
			 box=fd.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/nav[2]/div/div[1]"));
			 list =box.findElements(By.tagName("a"));
		 }
		 
		 
			
		
	}

}
