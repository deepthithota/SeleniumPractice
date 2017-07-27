package Test;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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
		CloseBrowser();
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
				test=Rep.startTest("test1");
				test.log(LogStatus.INFO, "opening browser");
				OpenBrowser(prop.getProperty("Browser"));
				TakeScreenShot();
				ReportPass();
				
		
	}
	@Test(priority=2,dependsOnMethods="Firsttest")
	public void SecondTest()
	{
		test=Rep.startTest("test2");
		test.log(LogStatus.INFO, "opening site");
		navigate(prop.getProperty("SiteName"));
		TakeScreenShot();
		ReportPass();
	}

	@Test(priority=3,dependsOnMethods="SecondTest",dataProvider="loginname")
	public void Thirdtest(String LoginName)
	{
		test=Rep.startTest("test3");
		test.log(LogStatus.INFO, "entering username");
		typekeys("Username_id",LoginName);
		test.log(LogStatus.INFO, "clicking next");
		click("Next_xpath");
		TakeScreenShot();
		NavigateBack();
		
		ReportPass();
	}
	@DataProvider(name="loginname")
	public Object[][] getloginname()
	{
		Object[][] data = new Object[3][1];
		data[0][0]="thota.deepthi";
		data[1][0]="thota.deepthi85";
		data[2][0]="srinivas6661";
		return data;
	}
}
