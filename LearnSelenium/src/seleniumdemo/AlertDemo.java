package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	
	Alert alert=driver.switchTo().alert();
	
	String alertmessage=driver.switchTo().alert().getText();
	System.out.println(alertmessage);
    alert.accept();
    
    
    driver.findElement(By.linkText("Alert with OK & Cancel")).click();
    		
    		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    
    		Alert a=driver.switchTo().alert();
    		
    		String amsg=driver.switchTo().alert().getText();
    		System.out.println(amsg);
    		
    alert.dismiss();
    
    
    
    
    driver.findElement(By.linkText("Alert with Textbox")).click();
	
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

	Alert alt=driver.switchTo().alert();
	
	String altmsg=driver.switchTo().alert().getText();
	System.out.println(altmsg);
	
    alert.sendKeys("shraddha");
    alert.accept();
    
    
    
    
	}

	
	
	
}
