package demowebshop.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pompackage.LoginPagePOM;

public class ValidateLogin {
	
    @Test
    public void checklogin()
    {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	
	LoginPagePOM login=new LoginPagePOM(driver);
	
	login.enteremail("shraddha01@gmail.com");
	login.enterpassword("kkk111");
	login.clicksignin();
    }
}
