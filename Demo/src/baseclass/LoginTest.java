package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericutility.ReadProperty1;

public class LoginTest 
{
	 WebDriver driver;
	 @Parameters("Browser")
     @Test
     public void login(String browser) throws Throwable
     { 
		if(browser.equals("Chrome"))
		{
    	driver = new ChromeDriver();
		}
    	
    	else if(browser.equals("Edge"))
		{
    	driver = new EdgeDriver();
		}
    	
    	else
		{
    	  driver = new EdgeDriver();
		}
   
     
	
    	driver.get("https://www.shoppersstack.com/user-signin");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	ReadProperty1 read = new ReadProperty1();
     	String username = read.fetchProperty("username");
     	driver.findElement(By.id("Email")).sendKeys(username);
     	String pwd = read.fetchProperty("password");
     	driver.findElement(By.id("Password")).sendKeys(pwd);
     	driver.findElement(By.xpath("//span[text() = 'Login']")).click();
     	Reporter.log("login successfully" , true);
     }
     
}

