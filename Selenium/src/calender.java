import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class calender {
	FirefoxDriver fd;
	@Test
	public void makemytrip() throws ParseException
	{
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		fd=new FirefoxDriver();
		fd.get("https://www.makemytrip.com");
		fd.manage().window().maximize();
		fd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		fd.findElementById("hp-widget__depart").click();
		WebDriverWait w= new WebDriverWait(fd, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@id,'dp149')]/div/div[1]/div/div")));
		selectdate("01/01/2018");
		
	}
	
	public void selectdate(String selectD) throws ParseException
	{
		Date datetobeselected=new SimpleDateFormat("MM/dd/yyyy").parse(selectD);
		Date currentDate = new Date();
		String MonthYearToBeSelected = (new SimpleDateFormat("MMMM").format(datetobeselected)).toUpperCase() +" "+ new SimpleDateFormat("yyyy").format(datetobeselected);
		String monthdatedisplayed=fd.findElement(By.xpath("//*[starts-with(@id,'dp149')]/div/div[1]/div/div")).getText();
		System.out.println(monthdatedisplayed+MonthYearToBeSelected+datetobeselected+currentDate);
		while(true)
		{
		if(monthdatedisplayed.equals(MonthYearToBeSelected))
		break;	
		if(datetobeselected.after(currentDate))
			fd.findElement(By.xpath("//*[starts-with(@id,'dp149')]/div/div[2]/div/a/span")).click();
		else
			fd.findElement(By.xpath("//*[starts-with(@id,'dp149')]/div/div[1]/div/a/span")).click();
		monthdatedisplayed=fd.findElement(By.xpath("//*[starts-with(@id,'dp149')]/div/div[1]/div/div")).getText();
		}
		String day = new SimpleDateFormat("d").format(datetobeselected);
		System.out.println(day);
		fd.findElement(By.xpath("//a[text()='"+day+"']")).click();
		//List<WebElement> dates= fd.findElementsByXPath("//*[starts-with(@id,'dp149')]/div/div[1]/table/tbody/tr/td");
		/*for (int i=0;i<dates.size();i++)
		{
			System.out.println(new SimpleDateFormat("dd").format(datetobeselected)+dates.get(i).getText());
			if(dates.get(i).getText().equals(new SimpleDateFormat("dd").format(datetobeselected)))
					{dates.get(i).click();break;}
		}*/
		
		
	}
	

	}
