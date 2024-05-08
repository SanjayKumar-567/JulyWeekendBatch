package testNGFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	@Test
	public void a1_fb()

	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);
	driver.get("https://www.google.com/search?q=fb&rlz=1C1FKPE_enUS994US994&oq=fb&aqs=chrome..69i57.1344j0j7&sourceid=chrome&ie=UTF-8");
	driver.manage().window().maximize();
	driver.quit();

	}
	@Test
	public void a2_amazon()

	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);
	driver.get("https://www.google.com/search?q=amazon&rlz=1C1FKPE_enUS994US994&oq=amazon&aqs=chrome..69i57.2910j0j15&sourceid=chrome&ie=UTF-8");
	driver.manage().window().maximize();
	driver.quit();

	}
	@Test
	public void a3_fkart()

	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);
	driver.get("https://www.google.com/search?q=flipkart&rlz=1C1FKPE_enUS994US994&oq=flipkart&aqs=chrome..69i57.5128j0j7&sourceid=chrome&ie=UTF-8");
	driver.manage().window().maximize();
	driver.quit();

	}
	@Test
	public void a4_nakurai()

	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(co);
	String url=" https://www.google.com/search?q=nakurai&rlz=1C1FKPE_enUS994US994&oq=nakurai&aqs=chrome..69i57.4681j0j15&sourceid=chrome&ie=UTF-8 ";
	driver.get(url);
	driver.manage().window().maximize();
	driver.quit();
	}


	}




