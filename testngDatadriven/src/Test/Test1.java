package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import baseTests.BasicOperations;

public class Test1 extends BasicOperations {
	@BeforeTest
	public void init()
	{
		initializePropertyFile();
		InitExtent();
	}
	@BeforeMethod
	public void starttest()
	{
		test=Rep.startTest("test");
	}
	@AfterMethod
	public void endTest()
	{
		Rep.endTest(test);
	}
	@Test(priority=1)
	public void Firsttest()
	{
				test.log(LogStatus.INFO, "opening browser");
				OpenBrowser(prop.getProperty("Browser"));
				test.log(LogStatus.PASS, "passed");
				TakeScreenShot();
				
		
	}
	@Test
	public void SecondTest()
	{
		test.log(LogStatus.INFO, "opening browser");
		navigate(prop.getProperty("SiteName"));
		test.log(LogStatus.PASS, "passed");
		TakeScreenShot();
		
	}
	

}