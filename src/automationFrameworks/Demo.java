package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co) ;
		driver.manage().window().maximize();
		driver.get("https://careerscloud.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Log in with Google')]")).click();
		driver.findElement(By.xpath("//div[@class='BHzsHc']")).click();

	}

}
