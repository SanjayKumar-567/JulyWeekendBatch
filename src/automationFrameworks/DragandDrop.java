package automationFrameworks;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
ChromeOptions co= new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(co) ;
driver.manage().window().maximize();
driver.get("https://testautomationpractice.blogspot.com/");
Thread.sleep(5000);
driver.findElement(By.id("name")).sendKeys("sanjay");
driver.findElement(By.id("email")).sendKeys("sanjay97official@gmail.com");
driver.findElement(By.id("phone")).sendKeys("23456789");
driver.findElement(By.id("textarea")).sendKeys("madipakkam chennai-91");

 WebElement gender = driver.findElement(By.id("male"));
 gender.click();
 
 WebElement country = driver.findElement(By.id("country"));
 Select slt = new Select(country);
 slt.selectByIndex(9);


//driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
//ArrayList <String> wh = new ArrayList<>(driver.getWindowHandles());
//driver.switchTo().window(wh.get(1));


//driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
//Alert alt=driver.switchTo().alert();//popup
//alt.accept();
//
//              //double click
//   WebElement dclick= driver.findElement(By.xpath("//button[contains(text(),'Copy ')]"));
//   Actions act = new Actions(driver);
//   act.doubleClick(dclick).build().perform();
//             //dropdown
//   WebElement dropdown =   driver.findElement(By.id("speed"));
//   Select slt = new Select(dropdown);
//   slt.selectByVisibleText("Faster");
   
   
   //driver.findElement(By.id("RESULT_FileUpload-10")).sendKeys("D:\\compaq bkp\\RESUME\\P.Sanjay Kumar Resume (2) (1).pdf");
   

                      //drag and drop
       WebElement drag= driver.findElement(By.id("draggable"));//
       WebElement drop =   driver.findElement(By.id("droppable"));
       Actions act1 = new Actions(driver);
        act1.dragAndDrop(drag, drop).build().perform();
        driver.quit();
}

	}

	
