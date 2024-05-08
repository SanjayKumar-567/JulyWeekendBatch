package automationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v102.runtime.model.WebDriverValue;
import org.openqa.selenium.support.ui.Select;

public class Jpet {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		//WebDriverValue.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm="); // july 30,31= assinments
		driver.manage().window().maximize();
		// driver.findElement(By.id("details-button")).click();
		// driver.findElement(By.id("proceed-link")).click();

		driver.findElement(By.name("username")).sendKeys("sanjay kumar");
		driver.findElement(By.name("password")).sendKeys("kumar9500");
		driver.findElement(By.name("repeatedPassword")).sendKeys("kumar9500");
		driver.findElement(By.name("account.firstName")).sendKeys("sanjay");
		driver.findElement(By.name("account.lastName")).sendKeys("kumar");
		driver.findElement(By.name("account.email")).sendKeys("sanjaystr96@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("9500112497");
		driver.findElement(By.name("account.address1")).sendKeys("subramaniya nagar");
		driver.findElement(By.name("account.address2")).sendKeys("8th street madipakkam");
		driver.findElement(By.name("account.city")).sendKeys("chennai");
		driver.findElement(By.name("account.state")).sendKeys("tamil nadu");
		driver.findElement(By.name("account.zip")).sendKeys("600021");
		driver.findElement(By.name("account.country")).sendKeys("india");

		WebElement Dropdowm1 = driver.findElement(By.name("account.languagePreference"));// DROPDOWN=SELECT CLASS
		Select select1 = new Select(Dropdowm1);
		select1.selectByVisibleText("japanese");
		// driver.findElement(By.name("account.languagePreference")).sendKeys("japanese");

		// drop down
		WebElement Dropdowm2 = driver.findElement(By.name("account.favouriteCategoryId"));
		Select select2 = new Select(Dropdowm2);
		select2.selectByVisibleText("CATS");
		// driver.findElement(By.name("account.favouriteCategoryId")).sendKeys("CATS");

		// radio button
		driver.findElement(By.name("account.listOption")).click();

		// WebElement radiobuttton1 = driver.findElement(By.name("account.listOption"));
		// radiobuttton1.click();

		WebElement radiobuttton2 = driver.findElement(By.name("account.bannerOption"));
		radiobuttton2.click();

		System.out.println(radiobuttton2.isEnabled());

		driver.findElement(By.name("newAccount")).click();

	}

}
