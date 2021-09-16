package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.name("FirstName")).sendKeys("Shraddha");
        driver.findElement(By.name("LastName")).sendKeys("Dalve");
        driver.findElement(By.id("Email")).sendKeys("shraddhadalve96@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("shr123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("shr123");
        
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
        driver.close();
        
        
        
	}

}
