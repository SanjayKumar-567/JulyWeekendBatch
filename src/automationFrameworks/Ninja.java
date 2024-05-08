package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Ninja {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		   driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		   
		   driver.findElement(By.id("input-firstname")).sendKeys("sanjay");
		   driver.findElement(By.id("input-lastname")).sendKeys("kumar");
		   driver.findElement(By.id("input-email")).sendKeys("skkum2a7r@gmail.com");
		   driver.findElement(By.id("input-telephone")).sendKeys("9790948567");
		   driver.findElement(By.id("input-password")).sendKeys("kumar1111");
		   driver.findElement(By.id("input-confirm")).sendKeys("kumar1111");
//driver.findElement(By.id("")).sendKeys("");
		  //Radio button
		 WebElement rb=  driver.findElement(By.name("newsletter"));
		 rb .click();
		 System.out.println(rb.isEnabled());
		 
		WebElement ChkBox =   driver.findElement(By.name("agree"));
		ChkBox.click();
		System.out.println(ChkBox.isSelected());
		//System.out.println(ChkBox.isDisplayed());is for

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();//act like a click

		 String PageText = driver.findElement(By.xpath("//h1[contains(text(),'Created')]")).getText();
		 System.out.println( PageText);
		 
		 driver.quit();

		      }


	}


