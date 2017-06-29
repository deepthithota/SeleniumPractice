
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class mod1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		// TODO Auto-generated method stub
		FirefoxDriver fd= new FirefoxDriver();
		fd.get("http:\\google.com");
		
		
		// TODO Auto-generated method stub
		ChromeDriver cd= new ChromeDriver();
		
		cd.get("http:\\yahoo.com");
		

	}

}
