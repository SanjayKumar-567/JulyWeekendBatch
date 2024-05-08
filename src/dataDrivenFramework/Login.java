package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {
	String[][] data = null;

	@DataProvider(name = "LoginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = getExcelData();
		return data;

	}

	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Eclipse\\td\\Book1.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowcount = sheet.getRows();
		int coloumcount = sheet.getColumns();
		String testData[][] = new String[rowcount - 1][coloumcount];
		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < coloumcount; j++) {
				testData[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;
	}

	@Test(dataProvider = "LoginData")
	public void loginwithbothcorrect(String Uname, String pwd) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\eclipse-jee-oxygen-3a-win32-x86_64\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(Uname);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

	}

}
