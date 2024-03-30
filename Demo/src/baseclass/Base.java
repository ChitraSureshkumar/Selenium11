package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import genericutility.ReadProperty1;



public class Base 
{   
	public WebDriver driver;
    @BeforeClass
    public void openBrowser() throws Throwable
    {
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	ReadProperty1 read = new ReadProperty1();
    	String url = read.fetchProperty("url");
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	Reporter.log("Browser is opened" , true);
    }
    
    @BeforeMethod
    public void login() throws Throwable
    { 
    	ReadProperty1 read = new ReadProperty1();
    	String username = read.fetchProperty("username");
    	driver.findElement(By.id("Email")).sendKeys(username);
    	String pwd = read.fetchProperty("password");
    	driver.findElement(By.id("Password")).sendKeys(pwd);
    	driver.findElement(By.xpath("//span[text() = 'Login']")).click();
    	Reporter.log("login successfully" , true);
    }
    
    @AfterMethod
    public void  logout()
    {
    	Reporter.log("logged out successfully" , true);
    }
   
    @AfterClass
    public void closeBrowser()
    {
    	driver.quit();
    	Reporter.log("Browser closed", true);
    }
}
