package Test;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import baseTests.BasicOperations;

public class Test1 extends BasicOperations {
	@BeforeTest
	public void init()
	{
		System.out.println("beforetest");
		initializePropertyFile();
		InitExtent();
	}
	@AfterTest
	public void quit()
	{
		Rep.flush();
		wd.quit();
	}
	@BeforeMethod
	public void starttest()
	{
		
	}
	@AfterMethod
	public void endTest()
	{
		Rep.endTest(test);
		
		
	}
	@Test(priority=1)
	public void Firsttest()
	{
		System.out.println("test1");
				test=Rep.startTest("test1");
				test.log(LogStatus.INFO, "opening browser");
				OpenBrowser(prop.getProperty("Browser"));
				TakeScreenShot();
				test.log(LogStatus.PASS, "passed");
				
		
	}
	@Test(priority=2)
	public void SecondTest()
	{
		System.out.println("test2");
		test=Rep.startTest("test2");
		test.log(LogStatus.INFO, "opening site");
		navigate(prop.getProperty("SiteName"));
		TakeScreenShot();
		test.log(LogStatus.PASS, "passed");
	}

	/*@Test
	public void test()
	{
		initializePropertyFile();
		System.out.println("Browser");
		ExtentReports Repo=new ExtentReports("E:\\report");
		//Repo.loadConfig(new File("E:\\Git_local_repo\\testngDatadriven\\src\\ExtentReportsConfig.xml"));
		
	}*/
	
	}

