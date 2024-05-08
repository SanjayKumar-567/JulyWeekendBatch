package interview;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class syntax {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//1.
		System.setProperty("driver type", "driver location");
		WebDriver driver = new ChromeDriver();
		
		//2. find element vs find elements
	driver.	findElement(By.xpath("")).click();//it is used to perform task like click,sendkeys
	driver.	findElements(By.xpath("")).size();//it is used to perform task like sizemethod

		//3.window maximize
		driver.manage().window().maximize();
		
         //4navigate
		driver.navigate().to("url");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//5 handling droupdowns
	WebElement droupdown=	driver.findElement(By.xpath(""));
	Select slt = new Select(droupdown);
	slt.selectByVisibleText("value");
	
	//6 purpose of sendkeys
	
	/*in manual testing we can able to test the textbox area by entering data manually 
	but in automation we cant able to do. so with the help of sendkeys we can able to send our data through script to the application  and test it 
	*/
	
	//7. mouseover 
	WebElement mouseover=driver.findElement(By.xpath(""));
	Actions act = new Actions(driver);
	act.moveToElement(mouseover);
	
	//8 implicit wait vs explicit wait
	/*polling time 500 ms
	it holds for over all script 
	explicit wait
     polling time 500 ms
	it holds for perticular element with conditions
	
	*/
	//9. screenshort
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		Files.copy(f, new File("D:\\compaq bkp\\c bkp\\Pictures\\screenshot.jpg"));
		
		//10.handling frames
	driver.switchTo().frame("");
		

	}

}
