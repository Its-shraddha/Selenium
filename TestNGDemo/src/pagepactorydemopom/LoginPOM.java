package pagepactorydemopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {
	
	WebDriver driver;
	
	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//*[@value='Log in']")
	WebElement loginbtn;
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
   public void sendemail(String eml)
   {
	   email.sendKeys(eml);
   }

   public void sendpassword(String pd)
   {
	   password.sendKeys(pd);
   }
   
   public void clicklogin() {
	   loginbtn.click();
   }
}
