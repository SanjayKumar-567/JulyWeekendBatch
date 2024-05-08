package testNGFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Annotation {
	WebDriver driver;
	//ExtentReports extentReport;
	//ExtentSparkReporter htmlReporter;
	//ExtentTest testCase;

	long starttime;
	long endtime;
	@BeforeSuite
	public void  launchbrowse() {
		//extentReport =new ExtentReports();
		//htmlReporter = new	ExtentSparkReporter("ExtendReport.html");//project
		//extentReport.attachReporter(htmlReporter);
		
	starttime =System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");    
	driver = new ChromeDriver(co);
	          driver.manage().window().maximize();

	}
	@Test
	public void  a_google() {
	//	testCase=extentReport.createTest("verify google title");
	         driver.get("https://www.google.com/");
	      String title =  driver.getTitle();
	      if(title.equals(title))
	System.out.println("passed");
	      else
	    	  System.out.println("failed");
	}
	@Test
	public void  b_bingo() {
		//testCase=extentReport.createTest("verify bingo title");


	driver.get("https://www.bing.com/");
	System.out.println("bing opened");

	}
	@Test
	public void  c_facebook() {
		//testCase=extentReport.createTest("verify fb title");


	driver.get("https://www.facebook.com/");
	System.out.println("fb opened");

	}

	@AfterSuite
	public void  closebrowse() {
	driver.quit();
	//extentReport.flush();
	endtime =System.currentTimeMillis();
	long totaltime=endtime-starttime;
	System.out.println(totaltime);
	}


}
