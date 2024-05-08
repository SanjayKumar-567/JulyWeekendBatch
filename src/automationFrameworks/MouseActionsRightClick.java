package automationFrameworks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsRightClick {
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[text()='right click me']"));

		WebElement rightclickbutton=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclickbutton).build().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Copy')]")).click();
		Thread.sleep(2000);

		        Alert act1= driver.switchTo().alert();
		       String popup = act1.getText();
		       System.out.println(popup);
		       act1.accept();
		       
		}

}
