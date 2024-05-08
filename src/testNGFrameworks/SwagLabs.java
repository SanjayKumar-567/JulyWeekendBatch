package testNGFrameworks;

import java.io.File;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

//import com.google.common.io.Files;

public class SwagLabs {
	WebDriver driver;
	ExtentReports extentReport; //created object for extended report
	//ExtentHtmlReporter htmlreporter;//created extent html report
	ExtentTest testcase;

	@Test
	public void a1_PageLoded()
	{				
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--remote-allow-origins=* ");
	 driver = new ChromeDriver(co) ;

		extentReport = new ExtentReports();
		//htmlreporter = new ExtentHtmlReporter("ExtentReport.html");
	//	extentReport.attachReporter(htmlreporter);
		testcase=extentReport.createTest("verifiy guru url is opend");
	driver.get("https://www.saucedemo.com/");     
	driver.manage().window().maximize();
	//driver.findElement(By.id("details-button")).click();
	//driver.findElement(By.id("proceed-link")).click();
	}

	@Test
	public void a2_LoginPage()
	{
		testcase=extentReport.createTest("verifysucessfully completed  contact_info and started mailing_info");

	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Test
	public void a3_AddToCart() throws IOException
	{
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']")).click();
	driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
	driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']/following::button[1]")).click();
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("first-name")).sendKeys("sanjay");
	driver.findElement(By.id("last-name")).sendKeys("kumar");
	driver.findElement(By.id("postal-code")).sendKeys("600091");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();

	//File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
	//Files.copy(f, new File("D:\\compaq bkp\\c bkp\\Pictures\\screenshot.jpg"));
	
	File screenshort=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(screenshort, new File("D:\\compaq bkp\\c bkp\\Pictures\\screenshot.jpg"));
	
	}

	@Test
	public void a4_PrintText()
	{
	String PageTitle = driver.getTitle();//to print on consul screen
	System.out.println(PageTitle);        


	String CurrentPageUrl =driver.getCurrentUrl();
	System.out.println(CurrentPageUrl);


//	String PageText = driver.findElement(By.xpath("//h2[contains(text(),'THANK')]")).getText();
//	      System.out.println(PageText);
//	     
//	     
//	        String CssValu =driver.findElement(By.xpath("//img[@class='pony_express']")).getCssValue("font-size");
//	        System.out.println(CssValu);
	}
	     
	@Test
	public void a5_LogOut()
	{
	       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.findElement(By.id("react-burger-menu-btn")).click();
	        driver.findElement(By.id("logout_sidebar_link")).click();
	      

	        driver.quit();
	        extentReport.flush();//this line generate the output
	        
	}


	}


