package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class InternetInput {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver (co);
		   driver.get("https://the-internet.herokuapp.com/inputs");
		   driver.findElement(By.xpath("//p[contains(text(),'Number')]/following::input[1]")).sendKeys("10");
		   Actions act = new Actions(driver);
		   Thread.sleep(2000);
		   for(int i=0;i<5;i++)
		   {
		    act.sendKeys(Keys.ARROW_UP).build().perform();
		   }
		   Thread.sleep(2000);
		   for(int i=0;i<5;i++)
		   {
		    act.sendKeys(Keys.ARROW_DOWN).build().perform();
		   }

		//navigation methods
		   
		   driver.navigate().to("https://www.google.com/search?q=facebook&rlz=1C1SQJL_enIN997IN997&oq=facebook&aqs=chrome..69i57.9566j0j15&sourceid=chrome&ie=UTF-8");
		   Thread.sleep(3000);
		   driver.navigate().back();
		   Thread.sleep(3000);
		 //  driver.navigate().forward();
		   driver.navigate().to("https://www.google.com/search?q=flipkart&rlz=1C1SQJL_enIN997IN997&oq=flipkart&aqs=chrome..69i57.6818j0j7&sourceid=chrome&ie=UTF-8");
		   Thread.sleep(3000);
		   driver.navigate().refresh();
		}

}
