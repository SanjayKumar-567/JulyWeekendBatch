package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement sin = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		Actions act = new Actions(driver);
		act.moveToElement(sin).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text((),'Sign in')]")).click();
		driver.close();
	}
}
