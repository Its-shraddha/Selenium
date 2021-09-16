package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise01 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	Thread.sleep(2000);
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("//input[@class='button']")).click();

    driver.findElement(By.xpath("//a[@id='welcome']")).click();
    Thread.sleep(3000);

    // driver.findElement(By.linkText("Logout")).click();
    driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
	Thread.sleep(3000);
	
    driver.close();
	}

}
