package interview;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");//driver type ,driver location
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--remote-allow-origins=* ");
	WebDriver driver = new ChromeDriver(co) ;
	driver.navigate().to("https://colab.humanbrain.in/");
	//driver .navigate().to("https://accounts.google.com/o/oauth2/auth?response_type=code&client_id=591121355730-2r8srv7tebjunsd0jo87eve59b6pumr5.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fhumanbrain-annotation.firebaseapp.com%2F__%2Fauth%2Fhandler&state=AMbdmDkfQZmYrKXvVu9TQYlrr7Frf_M0IIJ1TL-aRIM2tBZmwutkazEukZ3NwYby2KfxiCkxURLmS6P4LDDQoi-KnU0-5LbJ3mqVGVUxAjQ5IrDqVw3b88LwnPHgK5UY8N2MtzPKz9U8qwngSZF6err6fSszaG0i1fhMey50R5xJ28jzyBPiVx3m-PCUUa0rZPuuc3VAA4jWtSZFTqFzTban0M9hJoEqiKLOgqhtyEhwhtK5MTEziurhMyRdaNON4x63Hu7WGHgzWvXmVYwBaJbcAtuGD0ImEWVea_gicll1HDSG_NLPWz2mXitiTTsjMDkuOaP7fWLn7QlTDC5Jzg&scope=openid%20https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email%20profile&context_uri=https%3A%2F%2Fdataportal.colab.humanbrain.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//a[contains(text(),'HIGHLIGHTS')]//following::a[1]")).click();
		ArrayList<String> Tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(Tab.get(1));
		String url	=driver.getCurrentUrl();
		System.out.println(url);
		
		String parenthandle=driver.getWindowHandle();
		System.out.println(parenthandle);
		
 driver .findElement(By.xpath("//nb-icon[@class='menu-icon ng-tns-c93-2 ng-star-inserted']")).click();
	String text =driver.findElement(By.xpath("//h1[@class='head']")).getText();
	System.out.println(text);
 driver .findElement(By.xpath("//button[contains(.,'Log In')]")).click();
 Set <String>handles= driver.getWindowHandles();
 for (String handle : handles) {
 	System.out.println(handle);
 	Thread.sleep(3000);
 	if(!handle.equals(parenthandle)) {
 		
 		driver.switchTo().window(handle);	
 	}
 }
	String txt=driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).getText();
	System.out.println(txt);
	//span[normalize-space()='Sign in']
 //driver.findElement(By.xpath("//div[text()='Use another account']")).click();
 driver.findElement(By.name("identifier")).sendKeys("sanjaycivilkumarsk@gmail.com");
 driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
 driver.quit();

	

	
	}

}
