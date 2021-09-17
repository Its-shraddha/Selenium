package demowebshoppagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pagepactorydemopom.RegisterPOM;

public class RegisterByPageFactory {

	
public void registerUser() {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/register");
	driver.manage().window().maximize();
	
	RegisterPOM reg=PageFactory.initElements(driver, RegisterPOM.class);
	reg.selectGender(true);
	reg.firstName("shraddha");
	reg.lastName("dalve");
	reg.enterEmail("shraddha03@gmail.com");
	reg.enterPassword("kkk111");
	reg.confirmPassword("kkk111");
	
	
}
}
