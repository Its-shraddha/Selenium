package learntestng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {
	WebDriver driver;
	@Test
	public void testlogin() throws MalformedURLException
	{
	 DesiredCapabilities dc=DesiredCapabilities.chrome();
	 dc.setBrowserName("chrome");
	 dc.setPlatform(Platform.WINDOWS);
	 
     driver=new RemoteWebDriver(new URL("http://192.168.43.42:4355/wd/hub"),dc);
	
	
	driver.get("http://demowebshop.tricentis.com/login");
    driver.manage().window().maximize();
    System.out.println("Start application");
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	
	driver.findElement(By.id("Email")).sendKeys("shraddha01@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("kkk111");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	System.out.println("Successfully Login");
	driver.findElement(By.linkText("Log out")).click();
}
}
