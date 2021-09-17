package paralleltestdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest {
	
	WebDriver driver;
	
	@Test
	public void FirefoxTest()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSoftware\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();	  
	    driver.get("https://www.google.com/");
	  //  driver.manage().window().maximize();
		boolean check=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	    Assert.assertTrue(check);
	    driver.quit();
	    
	}
	
	@Test
	public void ChromeTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com"); 
	//	driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    driver.quit();
	}

}
