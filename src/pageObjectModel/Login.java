package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login {
	
	    @Test
	    public void launchbrowser() {
	    	System.setProperty("webdriver.chrome.driver",
					"C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
	    	ChromeOptions co= new ChromeOptions();
	    	co.addArguments("--remote-allow-origins=* ");
	    	WebDriver driver = new ChromeDriver(co) ;
	    	driver.get("https://www.saucedemo.com/");  

	LoginPom lp  = new LoginPom(driver);
	lp. a_name("standard_user");
	lp.b_pass("secret_sauce");
	lp.c_lbutton();
	   
}  
	   
	   
}

