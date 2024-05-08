package testNGFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Guru {
	

		WebDriver driver;
		
		@Test
		public void a1_contact_info() throws InterruptedException

		{

		//WebDriverValue.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions co= new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(co) ;		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		

		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("sanjay ");
		driver.findElement(By.name("lastName")).sendKeys("kumar p");
		driver.findElement(By.xpath("//input[@name ='phone']")).sendKeys("9790948567");
		driver.findElement(By.xpath("//input[@id ='userName']")).sendKeys("sanjayoffical@gmail.com");
		}
		@Test
		public void a2_mailing_info()
		{
		Reporter.log("sucessfully completed  contact_info and started mailing_info");

		driver.findElement(By.name("address1")).sendKeys("subaramaniya nagar");
		driver.findElement(By.xpath("//input[@name ='city']")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("tamil nadu");
		driver.findElement(By.xpath("//input[@name ='postalCode']")).sendKeys("600091");
		            WebElement findElement = driver.findElement(By.name("country"));
		           
		               Select select = new Select(findElement);
		               select.selectByVisibleText("INDIA");            
		           
		}
		@Test
		public void a3_user_info()
		{
		Reporter.log("sucessfully completed mailing_info and starteduser_info");

		               driver.findElement(By.id("email")).sendKeys("sanjay@gmail.com");
		               driver.findElement(By.name("password")).sendKeys("123456789");
		               driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
		        driver.findElement(By.xpath("//input[@name ='submit']")).click();

		Reporter.log("sucessfully completed user_info");
		             driver.close();		               

		}
		}


