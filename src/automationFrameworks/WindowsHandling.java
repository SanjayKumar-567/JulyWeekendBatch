package automationFrameworks;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandling {
	 public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.flipkart.com/"); // july 30,31= assinments
		driver.manage().window().maximize(); 
		String url1=driver.getCurrentUrl();
		System.out.println(url1); 
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles"); 
		driver.findElement(By.xpath("//input[@name='q']/following::button[1]")).click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[normalize-space()='POCO C51 (Royal Blue, 64 GB)']")).click(); 
		Thread.sleep(1000);
		
		ArrayList<String> flipkartTab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(flipkartTab.get(1));
		
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		//div[normalize-space()='POCO C51 (Royal Blue, 64 GB)']

		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.close();
		driver.quit();

	}


}
