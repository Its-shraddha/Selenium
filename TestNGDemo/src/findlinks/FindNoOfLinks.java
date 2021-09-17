package findlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfLinks {
	
	
	WebDriver driver;
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	
		System.out.println("Start application");
	}
	public void countlink()
	{
		
		List<WebElement> link = driver.findElements(By.tagName("a"));

		System.out.println(link.size());
	}
}