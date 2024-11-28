package automationFrameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import lombok.Builder;

public class Amazon {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement sin = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		Actions act = new Actions(driver);
		act.moveToElement(sin).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text((),'Sign in')]")).click();
		driver.close();
		driver.findElement(By.id("twotabsearchtextbox")).click();
		WebElement srch = driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		// driver.close();
		driver.findElement(By.id("nav_avod_desktop_topnav")).click();
		driver.close();

		driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();

	}

}
