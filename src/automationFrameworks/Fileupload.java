package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co) ;
		
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=Cj0KCQiA6fafBhC1ARIsAIJjL8n6lcxNTVvfRqEd28gmMtwAHVc5elQbQJE7eP_LlmvCLR82kgGsmXIaAulBEALw_wcB&gclsrc=aw.ds");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("sanjay");
		driver.findElement(By.id("email")).sendKeys("sanjay97official@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sk@kumar97");
		driver.findElement(By.id("mobile")).sendKeys("9790948567");
		
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);hold over all script
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[4]/div[2]/div[2]/div[2]/p[1]")).click();
		//driver.findElement(By.id("currentCity")).sendKeys("chennai")
		//driver.findElement(By.xpath("//span[contains(text(),'Chennai')]")).click();

		WebElement upload =driver.findElement(By.xpath("//button[contains(text(),'Upload ')]"));
		upload.click();
		upload.sendKeys("D:\\compaq bkp\\RESUME\\P.Sanjay Kumar Resume (2) (1).pdf");







		}


	}


