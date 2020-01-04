package learnPOM.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import learnPOM.utils.LeadsInputData;

public class ProjectSpecificMethods {	
	public static ChromeDriver driver;
	public static String xlfilename;
	String url="http://leaftaps.com/opentaps/control/main";
	
	@BeforeMethod
	public void launchBrowser() {
	  	  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver78.exe");
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get(url);
	}
	
	@DataProvider(name="getData")
	public String[][] fetchData() throws IOException  {
		/*
		String [][] logindata = new String [2][2];
		logindata[0][0] ="DemoSalesManager"; logindata[0][1] ="crmsfa";
		logindata[1][0] ="democsr"; logindata[1][1] ="crmsfa";
		return logindata;
		*/
		
		LeadsInputData mydata = new LeadsInputData(); 
		return mydata.readXL(xlfilename);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();  	
	}	
}