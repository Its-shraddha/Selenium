package demowebshoppagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pagepactorydemopom.LoginPOM;

public class VerifyLoginPF {
	
	public void CheckLoginPF()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		LoginPOM loginpage=PageFactory.initElements(driver, LoginPOM.class);
		
		loginpage.sendemail("shraddha02@gmail.com");
		loginpage.sendpassword("kkk111");
		loginpage.clicklogin();
		driver.close();
	}

}
