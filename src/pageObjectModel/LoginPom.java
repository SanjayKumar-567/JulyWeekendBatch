package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	
WebDriver driver;
//By username	=By.id("user-name");

@FindBy(id="user-name")
WebElement username;

//By password=By.id("password");

@FindBy(id="password")
WebElement password ;

@FindBy(id="login-button")
		WebElement loginbtm;



		LoginPom(WebDriver d)
		{
			driver = d;
			PageFactory.initElements(d, this);
		}



         public void a_name(String uname)
            {
        	// driver.findElement(username).sendKeys(uname);
        	 username.sendKeys(uname);
        	 
	}
          public void b_pass(String pwd)
         {
        	  //driver.findElement(password).sendKeys(pwd);
        	  password.sendKeys(pwd);

	}


         public void c_lbutton()
         {
        	 loginbtm.click();

	     }


	

		 
         }



