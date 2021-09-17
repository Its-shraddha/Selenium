package pagepactorydemopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPOM {
WebDriver driver;
	
	@FindBy(id="gender-female")
	WebElement gender;
	
	@FindBy(xpath="//label[@for='FirstName']")
	WebElement firstname;
	
	@FindBy(xpath="//label[@for='LastName']")
	WebElement lastname;
	
	@FindBy(xpath="//label[(text()='Email:')]")
	WebElement email;
	
	@FindBy(xpath="//label[contains(text(),'Password:')]")
	WebElement password;
	
	@FindBy(xpath="//label[contains(text(),'Confirm password:')]")
	WebElement confirmpassword;
	
	@FindBy(id="register-button")
	WebElement registerbtn;
	
	public RegisterPOM(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
   public void selectGender(boolean g)
   {
	   gender.isSelected();
   }

   public void firstName(String nm)
   {
	   firstname.sendKeys(nm);
   }

   public void lastName(String ln)
   {
	   lastname.sendKeys(ln);
   }
   public void enterEmail(String em)
   {
	   email.sendKeys(em);
   }
   public void enterPassword(String pwd)
   {
	   password.sendKeys(pwd);
   }
   public void confirmPassword(String cp)
   {
	   confirmpassword.sendKeys(cp);
   }
   
   public void clickRegister() {
	   registerbtn.click();
   }
}



